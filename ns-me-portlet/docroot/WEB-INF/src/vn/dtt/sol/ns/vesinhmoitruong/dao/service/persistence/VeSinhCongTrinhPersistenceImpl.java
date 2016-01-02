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

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ve sinh cong trinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see VeSinhCongTrinhPersistence
 * @see VeSinhCongTrinhUtil
 * @generated
 */
public class VeSinhCongTrinhPersistenceImpl extends BasePersistenceImpl<VeSinhCongTrinh>
	implements VeSinhCongTrinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VeSinhCongTrinhUtil} to access the ve sinh cong trinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VeSinhCongTrinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhCongTrinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VeSinhCongTrinhPersistenceImpl() {
		setModelClass(VeSinhCongTrinh.class);
	}

	/**
	 * Caches the ve sinh cong trinh in the entity cache if it is enabled.
	 *
	 * @param veSinhCongTrinh the ve sinh cong trinh
	 */
	@Override
	public void cacheResult(VeSinhCongTrinh veSinhCongTrinh) {
		EntityCacheUtil.putResult(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhCongTrinhImpl.class, veSinhCongTrinh.getPrimaryKey(),
			veSinhCongTrinh);

		veSinhCongTrinh.resetOriginalValues();
	}

	/**
	 * Caches the ve sinh cong trinhs in the entity cache if it is enabled.
	 *
	 * @param veSinhCongTrinhs the ve sinh cong trinhs
	 */
	@Override
	public void cacheResult(List<VeSinhCongTrinh> veSinhCongTrinhs) {
		for (VeSinhCongTrinh veSinhCongTrinh : veSinhCongTrinhs) {
			if (EntityCacheUtil.getResult(
						VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
						VeSinhCongTrinhImpl.class,
						veSinhCongTrinh.getPrimaryKey()) == null) {
				cacheResult(veSinhCongTrinh);
			}
			else {
				veSinhCongTrinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ve sinh cong trinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VeSinhCongTrinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VeSinhCongTrinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ve sinh cong trinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VeSinhCongTrinh veSinhCongTrinh) {
		EntityCacheUtil.removeResult(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhCongTrinhImpl.class, veSinhCongTrinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VeSinhCongTrinh> veSinhCongTrinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VeSinhCongTrinh veSinhCongTrinh : veSinhCongTrinhs) {
			EntityCacheUtil.removeResult(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
				VeSinhCongTrinhImpl.class, veSinhCongTrinh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ve sinh cong trinh with the primary key. Does not add the ve sinh cong trinh to the database.
	 *
	 * @param id the primary key for the new ve sinh cong trinh
	 * @return the new ve sinh cong trinh
	 */
	@Override
	public VeSinhCongTrinh create(int id) {
		VeSinhCongTrinh veSinhCongTrinh = new VeSinhCongTrinhImpl();

		veSinhCongTrinh.setNew(true);
		veSinhCongTrinh.setPrimaryKey(id);

		return veSinhCongTrinh;
	}

	/**
	 * Removes the ve sinh cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ve sinh cong trinh
	 * @return the ve sinh cong trinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException if a ve sinh cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhCongTrinh remove(int id)
		throws NoSuchVeSinhCongTrinhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ve sinh cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ve sinh cong trinh
	 * @return the ve sinh cong trinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException if a ve sinh cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhCongTrinh remove(Serializable primaryKey)
		throws NoSuchVeSinhCongTrinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VeSinhCongTrinh veSinhCongTrinh = (VeSinhCongTrinh)session.get(VeSinhCongTrinhImpl.class,
					primaryKey);

			if (veSinhCongTrinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVeSinhCongTrinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(veSinhCongTrinh);
		}
		catch (NoSuchVeSinhCongTrinhException nsee) {
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
	protected VeSinhCongTrinh removeImpl(VeSinhCongTrinh veSinhCongTrinh)
		throws SystemException {
		veSinhCongTrinh = toUnwrappedModel(veSinhCongTrinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(veSinhCongTrinh)) {
				veSinhCongTrinh = (VeSinhCongTrinh)session.get(VeSinhCongTrinhImpl.class,
						veSinhCongTrinh.getPrimaryKeyObj());
			}

			if (veSinhCongTrinh != null) {
				session.delete(veSinhCongTrinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (veSinhCongTrinh != null) {
			clearCache(veSinhCongTrinh);
		}

		return veSinhCongTrinh;
	}

	@Override
	public VeSinhCongTrinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh veSinhCongTrinh)
		throws SystemException {
		veSinhCongTrinh = toUnwrappedModel(veSinhCongTrinh);

		boolean isNew = veSinhCongTrinh.isNew();

		Session session = null;

		try {
			session = openSession();

			if (veSinhCongTrinh.isNew()) {
				session.save(veSinhCongTrinh);

				veSinhCongTrinh.setNew(false);
			}
			else {
				session.merge(veSinhCongTrinh);
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

		EntityCacheUtil.putResult(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhCongTrinhImpl.class, veSinhCongTrinh.getPrimaryKey(),
			veSinhCongTrinh);

		return veSinhCongTrinh;
	}

	protected VeSinhCongTrinh toUnwrappedModel(VeSinhCongTrinh veSinhCongTrinh) {
		if (veSinhCongTrinh instanceof VeSinhCongTrinhImpl) {
			return veSinhCongTrinh;
		}

		VeSinhCongTrinhImpl veSinhCongTrinhImpl = new VeSinhCongTrinhImpl();

		veSinhCongTrinhImpl.setNew(veSinhCongTrinh.isNew());
		veSinhCongTrinhImpl.setPrimaryKey(veSinhCongTrinh.getPrimaryKey());

		veSinhCongTrinhImpl.setId(veSinhCongTrinh.getId());
		veSinhCongTrinhImpl.setTenCongTrinh(veSinhCongTrinh.getTenCongTrinh());
		veSinhCongTrinhImpl.setLoaiCongTrinh(veSinhCongTrinh.getLoaiCongTrinh());
		veSinhCongTrinhImpl.setMaTinh(veSinhCongTrinh.getMaTinh());
		veSinhCongTrinhImpl.setMaHuyen(veSinhCongTrinh.getMaHuyen());
		veSinhCongTrinhImpl.setMaXa(veSinhCongTrinh.getMaXa());
		veSinhCongTrinhImpl.setDiaChi(veSinhCongTrinh.getDiaChi());
		veSinhCongTrinhImpl.setTrangThai(veSinhCongTrinh.getTrangThai());
		veSinhCongTrinhImpl.setNamBaoCao(veSinhCongTrinh.getNamBaoCao());
		veSinhCongTrinhImpl.setGhiChu(veSinhCongTrinh.getGhiChu());
		veSinhCongTrinhImpl.setNgayTao(veSinhCongTrinh.getNgayTao());
		veSinhCongTrinhImpl.setIdNguoiTao(veSinhCongTrinh.getIdNguoiTao());
		veSinhCongTrinhImpl.setKinhDo(veSinhCongTrinh.getKinhDo());
		veSinhCongTrinhImpl.setViDo(veSinhCongTrinh.getViDo());
		veSinhCongTrinhImpl.setLoaiNguonNuoc(veSinhCongTrinh.getLoaiNguonNuoc());
		veSinhCongTrinhImpl.setNguonNuocHVS(veSinhCongTrinh.getNguonNuocHVS());
		veSinhCongTrinhImpl.setLoaiNhaTieu(veSinhCongTrinh.getLoaiNhaTieu());
		veSinhCongTrinhImpl.setNhaTieuHVS(veSinhCongTrinh.getNhaTieuHVS());
		veSinhCongTrinhImpl.setKetLuanHVS(veSinhCongTrinh.getKetLuanHVS());
		veSinhCongTrinhImpl.setNgayKiemDem(veSinhCongTrinh.getNgayKiemDem());
		veSinhCongTrinhImpl.setNgayDanhGia(veSinhCongTrinh.getNgayDanhGia());
		veSinhCongTrinhImpl.setIdNguoiDanhGia(veSinhCongTrinh.getIdNguoiDanhGia());

		return veSinhCongTrinhImpl;
	}

	/**
	 * Returns the ve sinh cong trinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ve sinh cong trinh
	 * @return the ve sinh cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException if a ve sinh cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhCongTrinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVeSinhCongTrinhException, SystemException {
		VeSinhCongTrinh veSinhCongTrinh = fetchByPrimaryKey(primaryKey);

		if (veSinhCongTrinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVeSinhCongTrinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return veSinhCongTrinh;
	}

	/**
	 * Returns the ve sinh cong trinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException} if it could not be found.
	 *
	 * @param id the primary key of the ve sinh cong trinh
	 * @return the ve sinh cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException if a ve sinh cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhCongTrinh findByPrimaryKey(int id)
		throws NoSuchVeSinhCongTrinhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ve sinh cong trinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ve sinh cong trinh
	 * @return the ve sinh cong trinh, or <code>null</code> if a ve sinh cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhCongTrinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VeSinhCongTrinh veSinhCongTrinh = (VeSinhCongTrinh)EntityCacheUtil.getResult(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
				VeSinhCongTrinhImpl.class, primaryKey);

		if (veSinhCongTrinh == _nullVeSinhCongTrinh) {
			return null;
		}

		if (veSinhCongTrinh == null) {
			Session session = null;

			try {
				session = openSession();

				veSinhCongTrinh = (VeSinhCongTrinh)session.get(VeSinhCongTrinhImpl.class,
						primaryKey);

				if (veSinhCongTrinh != null) {
					cacheResult(veSinhCongTrinh);
				}
				else {
					EntityCacheUtil.putResult(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
						VeSinhCongTrinhImpl.class, primaryKey,
						_nullVeSinhCongTrinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VeSinhCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
					VeSinhCongTrinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return veSinhCongTrinh;
	}

	/**
	 * Returns the ve sinh cong trinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ve sinh cong trinh
	 * @return the ve sinh cong trinh, or <code>null</code> if a ve sinh cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhCongTrinh fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ve sinh cong trinhs.
	 *
	 * @return the ve sinh cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhCongTrinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ve sinh cong trinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ve sinh cong trinhs
	 * @param end the upper bound of the range of ve sinh cong trinhs (not inclusive)
	 * @return the range of ve sinh cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhCongTrinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ve sinh cong trinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ve sinh cong trinhs
	 * @param end the upper bound of the range of ve sinh cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ve sinh cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhCongTrinh> findAll(int start, int end,
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

		List<VeSinhCongTrinh> list = (List<VeSinhCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VESINHCONGTRINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VESINHCONGTRINH;

				if (pagination) {
					sql = sql.concat(VeSinhCongTrinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VeSinhCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VeSinhCongTrinh>(list);
				}
				else {
					list = (List<VeSinhCongTrinh>)QueryUtil.list(q,
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
	 * Removes all the ve sinh cong trinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VeSinhCongTrinh veSinhCongTrinh : findAll()) {
			remove(veSinhCongTrinh);
		}
	}

	/**
	 * Returns the number of ve sinh cong trinhs.
	 *
	 * @return the number of ve sinh cong trinhs
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

				Query q = session.createQuery(_SQL_COUNT_VESINHCONGTRINH);

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
	 * Initializes the ve sinh cong trinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VeSinhCongTrinh>> listenersList = new ArrayList<ModelListener<VeSinhCongTrinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VeSinhCongTrinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VeSinhCongTrinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VESINHCONGTRINH = "SELECT veSinhCongTrinh FROM VeSinhCongTrinh veSinhCongTrinh";
	private static final String _SQL_COUNT_VESINHCONGTRINH = "SELECT COUNT(veSinhCongTrinh) FROM VeSinhCongTrinh veSinhCongTrinh";
	private static final String _ORDER_BY_ENTITY_ALIAS = "veSinhCongTrinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VeSinhCongTrinh exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VeSinhCongTrinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "tenCongTrinh", "loaiCongTrinh", "maTinh", "maHuyen",
				"maXa", "diaChi", "trangThai", "namBaoCao", "ghiChu", "ngayTao",
				"idNguoiTao", "kinhDo", "viDo", "loaiNguonNuoc", "nguonNuocHVS",
				"loaiNhaTieu", "nhaTieuHVS", "ketLuanHVS", "ngayKiemDem",
				"ngayDanhGia", "idNguoiDanhGia"
			});
	private static VeSinhCongTrinh _nullVeSinhCongTrinh = new VeSinhCongTrinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VeSinhCongTrinh> toCacheModel() {
				return _nullVeSinhCongTrinhCacheModel;
			}
		};

	private static CacheModel<VeSinhCongTrinh> _nullVeSinhCongTrinhCacheModel = new CacheModel<VeSinhCongTrinh>() {
			@Override
			public VeSinhCongTrinh toEntityModel() {
				return _nullVeSinhCongTrinh;
			}
		};
}