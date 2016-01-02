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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dau noi nuoc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DauNoiNuocPersistence
 * @see DauNoiNuocUtil
 * @generated
 */
public class DauNoiNuocPersistenceImpl extends BasePersistenceImpl<DauNoiNuoc>
	implements DauNoiNuocPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DauNoiNuocUtil} to access the dau noi nuoc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DauNoiNuocImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_ = new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_ = new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_",
			new String[] { Integer.class.getName() },
			DauNoiNuocModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MATINH_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MAHUYEN_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MAXA_COLUMN_BITMASK |
			DauNoiNuocModelImpl.THONXOM_COLUMN_BITMASK |
			DauNoiNuocModelImpl.TENCHUHO_COLUMN_BITMASK |
			DauNoiNuocModelImpl.TRANGTHAI_COLUMN_BITMASK |
			DauNoiNuocModelImpl.NAMBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_ = new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the dau noi nuocs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_(int tramCapNuocId)
		throws SystemException {
		return findByT_(tramCapNuocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dau noi nuocs where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @return the range of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_(int tramCapNuocId, int start, int end)
		throws SystemException {
		return findByT_(tramCapNuocId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dau noi nuocs where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_(int tramCapNuocId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_;
			finderArgs = new Object[] { tramCapNuocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_;
			finderArgs = new Object[] {
					tramCapNuocId,
					
					start, end, orderByComparator
				};
		}

		List<DauNoiNuoc> list = (List<DauNoiNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DauNoiNuoc dauNoiNuoc : list) {
				if ((tramCapNuocId != dauNoiNuoc.getTramCapNuocId())) {
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

			query.append(_SQL_SELECT_DAUNOINUOC_WHERE);

			query.append(_FINDER_COLUMN_T__TRAMCAPNUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DauNoiNuocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (!pagination) {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DauNoiNuoc>(list);
				}
				else {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByT__First(int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByT__First(tramCapNuocId, orderByComparator);

		if (dauNoiNuoc != null) {
			return dauNoiNuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDauNoiNuocException(msg.toString());
	}

	/**
	 * Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByT__First(int tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DauNoiNuoc> list = findByT_(tramCapNuocId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByT__Last(int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByT__Last(tramCapNuocId, orderByComparator);

		if (dauNoiNuoc != null) {
			return dauNoiNuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDauNoiNuocException(msg.toString());
	}

	/**
	 * Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByT__Last(int tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_(tramCapNuocId);

		if (count == 0) {
			return null;
		}

		List<DauNoiNuoc> list = findByT_(tramCapNuocId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dau noi nuocs before and after the current dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param id the primary key of the current dau noi nuoc
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc[] findByT__PrevAndNext(long id, int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DauNoiNuoc[] array = new DauNoiNuocImpl[3];

			array[0] = getByT__PrevAndNext(session, dauNoiNuoc, tramCapNuocId,
					orderByComparator, true);

			array[1] = dauNoiNuoc;

			array[2] = getByT__PrevAndNext(session, dauNoiNuoc, tramCapNuocId,
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

	protected DauNoiNuoc getByT__PrevAndNext(Session session,
		DauNoiNuoc dauNoiNuoc, int tramCapNuocId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DAUNOINUOC_WHERE);

		query.append(_FINDER_COLUMN_T__TRAMCAPNUOCID_2);

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
			query.append(DauNoiNuocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dauNoiNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DauNoiNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dau noi nuocs where tramCapNuocId = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_(int tramCapNuocId) throws SystemException {
		for (DauNoiNuoc dauNoiNuoc : findByT_(tramCapNuocId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dauNoiNuoc);
		}
	}

	/**
	 * Returns the number of dau noi nuocs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the number of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_(int tramCapNuocId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_;

		Object[] finderArgs = new Object[] { tramCapNuocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DAUNOINUOC_WHERE);

			query.append(_FINDER_COLUMN_T__TRAMCAPNUOCID_2);

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

	private static final String _FINDER_COLUMN_T__TRAMCAPNUOCID_2 = "dauNoiNuoc.tramCapNuocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA =
		new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_tramCapNuocId_idNguoiDanhGia",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA =
		new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByT_tramCapNuocId_idNguoiDanhGia",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			DauNoiNuocModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			DauNoiNuocModelImpl.IDNGUOIDANHGIA_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MATINH_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MAHUYEN_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MAXA_COLUMN_BITMASK |
			DauNoiNuocModelImpl.THONXOM_COLUMN_BITMASK |
			DauNoiNuocModelImpl.TENCHUHO_COLUMN_BITMASK |
			DauNoiNuocModelImpl.TRANGTHAI_COLUMN_BITMASK |
			DauNoiNuocModelImpl.NAMBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA =
		new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByT_tramCapNuocId_idNguoiDanhGia",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @return the matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_tramCapNuocId_idNguoiDanhGia(
		int tramCapNuocId, int idNguoiDanhGia) throws SystemException {
		return findByT_tramCapNuocId_idNguoiDanhGia(tramCapNuocId,
			idNguoiDanhGia, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @return the range of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_tramCapNuocId_idNguoiDanhGia(
		int tramCapNuocId, int idNguoiDanhGia, int start, int end)
		throws SystemException {
		return findByT_tramCapNuocId_idNguoiDanhGia(tramCapNuocId,
			idNguoiDanhGia, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_tramCapNuocId_idNguoiDanhGia(
		int tramCapNuocId, int idNguoiDanhGia, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA;
			finderArgs = new Object[] { tramCapNuocId, idNguoiDanhGia };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA;
			finderArgs = new Object[] {
					tramCapNuocId, idNguoiDanhGia,
					
					start, end, orderByComparator
				};
		}

		List<DauNoiNuoc> list = (List<DauNoiNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DauNoiNuoc dauNoiNuoc : list) {
				if ((tramCapNuocId != dauNoiNuoc.getTramCapNuocId()) ||
						(idNguoiDanhGia != dauNoiNuoc.getIdNguoiDanhGia())) {
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

			query.append(_SQL_SELECT_DAUNOINUOC_WHERE);

			query.append(_FINDER_COLUMN_T_TRAMCAPNUOCID_IDNGUOIDANHGIA_TRAMCAPNUOCID_2);

			query.append(_FINDER_COLUMN_T_TRAMCAPNUOCID_IDNGUOIDANHGIA_IDNGUOIDANHGIA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DauNoiNuocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				qPos.add(idNguoiDanhGia);

				if (!pagination) {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DauNoiNuoc>(list);
				}
				else {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByT_tramCapNuocId_idNguoiDanhGia_First(
		int tramCapNuocId, int idNguoiDanhGia,
		OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByT_tramCapNuocId_idNguoiDanhGia_First(tramCapNuocId,
				idNguoiDanhGia, orderByComparator);

		if (dauNoiNuoc != null) {
			return dauNoiNuoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", idNguoiDanhGia=");
		msg.append(idNguoiDanhGia);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDauNoiNuocException(msg.toString());
	}

	/**
	 * Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByT_tramCapNuocId_idNguoiDanhGia_First(
		int tramCapNuocId, int idNguoiDanhGia,
		OrderByComparator orderByComparator) throws SystemException {
		List<DauNoiNuoc> list = findByT_tramCapNuocId_idNguoiDanhGia(tramCapNuocId,
				idNguoiDanhGia, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByT_tramCapNuocId_idNguoiDanhGia_Last(
		int tramCapNuocId, int idNguoiDanhGia,
		OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByT_tramCapNuocId_idNguoiDanhGia_Last(tramCapNuocId,
				idNguoiDanhGia, orderByComparator);

		if (dauNoiNuoc != null) {
			return dauNoiNuoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", idNguoiDanhGia=");
		msg.append(idNguoiDanhGia);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDauNoiNuocException(msg.toString());
	}

	/**
	 * Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByT_tramCapNuocId_idNguoiDanhGia_Last(
		int tramCapNuocId, int idNguoiDanhGia,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_tramCapNuocId_idNguoiDanhGia(tramCapNuocId,
				idNguoiDanhGia);

		if (count == 0) {
			return null;
		}

		List<DauNoiNuoc> list = findByT_tramCapNuocId_idNguoiDanhGia(tramCapNuocId,
				idNguoiDanhGia, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dau noi nuocs before and after the current dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * @param id the primary key of the current dau noi nuoc
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc[] findByT_tramCapNuocId_idNguoiDanhGia_PrevAndNext(
		long id, int tramCapNuocId, int idNguoiDanhGia,
		OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DauNoiNuoc[] array = new DauNoiNuocImpl[3];

			array[0] = getByT_tramCapNuocId_idNguoiDanhGia_PrevAndNext(session,
					dauNoiNuoc, tramCapNuocId, idNguoiDanhGia,
					orderByComparator, true);

			array[1] = dauNoiNuoc;

			array[2] = getByT_tramCapNuocId_idNguoiDanhGia_PrevAndNext(session,
					dauNoiNuoc, tramCapNuocId, idNguoiDanhGia,
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

	protected DauNoiNuoc getByT_tramCapNuocId_idNguoiDanhGia_PrevAndNext(
		Session session, DauNoiNuoc dauNoiNuoc, int tramCapNuocId,
		int idNguoiDanhGia, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DAUNOINUOC_WHERE);

		query.append(_FINDER_COLUMN_T_TRAMCAPNUOCID_IDNGUOIDANHGIA_TRAMCAPNUOCID_2);

		query.append(_FINDER_COLUMN_T_TRAMCAPNUOCID_IDNGUOIDANHGIA_IDNGUOIDANHGIA_2);

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
			query.append(DauNoiNuocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		qPos.add(idNguoiDanhGia);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dauNoiNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DauNoiNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_tramCapNuocId_idNguoiDanhGia(int tramCapNuocId,
		int idNguoiDanhGia) throws SystemException {
		for (DauNoiNuoc dauNoiNuoc : findByT_tramCapNuocId_idNguoiDanhGia(
				tramCapNuocId, idNguoiDanhGia, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dauNoiNuoc);
		}
	}

	/**
	 * Returns the number of dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param idNguoiDanhGia the id nguoi danh gia
	 * @return the number of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_tramCapNuocId_idNguoiDanhGia(int tramCapNuocId,
		int idNguoiDanhGia) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA;

		Object[] finderArgs = new Object[] { tramCapNuocId, idNguoiDanhGia };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DAUNOINUOC_WHERE);

			query.append(_FINDER_COLUMN_T_TRAMCAPNUOCID_IDNGUOIDANHGIA_TRAMCAPNUOCID_2);

			query.append(_FINDER_COLUMN_T_TRAMCAPNUOCID_IDNGUOIDANHGIA_IDNGUOIDANHGIA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				qPos.add(idNguoiDanhGia);

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

	private static final String _FINDER_COLUMN_T_TRAMCAPNUOCID_IDNGUOIDANHGIA_TRAMCAPNUOCID_2 =
		"dauNoiNuoc.tramCapNuocId = ? AND ";
	private static final String _FINDER_COLUMN_T_TRAMCAPNUOCID_IDNGUOIDANHGIA_IDNGUOIDANHGIA_2 =
		"dauNoiNuoc.idNguoiDanhGia = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_CHK_IMPORT =
		new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_CHK_Import",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT =
		new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_CHK_Import",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			DauNoiNuocModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MATINH_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MAHUYEN_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MAXA_COLUMN_BITMASK |
			DauNoiNuocModelImpl.TENCHUHO_COLUMN_BITMASK |
			DauNoiNuocModelImpl.IDNGUOITAO_COLUMN_BITMASK |
			DauNoiNuocModelImpl.THONXOM_COLUMN_BITMASK |
			DauNoiNuocModelImpl.TRANGTHAI_COLUMN_BITMASK |
			DauNoiNuocModelImpl.NAMBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_CHK_IMPORT = new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_CHK_Import",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @return the matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_CHK_Import(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String tenChuHo,
		int idNguoiTao) throws SystemException {
		return findByT_CHK_Import(tramCapNuocId, maTinh, maHuyen, maXa,
			tenChuHo, idNguoiTao, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @return the range of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_CHK_Import(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String tenChuHo,
		int idNguoiTao, int start, int end) throws SystemException {
		return findByT_CHK_Import(tramCapNuocId, maTinh, maHuyen, maXa,
			tenChuHo, idNguoiTao, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_CHK_Import(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String tenChuHo,
		int idNguoiTao, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT;
			finderArgs = new Object[] {
					tramCapNuocId, maTinh, maHuyen, maXa, tenChuHo, idNguoiTao
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_CHK_IMPORT;
			finderArgs = new Object[] {
					tramCapNuocId, maTinh, maHuyen, maXa, tenChuHo, idNguoiTao,
					
					start, end, orderByComparator
				};
		}

		List<DauNoiNuoc> list = (List<DauNoiNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DauNoiNuoc dauNoiNuoc : list) {
				if ((tramCapNuocId != dauNoiNuoc.getTramCapNuocId()) ||
						!Validator.equals(maTinh, dauNoiNuoc.getMaTinh()) ||
						!Validator.equals(maHuyen, dauNoiNuoc.getMaHuyen()) ||
						!Validator.equals(maXa, dauNoiNuoc.getMaXa()) ||
						!Validator.equals(tenChuHo, dauNoiNuoc.getTenChuHo()) ||
						(idNguoiTao != dauNoiNuoc.getIdNguoiTao())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(8 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(8);
			}

			query.append(_SQL_SELECT_DAUNOINUOC_WHERE);

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_TRAMCAPNUOCID_2);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_2);
			}

			boolean bindTenChuHo = false;

			if (tenChuHo == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_1);
			}
			else if (tenChuHo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_3);
			}
			else {
				bindTenChuHo = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_2);
			}

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_IDNGUOITAO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DauNoiNuocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindTenChuHo) {
					qPos.add(tenChuHo);
				}

				qPos.add(idNguoiTao);

				if (!pagination) {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DauNoiNuoc>(list);
				}
				else {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByT_CHK_Import_First(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String tenChuHo,
		int idNguoiTao, OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByT_CHK_Import_First(tramCapNuocId,
				maTinh, maHuyen, maXa, tenChuHo, idNguoiTao, orderByComparator);

		if (dauNoiNuoc != null) {
			return dauNoiNuoc;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(", tenChuHo=");
		msg.append(tenChuHo);

		msg.append(", idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDauNoiNuocException(msg.toString());
	}

	/**
	 * Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByT_CHK_Import_First(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String tenChuHo,
		int idNguoiTao, OrderByComparator orderByComparator)
		throws SystemException {
		List<DauNoiNuoc> list = findByT_CHK_Import(tramCapNuocId, maTinh,
				maHuyen, maXa, tenChuHo, idNguoiTao, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByT_CHK_Import_Last(int tramCapNuocId, String maTinh,
		String maHuyen, String maXa, String tenChuHo, int idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByT_CHK_Import_Last(tramCapNuocId, maTinh,
				maHuyen, maXa, tenChuHo, idNguoiTao, orderByComparator);

		if (dauNoiNuoc != null) {
			return dauNoiNuoc;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(", tenChuHo=");
		msg.append(tenChuHo);

		msg.append(", idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDauNoiNuocException(msg.toString());
	}

	/**
	 * Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByT_CHK_Import_Last(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String tenChuHo,
		int idNguoiTao, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByT_CHK_Import(tramCapNuocId, maTinh, maHuyen, maXa,
				tenChuHo, idNguoiTao);

		if (count == 0) {
			return null;
		}

		List<DauNoiNuoc> list = findByT_CHK_Import(tramCapNuocId, maTinh,
				maHuyen, maXa, tenChuHo, idNguoiTao, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dau noi nuocs before and after the current dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param id the primary key of the current dau noi nuoc
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc[] findByT_CHK_Import_PrevAndNext(long id,
		int tramCapNuocId, String maTinh, String maHuyen, String maXa,
		String tenChuHo, int idNguoiTao, OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DauNoiNuoc[] array = new DauNoiNuocImpl[3];

			array[0] = getByT_CHK_Import_PrevAndNext(session, dauNoiNuoc,
					tramCapNuocId, maTinh, maHuyen, maXa, tenChuHo, idNguoiTao,
					orderByComparator, true);

			array[1] = dauNoiNuoc;

			array[2] = getByT_CHK_Import_PrevAndNext(session, dauNoiNuoc,
					tramCapNuocId, maTinh, maHuyen, maXa, tenChuHo, idNguoiTao,
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

	protected DauNoiNuoc getByT_CHK_Import_PrevAndNext(Session session,
		DauNoiNuoc dauNoiNuoc, int tramCapNuocId, String maTinh,
		String maHuyen, String maXa, String tenChuHo, int idNguoiTao,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DAUNOINUOC_WHERE);

		query.append(_FINDER_COLUMN_T_CHK_IMPORT_TRAMCAPNUOCID_2);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_2);
		}

		boolean bindMaHuyen = false;

		if (maHuyen == null) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_1);
		}
		else if (maHuyen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_3);
		}
		else {
			bindMaHuyen = true;

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_2);
		}

		boolean bindMaXa = false;

		if (maXa == null) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_1);
		}
		else if (maXa.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_3);
		}
		else {
			bindMaXa = true;

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_2);
		}

		boolean bindTenChuHo = false;

		if (tenChuHo == null) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_1);
		}
		else if (tenChuHo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_3);
		}
		else {
			bindTenChuHo = true;

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_2);
		}

		query.append(_FINDER_COLUMN_T_CHK_IMPORT_IDNGUOITAO_2);

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
			query.append(DauNoiNuocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (bindMaHuyen) {
			qPos.add(maHuyen);
		}

		if (bindMaXa) {
			qPos.add(maXa);
		}

		if (bindTenChuHo) {
			qPos.add(tenChuHo);
		}

		qPos.add(idNguoiTao);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dauNoiNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DauNoiNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_CHK_Import(int tramCapNuocId, String maTinh,
		String maHuyen, String maXa, String tenChuHo, int idNguoiTao)
		throws SystemException {
		for (DauNoiNuoc dauNoiNuoc : findByT_CHK_Import(tramCapNuocId, maTinh,
				maHuyen, maXa, tenChuHo, idNguoiTao, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dauNoiNuoc);
		}
	}

	/**
	 * Returns the number of dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @return the number of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_CHK_Import(int tramCapNuocId, String maTinh,
		String maHuyen, String maXa, String tenChuHo, int idNguoiTao)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_CHK_IMPORT;

		Object[] finderArgs = new Object[] {
				tramCapNuocId, maTinh, maHuyen, maXa, tenChuHo, idNguoiTao
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_DAUNOINUOC_WHERE);

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_TRAMCAPNUOCID_2);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_MAXA_2);
			}

			boolean bindTenChuHo = false;

			if (tenChuHo == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_1);
			}
			else if (tenChuHo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_3);
			}
			else {
				bindTenChuHo = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_2);
			}

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_IDNGUOITAO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindTenChuHo) {
					qPos.add(tenChuHo);
				}

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

	private static final String _FINDER_COLUMN_T_CHK_IMPORT_TRAMCAPNUOCID_2 = "dauNoiNuoc.tramCapNuocId = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MATINH_1 = "dauNoiNuoc.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MATINH_2 = "dauNoiNuoc.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MATINH_3 = "(dauNoiNuoc.maTinh IS NULL OR dauNoiNuoc.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_1 = "dauNoiNuoc.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_2 = "dauNoiNuoc.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_3 = "(dauNoiNuoc.maHuyen IS NULL OR dauNoiNuoc.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAXA_1 = "dauNoiNuoc.maXa IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAXA_2 = "dauNoiNuoc.maXa = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAXA_3 = "(dauNoiNuoc.maXa IS NULL OR dauNoiNuoc.maXa = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_1 = "dauNoiNuoc.tenChuHo IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_2 = "dauNoiNuoc.tenChuHo = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_3 = "(dauNoiNuoc.tenChuHo IS NULL OR dauNoiNuoc.tenChuHo = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_IDNGUOITAO_2 = "dauNoiNuoc.idNguoiTao = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_CHK_ADDDAUNOI =
		new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_CHK_ADDDAUNOI",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_ADDDAUNOI =
		new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, DauNoiNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_CHK_ADDDAUNOI",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			DauNoiNuocModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MATINH_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MAHUYEN_COLUMN_BITMASK |
			DauNoiNuocModelImpl.MAXA_COLUMN_BITMASK |
			DauNoiNuocModelImpl.THONXOM_COLUMN_BITMASK |
			DauNoiNuocModelImpl.TENCHUHO_COLUMN_BITMASK |
			DauNoiNuocModelImpl.TRANGTHAI_COLUMN_BITMASK |
			DauNoiNuocModelImpl.NAMBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_CHK_ADDDAUNOI = new FinderPath(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByT_CHK_ADDDAUNOI",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @return the matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_CHK_ADDDAUNOI(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String thonXom,
		String tenChuHo) throws SystemException {
		return findByT_CHK_ADDDAUNOI(tramCapNuocId, maTinh, maHuyen, maXa,
			thonXom, tenChuHo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @return the range of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_CHK_ADDDAUNOI(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String thonXom,
		String tenChuHo, int start, int end) throws SystemException {
		return findByT_CHK_ADDDAUNOI(tramCapNuocId, maTinh, maHuyen, maXa,
			thonXom, tenChuHo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findByT_CHK_ADDDAUNOI(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String thonXom,
		String tenChuHo, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_ADDDAUNOI;
			finderArgs = new Object[] {
					tramCapNuocId, maTinh, maHuyen, maXa, thonXom, tenChuHo
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_CHK_ADDDAUNOI;
			finderArgs = new Object[] {
					tramCapNuocId, maTinh, maHuyen, maXa, thonXom, tenChuHo,
					
					start, end, orderByComparator
				};
		}

		List<DauNoiNuoc> list = (List<DauNoiNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DauNoiNuoc dauNoiNuoc : list) {
				if ((tramCapNuocId != dauNoiNuoc.getTramCapNuocId()) ||
						!Validator.equals(maTinh, dauNoiNuoc.getMaTinh()) ||
						!Validator.equals(maHuyen, dauNoiNuoc.getMaHuyen()) ||
						!Validator.equals(maXa, dauNoiNuoc.getMaXa()) ||
						!Validator.equals(thonXom, dauNoiNuoc.getThonXom()) ||
						!Validator.equals(tenChuHo, dauNoiNuoc.getTenChuHo())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(8 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(8);
			}

			query.append(_SQL_SELECT_DAUNOINUOC_WHERE);

			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TRAMCAPNUOCID_2);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_2);
			}

			boolean bindThonXom = false;

			if (thonXom == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_1);
			}
			else if (thonXom.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_3);
			}
			else {
				bindThonXom = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_2);
			}

			boolean bindTenChuHo = false;

			if (tenChuHo == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_1);
			}
			else if (tenChuHo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_3);
			}
			else {
				bindTenChuHo = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DauNoiNuocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindThonXom) {
					qPos.add(thonXom);
				}

				if (bindTenChuHo) {
					qPos.add(tenChuHo);
				}

				if (!pagination) {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DauNoiNuoc>(list);
				}
				else {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByT_CHK_ADDDAUNOI_First(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String thonXom,
		String tenChuHo, OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByT_CHK_ADDDAUNOI_First(tramCapNuocId,
				maTinh, maHuyen, maXa, thonXom, tenChuHo, orderByComparator);

		if (dauNoiNuoc != null) {
			return dauNoiNuoc;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(", thonXom=");
		msg.append(thonXom);

		msg.append(", tenChuHo=");
		msg.append(tenChuHo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDauNoiNuocException(msg.toString());
	}

	/**
	 * Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByT_CHK_ADDDAUNOI_First(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String thonXom,
		String tenChuHo, OrderByComparator orderByComparator)
		throws SystemException {
		List<DauNoiNuoc> list = findByT_CHK_ADDDAUNOI(tramCapNuocId, maTinh,
				maHuyen, maXa, thonXom, tenChuHo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByT_CHK_ADDDAUNOI_Last(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String thonXom,
		String tenChuHo, OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByT_CHK_ADDDAUNOI_Last(tramCapNuocId,
				maTinh, maHuyen, maXa, thonXom, tenChuHo, orderByComparator);

		if (dauNoiNuoc != null) {
			return dauNoiNuoc;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(", thonXom=");
		msg.append(thonXom);

		msg.append(", tenChuHo=");
		msg.append(tenChuHo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDauNoiNuocException(msg.toString());
	}

	/**
	 * Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByT_CHK_ADDDAUNOI_Last(int tramCapNuocId,
		String maTinh, String maHuyen, String maXa, String thonXom,
		String tenChuHo, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByT_CHK_ADDDAUNOI(tramCapNuocId, maTinh, maHuyen,
				maXa, thonXom, tenChuHo);

		if (count == 0) {
			return null;
		}

		List<DauNoiNuoc> list = findByT_CHK_ADDDAUNOI(tramCapNuocId, maTinh,
				maHuyen, maXa, thonXom, tenChuHo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dau noi nuocs before and after the current dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * @param id the primary key of the current dau noi nuoc
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc[] findByT_CHK_ADDDAUNOI_PrevAndNext(long id,
		int tramCapNuocId, String maTinh, String maHuyen, String maXa,
		String thonXom, String tenChuHo, OrderByComparator orderByComparator)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DauNoiNuoc[] array = new DauNoiNuocImpl[3];

			array[0] = getByT_CHK_ADDDAUNOI_PrevAndNext(session, dauNoiNuoc,
					tramCapNuocId, maTinh, maHuyen, maXa, thonXom, tenChuHo,
					orderByComparator, true);

			array[1] = dauNoiNuoc;

			array[2] = getByT_CHK_ADDDAUNOI_PrevAndNext(session, dauNoiNuoc,
					tramCapNuocId, maTinh, maHuyen, maXa, thonXom, tenChuHo,
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

	protected DauNoiNuoc getByT_CHK_ADDDAUNOI_PrevAndNext(Session session,
		DauNoiNuoc dauNoiNuoc, int tramCapNuocId, String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DAUNOINUOC_WHERE);

		query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TRAMCAPNUOCID_2);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_2);
		}

		boolean bindMaHuyen = false;

		if (maHuyen == null) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_1);
		}
		else if (maHuyen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_3);
		}
		else {
			bindMaHuyen = true;

			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_2);
		}

		boolean bindMaXa = false;

		if (maXa == null) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_1);
		}
		else if (maXa.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_3);
		}
		else {
			bindMaXa = true;

			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_2);
		}

		boolean bindThonXom = false;

		if (thonXom == null) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_1);
		}
		else if (thonXom.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_3);
		}
		else {
			bindThonXom = true;

			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_2);
		}

		boolean bindTenChuHo = false;

		if (tenChuHo == null) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_1);
		}
		else if (tenChuHo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_3);
		}
		else {
			bindTenChuHo = true;

			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_2);
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
			query.append(DauNoiNuocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (bindMaHuyen) {
			qPos.add(maHuyen);
		}

		if (bindMaXa) {
			qPos.add(maXa);
		}

		if (bindThonXom) {
			qPos.add(thonXom);
		}

		if (bindTenChuHo) {
			qPos.add(tenChuHo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dauNoiNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DauNoiNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_CHK_ADDDAUNOI(int tramCapNuocId, String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo)
		throws SystemException {
		for (DauNoiNuoc dauNoiNuoc : findByT_CHK_ADDDAUNOI(tramCapNuocId,
				maTinh, maHuyen, maXa, thonXom, tenChuHo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dauNoiNuoc);
		}
	}

	/**
	 * Returns the number of dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @return the number of matching dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_CHK_ADDDAUNOI(int tramCapNuocId, String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_CHK_ADDDAUNOI;

		Object[] finderArgs = new Object[] {
				tramCapNuocId, maTinh, maHuyen, maXa, thonXom, tenChuHo
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_DAUNOINUOC_WHERE);

			query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TRAMCAPNUOCID_2);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_2);
			}

			boolean bindThonXom = false;

			if (thonXom == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_1);
			}
			else if (thonXom.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_3);
			}
			else {
				bindThonXom = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_2);
			}

			boolean bindTenChuHo = false;

			if (tenChuHo == null) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_1);
			}
			else if (tenChuHo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_3);
			}
			else {
				bindTenChuHo = true;

				query.append(_FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindThonXom) {
					qPos.add(thonXom);
				}

				if (bindTenChuHo) {
					qPos.add(tenChuHo);
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

	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_TRAMCAPNUOCID_2 = "dauNoiNuoc.tramCapNuocId = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_1 = "dauNoiNuoc.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_2 = "dauNoiNuoc.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MATINH_3 = "(dauNoiNuoc.maTinh IS NULL OR dauNoiNuoc.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_1 = "dauNoiNuoc.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_2 = "dauNoiNuoc.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MAHUYEN_3 = "(dauNoiNuoc.maHuyen IS NULL OR dauNoiNuoc.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_1 = "dauNoiNuoc.maXa IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_2 = "dauNoiNuoc.maXa = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_MAXA_3 = "(dauNoiNuoc.maXa IS NULL OR dauNoiNuoc.maXa = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_1 = "dauNoiNuoc.thonXom IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_2 = "dauNoiNuoc.thonXom = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_THONXOM_3 = "(dauNoiNuoc.thonXom IS NULL OR dauNoiNuoc.thonXom = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_1 = "dauNoiNuoc.tenChuHo IS NULL";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_2 = "dauNoiNuoc.tenChuHo = ?";
	private static final String _FINDER_COLUMN_T_CHK_ADDDAUNOI_TENCHUHO_3 = "(dauNoiNuoc.tenChuHo IS NULL OR dauNoiNuoc.tenChuHo = '')";

	public DauNoiNuocPersistenceImpl() {
		setModelClass(DauNoiNuoc.class);
	}

	/**
	 * Caches the dau noi nuoc in the entity cache if it is enabled.
	 *
	 * @param dauNoiNuoc the dau noi nuoc
	 */
	@Override
	public void cacheResult(DauNoiNuoc dauNoiNuoc) {
		EntityCacheUtil.putResult(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocImpl.class, dauNoiNuoc.getPrimaryKey(), dauNoiNuoc);

		dauNoiNuoc.resetOriginalValues();
	}

	/**
	 * Caches the dau noi nuocs in the entity cache if it is enabled.
	 *
	 * @param dauNoiNuocs the dau noi nuocs
	 */
	@Override
	public void cacheResult(List<DauNoiNuoc> dauNoiNuocs) {
		for (DauNoiNuoc dauNoiNuoc : dauNoiNuocs) {
			if (EntityCacheUtil.getResult(
						DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
						DauNoiNuocImpl.class, dauNoiNuoc.getPrimaryKey()) == null) {
				cacheResult(dauNoiNuoc);
			}
			else {
				dauNoiNuoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dau noi nuocs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DauNoiNuocImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DauNoiNuocImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dau noi nuoc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DauNoiNuoc dauNoiNuoc) {
		EntityCacheUtil.removeResult(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocImpl.class, dauNoiNuoc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DauNoiNuoc> dauNoiNuocs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DauNoiNuoc dauNoiNuoc : dauNoiNuocs) {
			EntityCacheUtil.removeResult(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
				DauNoiNuocImpl.class, dauNoiNuoc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dau noi nuoc with the primary key. Does not add the dau noi nuoc to the database.
	 *
	 * @param id the primary key for the new dau noi nuoc
	 * @return the new dau noi nuoc
	 */
	@Override
	public DauNoiNuoc create(long id) {
		DauNoiNuoc dauNoiNuoc = new DauNoiNuocImpl();

		dauNoiNuoc.setNew(true);
		dauNoiNuoc.setPrimaryKey(id);

		return dauNoiNuoc;
	}

	/**
	 * Removes the dau noi nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dau noi nuoc
	 * @return the dau noi nuoc that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc remove(long id)
		throws NoSuchDauNoiNuocException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dau noi nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dau noi nuoc
	 * @return the dau noi nuoc that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc remove(Serializable primaryKey)
		throws NoSuchDauNoiNuocException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DauNoiNuoc dauNoiNuoc = (DauNoiNuoc)session.get(DauNoiNuocImpl.class,
					primaryKey);

			if (dauNoiNuoc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDauNoiNuocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dauNoiNuoc);
		}
		catch (NoSuchDauNoiNuocException nsee) {
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
	protected DauNoiNuoc removeImpl(DauNoiNuoc dauNoiNuoc)
		throws SystemException {
		dauNoiNuoc = toUnwrappedModel(dauNoiNuoc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dauNoiNuoc)) {
				dauNoiNuoc = (DauNoiNuoc)session.get(DauNoiNuocImpl.class,
						dauNoiNuoc.getPrimaryKeyObj());
			}

			if (dauNoiNuoc != null) {
				session.delete(dauNoiNuoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dauNoiNuoc != null) {
			clearCache(dauNoiNuoc);
		}

		return dauNoiNuoc;
	}

	@Override
	public DauNoiNuoc updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc)
		throws SystemException {
		dauNoiNuoc = toUnwrappedModel(dauNoiNuoc);

		boolean isNew = dauNoiNuoc.isNew();

		DauNoiNuocModelImpl dauNoiNuocModelImpl = (DauNoiNuocModelImpl)dauNoiNuoc;

		Session session = null;

		try {
			session = openSession();

			if (dauNoiNuoc.isNew()) {
				session.save(dauNoiNuoc);

				dauNoiNuoc.setNew(false);
			}
			else {
				session.merge(dauNoiNuoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DauNoiNuocModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dauNoiNuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dauNoiNuocModelImpl.getOriginalTramCapNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);

				args = new Object[] { dauNoiNuocModelImpl.getTramCapNuocId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);
			}

			if ((dauNoiNuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dauNoiNuocModelImpl.getOriginalTramCapNuocId(),
						dauNoiNuocModelImpl.getOriginalIdNguoiDanhGia()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA,
					args);

				args = new Object[] {
						dauNoiNuocModelImpl.getTramCapNuocId(),
						dauNoiNuocModelImpl.getIdNguoiDanhGia()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TRAMCAPNUOCID_IDNGUOIDANHGIA,
					args);
			}

			if ((dauNoiNuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dauNoiNuocModelImpl.getOriginalTramCapNuocId(),
						dauNoiNuocModelImpl.getOriginalMaTinh(),
						dauNoiNuocModelImpl.getOriginalMaHuyen(),
						dauNoiNuocModelImpl.getOriginalMaXa(),
						dauNoiNuocModelImpl.getOriginalTenChuHo(),
						dauNoiNuocModelImpl.getOriginalIdNguoiTao()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_CHK_IMPORT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT,
					args);

				args = new Object[] {
						dauNoiNuocModelImpl.getTramCapNuocId(),
						dauNoiNuocModelImpl.getMaTinh(),
						dauNoiNuocModelImpl.getMaHuyen(),
						dauNoiNuocModelImpl.getMaXa(),
						dauNoiNuocModelImpl.getTenChuHo(),
						dauNoiNuocModelImpl.getIdNguoiTao()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_CHK_IMPORT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT,
					args);
			}

			if ((dauNoiNuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_ADDDAUNOI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dauNoiNuocModelImpl.getOriginalTramCapNuocId(),
						dauNoiNuocModelImpl.getOriginalMaTinh(),
						dauNoiNuocModelImpl.getOriginalMaHuyen(),
						dauNoiNuocModelImpl.getOriginalMaXa(),
						dauNoiNuocModelImpl.getOriginalThonXom(),
						dauNoiNuocModelImpl.getOriginalTenChuHo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_CHK_ADDDAUNOI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_ADDDAUNOI,
					args);

				args = new Object[] {
						dauNoiNuocModelImpl.getTramCapNuocId(),
						dauNoiNuocModelImpl.getMaTinh(),
						dauNoiNuocModelImpl.getMaHuyen(),
						dauNoiNuocModelImpl.getMaXa(),
						dauNoiNuocModelImpl.getThonXom(),
						dauNoiNuocModelImpl.getTenChuHo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_CHK_ADDDAUNOI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_ADDDAUNOI,
					args);
			}
		}

		EntityCacheUtil.putResult(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
			DauNoiNuocImpl.class, dauNoiNuoc.getPrimaryKey(), dauNoiNuoc);

		return dauNoiNuoc;
	}

	protected DauNoiNuoc toUnwrappedModel(DauNoiNuoc dauNoiNuoc) {
		if (dauNoiNuoc instanceof DauNoiNuocImpl) {
			return dauNoiNuoc;
		}

		DauNoiNuocImpl dauNoiNuocImpl = new DauNoiNuocImpl();

		dauNoiNuocImpl.setNew(dauNoiNuoc.isNew());
		dauNoiNuocImpl.setPrimaryKey(dauNoiNuoc.getPrimaryKey());

		dauNoiNuocImpl.setId(dauNoiNuoc.getId());
		dauNoiNuocImpl.setTramCapNuocId(dauNoiNuoc.getTramCapNuocId());
		dauNoiNuocImpl.setMaTinh(dauNoiNuoc.getMaTinh());
		dauNoiNuocImpl.setMaHuyen(dauNoiNuoc.getMaHuyen());
		dauNoiNuocImpl.setMaXa(dauNoiNuoc.getMaXa());
		dauNoiNuocImpl.setThonXom(dauNoiNuoc.getThonXom());
		dauNoiNuocImpl.setTenChuHo(dauNoiNuoc.getTenChuHo());
		dauNoiNuocImpl.setGioiTinh(dauNoiNuoc.getGioiTinh());
		dauNoiNuocImpl.setNgayDauNoiHopDong(dauNoiNuoc.getNgayDauNoiHopDong());
		dauNoiNuocImpl.setTrangThai(dauNoiNuoc.getTrangThai());
		dauNoiNuocImpl.setNamBaoCao(dauNoiNuoc.getNamBaoCao());
		dauNoiNuocImpl.setGhiChu(dauNoiNuoc.getGhiChu());
		dauNoiNuocImpl.setNgayTao(dauNoiNuoc.getNgayTao());
		dauNoiNuocImpl.setIdNguoiTao(dauNoiNuoc.getIdNguoiTao());
		dauNoiNuocImpl.setSoNguoiTrongHo(dauNoiNuoc.getSoNguoiTrongHo());
		dauNoiNuocImpl.setThanhPhanHoGiaDinh(dauNoiNuoc.getThanhPhanHoGiaDinh());
		dauNoiNuocImpl.setTongDoanhThu(dauNoiNuoc.getTongDoanhThu());
		dauNoiNuocImpl.setKinhDo(dauNoiNuoc.getKinhDo());
		dauNoiNuocImpl.setViDo(dauNoiNuoc.getViDo());
		dauNoiNuocImpl.setNgayDauNoiThucTe(dauNoiNuoc.getNgayDauNoiThucTe());
		dauNoiNuocImpl.setSoSeryDongHo(dauNoiNuoc.getSoSeryDongHo());
		dauNoiNuocImpl.setDanhGiaNuocHVS(dauNoiNuoc.getDanhGiaNuocHVS());
		dauNoiNuocImpl.setNgayKiemDem(dauNoiNuoc.getNgayKiemDem());
		dauNoiNuocImpl.setNgayDanhGia(dauNoiNuoc.getNgayDanhGia());
		dauNoiNuocImpl.setIdNguoiDanhGia(dauNoiNuoc.getIdNguoiDanhGia());

		return dauNoiNuocImpl;
	}

	/**
	 * Returns the dau noi nuoc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dau noi nuoc
	 * @return the dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDauNoiNuocException, SystemException {
		DauNoiNuoc dauNoiNuoc = fetchByPrimaryKey(primaryKey);

		if (dauNoiNuoc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDauNoiNuocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dauNoiNuoc;
	}

	/**
	 * Returns the dau noi nuoc with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException} if it could not be found.
	 *
	 * @param id the primary key of the dau noi nuoc
	 * @return the dau noi nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc findByPrimaryKey(long id)
		throws NoSuchDauNoiNuocException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dau noi nuoc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dau noi nuoc
	 * @return the dau noi nuoc, or <code>null</code> if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DauNoiNuoc dauNoiNuoc = (DauNoiNuoc)EntityCacheUtil.getResult(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
				DauNoiNuocImpl.class, primaryKey);

		if (dauNoiNuoc == _nullDauNoiNuoc) {
			return null;
		}

		if (dauNoiNuoc == null) {
			Session session = null;

			try {
				session = openSession();

				dauNoiNuoc = (DauNoiNuoc)session.get(DauNoiNuocImpl.class,
						primaryKey);

				if (dauNoiNuoc != null) {
					cacheResult(dauNoiNuoc);
				}
				else {
					EntityCacheUtil.putResult(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
						DauNoiNuocImpl.class, primaryKey, _nullDauNoiNuoc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DauNoiNuocModelImpl.ENTITY_CACHE_ENABLED,
					DauNoiNuocImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dauNoiNuoc;
	}

	/**
	 * Returns the dau noi nuoc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dau noi nuoc
	 * @return the dau noi nuoc, or <code>null</code> if a dau noi nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DauNoiNuoc fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dau noi nuocs.
	 *
	 * @return the dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dau noi nuocs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @return the range of dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dau noi nuocs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dau noi nuocs
	 * @param end the upper bound of the range of dau noi nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dau noi nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DauNoiNuoc> findAll(int start, int end,
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

		List<DauNoiNuoc> list = (List<DauNoiNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DAUNOINUOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DAUNOINUOC;

				if (pagination) {
					sql = sql.concat(DauNoiNuocModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DauNoiNuoc>(list);
				}
				else {
					list = (List<DauNoiNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dau noi nuocs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DauNoiNuoc dauNoiNuoc : findAll()) {
			remove(dauNoiNuoc);
		}
	}

	/**
	 * Returns the number of dau noi nuocs.
	 *
	 * @return the number of dau noi nuocs
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

				Query q = session.createQuery(_SQL_COUNT_DAUNOINUOC);

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
	 * Initializes the dau noi nuoc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DauNoiNuoc>> listenersList = new ArrayList<ModelListener<DauNoiNuoc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DauNoiNuoc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DauNoiNuocImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DAUNOINUOC = "SELECT dauNoiNuoc FROM DauNoiNuoc dauNoiNuoc";
	private static final String _SQL_SELECT_DAUNOINUOC_WHERE = "SELECT dauNoiNuoc FROM DauNoiNuoc dauNoiNuoc WHERE ";
	private static final String _SQL_COUNT_DAUNOINUOC = "SELECT COUNT(dauNoiNuoc) FROM DauNoiNuoc dauNoiNuoc";
	private static final String _SQL_COUNT_DAUNOINUOC_WHERE = "SELECT COUNT(dauNoiNuoc) FROM DauNoiNuoc dauNoiNuoc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dauNoiNuoc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DauNoiNuoc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DauNoiNuoc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DauNoiNuocPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "tramCapNuocId", "maTinh", "maHuyen", "maXa", "thonXom",
				"tenChuHo", "gioiTinh", "ngayDauNoiHopDong", "trangThai",
				"namBaoCao", "ghiChu", "ngayTao", "idNguoiTao", "soNguoiTrongHo",
				"thanhPhanHoGiaDinh", "tongDoanhThu", "kinhDo", "viDo",
				"ngayDauNoiThucTe", "soSeryDongHo", "danhGiaNuocHVS",
				"ngayKiemDem", "ngayDanhGia", "idNguoiDanhGia"
			});
	private static DauNoiNuoc _nullDauNoiNuoc = new DauNoiNuocImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DauNoiNuoc> toCacheModel() {
				return _nullDauNoiNuocCacheModel;
			}
		};

	private static CacheModel<DauNoiNuoc> _nullDauNoiNuocCacheModel = new CacheModel<DauNoiNuoc>() {
			@Override
			public DauNoiNuoc toEntityModel() {
				return _nullDauNoiNuoc;
			}
		};
}