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

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchKeHoachKiemDemVeSinhException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ke hoach kiem dem ve sinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see KeHoachKiemDemVeSinhPersistence
 * @see KeHoachKiemDemVeSinhUtil
 * @generated
 */
public class KeHoachKiemDemVeSinhPersistenceImpl extends BasePersistenceImpl<KeHoachKiemDemVeSinh>
	implements KeHoachKiemDemVeSinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KeHoachKiemDemVeSinhUtil} to access the ke hoach kiem dem ve sinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KeHoachKiemDemVeSinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachKiemDemVeSinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemVeSinhModelImpl.FINDER_CACHE_ENABLED,
			KeHoachKiemDemVeSinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemVeSinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public KeHoachKiemDemVeSinhPersistenceImpl() {
		setModelClass(KeHoachKiemDemVeSinh.class);
	}

	/**
	 * Caches the ke hoach kiem dem ve sinh in the entity cache if it is enabled.
	 *
	 * @param keHoachKiemDemVeSinh the ke hoach kiem dem ve sinh
	 */
	@Override
	public void cacheResult(KeHoachKiemDemVeSinh keHoachKiemDemVeSinh) {
		EntityCacheUtil.putResult(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemVeSinhImpl.class,
			keHoachKiemDemVeSinh.getPrimaryKey(), keHoachKiemDemVeSinh);

		keHoachKiemDemVeSinh.resetOriginalValues();
	}

	/**
	 * Caches the ke hoach kiem dem ve sinhs in the entity cache if it is enabled.
	 *
	 * @param keHoachKiemDemVeSinhs the ke hoach kiem dem ve sinhs
	 */
	@Override
	public void cacheResult(List<KeHoachKiemDemVeSinh> keHoachKiemDemVeSinhs) {
		for (KeHoachKiemDemVeSinh keHoachKiemDemVeSinh : keHoachKiemDemVeSinhs) {
			if (EntityCacheUtil.getResult(
						KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachKiemDemVeSinhImpl.class,
						keHoachKiemDemVeSinh.getPrimaryKey()) == null) {
				cacheResult(keHoachKiemDemVeSinh);
			}
			else {
				keHoachKiemDemVeSinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ke hoach kiem dem ve sinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KeHoachKiemDemVeSinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KeHoachKiemDemVeSinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ke hoach kiem dem ve sinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KeHoachKiemDemVeSinh keHoachKiemDemVeSinh) {
		EntityCacheUtil.removeResult(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemVeSinhImpl.class, keHoachKiemDemVeSinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<KeHoachKiemDemVeSinh> keHoachKiemDemVeSinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KeHoachKiemDemVeSinh keHoachKiemDemVeSinh : keHoachKiemDemVeSinhs) {
			EntityCacheUtil.removeResult(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachKiemDemVeSinhImpl.class,
				keHoachKiemDemVeSinh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ke hoach kiem dem ve sinh with the primary key. Does not add the ke hoach kiem dem ve sinh to the database.
	 *
	 * @param id the primary key for the new ke hoach kiem dem ve sinh
	 * @return the new ke hoach kiem dem ve sinh
	 */
	@Override
	public KeHoachKiemDemVeSinh create(int id) {
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = new KeHoachKiemDemVeSinhImpl();

		keHoachKiemDemVeSinh.setNew(true);
		keHoachKiemDemVeSinh.setPrimaryKey(id);

		return keHoachKiemDemVeSinh;
	}

	/**
	 * Removes the ke hoach kiem dem ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ke hoach kiem dem ve sinh
	 * @return the ke hoach kiem dem ve sinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchKeHoachKiemDemVeSinhException if a ke hoach kiem dem ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemVeSinh remove(int id)
		throws NoSuchKeHoachKiemDemVeSinhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ke hoach kiem dem ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ke hoach kiem dem ve sinh
	 * @return the ke hoach kiem dem ve sinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchKeHoachKiemDemVeSinhException if a ke hoach kiem dem ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemVeSinh remove(Serializable primaryKey)
		throws NoSuchKeHoachKiemDemVeSinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = (KeHoachKiemDemVeSinh)session.get(KeHoachKiemDemVeSinhImpl.class,
					primaryKey);

			if (keHoachKiemDemVeSinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKeHoachKiemDemVeSinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(keHoachKiemDemVeSinh);
		}
		catch (NoSuchKeHoachKiemDemVeSinhException nsee) {
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
	protected KeHoachKiemDemVeSinh removeImpl(
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh) throws SystemException {
		keHoachKiemDemVeSinh = toUnwrappedModel(keHoachKiemDemVeSinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(keHoachKiemDemVeSinh)) {
				keHoachKiemDemVeSinh = (KeHoachKiemDemVeSinh)session.get(KeHoachKiemDemVeSinhImpl.class,
						keHoachKiemDemVeSinh.getPrimaryKeyObj());
			}

			if (keHoachKiemDemVeSinh != null) {
				session.delete(keHoachKiemDemVeSinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (keHoachKiemDemVeSinh != null) {
			clearCache(keHoachKiemDemVeSinh);
		}

		return keHoachKiemDemVeSinh;
	}

	@Override
	public KeHoachKiemDemVeSinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh keHoachKiemDemVeSinh)
		throws SystemException {
		keHoachKiemDemVeSinh = toUnwrappedModel(keHoachKiemDemVeSinh);

		boolean isNew = keHoachKiemDemVeSinh.isNew();

		Session session = null;

		try {
			session = openSession();

			if (keHoachKiemDemVeSinh.isNew()) {
				session.save(keHoachKiemDemVeSinh);

				keHoachKiemDemVeSinh.setNew(false);
			}
			else {
				session.merge(keHoachKiemDemVeSinh);
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

		EntityCacheUtil.putResult(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachKiemDemVeSinhImpl.class,
			keHoachKiemDemVeSinh.getPrimaryKey(), keHoachKiemDemVeSinh);

		return keHoachKiemDemVeSinh;
	}

	protected KeHoachKiemDemVeSinh toUnwrappedModel(
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh) {
		if (keHoachKiemDemVeSinh instanceof KeHoachKiemDemVeSinhImpl) {
			return keHoachKiemDemVeSinh;
		}

		KeHoachKiemDemVeSinhImpl keHoachKiemDemVeSinhImpl = new KeHoachKiemDemVeSinhImpl();

		keHoachKiemDemVeSinhImpl.setNew(keHoachKiemDemVeSinh.isNew());
		keHoachKiemDemVeSinhImpl.setPrimaryKey(keHoachKiemDemVeSinh.getPrimaryKey());

		keHoachKiemDemVeSinhImpl.setId(keHoachKiemDemVeSinh.getId());
		keHoachKiemDemVeSinhImpl.setNam(keHoachKiemDemVeSinh.getNam());
		keHoachKiemDemVeSinhImpl.setMaTinh(keHoachKiemDemVeSinh.getMaTinh());
		keHoachKiemDemVeSinhImpl.setMaHuyen(keHoachKiemDemVeSinh.getMaHuyen());
		keHoachKiemDemVeSinhImpl.setKiemDemVienID(keHoachKiemDemVeSinh.getKiemDemVienID());
		keHoachKiemDemVeSinhImpl.setNgayBatDau(keHoachKiemDemVeSinh.getNgayBatDau());
		keHoachKiemDemVeSinhImpl.setNgayKetThuc(keHoachKiemDemVeSinh.getNgayKetThuc());
		keHoachKiemDemVeSinhImpl.setMoTa(keHoachKiemDemVeSinh.getMoTa());
		keHoachKiemDemVeSinhImpl.setNgayTao(keHoachKiemDemVeSinh.getNgayTao());
		keHoachKiemDemVeSinhImpl.setIdNguoiTao(keHoachKiemDemVeSinh.getIdNguoiTao());
		keHoachKiemDemVeSinhImpl.setNgayXuatBan(keHoachKiemDemVeSinh.getNgayXuatBan());
		keHoachKiemDemVeSinhImpl.setIdNguoiXuatBan(keHoachKiemDemVeSinh.getIdNguoiXuatBan());
		keHoachKiemDemVeSinhImpl.setTableId(keHoachKiemDemVeSinh.getTableId());
		keHoachKiemDemVeSinhImpl.setNgayDong(keHoachKiemDemVeSinh.getNgayDong());
		keHoachKiemDemVeSinhImpl.setIdNguoiDong(keHoachKiemDemVeSinh.getIdNguoiDong());
		keHoachKiemDemVeSinhImpl.setLastSavePoint(keHoachKiemDemVeSinh.getLastSavePoint());

		return keHoachKiemDemVeSinhImpl;
	}

	/**
	 * Returns the ke hoach kiem dem ve sinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach kiem dem ve sinh
	 * @return the ke hoach kiem dem ve sinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchKeHoachKiemDemVeSinhException if a ke hoach kiem dem ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemVeSinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKeHoachKiemDemVeSinhException, SystemException {
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = fetchByPrimaryKey(primaryKey);

		if (keHoachKiemDemVeSinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKeHoachKiemDemVeSinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return keHoachKiemDemVeSinh;
	}

	/**
	 * Returns the ke hoach kiem dem ve sinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchKeHoachKiemDemVeSinhException} if it could not be found.
	 *
	 * @param id the primary key of the ke hoach kiem dem ve sinh
	 * @return the ke hoach kiem dem ve sinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchKeHoachKiemDemVeSinhException if a ke hoach kiem dem ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemVeSinh findByPrimaryKey(int id)
		throws NoSuchKeHoachKiemDemVeSinhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ke hoach kiem dem ve sinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach kiem dem ve sinh
	 * @return the ke hoach kiem dem ve sinh, or <code>null</code> if a ke hoach kiem dem ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemVeSinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = (KeHoachKiemDemVeSinh)EntityCacheUtil.getResult(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachKiemDemVeSinhImpl.class, primaryKey);

		if (keHoachKiemDemVeSinh == _nullKeHoachKiemDemVeSinh) {
			return null;
		}

		if (keHoachKiemDemVeSinh == null) {
			Session session = null;

			try {
				session = openSession();

				keHoachKiemDemVeSinh = (KeHoachKiemDemVeSinh)session.get(KeHoachKiemDemVeSinhImpl.class,
						primaryKey);

				if (keHoachKiemDemVeSinh != null) {
					cacheResult(keHoachKiemDemVeSinh);
				}
				else {
					EntityCacheUtil.putResult(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachKiemDemVeSinhImpl.class, primaryKey,
						_nullKeHoachKiemDemVeSinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KeHoachKiemDemVeSinhModelImpl.ENTITY_CACHE_ENABLED,
					KeHoachKiemDemVeSinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return keHoachKiemDemVeSinh;
	}

	/**
	 * Returns the ke hoach kiem dem ve sinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ke hoach kiem dem ve sinh
	 * @return the ke hoach kiem dem ve sinh, or <code>null</code> if a ke hoach kiem dem ve sinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachKiemDemVeSinh fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ke hoach kiem dem ve sinhs.
	 *
	 * @return the ke hoach kiem dem ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachKiemDemVeSinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach kiem dem ve sinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach kiem dem ve sinhs
	 * @param end the upper bound of the range of ke hoach kiem dem ve sinhs (not inclusive)
	 * @return the range of ke hoach kiem dem ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachKiemDemVeSinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach kiem dem ve sinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach kiem dem ve sinhs
	 * @param end the upper bound of the range of ke hoach kiem dem ve sinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ke hoach kiem dem ve sinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachKiemDemVeSinh> findAll(int start, int end,
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

		List<KeHoachKiemDemVeSinh> list = (List<KeHoachKiemDemVeSinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KEHOACHKIEMDEMVESINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KEHOACHKIEMDEMVESINH;

				if (pagination) {
					sql = sql.concat(KeHoachKiemDemVeSinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KeHoachKiemDemVeSinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachKiemDemVeSinh>(list);
				}
				else {
					list = (List<KeHoachKiemDemVeSinh>)QueryUtil.list(q,
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
	 * Removes all the ke hoach kiem dem ve sinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KeHoachKiemDemVeSinh keHoachKiemDemVeSinh : findAll()) {
			remove(keHoachKiemDemVeSinh);
		}
	}

	/**
	 * Returns the number of ke hoach kiem dem ve sinhs.
	 *
	 * @return the number of ke hoach kiem dem ve sinhs
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

				Query q = session.createQuery(_SQL_COUNT_KEHOACHKIEMDEMVESINH);

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
	 * Initializes the ke hoach kiem dem ve sinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KeHoachKiemDemVeSinh>> listenersList = new ArrayList<ModelListener<KeHoachKiemDemVeSinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KeHoachKiemDemVeSinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KeHoachKiemDemVeSinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KEHOACHKIEMDEMVESINH = "SELECT keHoachKiemDemVeSinh FROM KeHoachKiemDemVeSinh keHoachKiemDemVeSinh";
	private static final String _SQL_COUNT_KEHOACHKIEMDEMVESINH = "SELECT COUNT(keHoachKiemDemVeSinh) FROM KeHoachKiemDemVeSinh keHoachKiemDemVeSinh";
	private static final String _ORDER_BY_ENTITY_ALIAS = "keHoachKiemDemVeSinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KeHoachKiemDemVeSinh exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KeHoachKiemDemVeSinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "nam", "maTinh", "maHuyen", "kiemDemVienID", "ngayBatDau",
				"ngayKetThuc", "moTa", "ngayTao", "idNguoiTao", "ngayXuatBan",
				"idNguoiXuatBan", "tableId", "ngayDong", "idNguoiDong",
				"lastSavePoint"
			});
	private static KeHoachKiemDemVeSinh _nullKeHoachKiemDemVeSinh = new KeHoachKiemDemVeSinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KeHoachKiemDemVeSinh> toCacheModel() {
				return _nullKeHoachKiemDemVeSinhCacheModel;
			}
		};

	private static CacheModel<KeHoachKiemDemVeSinh> _nullKeHoachKiemDemVeSinhCacheModel =
		new CacheModel<KeHoachKiemDemVeSinh>() {
			@Override
			public KeHoachKiemDemVeSinh toEntityModel() {
				return _nullKeHoachKiemDemVeSinh;
			}
		};
}