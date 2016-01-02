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

package vn.dtt.sol.ns.kehoachvesinh.dao.service.persistence;

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

import vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;
import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;
import vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhImpl;
import vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ke hoach ve sinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KeHoachVeSinhPersistence
 * @see KeHoachVeSinhUtil
 * @generated
 */
public class KeHoachVeSinhPersistenceImpl extends BasePersistenceImpl<KeHoachVeSinh>
	implements KeHoachVeSinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KeHoachVeSinhUtil} to access the ke hoach ve sinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KeHoachVeSinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY__ID = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchBy_ID",
			new String[] { Long.class.getName() },
			KeHoachVeSinhModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__ID = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns the ke hoach ve sinh where id = &#63; or throws a {@link vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException} if it could not be found.
	 *
	 * @param id the ID
	 * @return the matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_ID(long id)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_ID(id);

		if (keHoachVeSinh == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchKeHoachVeSinhException(msg.toString());
		}

		return keHoachVeSinh;
	}

	/**
	 * Returns the ke hoach ve sinh where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the ID
	 * @return the matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_ID(long id) throws SystemException {
		return fetchBy_ID(id, true);
	}

	/**
	 * Returns the ke hoach ve sinh where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_ID(long id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY__ID,
					finderArgs, this);
		}

		if (result instanceof KeHoachVeSinh) {
			KeHoachVeSinh keHoachVeSinh = (KeHoachVeSinh)result;

			if ((id != keHoachVeSinh.getId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

			query.append(_FINDER_COLUMN__ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				List<KeHoachVeSinh> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"KeHoachVeSinhPersistenceImpl.fetchBy_ID(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					KeHoachVeSinh keHoachVeSinh = list.get(0);

					result = keHoachVeSinh;

					cacheResult(keHoachVeSinh);

					if ((keHoachVeSinh.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID,
							finderArgs, keHoachVeSinh);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY__ID,
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
			return (KeHoachVeSinh)result;
		}
	}

	/**
	 * Removes the ke hoach ve sinh where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @return the ke hoach ve sinh that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh removeBy_ID(long id)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = findBy_ID(id);

		return remove(keHoachVeSinh);
	}

	/**
	 * Returns the number of ke hoach ve sinhs where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_ID(long id) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHVESINH_WHERE);

			query.append(_FINDER_COLUMN__ID_ID_2);

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

	private static final String _FINDER_COLUMN__ID_ID_2 = "keHoachVeSinh.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__N_T = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_N_T",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_N_T", new String[] { Long.class.getName() },
			KeHoachVeSinhModelImpl.IDNGUOITAO_COLUMN_BITMASK |
			KeHoachVeSinhModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__N_T = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_N_T",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ke hoach ve sinhs where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @return the matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_N_T(long idNguoiTao)
		throws SystemException {
		return findBy_N_T(idNguoiTao, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach ve sinhs where idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @return the range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_N_T(long idNguoiTao, int start, int end)
		throws SystemException {
		return findBy_N_T(idNguoiTao, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach ve sinhs where idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_N_T(long idNguoiTao, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T;
			finderArgs = new Object[] { idNguoiTao };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__N_T;
			finderArgs = new Object[] { idNguoiTao, start, end, orderByComparator };
		}

		List<KeHoachVeSinh> list = (List<KeHoachVeSinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachVeSinh keHoachVeSinh : list) {
				if ((idNguoiTao != keHoachVeSinh.getIdNguoiTao())) {
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

			query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

			query.append(_FINDER_COLUMN__N_T_IDNGUOITAO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idNguoiTao);

				if (!pagination) {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachVeSinh>(list);
				}
				else {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_N_T_First(long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_N_T_First(idNguoiTao,
				orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the first ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_N_T_First(long idNguoiTao,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachVeSinh> list = findBy_N_T(idNguoiTao, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_N_T_Last(long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_N_T_Last(idNguoiTao,
				orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_N_T_Last(long idNguoiTao,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_N_T(idNguoiTao);

		if (count == 0) {
			return null;
		}

		List<KeHoachVeSinh> list = findBy_N_T(idNguoiTao, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param id the primary key of the current ke hoach ve sinh
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh[] findBy_N_T_PrevAndNext(long id, long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachVeSinh[] array = new KeHoachVeSinhImpl[3];

			array[0] = getBy_N_T_PrevAndNext(session, keHoachVeSinh,
					idNguoiTao, orderByComparator, true);

			array[1] = keHoachVeSinh;

			array[2] = getBy_N_T_PrevAndNext(session, keHoachVeSinh,
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

	protected KeHoachVeSinh getBy_N_T_PrevAndNext(Session session,
		KeHoachVeSinh keHoachVeSinh, long idNguoiTao,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

		query.append(_FINDER_COLUMN__N_T_IDNGUOITAO_2);

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
			query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(idNguoiTao);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachVeSinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachVeSinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach ve sinhs where idNguoiTao = &#63; from the database.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_N_T(long idNguoiTao) throws SystemException {
		for (KeHoachVeSinh keHoachVeSinh : findBy_N_T(idNguoiTao,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachVeSinh);
		}
	}

	/**
	 * Returns the number of ke hoach ve sinhs where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @return the number of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_N_T(long idNguoiTao) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__N_T;

		Object[] finderArgs = new Object[] { idNguoiTao };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHVESINH_WHERE);

			query.append(_FINDER_COLUMN__N_T_IDNGUOITAO_2);

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

	private static final String _FINDER_COLUMN__N_T_IDNGUOITAO_2 = "keHoachVeSinh.idNguoiTao = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__Y = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_Y",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_Y", new String[] { Long.class.getName() },
			KeHoachVeSinhModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__Y = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_Y",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ke hoach ve sinhs where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_Y(long nam) throws SystemException {
		return findBy_Y(nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach ve sinhs where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @return the range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_Y(long nam, int start, int end)
		throws SystemException {
		return findBy_Y(nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach ve sinhs where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_Y(long nam, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y;
			finderArgs = new Object[] { nam };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__Y;
			finderArgs = new Object[] { nam, start, end, orderByComparator };
		}

		List<KeHoachVeSinh> list = (List<KeHoachVeSinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachVeSinh keHoachVeSinh : list) {
				if ((nam != keHoachVeSinh.getNam())) {
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

			query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

			query.append(_FINDER_COLUMN__Y_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nam);

				if (!pagination) {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachVeSinh>(list);
				}
				else {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach ve sinh in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_Y_First(long nam,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_Y_First(nam, orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the first ke hoach ve sinh in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_Y_First(long nam,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachVeSinh> list = findBy_Y(nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_Y_Last(long nam,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_Y_Last(nam, orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_Y_Last(long nam,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_Y(nam);

		if (count == 0) {
			return null;
		}

		List<KeHoachVeSinh> list = findBy_Y(nam, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where nam = &#63;.
	 *
	 * @param id the primary key of the current ke hoach ve sinh
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh[] findBy_Y_PrevAndNext(long id, long nam,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachVeSinh[] array = new KeHoachVeSinhImpl[3];

			array[0] = getBy_Y_PrevAndNext(session, keHoachVeSinh, nam,
					orderByComparator, true);

			array[1] = keHoachVeSinh;

			array[2] = getBy_Y_PrevAndNext(session, keHoachVeSinh, nam,
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

	protected KeHoachVeSinh getBy_Y_PrevAndNext(Session session,
		KeHoachVeSinh keHoachVeSinh, long nam,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

		query.append(_FINDER_COLUMN__Y_NAM_2);

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
			query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachVeSinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachVeSinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach ve sinhs where nam = &#63; from the database.
	 *
	 * @param nam the nam
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_Y(long nam) throws SystemException {
		for (KeHoachVeSinh keHoachVeSinh : findBy_Y(nam, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(keHoachVeSinh);
		}
	}

	/**
	 * Returns the number of ke hoach ve sinhs where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_Y(long nam) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__Y;

		Object[] finderArgs = new Object[] { nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHVESINH_WHERE);

			query.append(_FINDER_COLUMN__Y_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN__Y_NAM_2 = "keHoachVeSinh.nam = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__D_L_I = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_D_L_I",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I =
		new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_D_L_I", new String[] { Long.class.getName() },
			KeHoachVeSinhModelImpl.BAOCAODLI_COLUMN_BITMASK |
			KeHoachVeSinhModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__D_L_I = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_D_L_I",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ke hoach ve sinhs where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @return the matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_D_L_I(long baoCaoDLI)
		throws SystemException {
		return findBy_D_L_I(baoCaoDLI, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the ke hoach ve sinhs where baoCaoDLI = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @return the range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_D_L_I(long baoCaoDLI, int start, int end)
		throws SystemException {
		return findBy_D_L_I(baoCaoDLI, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach ve sinhs where baoCaoDLI = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_D_L_I(long baoCaoDLI, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I;
			finderArgs = new Object[] { baoCaoDLI };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__D_L_I;
			finderArgs = new Object[] { baoCaoDLI, start, end, orderByComparator };
		}

		List<KeHoachVeSinh> list = (List<KeHoachVeSinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachVeSinh keHoachVeSinh : list) {
				if ((baoCaoDLI != keHoachVeSinh.getBaoCaoDLI())) {
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

			query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

			query.append(_FINDER_COLUMN__D_L_I_BAOCAODLI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(baoCaoDLI);

				if (!pagination) {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachVeSinh>(list);
				}
				else {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_D_L_I_First(long baoCaoDLI,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_D_L_I_First(baoCaoDLI,
				orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("baoCaoDLI=");
		msg.append(baoCaoDLI);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the first ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_D_L_I_First(long baoCaoDLI,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachVeSinh> list = findBy_D_L_I(baoCaoDLI, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_D_L_I_Last(long baoCaoDLI,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_D_L_I_Last(baoCaoDLI,
				orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("baoCaoDLI=");
		msg.append(baoCaoDLI);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_D_L_I_Last(long baoCaoDLI,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_D_L_I(baoCaoDLI);

		if (count == 0) {
			return null;
		}

		List<KeHoachVeSinh> list = findBy_D_L_I(baoCaoDLI, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param id the primary key of the current ke hoach ve sinh
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh[] findBy_D_L_I_PrevAndNext(long id, long baoCaoDLI,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachVeSinh[] array = new KeHoachVeSinhImpl[3];

			array[0] = getBy_D_L_I_PrevAndNext(session, keHoachVeSinh,
					baoCaoDLI, orderByComparator, true);

			array[1] = keHoachVeSinh;

			array[2] = getBy_D_L_I_PrevAndNext(session, keHoachVeSinh,
					baoCaoDLI, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KeHoachVeSinh getBy_D_L_I_PrevAndNext(Session session,
		KeHoachVeSinh keHoachVeSinh, long baoCaoDLI,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

		query.append(_FINDER_COLUMN__D_L_I_BAOCAODLI_2);

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
			query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(baoCaoDLI);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachVeSinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachVeSinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach ve sinhs where baoCaoDLI = &#63; from the database.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_D_L_I(long baoCaoDLI) throws SystemException {
		for (KeHoachVeSinh keHoachVeSinh : findBy_D_L_I(baoCaoDLI,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachVeSinh);
		}
	}

	/**
	 * Returns the number of ke hoach ve sinhs where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @return the number of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_D_L_I(long baoCaoDLI) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__D_L_I;

		Object[] finderArgs = new Object[] { baoCaoDLI };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHVESINH_WHERE);

			query.append(_FINDER_COLUMN__D_L_I_BAOCAODLI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(baoCaoDLI);

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

	private static final String _FINDER_COLUMN__D_L_I_BAOCAODLI_2 = "keHoachVeSinh.baoCaoDLI = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__O_R_1 = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_O_R_1",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_1 =
		new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_O_R_1", new String[] { String.class.getName() },
			KeHoachVeSinhModelImpl.MATINH_COLUMN_BITMASK |
			KeHoachVeSinhModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__O_R_1 = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_O_R_1",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ke hoach ve sinhs where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_O_R_1(String maTinh)
		throws SystemException {
		return findBy_O_R_1(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach ve sinhs where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @return the range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_O_R_1(String maTinh, int start, int end)
		throws SystemException {
		return findBy_O_R_1(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach ve sinhs where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_O_R_1(String maTinh, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_1;
			finderArgs = new Object[] { maTinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__O_R_1;
			finderArgs = new Object[] { maTinh, start, end, orderByComparator };
		}

		List<KeHoachVeSinh> list = (List<KeHoachVeSinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachVeSinh keHoachVeSinh : list) {
				if (!Validator.equals(maTinh, keHoachVeSinh.getMaTinh())) {
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

			query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN__O_R_1_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN__O_R_1_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN__O_R_1_MATINH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
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
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachVeSinh>(list);
				}
				else {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach ve sinh in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_O_R_1_First(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_O_R_1_First(maTinh,
				orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the first ke hoach ve sinh in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_O_R_1_First(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachVeSinh> list = findBy_O_R_1(maTinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_O_R_1_Last(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_O_R_1_Last(maTinh,
				orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_O_R_1_Last(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_O_R_1(maTinh);

		if (count == 0) {
			return null;
		}

		List<KeHoachVeSinh> list = findBy_O_R_1(maTinh, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where maTinh = &#63;.
	 *
	 * @param id the primary key of the current ke hoach ve sinh
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh[] findBy_O_R_1_PrevAndNext(long id, String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachVeSinh[] array = new KeHoachVeSinhImpl[3];

			array[0] = getBy_O_R_1_PrevAndNext(session, keHoachVeSinh, maTinh,
					orderByComparator, true);

			array[1] = keHoachVeSinh;

			array[2] = getBy_O_R_1_PrevAndNext(session, keHoachVeSinh, maTinh,
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

	protected KeHoachVeSinh getBy_O_R_1_PrevAndNext(Session session,
		KeHoachVeSinh keHoachVeSinh, String maTinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN__O_R_1_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN__O_R_1_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN__O_R_1_MATINH_2);
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
			query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachVeSinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachVeSinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach ve sinhs where maTinh = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_O_R_1(String maTinh) throws SystemException {
		for (KeHoachVeSinh keHoachVeSinh : findBy_O_R_1(maTinh,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachVeSinh);
		}
	}

	/**
	 * Returns the number of ke hoach ve sinhs where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_O_R_1(String maTinh) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__O_R_1;

		Object[] finderArgs = new Object[] { maTinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHVESINH_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN__O_R_1_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN__O_R_1_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN__O_R_1_MATINH_2);
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

	private static final String _FINDER_COLUMN__O_R_1_MATINH_1 = "keHoachVeSinh.maTinh IS NULL";
	private static final String _FINDER_COLUMN__O_R_1_MATINH_2 = "keHoachVeSinh.maTinh = ?";
	private static final String _FINDER_COLUMN__O_R_1_MATINH_3 = "(keHoachVeSinh.maTinh IS NULL OR keHoachVeSinh.maTinh = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__O_R_2 = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_O_R_2",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_2 =
		new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_O_R_2", new String[] { String.class.getName() },
			KeHoachVeSinhModelImpl.MAHUYEN_COLUMN_BITMASK |
			KeHoachVeSinhModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__O_R_2 = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_O_R_2",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ke hoach ve sinhs where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @return the matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_O_R_2(String maHuyen)
		throws SystemException {
		return findBy_O_R_2(maHuyen, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach ve sinhs where maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @return the range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_O_R_2(String maHuyen, int start, int end)
		throws SystemException {
		return findBy_O_R_2(maHuyen, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach ve sinhs where maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_O_R_2(String maHuyen, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_2;
			finderArgs = new Object[] { maHuyen };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__O_R_2;
			finderArgs = new Object[] { maHuyen, start, end, orderByComparator };
		}

		List<KeHoachVeSinh> list = (List<KeHoachVeSinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachVeSinh keHoachVeSinh : list) {
				if (!Validator.equals(maHuyen, keHoachVeSinh.getMaHuyen())) {
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

			query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (!pagination) {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachVeSinh>(list);
				}
				else {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_O_R_2_First(String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_O_R_2_First(maHuyen,
				orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the first ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_O_R_2_First(String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachVeSinh> list = findBy_O_R_2(maHuyen, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_O_R_2_Last(String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_O_R_2_Last(maHuyen,
				orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_O_R_2_Last(String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_O_R_2(maHuyen);

		if (count == 0) {
			return null;
		}

		List<KeHoachVeSinh> list = findBy_O_R_2(maHuyen, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	 *
	 * @param id the primary key of the current ke hoach ve sinh
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh[] findBy_O_R_2_PrevAndNext(long id, String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachVeSinh[] array = new KeHoachVeSinhImpl[3];

			array[0] = getBy_O_R_2_PrevAndNext(session, keHoachVeSinh, maHuyen,
					orderByComparator, true);

			array[1] = keHoachVeSinh;

			array[2] = getBy_O_R_2_PrevAndNext(session, keHoachVeSinh, maHuyen,
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

	protected KeHoachVeSinh getBy_O_R_2_PrevAndNext(Session session,
		KeHoachVeSinh keHoachVeSinh, String maHuyen,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

		boolean bindMaHuyen = false;

		if (maHuyen == null) {
			query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_1);
		}
		else if (maHuyen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_3);
		}
		else {
			bindMaHuyen = true;

			query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_2);
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
			query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaHuyen) {
			qPos.add(maHuyen);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachVeSinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachVeSinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach ve sinhs where maHuyen = &#63; from the database.
	 *
	 * @param maHuyen the ma huyen
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_O_R_2(String maHuyen) throws SystemException {
		for (KeHoachVeSinh keHoachVeSinh : findBy_O_R_2(maHuyen,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachVeSinh);
		}
	}

	/**
	 * Returns the number of ke hoach ve sinhs where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @return the number of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_O_R_2(String maHuyen) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__O_R_2;

		Object[] finderArgs = new Object[] { maHuyen };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHVESINH_WHERE);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN__O_R_2_MAHUYEN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
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

	private static final String _FINDER_COLUMN__O_R_2_MAHUYEN_1 = "keHoachVeSinh.maHuyen IS NULL";
	private static final String _FINDER_COLUMN__O_R_2_MAHUYEN_2 = "keHoachVeSinh.maHuyen = ?";
	private static final String _FINDER_COLUMN__O_R_2_MAHUYEN_3 = "(keHoachVeSinh.maHuyen IS NULL OR keHoachVeSinh.maHuyen = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__X_A = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_X_A",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__X_A = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_X_A", new String[] { String.class.getName() },
			KeHoachVeSinhModelImpl.MAXA_COLUMN_BITMASK |
			KeHoachVeSinhModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__X_A = new FinderPath(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_X_A",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ke hoach ve sinhs where maXa = &#63;.
	 *
	 * @param maXa the ma xa
	 * @return the matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_X_A(String maXa)
		throws SystemException {
		return findBy_X_A(maXa, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach ve sinhs where maXa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maXa the ma xa
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @return the range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_X_A(String maXa, int start, int end)
		throws SystemException {
		return findBy_X_A(maXa, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach ve sinhs where maXa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maXa the ma xa
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findBy_X_A(String maXa, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__X_A;
			finderArgs = new Object[] { maXa };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__X_A;
			finderArgs = new Object[] { maXa, start, end, orderByComparator };
		}

		List<KeHoachVeSinh> list = (List<KeHoachVeSinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachVeSinh keHoachVeSinh : list) {
				if (!Validator.equals(maXa, keHoachVeSinh.getMaXa())) {
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

			query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN__X_A_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN__X_A_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN__X_A_MAXA_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (!pagination) {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachVeSinh>(list);
				}
				else {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach ve sinh in the ordered set where maXa = &#63;.
	 *
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_X_A_First(String maXa,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_X_A_First(maXa, orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maXa=");
		msg.append(maXa);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the first ke hoach ve sinh in the ordered set where maXa = &#63;.
	 *
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_X_A_First(String maXa,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachVeSinh> list = findBy_X_A(maXa, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where maXa = &#63;.
	 *
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findBy_X_A_Last(String maXa,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchBy_X_A_Last(maXa, orderByComparator);

		if (keHoachVeSinh != null) {
			return keHoachVeSinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maXa=");
		msg.append(maXa);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachVeSinhException(msg.toString());
	}

	/**
	 * Returns the last ke hoach ve sinh in the ordered set where maXa = &#63;.
	 *
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchBy_X_A_Last(String maXa,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_X_A(maXa);

		if (count == 0) {
			return null;
		}

		List<KeHoachVeSinh> list = findBy_X_A(maXa, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where maXa = &#63;.
	 *
	 * @param id the primary key of the current ke hoach ve sinh
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh[] findBy_X_A_PrevAndNext(long id, String maXa,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachVeSinh[] array = new KeHoachVeSinhImpl[3];

			array[0] = getBy_X_A_PrevAndNext(session, keHoachVeSinh, maXa,
					orderByComparator, true);

			array[1] = keHoachVeSinh;

			array[2] = getBy_X_A_PrevAndNext(session, keHoachVeSinh, maXa,
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

	protected KeHoachVeSinh getBy_X_A_PrevAndNext(Session session,
		KeHoachVeSinh keHoachVeSinh, String maXa,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHVESINH_WHERE);

		boolean bindMaXa = false;

		if (maXa == null) {
			query.append(_FINDER_COLUMN__X_A_MAXA_1);
		}
		else if (maXa.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN__X_A_MAXA_3);
		}
		else {
			bindMaXa = true;

			query.append(_FINDER_COLUMN__X_A_MAXA_2);
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
			query.append(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaXa) {
			qPos.add(maXa);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachVeSinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachVeSinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach ve sinhs where maXa = &#63; from the database.
	 *
	 * @param maXa the ma xa
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_X_A(String maXa) throws SystemException {
		for (KeHoachVeSinh keHoachVeSinh : findBy_X_A(maXa, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(keHoachVeSinh);
		}
	}

	/**
	 * Returns the number of ke hoach ve sinhs where maXa = &#63;.
	 *
	 * @param maXa the ma xa
	 * @return the number of matching ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_X_A(String maXa) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__X_A;

		Object[] finderArgs = new Object[] { maXa };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHVESINH_WHERE);

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN__X_A_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN__X_A_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN__X_A_MAXA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaXa) {
					qPos.add(maXa);
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

	private static final String _FINDER_COLUMN__X_A_MAXA_1 = "keHoachVeSinh.maXa IS NULL";
	private static final String _FINDER_COLUMN__X_A_MAXA_2 = "keHoachVeSinh.maXa = ?";
	private static final String _FINDER_COLUMN__X_A_MAXA_3 = "(keHoachVeSinh.maXa IS NULL OR keHoachVeSinh.maXa = '')";

	public KeHoachVeSinhPersistenceImpl() {
		setModelClass(KeHoachVeSinh.class);
	}

	/**
	 * Caches the ke hoach ve sinh in the entity cache if it is enabled.
	 *
	 * @param keHoachVeSinh the ke hoach ve sinh
	 */
	@Override
	public void cacheResult(KeHoachVeSinh keHoachVeSinh) {
		EntityCacheUtil.putResult(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, keHoachVeSinh.getPrimaryKey(),
			keHoachVeSinh);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID,
			new Object[] { keHoachVeSinh.getId() }, keHoachVeSinh);

		keHoachVeSinh.resetOriginalValues();
	}

	/**
	 * Caches the ke hoach ve sinhs in the entity cache if it is enabled.
	 *
	 * @param keHoachVeSinhs the ke hoach ve sinhs
	 */
	@Override
	public void cacheResult(List<KeHoachVeSinh> keHoachVeSinhs) {
		for (KeHoachVeSinh keHoachVeSinh : keHoachVeSinhs) {
			if (EntityCacheUtil.getResult(
						KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachVeSinhImpl.class, keHoachVeSinh.getPrimaryKey()) == null) {
				cacheResult(keHoachVeSinh);
			}
			else {
				keHoachVeSinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ke hoach ve sinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KeHoachVeSinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KeHoachVeSinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ke hoach ve sinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KeHoachVeSinh keHoachVeSinh) {
		EntityCacheUtil.removeResult(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, keHoachVeSinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(keHoachVeSinh);
	}

	@Override
	public void clearCache(List<KeHoachVeSinh> keHoachVeSinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KeHoachVeSinh keHoachVeSinh : keHoachVeSinhs) {
			EntityCacheUtil.removeResult(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachVeSinhImpl.class, keHoachVeSinh.getPrimaryKey());

			clearUniqueFindersCache(keHoachVeSinh);
		}
	}

	protected void cacheUniqueFindersCache(KeHoachVeSinh keHoachVeSinh) {
		if (keHoachVeSinh.isNew()) {
			Object[] args = new Object[] { keHoachVeSinh.getId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY__ID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID, args,
				keHoachVeSinh);
		}
		else {
			KeHoachVeSinhModelImpl keHoachVeSinhModelImpl = (KeHoachVeSinhModelImpl)keHoachVeSinh;

			if ((keHoachVeSinhModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY__ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { keHoachVeSinh.getId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY__ID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID, args,
					keHoachVeSinh);
			}
		}
	}

	protected void clearUniqueFindersCache(KeHoachVeSinh keHoachVeSinh) {
		KeHoachVeSinhModelImpl keHoachVeSinhModelImpl = (KeHoachVeSinhModelImpl)keHoachVeSinh;

		Object[] args = new Object[] { keHoachVeSinh.getId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__ID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY__ID, args);

		if ((keHoachVeSinhModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY__ID.getColumnBitmask()) != 0) {
			args = new Object[] { keHoachVeSinhModelImpl.getOriginalId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__ID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY__ID, args);
		}
	}

	/**
	 * Creates a new ke hoach ve sinh with the primary key. Does not add the ke hoach ve sinh to the database.
	 *
	 * @param id the primary key for the new ke hoach ve sinh
	 * @return the new ke hoach ve sinh
	 */
	@Override
	public KeHoachVeSinh create(long id) {
		KeHoachVeSinh keHoachVeSinh = new KeHoachVeSinhImpl();

		keHoachVeSinh.setNew(true);
		keHoachVeSinh.setPrimaryKey(id);

		return keHoachVeSinh;
	}

	/**
	 * Removes the ke hoach ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ke hoach ve sinh
	 * @return the ke hoach ve sinh that was removed
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh remove(long id)
		throws NoSuchKeHoachVeSinhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ke hoach ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ke hoach ve sinh
	 * @return the ke hoach ve sinh that was removed
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh remove(Serializable primaryKey)
		throws NoSuchKeHoachVeSinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KeHoachVeSinh keHoachVeSinh = (KeHoachVeSinh)session.get(KeHoachVeSinhImpl.class,
					primaryKey);

			if (keHoachVeSinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKeHoachVeSinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(keHoachVeSinh);
		}
		catch (NoSuchKeHoachVeSinhException nsee) {
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
	protected KeHoachVeSinh removeImpl(KeHoachVeSinh keHoachVeSinh)
		throws SystemException {
		keHoachVeSinh = toUnwrappedModel(keHoachVeSinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(keHoachVeSinh)) {
				keHoachVeSinh = (KeHoachVeSinh)session.get(KeHoachVeSinhImpl.class,
						keHoachVeSinh.getPrimaryKeyObj());
			}

			if (keHoachVeSinh != null) {
				session.delete(keHoachVeSinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (keHoachVeSinh != null) {
			clearCache(keHoachVeSinh);
		}

		return keHoachVeSinh;
	}

	@Override
	public KeHoachVeSinh updateImpl(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh)
		throws SystemException {
		keHoachVeSinh = toUnwrappedModel(keHoachVeSinh);

		boolean isNew = keHoachVeSinh.isNew();

		KeHoachVeSinhModelImpl keHoachVeSinhModelImpl = (KeHoachVeSinhModelImpl)keHoachVeSinh;

		Session session = null;

		try {
			session = openSession();

			if (keHoachVeSinh.isNew()) {
				session.save(keHoachVeSinh);

				keHoachVeSinh.setNew(false);
			}
			else {
				session.merge(keHoachVeSinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KeHoachVeSinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((keHoachVeSinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachVeSinhModelImpl.getOriginalIdNguoiTao()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__N_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T,
					args);

				args = new Object[] { keHoachVeSinhModelImpl.getIdNguoiTao() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__N_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T,
					args);
			}

			if ((keHoachVeSinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachVeSinhModelImpl.getOriginalNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__Y, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y,
					args);

				args = new Object[] { keHoachVeSinhModelImpl.getNam() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__Y, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y,
					args);
			}

			if ((keHoachVeSinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachVeSinhModelImpl.getOriginalBaoCaoDLI()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__D_L_I, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I,
					args);

				args = new Object[] { keHoachVeSinhModelImpl.getBaoCaoDLI() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__D_L_I, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I,
					args);
			}

			if ((keHoachVeSinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachVeSinhModelImpl.getOriginalMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__O_R_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_1,
					args);

				args = new Object[] { keHoachVeSinhModelImpl.getMaTinh() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__O_R_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_1,
					args);
			}

			if ((keHoachVeSinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachVeSinhModelImpl.getOriginalMaHuyen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__O_R_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_2,
					args);

				args = new Object[] { keHoachVeSinhModelImpl.getMaHuyen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__O_R_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__O_R_2,
					args);
			}

			if ((keHoachVeSinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__X_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachVeSinhModelImpl.getOriginalMaXa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__X_A, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__X_A,
					args);

				args = new Object[] { keHoachVeSinhModelImpl.getMaXa() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__X_A, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__X_A,
					args);
			}
		}

		EntityCacheUtil.putResult(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachVeSinhImpl.class, keHoachVeSinh.getPrimaryKey(),
			keHoachVeSinh);

		clearUniqueFindersCache(keHoachVeSinh);
		cacheUniqueFindersCache(keHoachVeSinh);

		return keHoachVeSinh;
	}

	protected KeHoachVeSinh toUnwrappedModel(KeHoachVeSinh keHoachVeSinh) {
		if (keHoachVeSinh instanceof KeHoachVeSinhImpl) {
			return keHoachVeSinh;
		}

		KeHoachVeSinhImpl keHoachVeSinhImpl = new KeHoachVeSinhImpl();

		keHoachVeSinhImpl.setNew(keHoachVeSinh.isNew());
		keHoachVeSinhImpl.setPrimaryKey(keHoachVeSinh.getPrimaryKey());

		keHoachVeSinhImpl.setId(keHoachVeSinh.getId());
		keHoachVeSinhImpl.setMaTinh(keHoachVeSinh.getMaTinh());
		keHoachVeSinhImpl.setMaHuyen(keHoachVeSinh.getMaHuyen());
		keHoachVeSinhImpl.setMaXa(keHoachVeSinh.getMaXa());
		keHoachVeSinhImpl.setNam(keHoachVeSinh.getNam());
		keHoachVeSinhImpl.setSoNhaTieuHVSMoi(keHoachVeSinh.getSoNhaTieuHVSMoi());
		keHoachVeSinhImpl.setSoDan(keHoachVeSinh.getSoDan());
		keHoachVeSinhImpl.setDangKyVSTX(keHoachVeSinh.getDangKyVSTX());
		keHoachVeSinhImpl.setGhiChu(keHoachVeSinh.getGhiChu());
		keHoachVeSinhImpl.setBaoCaoDLI(keHoachVeSinh.getBaoCaoDLI());
		keHoachVeSinhImpl.setNgayTao(keHoachVeSinh.getNgayTao());
		keHoachVeSinhImpl.setIdNguoiTao(keHoachVeSinh.getIdNguoiTao());

		return keHoachVeSinhImpl;
	}

	/**
	 * Returns the ke hoach ve sinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach ve sinh
	 * @return the ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKeHoachVeSinhException, SystemException {
		KeHoachVeSinh keHoachVeSinh = fetchByPrimaryKey(primaryKey);

		if (keHoachVeSinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKeHoachVeSinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return keHoachVeSinh;
	}

	/**
	 * Returns the ke hoach ve sinh with the primary key or throws a {@link vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException} if it could not be found.
	 *
	 * @param id the primary key of the ke hoach ve sinh
	 * @return the ke hoach ve sinh
	 * @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh findByPrimaryKey(long id)
		throws NoSuchKeHoachVeSinhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ke hoach ve sinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach ve sinh
	 * @return the ke hoach ve sinh, or <code>null</code> if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KeHoachVeSinh keHoachVeSinh = (KeHoachVeSinh)EntityCacheUtil.getResult(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachVeSinhImpl.class, primaryKey);

		if (keHoachVeSinh == _nullKeHoachVeSinh) {
			return null;
		}

		if (keHoachVeSinh == null) {
			Session session = null;

			try {
				session = openSession();

				keHoachVeSinh = (KeHoachVeSinh)session.get(KeHoachVeSinhImpl.class,
						primaryKey);

				if (keHoachVeSinh != null) {
					cacheResult(keHoachVeSinh);
				}
				else {
					EntityCacheUtil.putResult(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachVeSinhImpl.class, primaryKey, _nullKeHoachVeSinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KeHoachVeSinhModelImpl.ENTITY_CACHE_ENABLED,
					KeHoachVeSinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return keHoachVeSinh;
	}

	/**
	 * Returns the ke hoach ve sinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ke hoach ve sinh
	 * @return the ke hoach ve sinh, or <code>null</code> if a ke hoach ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachVeSinh fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ke hoach ve sinhs.
	 *
	 * @return the ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach ve sinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @return the range of ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach ve sinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach ve sinhs
	 * @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ke hoach ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachVeSinh> findAll(int start, int end,
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

		List<KeHoachVeSinh> list = (List<KeHoachVeSinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KEHOACHVESINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KEHOACHVESINH;

				if (pagination) {
					sql = sql.concat(KeHoachVeSinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachVeSinh>(list);
				}
				else {
					list = (List<KeHoachVeSinh>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ke hoach ve sinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KeHoachVeSinh keHoachVeSinh : findAll()) {
			remove(keHoachVeSinh);
		}
	}

	/**
	 * Returns the number of ke hoach ve sinhs.
	 *
	 * @return the number of ke hoach ve sinhs
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

				Query q = session.createQuery(_SQL_COUNT_KEHOACHVESINH);

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
	 * Initializes the ke hoach ve sinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KeHoachVeSinh>> listenersList = new ArrayList<ModelListener<KeHoachVeSinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KeHoachVeSinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KeHoachVeSinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KEHOACHVESINH = "SELECT keHoachVeSinh FROM KeHoachVeSinh keHoachVeSinh";
	private static final String _SQL_SELECT_KEHOACHVESINH_WHERE = "SELECT keHoachVeSinh FROM KeHoachVeSinh keHoachVeSinh WHERE ";
	private static final String _SQL_COUNT_KEHOACHVESINH = "SELECT COUNT(keHoachVeSinh) FROM KeHoachVeSinh keHoachVeSinh";
	private static final String _SQL_COUNT_KEHOACHVESINH_WHERE = "SELECT COUNT(keHoachVeSinh) FROM KeHoachVeSinh keHoachVeSinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "keHoachVeSinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KeHoachVeSinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No KeHoachVeSinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KeHoachVeSinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "maHuyen", "maXa", "nam", "soNhaTieuHVSMoi",
				"soDan", "dangKyVSTX", "ghiChu", "baoCaoDLI", "ngayTao",
				"idNguoiTao"
			});
	private static KeHoachVeSinh _nullKeHoachVeSinh = new KeHoachVeSinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KeHoachVeSinh> toCacheModel() {
				return _nullKeHoachVeSinhCacheModel;
			}
		};

	private static CacheModel<KeHoachVeSinh> _nullKeHoachVeSinhCacheModel = new CacheModel<KeHoachVeSinh>() {
			@Override
			public KeHoachVeSinh toEntityModel() {
				return _nullKeHoachVeSinh;
			}
		};
}