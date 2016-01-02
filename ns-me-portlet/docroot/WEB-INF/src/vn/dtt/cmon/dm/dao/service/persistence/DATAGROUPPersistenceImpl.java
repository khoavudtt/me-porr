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

package vn.dtt.cmon.dm.dao.service.persistence;

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

import vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException;
import vn.dtt.cmon.dm.dao.model.DATAGROUP;
import vn.dtt.cmon.dm.dao.model.impl.DATAGROUPImpl;
import vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the d a t a g r o u p service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DATAGROUPPersistence
 * @see DATAGROUPUtil
 * @generated
 */
public class DATAGROUPPersistenceImpl extends BasePersistenceImpl<DATAGROUP>
	implements DATAGROUPPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DATAGROUPUtil} to access the d a t a g r o u p persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DATAGROUPImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
			DATAGROUPModelImpl.FINDER_CACHE_ENABLED, DATAGROUPImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
			DATAGROUPModelImpl.FINDER_CACHE_ENABLED, DATAGROUPImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
			DATAGROUPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DATAGROUPPersistenceImpl() {
		setModelClass(DATAGROUP.class);
	}

	/**
	 * Caches the d a t a g r o u p in the entity cache if it is enabled.
	 *
	 * @param datagroup the d a t a g r o u p
	 */
	@Override
	public void cacheResult(DATAGROUP datagroup) {
		EntityCacheUtil.putResult(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
			DATAGROUPImpl.class, datagroup.getPrimaryKey(), datagroup);

		datagroup.resetOriginalValues();
	}

	/**
	 * Caches the d a t a g r o u ps in the entity cache if it is enabled.
	 *
	 * @param datagroups the d a t a g r o u ps
	 */
	@Override
	public void cacheResult(List<DATAGROUP> datagroups) {
		for (DATAGROUP datagroup : datagroups) {
			if (EntityCacheUtil.getResult(
						DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
						DATAGROUPImpl.class, datagroup.getPrimaryKey()) == null) {
				cacheResult(datagroup);
			}
			else {
				datagroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all d a t a g r o u ps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DATAGROUPImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DATAGROUPImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the d a t a g r o u p.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DATAGROUP datagroup) {
		EntityCacheUtil.removeResult(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
			DATAGROUPImpl.class, datagroup.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DATAGROUP> datagroups) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DATAGROUP datagroup : datagroups) {
			EntityCacheUtil.removeResult(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
				DATAGROUPImpl.class, datagroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new d a t a g r o u p with the primary key. Does not add the d a t a g r o u p to the database.
	 *
	 * @param id the primary key for the new d a t a g r o u p
	 * @return the new d a t a g r o u p
	 */
	@Override
	public DATAGROUP create(long id) {
		DATAGROUP datagroup = new DATAGROUPImpl();

		datagroup.setNew(true);
		datagroup.setPrimaryKey(id);

		return datagroup;
	}

	/**
	 * Removes the d a t a g r o u p with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the d a t a g r o u p
	 * @return the d a t a g r o u p that was removed
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException if a d a t a g r o u p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAGROUP remove(long id)
		throws NoSuchDATAGROUPException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the d a t a g r o u p with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the d a t a g r o u p
	 * @return the d a t a g r o u p that was removed
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException if a d a t a g r o u p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAGROUP remove(Serializable primaryKey)
		throws NoSuchDATAGROUPException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DATAGROUP datagroup = (DATAGROUP)session.get(DATAGROUPImpl.class,
					primaryKey);

			if (datagroup == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDATAGROUPException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(datagroup);
		}
		catch (NoSuchDATAGROUPException nsee) {
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
	protected DATAGROUP removeImpl(DATAGROUP datagroup)
		throws SystemException {
		datagroup = toUnwrappedModel(datagroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(datagroup)) {
				datagroup = (DATAGROUP)session.get(DATAGROUPImpl.class,
						datagroup.getPrimaryKeyObj());
			}

			if (datagroup != null) {
				session.delete(datagroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (datagroup != null) {
			clearCache(datagroup);
		}

		return datagroup;
	}

	@Override
	public DATAGROUP updateImpl(vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws SystemException {
		datagroup = toUnwrappedModel(datagroup);

		boolean isNew = datagroup.isNew();

		Session session = null;

		try {
			session = openSession();

			if (datagroup.isNew()) {
				session.save(datagroup);

				datagroup.setNew(false);
			}
			else {
				session.merge(datagroup);
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

		EntityCacheUtil.putResult(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
			DATAGROUPImpl.class, datagroup.getPrimaryKey(), datagroup);

		return datagroup;
	}

	protected DATAGROUP toUnwrappedModel(DATAGROUP datagroup) {
		if (datagroup instanceof DATAGROUPImpl) {
			return datagroup;
		}

		DATAGROUPImpl datagroupImpl = new DATAGROUPImpl();

		datagroupImpl.setNew(datagroup.isNew());
		datagroupImpl.setPrimaryKey(datagroup.getPrimaryKey());

		datagroupImpl.setId(datagroup.getId());
		datagroupImpl.setCode(datagroup.getCode());
		datagroupImpl.setName(datagroup.getName());
		datagroupImpl.setDescription(datagroup.getDescription());

		return datagroupImpl;
	}

	/**
	 * Returns the d a t a g r o u p with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the d a t a g r o u p
	 * @return the d a t a g r o u p
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException if a d a t a g r o u p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAGROUP findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDATAGROUPException, SystemException {
		DATAGROUP datagroup = fetchByPrimaryKey(primaryKey);

		if (datagroup == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDATAGROUPException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return datagroup;
	}

	/**
	 * Returns the d a t a g r o u p with the primary key or throws a {@link vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException} if it could not be found.
	 *
	 * @param id the primary key of the d a t a g r o u p
	 * @return the d a t a g r o u p
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException if a d a t a g r o u p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAGROUP findByPrimaryKey(long id)
		throws NoSuchDATAGROUPException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the d a t a g r o u p with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the d a t a g r o u p
	 * @return the d a t a g r o u p, or <code>null</code> if a d a t a g r o u p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAGROUP fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DATAGROUP datagroup = (DATAGROUP)EntityCacheUtil.getResult(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
				DATAGROUPImpl.class, primaryKey);

		if (datagroup == _nullDATAGROUP) {
			return null;
		}

		if (datagroup == null) {
			Session session = null;

			try {
				session = openSession();

				datagroup = (DATAGROUP)session.get(DATAGROUPImpl.class,
						primaryKey);

				if (datagroup != null) {
					cacheResult(datagroup);
				}
				else {
					EntityCacheUtil.putResult(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
						DATAGROUPImpl.class, primaryKey, _nullDATAGROUP);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DATAGROUPModelImpl.ENTITY_CACHE_ENABLED,
					DATAGROUPImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return datagroup;
	}

	/**
	 * Returns the d a t a g r o u p with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the d a t a g r o u p
	 * @return the d a t a g r o u p, or <code>null</code> if a d a t a g r o u p with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAGROUP fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the d a t a g r o u ps.
	 *
	 * @return the d a t a g r o u ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAGROUP> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the d a t a g r o u ps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d a t a g r o u ps
	 * @param end the upper bound of the range of d a t a g r o u ps (not inclusive)
	 * @return the range of d a t a g r o u ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAGROUP> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the d a t a g r o u ps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d a t a g r o u ps
	 * @param end the upper bound of the range of d a t a g r o u ps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of d a t a g r o u ps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAGROUP> findAll(int start, int end,
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

		List<DATAGROUP> list = (List<DATAGROUP>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DATAGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATAGROUP;

				if (pagination) {
					sql = sql.concat(DATAGROUPModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DATAGROUP>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DATAGROUP>(list);
				}
				else {
					list = (List<DATAGROUP>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the d a t a g r o u ps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DATAGROUP datagroup : findAll()) {
			remove(datagroup);
		}
	}

	/**
	 * Returns the number of d a t a g r o u ps.
	 *
	 * @return the number of d a t a g r o u ps
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

				Query q = session.createQuery(_SQL_COUNT_DATAGROUP);

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
	 * Initializes the d a t a g r o u p persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.dm.dao.model.DATAGROUP")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DATAGROUP>> listenersList = new ArrayList<ModelListener<DATAGROUP>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DATAGROUP>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DATAGROUPImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DATAGROUP = "SELECT datagroup FROM DATAGROUP datagroup";
	private static final String _SQL_COUNT_DATAGROUP = "SELECT COUNT(datagroup) FROM DATAGROUP datagroup";
	private static final String _ORDER_BY_ENTITY_ALIAS = "datagroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DATAGROUP exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DATAGROUPPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "code", "name", "description"
			});
	private static DATAGROUP _nullDATAGROUP = new DATAGROUPImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DATAGROUP> toCacheModel() {
				return _nullDATAGROUPCacheModel;
			}
		};

	private static CacheModel<DATAGROUP> _nullDATAGROUPCacheModel = new CacheModel<DATAGROUP>() {
			@Override
			public DATAGROUP toEntityModel() {
				return _nullDATAGROUP;
			}
		};
}