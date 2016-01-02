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

import vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ke hoach kiem dem nuoc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see KeHoachKiemDemNuocPersistence
 * @see KeHoachKiemDemNuocUtil
 * @generated
 */
public class KeHoachKiemDemNuocPersistenceImpl extends BasePersistenceImpl<KeHoachKiemDemNuoc>
	implements KeHoachKiemDemNuocPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KeHoachKiemDemNuocUtil} to access the ke hoach kiem dem nuoc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KeHoachKiemDemNuocImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemNuocModelImpl.FINDER_CACHE_ENABLED,
			KeHoachKiemDemNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemNuocModelImpl.FINDER_CACHE_ENABLED,
			KeHoachKiemDemNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public KeHoachKiemDemNuocPersistenceImpl() {
		setModelClass(KeHoachKiemDemNuoc.class);
	}

	/**
	 * Caches the ke hoach kiem dem nuoc in the entity cache if it is enabled.
	 *
	 * @param keHoachKiemDemNuoc the ke hoach kiem dem nuoc
	 */
	@Override
	public void cacheResult(KeHoachKiemDemNuoc keHoachKiemDemNuoc) {
		EntityCacheUtil.putResult(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemNuocImpl.class, keHoachKiemDemNuoc.getPrimaryKey(),
			keHoachKiemDemNuoc);

		keHoachKiemDemNuoc.resetOriginalValues();
	}

	/**
	 * Caches the ke hoach kiem dem nuocs in the entity cache if it is enabled.
	 *
	 * @param keHoachKiemDemNuocs the ke hoach kiem dem nuocs
	 */
	@Override
	public void cacheResult(List<KeHoachKiemDemNuoc> keHoachKiemDemNuocs) {
		for (KeHoachKiemDemNuoc keHoachKiemDemNuoc : keHoachKiemDemNuocs) {
			if (EntityCacheUtil.getResult(
						KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachKiemDemNuocImpl.class,
						keHoachKiemDemNuoc.getPrimaryKey()) == null) {
				cacheResult(keHoachKiemDemNuoc);
			}
			else {
				keHoachKiemDemNuoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ke hoach kiem dem nuocs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KeHoachKiemDemNuocImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KeHoachKiemDemNuocImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ke hoach kiem dem nuoc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KeHoachKiemDemNuoc keHoachKiemDemNuoc) {
		EntityCacheUtil.removeResult(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemNuocImpl.class, keHoachKiemDemNuoc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<KeHoachKiemDemNuoc> keHoachKiemDemNuocs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KeHoachKiemDemNuoc keHoachKiemDemNuoc : keHoachKiemDemNuocs) {
			EntityCacheUtil.removeResult(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachKiemDemNuocImpl.class, keHoachKiemDemNuoc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ke hoach kiem dem nuoc with the primary key. Does not add the ke hoach kiem dem nuoc to the database.
	 *
	 * @param id the primary key for the new ke hoach kiem dem nuoc
	 * @return the new ke hoach kiem dem nuoc
	 */
	@Override
	public KeHoachKiemDemNuoc create(int id) {
		KeHoachKiemDemNuoc keHoachKiemDemNuoc = new KeHoachKiemDemNuocImpl();

		keHoachKiemDemNuoc.setNew(true);
		keHoachKiemDemNuoc.setPrimaryKey(id);

		return keHoachKiemDemNuoc;
	}

	/**
	 * Removes the ke hoach kiem dem nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ke hoach kiem dem nuoc
	 * @return the ke hoach kiem dem nuoc that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException if a ke hoach kiem dem nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemNuoc remove(int id)
		throws NoSuchKeHoachKiemDemNuocException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ke hoach kiem dem nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ke hoach kiem dem nuoc
	 * @return the ke hoach kiem dem nuoc that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException if a ke hoach kiem dem nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemNuoc remove(Serializable primaryKey)
		throws NoSuchKeHoachKiemDemNuocException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KeHoachKiemDemNuoc keHoachKiemDemNuoc = (KeHoachKiemDemNuoc)session.get(KeHoachKiemDemNuocImpl.class,
					primaryKey);

			if (keHoachKiemDemNuoc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKeHoachKiemDemNuocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(keHoachKiemDemNuoc);
		}
		catch (NoSuchKeHoachKiemDemNuocException nsee) {
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
	protected KeHoachKiemDemNuoc removeImpl(
		KeHoachKiemDemNuoc keHoachKiemDemNuoc) throws SystemException {
		keHoachKiemDemNuoc = toUnwrappedModel(keHoachKiemDemNuoc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(keHoachKiemDemNuoc)) {
				keHoachKiemDemNuoc = (KeHoachKiemDemNuoc)session.get(KeHoachKiemDemNuocImpl.class,
						keHoachKiemDemNuoc.getPrimaryKeyObj());
			}

			if (keHoachKiemDemNuoc != null) {
				session.delete(keHoachKiemDemNuoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (keHoachKiemDemNuoc != null) {
			clearCache(keHoachKiemDemNuoc);
		}

		return keHoachKiemDemNuoc;
	}

	@Override
	public KeHoachKiemDemNuoc updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc)
		throws SystemException {
		keHoachKiemDemNuoc = toUnwrappedModel(keHoachKiemDemNuoc);

		boolean isNew = keHoachKiemDemNuoc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (keHoachKiemDemNuoc.isNew()) {
				session.save(keHoachKiemDemNuoc);

				keHoachKiemDemNuoc.setNew(false);
			}
			else {
				session.merge(keHoachKiemDemNuoc);
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

		EntityCacheUtil.putResult(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemNuocImpl.class, keHoachKiemDemNuoc.getPrimaryKey(),
			keHoachKiemDemNuoc);

		return keHoachKiemDemNuoc;
	}

	protected KeHoachKiemDemNuoc toUnwrappedModel(
		KeHoachKiemDemNuoc keHoachKiemDemNuoc) {
		if (keHoachKiemDemNuoc instanceof KeHoachKiemDemNuocImpl) {
			return keHoachKiemDemNuoc;
		}

		KeHoachKiemDemNuocImpl keHoachKiemDemNuocImpl = new KeHoachKiemDemNuocImpl();

		keHoachKiemDemNuocImpl.setNew(keHoachKiemDemNuoc.isNew());
		keHoachKiemDemNuocImpl.setPrimaryKey(keHoachKiemDemNuoc.getPrimaryKey());

		keHoachKiemDemNuocImpl.setId(keHoachKiemDemNuoc.getId());
		keHoachKiemDemNuocImpl.setNam(keHoachKiemDemNuoc.getNam());
		keHoachKiemDemNuocImpl.setTramCapNuocId(keHoachKiemDemNuoc.getTramCapNuocId());
		keHoachKiemDemNuocImpl.setKiemDemVienId(keHoachKiemDemNuoc.getKiemDemVienId());
		keHoachKiemDemNuocImpl.setNgayBatDau(keHoachKiemDemNuoc.getNgayBatDau());
		keHoachKiemDemNuocImpl.setNgayKetThuc(keHoachKiemDemNuoc.getNgayKetThuc());
		keHoachKiemDemNuocImpl.setMoTa(keHoachKiemDemNuoc.getMoTa());
		keHoachKiemDemNuocImpl.setNgayTao(keHoachKiemDemNuoc.getNgayTao());
		keHoachKiemDemNuocImpl.setIdNguoiTao(keHoachKiemDemNuoc.getIdNguoiTao());
		keHoachKiemDemNuocImpl.setNgayXuatBan(keHoachKiemDemNuoc.getNgayXuatBan());
		keHoachKiemDemNuocImpl.setIdNguoiXuatBan(keHoachKiemDemNuoc.getIdNguoiXuatBan());
		keHoachKiemDemNuocImpl.setNgayDong(keHoachKiemDemNuoc.getNgayDong());
		keHoachKiemDemNuocImpl.setIdNguoiDong(keHoachKiemDemNuoc.getIdNguoiDong());
		keHoachKiemDemNuocImpl.setLastSavePoint(keHoachKiemDemNuoc.getLastSavePoint());

		return keHoachKiemDemNuocImpl;
	}

	/**
	 * Returns the ke hoach kiem dem nuoc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach kiem dem nuoc
	 * @return the ke hoach kiem dem nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException if a ke hoach kiem dem nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemNuoc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKeHoachKiemDemNuocException, SystemException {
		KeHoachKiemDemNuoc keHoachKiemDemNuoc = fetchByPrimaryKey(primaryKey);

		if (keHoachKiemDemNuoc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKeHoachKiemDemNuocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return keHoachKiemDemNuoc;
	}

	/**
	 * Returns the ke hoach kiem dem nuoc with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException} if it could not be found.
	 *
	 * @param id the primary key of the ke hoach kiem dem nuoc
	 * @return the ke hoach kiem dem nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException if a ke hoach kiem dem nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemNuoc findByPrimaryKey(int id)
		throws NoSuchKeHoachKiemDemNuocException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ke hoach kiem dem nuoc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach kiem dem nuoc
	 * @return the ke hoach kiem dem nuoc, or <code>null</code> if a ke hoach kiem dem nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemNuoc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KeHoachKiemDemNuoc keHoachKiemDemNuoc = (KeHoachKiemDemNuoc)EntityCacheUtil.getResult(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachKiemDemNuocImpl.class, primaryKey);

		if (keHoachKiemDemNuoc == _nullKeHoachKiemDemNuoc) {
			return null;
		}

		if (keHoachKiemDemNuoc == null) {
			Session session = null;

			try {
				session = openSession();

				keHoachKiemDemNuoc = (KeHoachKiemDemNuoc)session.get(KeHoachKiemDemNuocImpl.class,
						primaryKey);

				if (keHoachKiemDemNuoc != null) {
					cacheResult(keHoachKiemDemNuoc);
				}
				else {
					EntityCacheUtil.putResult(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachKiemDemNuocImpl.class, primaryKey,
						_nullKeHoachKiemDemNuoc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KeHoachKiemDemNuocModelImpl.ENTITY_CACHE_ENABLED,
					KeHoachKiemDemNuocImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return keHoachKiemDemNuoc;
	}

	/**
	 * Returns the ke hoach kiem dem nuoc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ke hoach kiem dem nuoc
	 * @return the ke hoach kiem dem nuoc, or <code>null</code> if a ke hoach kiem dem nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemNuoc fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ke hoach kiem dem nuocs.
	 *
	 * @return the ke hoach kiem dem nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachKiemDemNuoc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach kiem dem nuocs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach kiem dem nuocs
	 * @param end the upper bound of the range of ke hoach kiem dem nuocs (not inclusive)
	 * @return the range of ke hoach kiem dem nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachKiemDemNuoc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach kiem dem nuocs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach kiem dem nuocs
	 * @param end the upper bound of the range of ke hoach kiem dem nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ke hoach kiem dem nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachKiemDemNuoc> findAll(int start, int end,
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

		List<KeHoachKiemDemNuoc> list = (List<KeHoachKiemDemNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KEHOACHKIEMDEMNUOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KEHOACHKIEMDEMNUOC;

				if (pagination) {
					sql = sql.concat(KeHoachKiemDemNuocModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KeHoachKiemDemNuoc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachKiemDemNuoc>(list);
				}
				else {
					list = (List<KeHoachKiemDemNuoc>)QueryUtil.list(q,
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
	 * Removes all the ke hoach kiem dem nuocs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KeHoachKiemDemNuoc keHoachKiemDemNuoc : findAll()) {
			remove(keHoachKiemDemNuoc);
		}
	}

	/**
	 * Returns the number of ke hoach kiem dem nuocs.
	 *
	 * @return the number of ke hoach kiem dem nuocs
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

				Query q = session.createQuery(_SQL_COUNT_KEHOACHKIEMDEMNUOC);

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
	 * Initializes the ke hoach kiem dem nuoc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KeHoachKiemDemNuoc>> listenersList = new ArrayList<ModelListener<KeHoachKiemDemNuoc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KeHoachKiemDemNuoc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KeHoachKiemDemNuocImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KEHOACHKIEMDEMNUOC = "SELECT keHoachKiemDemNuoc FROM KeHoachKiemDemNuoc keHoachKiemDemNuoc";
	private static final String _SQL_COUNT_KEHOACHKIEMDEMNUOC = "SELECT COUNT(keHoachKiemDemNuoc) FROM KeHoachKiemDemNuoc keHoachKiemDemNuoc";
	private static final String _ORDER_BY_ENTITY_ALIAS = "keHoachKiemDemNuoc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KeHoachKiemDemNuoc exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KeHoachKiemDemNuocPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "nam", "tramCapNuocId", "kiemDemVienId", "ngayBatDau",
				"ngayKetThuc", "moTa", "ngayTao", "idNguoiTao", "ngayXuatBan",
				"idNguoiXuatBan", "ngayDong", "idNguoiDong", "lastSavePoint"
			});
	private static KeHoachKiemDemNuoc _nullKeHoachKiemDemNuoc = new KeHoachKiemDemNuocImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KeHoachKiemDemNuoc> toCacheModel() {
				return _nullKeHoachKiemDemNuocCacheModel;
			}
		};

	private static CacheModel<KeHoachKiemDemNuoc> _nullKeHoachKiemDemNuocCacheModel =
		new CacheModel<KeHoachKiemDemNuoc>() {
			@Override
			public KeHoachKiemDemNuoc toEntityModel() {
				return _nullKeHoachKiemDemNuoc;
			}
		};
}