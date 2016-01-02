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

package vn.dtt.sol.ns.danhgiavesinh.dao.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.sol.ns.danhgiavesinh.dao.NoSuchDANHGIAVESINHXAException;
import vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA;
import vn.dtt.sol.ns.danhgiavesinh.dao.model.impl.DANHGIAVESINHXAImpl;
import vn.dtt.sol.ns.danhgiavesinh.dao.model.impl.DANHGIAVESINHXAModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the d a n h g i a v e s i n h x a service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DANHGIAVESINHXAPersistence
 * @see DANHGIAVESINHXAUtil
 * @generated
 */
public class DANHGIAVESINHXAPersistenceImpl extends BasePersistenceImpl<DANHGIAVESINHXA>
	implements DANHGIAVESINHXAPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DANHGIAVESINHXAUtil} to access the d a n h g i a v e s i n h x a persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DANHGIAVESINHXAImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
			DANHGIAVESINHXAModelImpl.FINDER_CACHE_ENABLED,
			DANHGIAVESINHXAImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
			DANHGIAVESINHXAModelImpl.FINDER_CACHE_ENABLED,
			DANHGIAVESINHXAImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
			DANHGIAVESINHXAModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DANHGIAVESINHXAPersistenceImpl() {
		setModelClass(DANHGIAVESINHXA.class);
	}

	/**
	 * Caches the d a n h g i a v e s i n h x a in the entity cache if it is enabled.
	 *
	 * @param danhgiavesinhxa the d a n h g i a v e s i n h x a
	 */
	@Override
	public void cacheResult(DANHGIAVESINHXA danhgiavesinhxa) {
		EntityCacheUtil.putResult(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
			DANHGIAVESINHXAImpl.class, danhgiavesinhxa.getPrimaryKey(),
			danhgiavesinhxa);

		danhgiavesinhxa.resetOriginalValues();
	}

	/**
	 * Caches the d a n h g i a v e s i n h x as in the entity cache if it is enabled.
	 *
	 * @param danhgiavesinhxas the d a n h g i a v e s i n h x as
	 */
	@Override
	public void cacheResult(List<DANHGIAVESINHXA> danhgiavesinhxas) {
		for (DANHGIAVESINHXA danhgiavesinhxa : danhgiavesinhxas) {
			if (EntityCacheUtil.getResult(
						DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
						DANHGIAVESINHXAImpl.class,
						danhgiavesinhxa.getPrimaryKey()) == null) {
				cacheResult(danhgiavesinhxa);
			}
			else {
				danhgiavesinhxa.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all d a n h g i a v e s i n h x as.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DANHGIAVESINHXAImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DANHGIAVESINHXAImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the d a n h g i a v e s i n h x a.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DANHGIAVESINHXA danhgiavesinhxa) {
		EntityCacheUtil.removeResult(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
			DANHGIAVESINHXAImpl.class, danhgiavesinhxa.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DANHGIAVESINHXA> danhgiavesinhxas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DANHGIAVESINHXA danhgiavesinhxa : danhgiavesinhxas) {
			EntityCacheUtil.removeResult(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
				DANHGIAVESINHXAImpl.class, danhgiavesinhxa.getPrimaryKey());
		}
	}

	/**
	 * Creates a new d a n h g i a v e s i n h x a with the primary key. Does not add the d a n h g i a v e s i n h x a to the database.
	 *
	 * @param id the primary key for the new d a n h g i a v e s i n h x a
	 * @return the new d a n h g i a v e s i n h x a
	 */
	@Override
	public DANHGIAVESINHXA create(long id) {
		DANHGIAVESINHXA danhgiavesinhxa = new DANHGIAVESINHXAImpl();

		danhgiavesinhxa.setNew(true);
		danhgiavesinhxa.setPrimaryKey(id);

		return danhgiavesinhxa;
	}

	/**
	 * Removes the d a n h g i a v e s i n h x a with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the d a n h g i a v e s i n h x a
	 * @return the d a n h g i a v e s i n h x a that was removed
	 * @throws vn.dtt.sol.ns.danhgiavesinh.dao.NoSuchDANHGIAVESINHXAException if a d a n h g i a v e s i n h x a with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DANHGIAVESINHXA remove(long id)
		throws NoSuchDANHGIAVESINHXAException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the d a n h g i a v e s i n h x a with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the d a n h g i a v e s i n h x a
	 * @return the d a n h g i a v e s i n h x a that was removed
	 * @throws vn.dtt.sol.ns.danhgiavesinh.dao.NoSuchDANHGIAVESINHXAException if a d a n h g i a v e s i n h x a with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DANHGIAVESINHXA remove(Serializable primaryKey)
		throws NoSuchDANHGIAVESINHXAException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DANHGIAVESINHXA danhgiavesinhxa = (DANHGIAVESINHXA)session.get(DANHGIAVESINHXAImpl.class,
					primaryKey);

			if (danhgiavesinhxa == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDANHGIAVESINHXAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(danhgiavesinhxa);
		}
		catch (NoSuchDANHGIAVESINHXAException nsee) {
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
	protected DANHGIAVESINHXA removeImpl(DANHGIAVESINHXA danhgiavesinhxa)
		throws SystemException {
		danhgiavesinhxa = toUnwrappedModel(danhgiavesinhxa);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(danhgiavesinhxa)) {
				danhgiavesinhxa = (DANHGIAVESINHXA)session.get(DANHGIAVESINHXAImpl.class,
						danhgiavesinhxa.getPrimaryKeyObj());
			}

			if (danhgiavesinhxa != null) {
				session.delete(danhgiavesinhxa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (danhgiavesinhxa != null) {
			clearCache(danhgiavesinhxa);
		}

		return danhgiavesinhxa;
	}

	@Override
	public DANHGIAVESINHXA updateImpl(
		vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA danhgiavesinhxa)
		throws SystemException {
		danhgiavesinhxa = toUnwrappedModel(danhgiavesinhxa);

		boolean isNew = danhgiavesinhxa.isNew();

		Session session = null;

		try {
			session = openSession();

			if (danhgiavesinhxa.isNew()) {
				session.save(danhgiavesinhxa);

				danhgiavesinhxa.setNew(false);
			}
			else {
				session.merge(danhgiavesinhxa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
			DANHGIAVESINHXAImpl.class, danhgiavesinhxa.getPrimaryKey(),
			danhgiavesinhxa);

		return danhgiavesinhxa;
	}

	protected DANHGIAVESINHXA toUnwrappedModel(DANHGIAVESINHXA danhgiavesinhxa) {
		if (danhgiavesinhxa instanceof DANHGIAVESINHXAImpl) {
			return danhgiavesinhxa;
		}

		DANHGIAVESINHXAImpl danhgiavesinhxaImpl = new DANHGIAVESINHXAImpl();

		danhgiavesinhxaImpl.setNew(danhgiavesinhxa.isNew());
		danhgiavesinhxaImpl.setPrimaryKey(danhgiavesinhxa.getPrimaryKey());

		danhgiavesinhxaImpl.setId(danhgiavesinhxa.getId());
		danhgiavesinhxaImpl.setMaXa(danhgiavesinhxa.getMaXa());
		danhgiavesinhxaImpl.setMaTinh(danhgiavesinhxa.getMaTinh());
		danhgiavesinhxaImpl.setMaHuyen(danhgiavesinhxa.getMaHuyen());
		danhgiavesinhxaImpl.setNam(danhgiavesinhxa.getNam());
		danhgiavesinhxaImpl.setSoDan(danhgiavesinhxa.getSoDan());
		danhgiavesinhxaImpl.setTiLeHGDCoNhaTieu(danhgiavesinhxa.getTiLeHGDCoNhaTieu());
		danhgiavesinhxaImpl.setTiLeHGDCoNhaTieuHVS(danhgiavesinhxa.getTiLeHGDCoNhaTieuHVS());
		danhgiavesinhxaImpl.setTiLeTruongHocHVS(danhgiavesinhxa.getTiLeTruongHocHVS());
		danhgiavesinhxaImpl.setTiLeTramYTeHVS(danhgiavesinhxa.getTiLeTramYTeHVS());
		danhgiavesinhxaImpl.setKetLuanVSTX(danhgiavesinhxa.getKetLuanVSTX());
		danhgiavesinhxaImpl.setGhiChu(danhgiavesinhxa.getGhiChu());
		danhgiavesinhxaImpl.setBaoCaoDLI(danhgiavesinhxa.getBaoCaoDLI());
		danhgiavesinhxaImpl.setNgayTao(danhgiavesinhxa.getNgayTao());
		danhgiavesinhxaImpl.setIdNguoiTao(danhgiavesinhxa.getIdNguoiTao());

		return danhgiavesinhxaImpl;
	}

	/**
	 * Returns the d a n h g i a v e s i n h x a with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the d a n h g i a v e s i n h x a
	 * @return the d a n h g i a v e s i n h x a
	 * @throws vn.dtt.sol.ns.danhgiavesinh.dao.NoSuchDANHGIAVESINHXAException if a d a n h g i a v e s i n h x a with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DANHGIAVESINHXA findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDANHGIAVESINHXAException, SystemException {
		DANHGIAVESINHXA danhgiavesinhxa = fetchByPrimaryKey(primaryKey);

		if (danhgiavesinhxa == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDANHGIAVESINHXAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return danhgiavesinhxa;
	}

	/**
	 * Returns the d a n h g i a v e s i n h x a with the primary key or throws a {@link vn.dtt.sol.ns.danhgiavesinh.dao.NoSuchDANHGIAVESINHXAException} if it could not be found.
	 *
	 * @param id the primary key of the d a n h g i a v e s i n h x a
	 * @return the d a n h g i a v e s i n h x a
	 * @throws vn.dtt.sol.ns.danhgiavesinh.dao.NoSuchDANHGIAVESINHXAException if a d a n h g i a v e s i n h x a with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DANHGIAVESINHXA findByPrimaryKey(long id)
		throws NoSuchDANHGIAVESINHXAException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the d a n h g i a v e s i n h x a with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the d a n h g i a v e s i n h x a
	 * @return the d a n h g i a v e s i n h x a, or <code>null</code> if a d a n h g i a v e s i n h x a with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DANHGIAVESINHXA fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DANHGIAVESINHXA danhgiavesinhxa = (DANHGIAVESINHXA)EntityCacheUtil.getResult(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
				DANHGIAVESINHXAImpl.class, primaryKey);

		if (danhgiavesinhxa == _nullDANHGIAVESINHXA) {
			return null;
		}

		if (danhgiavesinhxa == null) {
			Session session = null;

			try {
				session = openSession();

				danhgiavesinhxa = (DANHGIAVESINHXA)session.get(DANHGIAVESINHXAImpl.class,
						primaryKey);

				if (danhgiavesinhxa != null) {
					cacheResult(danhgiavesinhxa);
				}
				else {
					EntityCacheUtil.putResult(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
						DANHGIAVESINHXAImpl.class, primaryKey,
						_nullDANHGIAVESINHXA);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DANHGIAVESINHXAModelImpl.ENTITY_CACHE_ENABLED,
					DANHGIAVESINHXAImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return danhgiavesinhxa;
	}

	/**
	 * Returns the d a n h g i a v e s i n h x a with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the d a n h g i a v e s i n h x a
	 * @return the d a n h g i a v e s i n h x a, or <code>null</code> if a d a n h g i a v e s i n h x a with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DANHGIAVESINHXA fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the d a n h g i a v e s i n h x as.
	 *
	 * @return the d a n h g i a v e s i n h x as
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DANHGIAVESINHXA> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the d a n h g i a v e s i n h x as.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.danhgiavesinh.dao.model.impl.DANHGIAVESINHXAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d a n h g i a v e s i n h x as
	 * @param end the upper bound of the range of d a n h g i a v e s i n h x as (not inclusive)
	 * @return the range of d a n h g i a v e s i n h x as
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DANHGIAVESINHXA> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the d a n h g i a v e s i n h x as.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.danhgiavesinh.dao.model.impl.DANHGIAVESINHXAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d a n h g i a v e s i n h x as
	 * @param end the upper bound of the range of d a n h g i a v e s i n h x as (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of d a n h g i a v e s i n h x as
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DANHGIAVESINHXA> findAll(int start, int end,
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

		List<DANHGIAVESINHXA> list = (List<DANHGIAVESINHXA>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DANHGIAVESINHXA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DANHGIAVESINHXA;

				if (pagination) {
					sql = sql.concat(DANHGIAVESINHXAModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DANHGIAVESINHXA>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DANHGIAVESINHXA>(list);
				}
				else {
					list = (List<DANHGIAVESINHXA>)QueryUtil.list(q,
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
	 * Removes all the d a n h g i a v e s i n h x as from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DANHGIAVESINHXA danhgiavesinhxa : findAll()) {
			remove(danhgiavesinhxa);
		}
	}

	/**
	 * Returns the number of d a n h g i a v e s i n h x as.
	 *
	 * @return the number of d a n h g i a v e s i n h x as
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

				Query q = session.createQuery(_SQL_COUNT_DANHGIAVESINHXA);

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
	 * Initializes the d a n h g i a v e s i n h x a persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DANHGIAVESINHXA>> listenersList = new ArrayList<ModelListener<DANHGIAVESINHXA>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DANHGIAVESINHXA>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DANHGIAVESINHXAImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DANHGIAVESINHXA = "SELECT danhgiavesinhxa FROM DANHGIAVESINHXA danhgiavesinhxa";
	private static final String _SQL_COUNT_DANHGIAVESINHXA = "SELECT COUNT(danhgiavesinhxa) FROM DANHGIAVESINHXA danhgiavesinhxa";
	private static final String _ORDER_BY_ENTITY_ALIAS = "danhgiavesinhxa.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DANHGIAVESINHXA exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DANHGIAVESINHXAPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maXa", "maTinh", "maHuyen", "nam", "soDan",
				"tiLeHGDCoNhaTieu", "tiLeHGDCoNhaTieuHVS", "tiLeTruongHocHVS",
				"tiLeTramYTeHVS", "ketLuanVSTX", "ghiChu", "baoCaoDLI",
				"ngayTao", "idNguoiTao"
			});
	private static DANHGIAVESINHXA _nullDANHGIAVESINHXA = new DANHGIAVESINHXAImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DANHGIAVESINHXA> toCacheModel() {
				return _nullDANHGIAVESINHXACacheModel;
			}
		};

	private static CacheModel<DANHGIAVESINHXA> _nullDANHGIAVESINHXACacheModel = new CacheModel<DANHGIAVESINHXA>() {
			@Override
			public DANHGIAVESINHXA toEntityModel() {
				return _nullDANHGIAVESINHXA;
			}
		};
}