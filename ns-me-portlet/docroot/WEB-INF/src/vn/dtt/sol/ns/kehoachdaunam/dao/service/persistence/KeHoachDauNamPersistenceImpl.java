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

package vn.dtt.sol.ns.kehoachdaunam.dao.service.persistence;

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
import com.liferay.portal.kernel.util.CalendarUtil;
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

import vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;
import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;
import vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamImpl;
import vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ke hoach dau nam service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KeHoachDauNamPersistence
 * @see KeHoachDauNamUtil
 * @generated
 */
public class KeHoachDauNamPersistenceImpl extends BasePersistenceImpl<KeHoachDauNam>
	implements KeHoachDauNamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KeHoachDauNamUtil} to access the ke hoach dau nam persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KeHoachDauNamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY__ID = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchBy_ID",
			new String[] { Long.class.getName() },
			KeHoachDauNamModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__ID = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns the ke hoach dau nam where id = &#63; or throws a {@link vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException} if it could not be found.
	 *
	 * @param id the ID
	 * @return the matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_ID(long id)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_ID(id);

		if (keHoachDauNam == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchKeHoachDauNamException(msg.toString());
		}

		return keHoachDauNam;
	}

	/**
	 * Returns the ke hoach dau nam where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the ID
	 * @return the matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_ID(long id) throws SystemException {
		return fetchBy_ID(id, true);
	}

	/**
	 * Returns the ke hoach dau nam where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_ID(long id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY__ID,
					finderArgs, this);
		}

		if (result instanceof KeHoachDauNam) {
			KeHoachDauNam keHoachDauNam = (KeHoachDauNam)result;

			if ((id != keHoachDauNam.getId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

			query.append(_FINDER_COLUMN__ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				List<KeHoachDauNam> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"KeHoachDauNamPersistenceImpl.fetchBy_ID(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					KeHoachDauNam keHoachDauNam = list.get(0);

					result = keHoachDauNam;

					cacheResult(keHoachDauNam);

					if ((keHoachDauNam.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID,
							finderArgs, keHoachDauNam);
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
			return (KeHoachDauNam)result;
		}
	}

	/**
	 * Removes the ke hoach dau nam where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @return the ke hoach dau nam that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam removeBy_ID(long id)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = findBy_ID(id);

		return remove(keHoachDauNam);
	}

	/**
	 * Returns the number of ke hoach dau nams where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching ke hoach dau nams
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

			query.append(_SQL_COUNT_KEHOACHDAUNAM_WHERE);

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

	private static final String _FINDER_COLUMN__ID_ID_2 = "keHoachDauNam.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__N_T = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_N_T",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_N_T", new String[] { Long.class.getName() },
			KeHoachDauNamModelImpl.IDNGUOITAO_COLUMN_BITMASK |
			KeHoachDauNamModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__N_T = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_N_T",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ke hoach dau nams where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @return the matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_N_T(long idNguoiTao)
		throws SystemException {
		return findBy_N_T(idNguoiTao, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach dau nams where idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @return the range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_N_T(long idNguoiTao, int start, int end)
		throws SystemException {
		return findBy_N_T(idNguoiTao, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach dau nams where idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_N_T(long idNguoiTao, int start, int end,
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

		List<KeHoachDauNam> list = (List<KeHoachDauNam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachDauNam keHoachDauNam : list) {
				if ((idNguoiTao != keHoachDauNam.getIdNguoiTao())) {
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

			query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

			query.append(_FINDER_COLUMN__N_T_IDNGUOITAO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idNguoiTao);

				if (!pagination) {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachDauNam>(list);
				}
				else {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_N_T_First(long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_N_T_First(idNguoiTao,
				orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the first ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_N_T_First(long idNguoiTao,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachDauNam> list = findBy_N_T(idNguoiTao, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_N_T_Last(long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_N_T_Last(idNguoiTao,
				orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_N_T_Last(long idNguoiTao,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_N_T(idNguoiTao);

		if (count == 0) {
			return null;
		}

		List<KeHoachDauNam> list = findBy_N_T(idNguoiTao, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param id the primary key of the current ke hoach dau nam
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam[] findBy_N_T_PrevAndNext(long id, long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachDauNam[] array = new KeHoachDauNamImpl[3];

			array[0] = getBy_N_T_PrevAndNext(session, keHoachDauNam,
					idNguoiTao, orderByComparator, true);

			array[1] = keHoachDauNam;

			array[2] = getBy_N_T_PrevAndNext(session, keHoachDauNam,
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

	protected KeHoachDauNam getBy_N_T_PrevAndNext(Session session,
		KeHoachDauNam keHoachDauNam, long idNguoiTao,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

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
			query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(idNguoiTao);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachDauNam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachDauNam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach dau nams where idNguoiTao = &#63; from the database.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_N_T(long idNguoiTao) throws SystemException {
		for (KeHoachDauNam keHoachDauNam : findBy_N_T(idNguoiTao,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachDauNam);
		}
	}

	/**
	 * Returns the number of ke hoach dau nams where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @return the number of matching ke hoach dau nams
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

			query.append(_SQL_COUNT_KEHOACHDAUNAM_WHERE);

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

	private static final String _FINDER_COLUMN__N_T_IDNGUOITAO_2 = "keHoachDauNam.idNguoiTao = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__T_C_N = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_T_C_N",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__T_C_N =
		new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_T_C_N", new String[] { Long.class.getName() },
			KeHoachDauNamModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			KeHoachDauNamModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__T_C_N = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_T_C_N",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ke hoach dau nams where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_T_C_N(long tramCapNuocId)
		throws SystemException {
		return findBy_T_C_N(tramCapNuocId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach dau nams where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @return the range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_T_C_N(long tramCapNuocId, int start,
		int end) throws SystemException {
		return findBy_T_C_N(tramCapNuocId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach dau nams where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_T_C_N(long tramCapNuocId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__T_C_N;
			finderArgs = new Object[] { tramCapNuocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__T_C_N;
			finderArgs = new Object[] {
					tramCapNuocId,
					
					start, end, orderByComparator
				};
		}

		List<KeHoachDauNam> list = (List<KeHoachDauNam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachDauNam keHoachDauNam : list) {
				if ((tramCapNuocId != keHoachDauNam.getTramCapNuocId())) {
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

			query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

			query.append(_FINDER_COLUMN__T_C_N_TRAMCAPNUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (!pagination) {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachDauNam>(list);
				}
				else {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_T_C_N_First(long tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_T_C_N_First(tramCapNuocId,
				orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_T_C_N_First(long tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachDauNam> list = findBy_T_C_N(tramCapNuocId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_T_C_N_Last(long tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_T_C_N_Last(tramCapNuocId,
				orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_T_C_N_Last(long tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_T_C_N(tramCapNuocId);

		if (count == 0) {
			return null;
		}

		List<KeHoachDauNam> list = findBy_T_C_N(tramCapNuocId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param id the primary key of the current ke hoach dau nam
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam[] findBy_T_C_N_PrevAndNext(long id,
		long tramCapNuocId, OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachDauNam[] array = new KeHoachDauNamImpl[3];

			array[0] = getBy_T_C_N_PrevAndNext(session, keHoachDauNam,
					tramCapNuocId, orderByComparator, true);

			array[1] = keHoachDauNam;

			array[2] = getBy_T_C_N_PrevAndNext(session, keHoachDauNam,
					tramCapNuocId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KeHoachDauNam getBy_T_C_N_PrevAndNext(Session session,
		KeHoachDauNam keHoachDauNam, long tramCapNuocId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

		query.append(_FINDER_COLUMN__T_C_N_TRAMCAPNUOCID_2);

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
			query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachDauNam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachDauNam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach dau nams where tramCapNuocId = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_T_C_N(long tramCapNuocId) throws SystemException {
		for (KeHoachDauNam keHoachDauNam : findBy_T_C_N(tramCapNuocId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachDauNam);
		}
	}

	/**
	 * Returns the number of ke hoach dau nams where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the number of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_T_C_N(long tramCapNuocId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__T_C_N;

		Object[] finderArgs = new Object[] { tramCapNuocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHDAUNAM_WHERE);

			query.append(_FINDER_COLUMN__T_C_N_TRAMCAPNUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

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

	private static final String _FINDER_COLUMN__T_C_N_TRAMCAPNUOCID_2 = "keHoachDauNam.tramCapNuocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__Y = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_Y",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_Y", new String[] { Long.class.getName() },
			KeHoachDauNamModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__Y = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_Y",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ke hoach dau nams where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_Y(long nam) throws SystemException {
		return findBy_Y(nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach dau nams where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @return the range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_Y(long nam, int start, int end)
		throws SystemException {
		return findBy_Y(nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach dau nams where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_Y(long nam, int start, int end,
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

		List<KeHoachDauNam> list = (List<KeHoachDauNam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachDauNam keHoachDauNam : list) {
				if ((nam != keHoachDauNam.getNam())) {
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

			query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

			query.append(_FINDER_COLUMN__Y_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nam);

				if (!pagination) {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachDauNam>(list);
				}
				else {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach dau nam in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_Y_First(long nam,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_Y_First(nam, orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the first ke hoach dau nam in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_Y_First(long nam,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachDauNam> list = findBy_Y(nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_Y_Last(long nam,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_Y_Last(nam, orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_Y_Last(long nam,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_Y(nam);

		if (count == 0) {
			return null;
		}

		List<KeHoachDauNam> list = findBy_Y(nam, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where nam = &#63;.
	 *
	 * @param id the primary key of the current ke hoach dau nam
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam[] findBy_Y_PrevAndNext(long id, long nam,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachDauNam[] array = new KeHoachDauNamImpl[3];

			array[0] = getBy_Y_PrevAndNext(session, keHoachDauNam, nam,
					orderByComparator, true);

			array[1] = keHoachDauNam;

			array[2] = getBy_Y_PrevAndNext(session, keHoachDauNam, nam,
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

	protected KeHoachDauNam getBy_Y_PrevAndNext(Session session,
		KeHoachDauNam keHoachDauNam, long nam,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

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
			query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachDauNam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachDauNam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach dau nams where nam = &#63; from the database.
	 *
	 * @param nam the nam
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_Y(long nam) throws SystemException {
		for (KeHoachDauNam keHoachDauNam : findBy_Y(nam, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(keHoachDauNam);
		}
	}

	/**
	 * Returns the number of ke hoach dau nams where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching ke hoach dau nams
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

			query.append(_SQL_COUNT_KEHOACHDAUNAM_WHERE);

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

	private static final String _FINDER_COLUMN__Y_NAM_2 = "keHoachDauNam.nam = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRAMCAP_NAM =
		new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTramCap_Nam",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAMCAP_NAM =
		new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTramCap_Nam",
			new String[] { Long.class.getName(), Long.class.getName() },
			KeHoachDauNamModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			KeHoachDauNamModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRAMCAP_NAM = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTramCap_Nam",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @return the matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findByTramCap_Nam(long tramCapNuocId, long nam)
		throws SystemException {
		return findByTramCap_Nam(tramCapNuocId, nam, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @return the range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findByTramCap_Nam(long tramCapNuocId, long nam,
		int start, int end) throws SystemException {
		return findByTramCap_Nam(tramCapNuocId, nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findByTramCap_Nam(long tramCapNuocId, long nam,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAMCAP_NAM;
			finderArgs = new Object[] { tramCapNuocId, nam };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRAMCAP_NAM;
			finderArgs = new Object[] {
					tramCapNuocId, nam,
					
					start, end, orderByComparator
				};
		}

		List<KeHoachDauNam> list = (List<KeHoachDauNam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachDauNam keHoachDauNam : list) {
				if ((tramCapNuocId != keHoachDauNam.getTramCapNuocId()) ||
						(nam != keHoachDauNam.getNam())) {
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

			query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

			query.append(_FINDER_COLUMN_TRAMCAP_NAM_TRAMCAPNUOCID_2);

			query.append(_FINDER_COLUMN_TRAMCAP_NAM_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				qPos.add(nam);

				if (!pagination) {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachDauNam>(list);
				}
				else {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findByTramCap_Nam_First(long tramCapNuocId, long nam,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchByTramCap_Nam_First(tramCapNuocId,
				nam, orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchByTramCap_Nam_First(long tramCapNuocId, long nam,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachDauNam> list = findByTramCap_Nam(tramCapNuocId, nam, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findByTramCap_Nam_Last(long tramCapNuocId, long nam,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchByTramCap_Nam_Last(tramCapNuocId,
				nam, orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchByTramCap_Nam_Last(long tramCapNuocId, long nam,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTramCap_Nam(tramCapNuocId, nam);

		if (count == 0) {
			return null;
		}

		List<KeHoachDauNam> list = findByTramCap_Nam(tramCapNuocId, nam,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current ke hoach dau nam
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam[] findByTramCap_Nam_PrevAndNext(long id,
		long tramCapNuocId, long nam, OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachDauNam[] array = new KeHoachDauNamImpl[3];

			array[0] = getByTramCap_Nam_PrevAndNext(session, keHoachDauNam,
					tramCapNuocId, nam, orderByComparator, true);

			array[1] = keHoachDauNam;

			array[2] = getByTramCap_Nam_PrevAndNext(session, keHoachDauNam,
					tramCapNuocId, nam, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KeHoachDauNam getByTramCap_Nam_PrevAndNext(Session session,
		KeHoachDauNam keHoachDauNam, long tramCapNuocId, long nam,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

		query.append(_FINDER_COLUMN_TRAMCAP_NAM_TRAMCAPNUOCID_2);

		query.append(_FINDER_COLUMN_TRAMCAP_NAM_NAM_2);

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
			query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachDauNam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachDauNam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTramCap_Nam(long tramCapNuocId, long nam)
		throws SystemException {
		for (KeHoachDauNam keHoachDauNam : findByTramCap_Nam(tramCapNuocId,
				nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachDauNam);
		}
	}

	/**
	 * Returns the number of ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @return the number of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTramCap_Nam(long tramCapNuocId, long nam)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRAMCAP_NAM;

		Object[] finderArgs = new Object[] { tramCapNuocId, nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_KEHOACHDAUNAM_WHERE);

			query.append(_FINDER_COLUMN_TRAMCAP_NAM_TRAMCAPNUOCID_2);

			query.append(_FINDER_COLUMN_TRAMCAP_NAM_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

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

	private static final String _FINDER_COLUMN_TRAMCAP_NAM_TRAMCAPNUOCID_2 = "keHoachDauNam.tramCapNuocId = ? AND ";
	private static final String _FINDER_COLUMN_TRAMCAP_NAM_NAM_2 = "keHoachDauNam.nam = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__D_L_I = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_D_L_I",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I =
		new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_D_L_I", new String[] { Long.class.getName() },
			KeHoachDauNamModelImpl.BAOCAODLI_COLUMN_BITMASK |
			KeHoachDauNamModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__D_L_I = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_D_L_I",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ke hoach dau nams where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @return the matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_D_L_I(long baoCaoDLI)
		throws SystemException {
		return findBy_D_L_I(baoCaoDLI, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the ke hoach dau nams where baoCaoDLI = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @return the range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_D_L_I(long baoCaoDLI, int start, int end)
		throws SystemException {
		return findBy_D_L_I(baoCaoDLI, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach dau nams where baoCaoDLI = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_D_L_I(long baoCaoDLI, int start, int end,
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

		List<KeHoachDauNam> list = (List<KeHoachDauNam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachDauNam keHoachDauNam : list) {
				if ((baoCaoDLI != keHoachDauNam.getBaoCaoDLI())) {
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

			query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

			query.append(_FINDER_COLUMN__D_L_I_BAOCAODLI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(baoCaoDLI);

				if (!pagination) {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachDauNam>(list);
				}
				else {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_D_L_I_First(long baoCaoDLI,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_D_L_I_First(baoCaoDLI,
				orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("baoCaoDLI=");
		msg.append(baoCaoDLI);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the first ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_D_L_I_First(long baoCaoDLI,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachDauNam> list = findBy_D_L_I(baoCaoDLI, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_D_L_I_Last(long baoCaoDLI,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_D_L_I_Last(baoCaoDLI,
				orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("baoCaoDLI=");
		msg.append(baoCaoDLI);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_D_L_I_Last(long baoCaoDLI,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_D_L_I(baoCaoDLI);

		if (count == 0) {
			return null;
		}

		List<KeHoachDauNam> list = findBy_D_L_I(baoCaoDLI, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	 *
	 * @param id the primary key of the current ke hoach dau nam
	 * @param baoCaoDLI the bao cao d l i
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam[] findBy_D_L_I_PrevAndNext(long id, long baoCaoDLI,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachDauNam[] array = new KeHoachDauNamImpl[3];

			array[0] = getBy_D_L_I_PrevAndNext(session, keHoachDauNam,
					baoCaoDLI, orderByComparator, true);

			array[1] = keHoachDauNam;

			array[2] = getBy_D_L_I_PrevAndNext(session, keHoachDauNam,
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

	protected KeHoachDauNam getBy_D_L_I_PrevAndNext(Session session,
		KeHoachDauNam keHoachDauNam, long baoCaoDLI,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

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
			query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(baoCaoDLI);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachDauNam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachDauNam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach dau nams where baoCaoDLI = &#63; from the database.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_D_L_I(long baoCaoDLI) throws SystemException {
		for (KeHoachDauNam keHoachDauNam : findBy_D_L_I(baoCaoDLI,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachDauNam);
		}
	}

	/**
	 * Returns the number of ke hoach dau nams where baoCaoDLI = &#63;.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 * @return the number of matching ke hoach dau nams
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

			query.append(_SQL_COUNT_KEHOACHDAUNAM_WHERE);

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

	private static final String _FINDER_COLUMN__D_L_I_BAOCAODLI_2 = "keHoachDauNam.baoCaoDLI = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__D = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_D",
			new String[] {
				Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED,
			KeHoachDauNamImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_D", new String[] { Date.class.getName() },
			KeHoachDauNamModelImpl.NGAYTAO_COLUMN_BITMASK |
			KeHoachDauNamModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__D = new FinderPath(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_D",
			new String[] { Date.class.getName() });

	/**
	 * Returns all the ke hoach dau nams where ngayTao = &#63;.
	 *
	 * @param ngayTao the ngay tao
	 * @return the matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_D(Date ngayTao) throws SystemException {
		return findBy_D(ngayTao, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach dau nams where ngayTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayTao the ngay tao
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @return the range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_D(Date ngayTao, int start, int end)
		throws SystemException {
		return findBy_D(ngayTao, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach dau nams where ngayTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayTao the ngay tao
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findBy_D(Date ngayTao, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D;
			finderArgs = new Object[] { ngayTao };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__D;
			finderArgs = new Object[] { ngayTao, start, end, orderByComparator };
		}

		List<KeHoachDauNam> list = (List<KeHoachDauNam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachDauNam keHoachDauNam : list) {
				if (!Validator.equals(ngayTao, keHoachDauNam.getNgayTao())) {
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

			query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

			boolean bindNgayTao = false;

			if (ngayTao == null) {
				query.append(_FINDER_COLUMN__D_NGAYTAO_1);
			}
			else {
				bindNgayTao = true;

				query.append(_FINDER_COLUMN__D_NGAYTAO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayTao) {
					qPos.add(CalendarUtil.getTimestamp(ngayTao));
				}

				if (!pagination) {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachDauNam>(list);
				}
				else {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ke hoach dau nam in the ordered set where ngayTao = &#63;.
	 *
	 * @param ngayTao the ngay tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_D_First(Date ngayTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_D_First(ngayTao, orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayTao=");
		msg.append(ngayTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the first ke hoach dau nam in the ordered set where ngayTao = &#63;.
	 *
	 * @param ngayTao the ngay tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_D_First(Date ngayTao,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachDauNam> list = findBy_D(ngayTao, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where ngayTao = &#63;.
	 *
	 * @param ngayTao the ngay tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findBy_D_Last(Date ngayTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchBy_D_Last(ngayTao, orderByComparator);

		if (keHoachDauNam != null) {
			return keHoachDauNam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayTao=");
		msg.append(ngayTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachDauNamException(msg.toString());
	}

	/**
	 * Returns the last ke hoach dau nam in the ordered set where ngayTao = &#63;.
	 *
	 * @param ngayTao the ngay tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchBy_D_Last(Date ngayTao,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_D(ngayTao);

		if (count == 0) {
			return null;
		}

		List<KeHoachDauNam> list = findBy_D(ngayTao, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where ngayTao = &#63;.
	 *
	 * @param id the primary key of the current ke hoach dau nam
	 * @param ngayTao the ngay tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam[] findBy_D_PrevAndNext(long id, Date ngayTao,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachDauNam[] array = new KeHoachDauNamImpl[3];

			array[0] = getBy_D_PrevAndNext(session, keHoachDauNam, ngayTao,
					orderByComparator, true);

			array[1] = keHoachDauNam;

			array[2] = getBy_D_PrevAndNext(session, keHoachDauNam, ngayTao,
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

	protected KeHoachDauNam getBy_D_PrevAndNext(Session session,
		KeHoachDauNam keHoachDauNam, Date ngayTao,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHDAUNAM_WHERE);

		boolean bindNgayTao = false;

		if (ngayTao == null) {
			query.append(_FINDER_COLUMN__D_NGAYTAO_1);
		}
		else {
			bindNgayTao = true;

			query.append(_FINDER_COLUMN__D_NGAYTAO_2);
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
			query.append(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNgayTao) {
			qPos.add(CalendarUtil.getTimestamp(ngayTao));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachDauNam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachDauNam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach dau nams where ngayTao = &#63; from the database.
	 *
	 * @param ngayTao the ngay tao
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_D(Date ngayTao) throws SystemException {
		for (KeHoachDauNam keHoachDauNam : findBy_D(ngayTao, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(keHoachDauNam);
		}
	}

	/**
	 * Returns the number of ke hoach dau nams where ngayTao = &#63;.
	 *
	 * @param ngayTao the ngay tao
	 * @return the number of matching ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_D(Date ngayTao) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__D;

		Object[] finderArgs = new Object[] { ngayTao };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEHOACHDAUNAM_WHERE);

			boolean bindNgayTao = false;

			if (ngayTao == null) {
				query.append(_FINDER_COLUMN__D_NGAYTAO_1);
			}
			else {
				bindNgayTao = true;

				query.append(_FINDER_COLUMN__D_NGAYTAO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayTao) {
					qPos.add(CalendarUtil.getTimestamp(ngayTao));
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

	private static final String _FINDER_COLUMN__D_NGAYTAO_1 = "keHoachDauNam.ngayTao IS NULL";
	private static final String _FINDER_COLUMN__D_NGAYTAO_2 = "keHoachDauNam.ngayTao = ?";

	public KeHoachDauNamPersistenceImpl() {
		setModelClass(KeHoachDauNam.class);
	}

	/**
	 * Caches the ke hoach dau nam in the entity cache if it is enabled.
	 *
	 * @param keHoachDauNam the ke hoach dau nam
	 */
	@Override
	public void cacheResult(KeHoachDauNam keHoachDauNam) {
		EntityCacheUtil.putResult(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamImpl.class, keHoachDauNam.getPrimaryKey(),
			keHoachDauNam);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID,
			new Object[] { keHoachDauNam.getId() }, keHoachDauNam);

		keHoachDauNam.resetOriginalValues();
	}

	/**
	 * Caches the ke hoach dau nams in the entity cache if it is enabled.
	 *
	 * @param keHoachDauNams the ke hoach dau nams
	 */
	@Override
	public void cacheResult(List<KeHoachDauNam> keHoachDauNams) {
		for (KeHoachDauNam keHoachDauNam : keHoachDauNams) {
			if (EntityCacheUtil.getResult(
						KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachDauNamImpl.class, keHoachDauNam.getPrimaryKey()) == null) {
				cacheResult(keHoachDauNam);
			}
			else {
				keHoachDauNam.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ke hoach dau nams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KeHoachDauNamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KeHoachDauNamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ke hoach dau nam.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KeHoachDauNam keHoachDauNam) {
		EntityCacheUtil.removeResult(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamImpl.class, keHoachDauNam.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(keHoachDauNam);
	}

	@Override
	public void clearCache(List<KeHoachDauNam> keHoachDauNams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KeHoachDauNam keHoachDauNam : keHoachDauNams) {
			EntityCacheUtil.removeResult(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachDauNamImpl.class, keHoachDauNam.getPrimaryKey());

			clearUniqueFindersCache(keHoachDauNam);
		}
	}

	protected void cacheUniqueFindersCache(KeHoachDauNam keHoachDauNam) {
		if (keHoachDauNam.isNew()) {
			Object[] args = new Object[] { keHoachDauNam.getId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY__ID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID, args,
				keHoachDauNam);
		}
		else {
			KeHoachDauNamModelImpl keHoachDauNamModelImpl = (KeHoachDauNamModelImpl)keHoachDauNam;

			if ((keHoachDauNamModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY__ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { keHoachDauNam.getId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY__ID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY__ID, args,
					keHoachDauNam);
			}
		}
	}

	protected void clearUniqueFindersCache(KeHoachDauNam keHoachDauNam) {
		KeHoachDauNamModelImpl keHoachDauNamModelImpl = (KeHoachDauNamModelImpl)keHoachDauNam;

		Object[] args = new Object[] { keHoachDauNam.getId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__ID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY__ID, args);

		if ((keHoachDauNamModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY__ID.getColumnBitmask()) != 0) {
			args = new Object[] { keHoachDauNamModelImpl.getOriginalId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__ID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY__ID, args);
		}
	}

	/**
	 * Creates a new ke hoach dau nam with the primary key. Does not add the ke hoach dau nam to the database.
	 *
	 * @param id the primary key for the new ke hoach dau nam
	 * @return the new ke hoach dau nam
	 */
	@Override
	public KeHoachDauNam create(long id) {
		KeHoachDauNam keHoachDauNam = new KeHoachDauNamImpl();

		keHoachDauNam.setNew(true);
		keHoachDauNam.setPrimaryKey(id);

		return keHoachDauNam;
	}

	/**
	 * Removes the ke hoach dau nam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ke hoach dau nam
	 * @return the ke hoach dau nam that was removed
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam remove(long id)
		throws NoSuchKeHoachDauNamException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ke hoach dau nam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ke hoach dau nam
	 * @return the ke hoach dau nam that was removed
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam remove(Serializable primaryKey)
		throws NoSuchKeHoachDauNamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KeHoachDauNam keHoachDauNam = (KeHoachDauNam)session.get(KeHoachDauNamImpl.class,
					primaryKey);

			if (keHoachDauNam == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKeHoachDauNamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(keHoachDauNam);
		}
		catch (NoSuchKeHoachDauNamException nsee) {
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
	protected KeHoachDauNam removeImpl(KeHoachDauNam keHoachDauNam)
		throws SystemException {
		keHoachDauNam = toUnwrappedModel(keHoachDauNam);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(keHoachDauNam)) {
				keHoachDauNam = (KeHoachDauNam)session.get(KeHoachDauNamImpl.class,
						keHoachDauNam.getPrimaryKeyObj());
			}

			if (keHoachDauNam != null) {
				session.delete(keHoachDauNam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (keHoachDauNam != null) {
			clearCache(keHoachDauNam);
		}

		return keHoachDauNam;
	}

	@Override
	public KeHoachDauNam updateImpl(
		vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam keHoachDauNam)
		throws SystemException {
		keHoachDauNam = toUnwrappedModel(keHoachDauNam);

		boolean isNew = keHoachDauNam.isNew();

		KeHoachDauNamModelImpl keHoachDauNamModelImpl = (KeHoachDauNamModelImpl)keHoachDauNam;

		Session session = null;

		try {
			session = openSession();

			if (keHoachDauNam.isNew()) {
				session.save(keHoachDauNam);

				keHoachDauNam.setNew(false);
			}
			else {
				session.merge(keHoachDauNam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KeHoachDauNamModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((keHoachDauNamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachDauNamModelImpl.getOriginalIdNguoiTao()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__N_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T,
					args);

				args = new Object[] { keHoachDauNamModelImpl.getIdNguoiTao() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__N_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__N_T,
					args);
			}

			if ((keHoachDauNamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__T_C_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachDauNamModelImpl.getOriginalTramCapNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__T_C_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__T_C_N,
					args);

				args = new Object[] { keHoachDauNamModelImpl.getTramCapNuocId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__T_C_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__T_C_N,
					args);
			}

			if ((keHoachDauNamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachDauNamModelImpl.getOriginalNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__Y, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y,
					args);

				args = new Object[] { keHoachDauNamModelImpl.getNam() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__Y, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__Y,
					args);
			}

			if ((keHoachDauNamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAMCAP_NAM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachDauNamModelImpl.getOriginalTramCapNuocId(),
						keHoachDauNamModelImpl.getOriginalNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRAMCAP_NAM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAMCAP_NAM,
					args);

				args = new Object[] {
						keHoachDauNamModelImpl.getTramCapNuocId(),
						keHoachDauNamModelImpl.getNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRAMCAP_NAM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAMCAP_NAM,
					args);
			}

			if ((keHoachDauNamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachDauNamModelImpl.getOriginalBaoCaoDLI()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__D_L_I, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I,
					args);

				args = new Object[] { keHoachDauNamModelImpl.getBaoCaoDLI() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__D_L_I, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D_L_I,
					args);
			}

			if ((keHoachDauNamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachDauNamModelImpl.getOriginalNgayTao()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__D, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D,
					args);

				args = new Object[] { keHoachDauNamModelImpl.getNgayTao() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__D, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__D,
					args);
			}
		}

		EntityCacheUtil.putResult(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachDauNamImpl.class, keHoachDauNam.getPrimaryKey(),
			keHoachDauNam);

		clearUniqueFindersCache(keHoachDauNam);
		cacheUniqueFindersCache(keHoachDauNam);

		return keHoachDauNam;
	}

	protected KeHoachDauNam toUnwrappedModel(KeHoachDauNam keHoachDauNam) {
		if (keHoachDauNam instanceof KeHoachDauNamImpl) {
			return keHoachDauNam;
		}

		KeHoachDauNamImpl keHoachDauNamImpl = new KeHoachDauNamImpl();

		keHoachDauNamImpl.setNew(keHoachDauNam.isNew());
		keHoachDauNamImpl.setPrimaryKey(keHoachDauNam.getPrimaryKey());

		keHoachDauNamImpl.setId(keHoachDauNam.getId());
		keHoachDauNamImpl.setTramCapNuocId(keHoachDauNam.getTramCapNuocId());
		keHoachDauNamImpl.setNam(keHoachDauNam.getNam());
		keHoachDauNamImpl.setSoDauNoiMoi(keHoachDauNam.getSoDauNoiMoi());
		keHoachDauNamImpl.setSoHoHuongLoi(keHoachDauNam.getSoHoHuongLoi());
		keHoachDauNamImpl.setSoNguoiHuongLoi(keHoachDauNam.getSoNguoiHuongLoi());
		keHoachDauNamImpl.setGhiChu(keHoachDauNam.getGhiChu());
		keHoachDauNamImpl.setBaoCaoDLI(keHoachDauNam.getBaoCaoDLI());
		keHoachDauNamImpl.setNgayTao(keHoachDauNam.getNgayTao());
		keHoachDauNamImpl.setIdNguoiTao(keHoachDauNam.getIdNguoiTao());

		return keHoachDauNamImpl;
	}

	/**
	 * Returns the ke hoach dau nam with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach dau nam
	 * @return the ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKeHoachDauNamException, SystemException {
		KeHoachDauNam keHoachDauNam = fetchByPrimaryKey(primaryKey);

		if (keHoachDauNam == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKeHoachDauNamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return keHoachDauNam;
	}

	/**
	 * Returns the ke hoach dau nam with the primary key or throws a {@link vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException} if it could not be found.
	 *
	 * @param id the primary key of the ke hoach dau nam
	 * @return the ke hoach dau nam
	 * @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam findByPrimaryKey(long id)
		throws NoSuchKeHoachDauNamException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ke hoach dau nam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach dau nam
	 * @return the ke hoach dau nam, or <code>null</code> if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KeHoachDauNam keHoachDauNam = (KeHoachDauNam)EntityCacheUtil.getResult(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachDauNamImpl.class, primaryKey);

		if (keHoachDauNam == _nullKeHoachDauNam) {
			return null;
		}

		if (keHoachDauNam == null) {
			Session session = null;

			try {
				session = openSession();

				keHoachDauNam = (KeHoachDauNam)session.get(KeHoachDauNamImpl.class,
						primaryKey);

				if (keHoachDauNam != null) {
					cacheResult(keHoachDauNam);
				}
				else {
					EntityCacheUtil.putResult(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachDauNamImpl.class, primaryKey, _nullKeHoachDauNam);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KeHoachDauNamModelImpl.ENTITY_CACHE_ENABLED,
					KeHoachDauNamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return keHoachDauNam;
	}

	/**
	 * Returns the ke hoach dau nam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ke hoach dau nam
	 * @return the ke hoach dau nam, or <code>null</code> if a ke hoach dau nam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachDauNam fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ke hoach dau nams.
	 *
	 * @return the ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach dau nams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @return the range of ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach dau nams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach dau nams
	 * @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ke hoach dau nams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachDauNam> findAll(int start, int end,
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

		List<KeHoachDauNam> list = (List<KeHoachDauNam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KEHOACHDAUNAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KEHOACHDAUNAM;

				if (pagination) {
					sql = sql.concat(KeHoachDauNamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachDauNam>(list);
				}
				else {
					list = (List<KeHoachDauNam>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ke hoach dau nams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KeHoachDauNam keHoachDauNam : findAll()) {
			remove(keHoachDauNam);
		}
	}

	/**
	 * Returns the number of ke hoach dau nams.
	 *
	 * @return the number of ke hoach dau nams
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

				Query q = session.createQuery(_SQL_COUNT_KEHOACHDAUNAM);

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
	 * Initializes the ke hoach dau nam persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KeHoachDauNam>> listenersList = new ArrayList<ModelListener<KeHoachDauNam>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KeHoachDauNam>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KeHoachDauNamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KEHOACHDAUNAM = "SELECT keHoachDauNam FROM KeHoachDauNam keHoachDauNam";
	private static final String _SQL_SELECT_KEHOACHDAUNAM_WHERE = "SELECT keHoachDauNam FROM KeHoachDauNam keHoachDauNam WHERE ";
	private static final String _SQL_COUNT_KEHOACHDAUNAM = "SELECT COUNT(keHoachDauNam) FROM KeHoachDauNam keHoachDauNam";
	private static final String _SQL_COUNT_KEHOACHDAUNAM_WHERE = "SELECT COUNT(keHoachDauNam) FROM KeHoachDauNam keHoachDauNam WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "keHoachDauNam.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KeHoachDauNam exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No KeHoachDauNam exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KeHoachDauNamPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "tramCapNuocId", "nam", "soDauNoiMoi", "soHoHuongLoi",
				"soNguoiHuongLoi", "ghiChu", "baoCaoDLI", "ngayTao",
				"idNguoiTao"
			});
	private static KeHoachDauNam _nullKeHoachDauNam = new KeHoachDauNamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KeHoachDauNam> toCacheModel() {
				return _nullKeHoachDauNamCacheModel;
			}
		};

	private static CacheModel<KeHoachDauNam> _nullKeHoachDauNamCacheModel = new CacheModel<KeHoachDauNam>() {
			@Override
			public KeHoachDauNam toEntityModel() {
				return _nullKeHoachDauNam;
			}
		};
}