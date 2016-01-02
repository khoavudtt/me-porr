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

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.keHoachVeSinhXaNewImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.keHoachVeSinhXaNewModelImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ke hoach ve sinh xa new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see keHoachVeSinhXaNewPersistence
 * @see keHoachVeSinhXaNewUtil
 * @generated
 */
public class keHoachVeSinhXaNewPersistenceImpl extends BasePersistenceImpl<keHoachVeSinhXaNew>
	implements keHoachVeSinhXaNewPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link keHoachVeSinhXaNewUtil} to access the ke hoach ve sinh xa new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = keHoachVeSinhXaNewImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			keHoachVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED,
			keHoachVeSinhXaNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			keHoachVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED,
			keHoachVeSinhXaNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			keHoachVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public keHoachVeSinhXaNewPersistenceImpl() {
		setModelClass(keHoachVeSinhXaNew.class);
	}

	/**
	 * Caches the ke hoach ve sinh xa new in the entity cache if it is enabled.
	 *
	 * @param keHoachVeSinhXaNew the ke hoach ve sinh xa new
	 */
	@Override
	public void cacheResult(keHoachVeSinhXaNew keHoachVeSinhXaNew) {
		EntityCacheUtil.putResult(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			keHoachVeSinhXaNewImpl.class, keHoachVeSinhXaNew.getPrimaryKey(),
			keHoachVeSinhXaNew);

		keHoachVeSinhXaNew.resetOriginalValues();
	}

	/**
	 * Caches the ke hoach ve sinh xa news in the entity cache if it is enabled.
	 *
	 * @param keHoachVeSinhXaNews the ke hoach ve sinh xa news
	 */
	@Override
	public void cacheResult(List<keHoachVeSinhXaNew> keHoachVeSinhXaNews) {
		for (keHoachVeSinhXaNew keHoachVeSinhXaNew : keHoachVeSinhXaNews) {
			if (EntityCacheUtil.getResult(
						keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
						keHoachVeSinhXaNewImpl.class,
						keHoachVeSinhXaNew.getPrimaryKey()) == null) {
				cacheResult(keHoachVeSinhXaNew);
			}
			else {
				keHoachVeSinhXaNew.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ke hoach ve sinh xa news.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(keHoachVeSinhXaNewImpl.class.getName());
		}

		EntityCacheUtil.clearCache(keHoachVeSinhXaNewImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ke hoach ve sinh xa new.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(keHoachVeSinhXaNew keHoachVeSinhXaNew) {
		EntityCacheUtil.removeResult(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			keHoachVeSinhXaNewImpl.class, keHoachVeSinhXaNew.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<keHoachVeSinhXaNew> keHoachVeSinhXaNews) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (keHoachVeSinhXaNew keHoachVeSinhXaNew : keHoachVeSinhXaNews) {
			EntityCacheUtil.removeResult(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
				keHoachVeSinhXaNewImpl.class, keHoachVeSinhXaNew.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ke hoach ve sinh xa new with the primary key. Does not add the ke hoach ve sinh xa new to the database.
	 *
	 * @param id the primary key for the new ke hoach ve sinh xa new
	 * @return the new ke hoach ve sinh xa new
	 */
	@Override
	public keHoachVeSinhXaNew create(int id) {
		keHoachVeSinhXaNew keHoachVeSinhXaNew = new keHoachVeSinhXaNewImpl();

		keHoachVeSinhXaNew.setNew(true);
		keHoachVeSinhXaNew.setPrimaryKey(id);

		return keHoachVeSinhXaNew;
	}

	/**
	 * Removes the ke hoach ve sinh xa new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ke hoach ve sinh xa new
	 * @return the ke hoach ve sinh xa new that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException if a ke hoach ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public keHoachVeSinhXaNew remove(int id)
		throws NoSuchkeHoachVeSinhXaNewException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ke hoach ve sinh xa new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ke hoach ve sinh xa new
	 * @return the ke hoach ve sinh xa new that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException if a ke hoach ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public keHoachVeSinhXaNew remove(Serializable primaryKey)
		throws NoSuchkeHoachVeSinhXaNewException, SystemException {
		Session session = null;

		try {
			session = openSession();

			keHoachVeSinhXaNew keHoachVeSinhXaNew = (keHoachVeSinhXaNew)session.get(keHoachVeSinhXaNewImpl.class,
					primaryKey);

			if (keHoachVeSinhXaNew == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchkeHoachVeSinhXaNewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(keHoachVeSinhXaNew);
		}
		catch (NoSuchkeHoachVeSinhXaNewException nsee) {
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
	protected keHoachVeSinhXaNew removeImpl(
		keHoachVeSinhXaNew keHoachVeSinhXaNew) throws SystemException {
		keHoachVeSinhXaNew = toUnwrappedModel(keHoachVeSinhXaNew);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(keHoachVeSinhXaNew)) {
				keHoachVeSinhXaNew = (keHoachVeSinhXaNew)session.get(keHoachVeSinhXaNewImpl.class,
						keHoachVeSinhXaNew.getPrimaryKeyObj());
			}

			if (keHoachVeSinhXaNew != null) {
				session.delete(keHoachVeSinhXaNew);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (keHoachVeSinhXaNew != null) {
			clearCache(keHoachVeSinhXaNew);
		}

		return keHoachVeSinhXaNew;
	}

	@Override
	public keHoachVeSinhXaNew updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew keHoachVeSinhXaNew)
		throws SystemException {
		keHoachVeSinhXaNew = toUnwrappedModel(keHoachVeSinhXaNew);

		boolean isNew = keHoachVeSinhXaNew.isNew();

		Session session = null;

		try {
			session = openSession();

			if (keHoachVeSinhXaNew.isNew()) {
				session.save(keHoachVeSinhXaNew);

				keHoachVeSinhXaNew.setNew(false);
			}
			else {
				session.merge(keHoachVeSinhXaNew);
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

		EntityCacheUtil.putResult(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			keHoachVeSinhXaNewImpl.class, keHoachVeSinhXaNew.getPrimaryKey(),
			keHoachVeSinhXaNew);

		return keHoachVeSinhXaNew;
	}

	protected keHoachVeSinhXaNew toUnwrappedModel(
		keHoachVeSinhXaNew keHoachVeSinhXaNew) {
		if (keHoachVeSinhXaNew instanceof keHoachVeSinhXaNewImpl) {
			return keHoachVeSinhXaNew;
		}

		keHoachVeSinhXaNewImpl keHoachVeSinhXaNewImpl = new keHoachVeSinhXaNewImpl();

		keHoachVeSinhXaNewImpl.setNew(keHoachVeSinhXaNew.isNew());
		keHoachVeSinhXaNewImpl.setPrimaryKey(keHoachVeSinhXaNew.getPrimaryKey());

		keHoachVeSinhXaNewImpl.setId(keHoachVeSinhXaNew.getId());
		keHoachVeSinhXaNewImpl.setMaTinh(keHoachVeSinhXaNew.getMaTinh());
		keHoachVeSinhXaNewImpl.setMaHuyen(keHoachVeSinhXaNew.getMaHuyen());
		keHoachVeSinhXaNewImpl.setMaXa(keHoachVeSinhXaNew.getMaXa());
		keHoachVeSinhXaNewImpl.setNam(keHoachVeSinhXaNew.getNam());
		keHoachVeSinhXaNewImpl.setSoNhaTieuHVSMoi(keHoachVeSinhXaNew.getSoNhaTieuHVSMoi());
		keHoachVeSinhXaNewImpl.setSoDan(keHoachVeSinhXaNew.getSoDan());
		keHoachVeSinhXaNewImpl.setDangKyVSTX(keHoachVeSinhXaNew.getDangKyVSTX());
		keHoachVeSinhXaNewImpl.setGhiChu(keHoachVeSinhXaNew.getGhiChu());
		keHoachVeSinhXaNewImpl.setBaoCaoDLI(keHoachVeSinhXaNew.getBaoCaoDLI());
		keHoachVeSinhXaNewImpl.setNgayTao(keHoachVeSinhXaNew.getNgayTao());
		keHoachVeSinhXaNewImpl.setIdNguoiTao(keHoachVeSinhXaNew.getIdNguoiTao());

		return keHoachVeSinhXaNewImpl;
	}

	/**
	 * Returns the ke hoach ve sinh xa new with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach ve sinh xa new
	 * @return the ke hoach ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException if a ke hoach ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public keHoachVeSinhXaNew findByPrimaryKey(Serializable primaryKey)
		throws NoSuchkeHoachVeSinhXaNewException, SystemException {
		keHoachVeSinhXaNew keHoachVeSinhXaNew = fetchByPrimaryKey(primaryKey);

		if (keHoachVeSinhXaNew == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchkeHoachVeSinhXaNewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return keHoachVeSinhXaNew;
	}

	/**
	 * Returns the ke hoach ve sinh xa new with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException} if it could not be found.
	 *
	 * @param id the primary key of the ke hoach ve sinh xa new
	 * @return the ke hoach ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException if a ke hoach ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public keHoachVeSinhXaNew findByPrimaryKey(int id)
		throws NoSuchkeHoachVeSinhXaNewException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ke hoach ve sinh xa new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach ve sinh xa new
	 * @return the ke hoach ve sinh xa new, or <code>null</code> if a ke hoach ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public keHoachVeSinhXaNew fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		keHoachVeSinhXaNew keHoachVeSinhXaNew = (keHoachVeSinhXaNew)EntityCacheUtil.getResult(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
				keHoachVeSinhXaNewImpl.class, primaryKey);

		if (keHoachVeSinhXaNew == _nullkeHoachVeSinhXaNew) {
			return null;
		}

		if (keHoachVeSinhXaNew == null) {
			Session session = null;

			try {
				session = openSession();

				keHoachVeSinhXaNew = (keHoachVeSinhXaNew)session.get(keHoachVeSinhXaNewImpl.class,
						primaryKey);

				if (keHoachVeSinhXaNew != null) {
					cacheResult(keHoachVeSinhXaNew);
				}
				else {
					EntityCacheUtil.putResult(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
						keHoachVeSinhXaNewImpl.class, primaryKey,
						_nullkeHoachVeSinhXaNew);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(keHoachVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
					keHoachVeSinhXaNewImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return keHoachVeSinhXaNew;
	}

	/**
	 * Returns the ke hoach ve sinh xa new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ke hoach ve sinh xa new
	 * @return the ke hoach ve sinh xa new, or <code>null</code> if a ke hoach ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public keHoachVeSinhXaNew fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ke hoach ve sinh xa news.
	 *
	 * @return the ke hoach ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<keHoachVeSinhXaNew> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach ve sinh xa news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.keHoachVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach ve sinh xa news
	 * @param end the upper bound of the range of ke hoach ve sinh xa news (not inclusive)
	 * @return the range of ke hoach ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<keHoachVeSinhXaNew> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach ve sinh xa news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.keHoachVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach ve sinh xa news
	 * @param end the upper bound of the range of ke hoach ve sinh xa news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ke hoach ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<keHoachVeSinhXaNew> findAll(int start, int end,
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

		List<keHoachVeSinhXaNew> list = (List<keHoachVeSinhXaNew>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KEHOACHVESINHXANEW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KEHOACHVESINHXANEW;

				if (pagination) {
					sql = sql.concat(keHoachVeSinhXaNewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<keHoachVeSinhXaNew>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<keHoachVeSinhXaNew>(list);
				}
				else {
					list = (List<keHoachVeSinhXaNew>)QueryUtil.list(q,
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
	 * Removes all the ke hoach ve sinh xa news from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (keHoachVeSinhXaNew keHoachVeSinhXaNew : findAll()) {
			remove(keHoachVeSinhXaNew);
		}
	}

	/**
	 * Returns the number of ke hoach ve sinh xa news.
	 *
	 * @return the number of ke hoach ve sinh xa news
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

				Query q = session.createQuery(_SQL_COUNT_KEHOACHVESINHXANEW);

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
	 * Initializes the ke hoach ve sinh xa new persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<keHoachVeSinhXaNew>> listenersList = new ArrayList<ModelListener<keHoachVeSinhXaNew>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<keHoachVeSinhXaNew>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(keHoachVeSinhXaNewImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KEHOACHVESINHXANEW = "SELECT keHoachVeSinhXaNew FROM keHoachVeSinhXaNew keHoachVeSinhXaNew";
	private static final String _SQL_COUNT_KEHOACHVESINHXANEW = "SELECT COUNT(keHoachVeSinhXaNew) FROM keHoachVeSinhXaNew keHoachVeSinhXaNew";
	private static final String _ORDER_BY_ENTITY_ALIAS = "keHoachVeSinhXaNew.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No keHoachVeSinhXaNew exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(keHoachVeSinhXaNewPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "maHuyen", "maXa", "nam", "soNhaTieuHVSMoi",
				"soDan", "dangKyVSTX", "ghiChu", "baoCaoDLI", "ngayTao",
				"idNguoiTao"
			});
	private static keHoachVeSinhXaNew _nullkeHoachVeSinhXaNew = new keHoachVeSinhXaNewImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<keHoachVeSinhXaNew> toCacheModel() {
				return _nullkeHoachVeSinhXaNewCacheModel;
			}
		};

	private static CacheModel<keHoachVeSinhXaNew> _nullkeHoachVeSinhXaNewCacheModel =
		new CacheModel<keHoachVeSinhXaNew>() {
			@Override
			public keHoachVeSinhXaNew toEntityModel() {
				return _nullkeHoachVeSinhXaNew;
			}
		};
}