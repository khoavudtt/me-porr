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

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ve sinh gia dinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see VeSinhGiaDinhPersistence
 * @see VeSinhGiaDinhUtil
 * @generated
 */
public class VeSinhGiaDinhPersistenceImpl extends BasePersistenceImpl<VeSinhGiaDinh>
	implements VeSinhGiaDinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VeSinhGiaDinhUtil} to access the ve sinh gia dinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VeSinhGiaDinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_CHK_IMPORT =
		new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_CHK_Import",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT =
		new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByT_CHK_Import",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			VeSinhGiaDinhModelImpl.MATINH_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.MAHUYEN_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.MAXA_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.THONXOM_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.TENCHUHO_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.IDNGUOITAO_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.LOAINHATIEU_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.TRANGTHAI_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.NAMBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_CHK_IMPORT = new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_CHK_Import",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @return the matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_CHK_Import(String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo,
		int idNguoiTao) throws SystemException {
		return findByT_CHK_Import(maTinh, maHuyen, maXa, thonXom, tenChuHo,
			idNguoiTao, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of ve sinh gia dinhs
	 * @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	 * @return the range of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_CHK_Import(String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo,
		int idNguoiTao, int start, int end) throws SystemException {
		return findByT_CHK_Import(maTinh, maHuyen, maXa, thonXom, tenChuHo,
			idNguoiTao, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of ve sinh gia dinhs
	 * @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_CHK_Import(String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo,
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
					maTinh, maHuyen, maXa, thonXom, tenChuHo, idNguoiTao
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_CHK_IMPORT;
			finderArgs = new Object[] {
					maTinh, maHuyen, maXa, thonXom, tenChuHo, idNguoiTao,
					
					start, end, orderByComparator
				};
		}

		List<VeSinhGiaDinh> list = (List<VeSinhGiaDinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VeSinhGiaDinh veSinhGiaDinh : list) {
				if (!Validator.equals(maTinh, veSinhGiaDinh.getMaTinh()) ||
						!Validator.equals(maHuyen, veSinhGiaDinh.getMaHuyen()) ||
						!Validator.equals(maXa, veSinhGiaDinh.getMaXa()) ||
						!Validator.equals(thonXom, veSinhGiaDinh.getThonXom()) ||
						!Validator.equals(tenChuHo, veSinhGiaDinh.getTenChuHo()) ||
						(idNguoiTao != veSinhGiaDinh.getIdNguoiTao())) {
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

			query.append(_SQL_SELECT_VESINHGIADINH_WHERE);

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

			boolean bindThonXom = false;

			if (thonXom == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_1);
			}
			else if (thonXom.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_3);
			}
			else {
				bindThonXom = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_2);
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
				query.append(VeSinhGiaDinhModelImpl.ORDER_BY_JPQL);
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

				qPos.add(idNguoiTao);

				if (!pagination) {
					list = (List<VeSinhGiaDinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VeSinhGiaDinh>(list);
				}
				else {
					list = (List<VeSinhGiaDinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh findByT_CHK_Import_First(String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo,
		int idNguoiTao, OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = fetchByT_CHK_Import_First(maTinh,
				maHuyen, maXa, thonXom, tenChuHo, idNguoiTao, orderByComparator);

		if (veSinhGiaDinh != null) {
			return veSinhGiaDinh;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(", thonXom=");
		msg.append(thonXom);

		msg.append(", tenChuHo=");
		msg.append(tenChuHo);

		msg.append(", idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVeSinhGiaDinhException(msg.toString());
	}

	/**
	 * Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh fetchByT_CHK_Import_First(String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo,
		int idNguoiTao, OrderByComparator orderByComparator)
		throws SystemException {
		List<VeSinhGiaDinh> list = findByT_CHK_Import(maTinh, maHuyen, maXa,
				thonXom, tenChuHo, idNguoiTao, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh findByT_CHK_Import_Last(String maTinh, String maHuyen,
		String maXa, String thonXom, String tenChuHo, int idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = fetchByT_CHK_Import_Last(maTinh, maHuyen,
				maXa, thonXom, tenChuHo, idNguoiTao, orderByComparator);

		if (veSinhGiaDinh != null) {
			return veSinhGiaDinh;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(", thonXom=");
		msg.append(thonXom);

		msg.append(", tenChuHo=");
		msg.append(tenChuHo);

		msg.append(", idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVeSinhGiaDinhException(msg.toString());
	}

	/**
	 * Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh fetchByT_CHK_Import_Last(String maTinh,
		String maHuyen, String maXa, String thonXom, String tenChuHo,
		int idNguoiTao, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByT_CHK_Import(maTinh, maHuyen, maXa, thonXom,
				tenChuHo, idNguoiTao);

		if (count == 0) {
			return null;
		}

		List<VeSinhGiaDinh> list = findByT_CHK_Import(maTinh, maHuyen, maXa,
				thonXom, tenChuHo, idNguoiTao, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ve sinh gia dinhs before and after the current ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param id the primary key of the current ve sinh gia dinh
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh[] findByT_CHK_Import_PrevAndNext(int id,
		String maTinh, String maHuyen, String maXa, String thonXom,
		String tenChuHo, int idNguoiTao, OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VeSinhGiaDinh[] array = new VeSinhGiaDinhImpl[3];

			array[0] = getByT_CHK_Import_PrevAndNext(session, veSinhGiaDinh,
					maTinh, maHuyen, maXa, thonXom, tenChuHo, idNguoiTao,
					orderByComparator, true);

			array[1] = veSinhGiaDinh;

			array[2] = getByT_CHK_Import_PrevAndNext(session, veSinhGiaDinh,
					maTinh, maHuyen, maXa, thonXom, tenChuHo, idNguoiTao,
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

	protected VeSinhGiaDinh getByT_CHK_Import_PrevAndNext(Session session,
		VeSinhGiaDinh veSinhGiaDinh, String maTinh, String maHuyen,
		String maXa, String thonXom, String tenChuHo, int idNguoiTao,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VESINHGIADINH_WHERE);

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

		boolean bindThonXom = false;

		if (thonXom == null) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_1);
		}
		else if (thonXom.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_3);
		}
		else {
			bindThonXom = true;

			query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_2);
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
			query.append(VeSinhGiaDinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

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

		qPos.add(idNguoiTao);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(veSinhGiaDinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VeSinhGiaDinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_CHK_Import(String maTinh, String maHuyen,
		String maXa, String thonXom, String tenChuHo, int idNguoiTao)
		throws SystemException {
		for (VeSinhGiaDinh veSinhGiaDinh : findByT_CHK_Import(maTinh, maHuyen,
				maXa, thonXom, tenChuHo, idNguoiTao, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(veSinhGiaDinh);
		}
	}

	/**
	 * Returns the number of ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param thonXom the thon xom
	 * @param tenChuHo the ten chu ho
	 * @param idNguoiTao the id nguoi tao
	 * @return the number of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_CHK_Import(String maTinh, String maHuyen, String maXa,
		String thonXom, String tenChuHo, int idNguoiTao)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_CHK_IMPORT;

		Object[] finderArgs = new Object[] {
				maTinh, maHuyen, maXa, thonXom, tenChuHo, idNguoiTao
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_VESINHGIADINH_WHERE);

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

			boolean bindThonXom = false;

			if (thonXom == null) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_1);
			}
			else if (thonXom.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_3);
			}
			else {
				bindThonXom = true;

				query.append(_FINDER_COLUMN_T_CHK_IMPORT_THONXOM_2);
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

	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MATINH_1 = "veSinhGiaDinh.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MATINH_2 = "veSinhGiaDinh.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MATINH_3 = "(veSinhGiaDinh.maTinh IS NULL OR veSinhGiaDinh.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_1 = "veSinhGiaDinh.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_2 = "veSinhGiaDinh.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAHUYEN_3 = "(veSinhGiaDinh.maHuyen IS NULL OR veSinhGiaDinh.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAXA_1 = "veSinhGiaDinh.maXa IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAXA_2 = "veSinhGiaDinh.maXa = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_MAXA_3 = "(veSinhGiaDinh.maXa IS NULL OR veSinhGiaDinh.maXa = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_THONXOM_1 = "veSinhGiaDinh.thonXom IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_THONXOM_2 = "veSinhGiaDinh.thonXom = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_THONXOM_3 = "(veSinhGiaDinh.thonXom IS NULL OR veSinhGiaDinh.thonXom = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_1 = "veSinhGiaDinh.tenChuHo IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_2 = "veSinhGiaDinh.tenChuHo = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_TENCHUHO_3 = "(veSinhGiaDinh.tenChuHo IS NULL OR veSinhGiaDinh.tenChuHo = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_IMPORT_IDNGUOITAO_2 = "veSinhGiaDinh.idNguoiTao = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_H_XMNN = new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_H_XMNN",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_H_XMNN =
		new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByT_H_XMNN",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			VeSinhGiaDinhModelImpl.MATINH_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.MAHUYEN_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.MAXA_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.MAUNGAUNHIEN_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.THONXOM_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.LOAINHATIEU_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.TENCHUHO_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.TRANGTHAI_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.NAMBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_H_XMNN = new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_H_XMNN",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @return the matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_H_XMNN(String maTinh, String maHuyen,
		String maXa, int mauNgauNhien) throws SystemException {
		return findByT_H_XMNN(maTinh, maHuyen, maXa, mauNgauNhien,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @param start the lower bound of the range of ve sinh gia dinhs
	 * @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	 * @return the range of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_H_XMNN(String maTinh, String maHuyen,
		String maXa, int mauNgauNhien, int start, int end)
		throws SystemException {
		return findByT_H_XMNN(maTinh, maHuyen, maXa, mauNgauNhien, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @param start the lower bound of the range of ve sinh gia dinhs
	 * @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_H_XMNN(String maTinh, String maHuyen,
		String maXa, int mauNgauNhien, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_H_XMNN;
			finderArgs = new Object[] { maTinh, maHuyen, maXa, mauNgauNhien };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_H_XMNN;
			finderArgs = new Object[] {
					maTinh, maHuyen, maXa, mauNgauNhien,
					
					start, end, orderByComparator
				};
		}

		List<VeSinhGiaDinh> list = (List<VeSinhGiaDinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VeSinhGiaDinh veSinhGiaDinh : list) {
				if (!Validator.equals(maTinh, veSinhGiaDinh.getMaTinh()) ||
						!Validator.equals(maHuyen, veSinhGiaDinh.getMaHuyen()) ||
						!Validator.equals(maXa, veSinhGiaDinh.getMaXa()) ||
						(mauNgauNhien != veSinhGiaDinh.getMauNgauNhien())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VESINHGIADINH_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_2);
			}

			query.append(_FINDER_COLUMN_T_H_XMNN_MAUNGAUNHIEN_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VeSinhGiaDinhModelImpl.ORDER_BY_JPQL);
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

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				qPos.add(mauNgauNhien);

				if (!pagination) {
					list = (List<VeSinhGiaDinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VeSinhGiaDinh>(list);
				}
				else {
					list = (List<VeSinhGiaDinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh findByT_H_XMNN_First(String maTinh, String maHuyen,
		String maXa, int mauNgauNhien, OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = fetchByT_H_XMNN_First(maTinh, maHuyen,
				maXa, mauNgauNhien, orderByComparator);

		if (veSinhGiaDinh != null) {
			return veSinhGiaDinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(", mauNgauNhien=");
		msg.append(mauNgauNhien);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVeSinhGiaDinhException(msg.toString());
	}

	/**
	 * Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh fetchByT_H_XMNN_First(String maTinh, String maHuyen,
		String maXa, int mauNgauNhien, OrderByComparator orderByComparator)
		throws SystemException {
		List<VeSinhGiaDinh> list = findByT_H_XMNN(maTinh, maHuyen, maXa,
				mauNgauNhien, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh findByT_H_XMNN_Last(String maTinh, String maHuyen,
		String maXa, int mauNgauNhien, OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = fetchByT_H_XMNN_Last(maTinh, maHuyen,
				maXa, mauNgauNhien, orderByComparator);

		if (veSinhGiaDinh != null) {
			return veSinhGiaDinh;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(", mauNgauNhien=");
		msg.append(mauNgauNhien);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVeSinhGiaDinhException(msg.toString());
	}

	/**
	 * Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh fetchByT_H_XMNN_Last(String maTinh, String maHuyen,
		String maXa, int mauNgauNhien, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByT_H_XMNN(maTinh, maHuyen, maXa, mauNgauNhien);

		if (count == 0) {
			return null;
		}

		List<VeSinhGiaDinh> list = findByT_H_XMNN(maTinh, maHuyen, maXa,
				mauNgauNhien, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ve sinh gia dinhs before and after the current ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * @param id the primary key of the current ve sinh gia dinh
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh[] findByT_H_XMNN_PrevAndNext(int id, String maTinh,
		String maHuyen, String maXa, int mauNgauNhien,
		OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VeSinhGiaDinh[] array = new VeSinhGiaDinhImpl[3];

			array[0] = getByT_H_XMNN_PrevAndNext(session, veSinhGiaDinh,
					maTinh, maHuyen, maXa, mauNgauNhien, orderByComparator, true);

			array[1] = veSinhGiaDinh;

			array[2] = getByT_H_XMNN_PrevAndNext(session, veSinhGiaDinh,
					maTinh, maHuyen, maXa, mauNgauNhien, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VeSinhGiaDinh getByT_H_XMNN_PrevAndNext(Session session,
		VeSinhGiaDinh veSinhGiaDinh, String maTinh, String maHuyen,
		String maXa, int mauNgauNhien, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VESINHGIADINH_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_2);
		}

		boolean bindMaHuyen = false;

		if (maHuyen == null) {
			query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_1);
		}
		else if (maHuyen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_3);
		}
		else {
			bindMaHuyen = true;

			query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_2);
		}

		boolean bindMaXa = false;

		if (maXa == null) {
			query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_1);
		}
		else if (maXa.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_3);
		}
		else {
			bindMaXa = true;

			query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_2);
		}

		query.append(_FINDER_COLUMN_T_H_XMNN_MAUNGAUNHIEN_2);

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
			query.append(VeSinhGiaDinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (bindMaHuyen) {
			qPos.add(maHuyen);
		}

		if (bindMaXa) {
			qPos.add(maXa);
		}

		qPos.add(mauNgauNhien);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(veSinhGiaDinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VeSinhGiaDinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_H_XMNN(String maTinh, String maHuyen, String maXa,
		int mauNgauNhien) throws SystemException {
		for (VeSinhGiaDinh veSinhGiaDinh : findByT_H_XMNN(maTinh, maHuyen,
				maXa, mauNgauNhien, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(veSinhGiaDinh);
		}
	}

	/**
	 * Returns the number of ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param mauNgauNhien the mau ngau nhien
	 * @return the number of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_H_XMNN(String maTinh, String maHuyen, String maXa,
		int mauNgauNhien) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_H_XMNN;

		Object[] finderArgs = new Object[] { maTinh, maHuyen, maXa, mauNgauNhien };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VESINHGIADINH_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_H_XMNN_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_H_XMNN_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_H_XMNN_MAXA_2);
			}

			query.append(_FINDER_COLUMN_T_H_XMNN_MAUNGAUNHIEN_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				qPos.add(mauNgauNhien);

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

	private static final String _FINDER_COLUMN_T_H_XMNN_MATINH_1 = "veSinhGiaDinh.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MATINH_2 = "veSinhGiaDinh.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MATINH_3 = "(veSinhGiaDinh.maTinh IS NULL OR veSinhGiaDinh.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MAHUYEN_1 = "veSinhGiaDinh.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MAHUYEN_2 = "veSinhGiaDinh.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MAHUYEN_3 = "(veSinhGiaDinh.maHuyen IS NULL OR veSinhGiaDinh.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MAXA_1 = "veSinhGiaDinh.maXa IS NULL AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MAXA_2 = "veSinhGiaDinh.maXa = ? AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MAXA_3 = "(veSinhGiaDinh.maXa IS NULL OR veSinhGiaDinh.maXa = '') AND ";
	private static final String _FINDER_COLUMN_T_H_XMNN_MAUNGAUNHIEN_2 = "veSinhGiaDinh.mauNgauNhien = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_CHK_INKEHOACH =
		new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_CHK_INKeHoach",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_INKEHOACH =
		new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByT_CHK_INKeHoach",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VeSinhGiaDinhModelImpl.MATINH_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.MAHUYEN_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.MAXA_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.THONXOM_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.LOAINHATIEU_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.TENCHUHO_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.TRANGTHAI_COLUMN_BITMASK |
			VeSinhGiaDinhModelImpl.NAMBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_CHK_INKEHOACH = new FinderPath(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByT_CHK_INKeHoach",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @return the matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_CHK_INKeHoach(String maTinh,
		String maHuyen, String maXa) throws SystemException {
		return findByT_CHK_INKeHoach(maTinh, maHuyen, maXa, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param start the lower bound of the range of ve sinh gia dinhs
	 * @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	 * @return the range of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_CHK_INKeHoach(String maTinh,
		String maHuyen, String maXa, int start, int end)
		throws SystemException {
		return findByT_CHK_INKeHoach(maTinh, maHuyen, maXa, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param start the lower bound of the range of ve sinh gia dinhs
	 * @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findByT_CHK_INKeHoach(String maTinh,
		String maHuyen, String maXa, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_INKEHOACH;
			finderArgs = new Object[] { maTinh, maHuyen, maXa };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_CHK_INKEHOACH;
			finderArgs = new Object[] {
					maTinh, maHuyen, maXa,
					
					start, end, orderByComparator
				};
		}

		List<VeSinhGiaDinh> list = (List<VeSinhGiaDinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VeSinhGiaDinh veSinhGiaDinh : list) {
				if (!Validator.equals(maTinh, veSinhGiaDinh.getMaTinh()) ||
						!Validator.equals(maHuyen, veSinhGiaDinh.getMaHuyen()) ||
						!Validator.equals(maXa, veSinhGiaDinh.getMaXa())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VESINHGIADINH_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VeSinhGiaDinhModelImpl.ORDER_BY_JPQL);
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

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (!pagination) {
					list = (List<VeSinhGiaDinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VeSinhGiaDinh>(list);
				}
				else {
					list = (List<VeSinhGiaDinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh findByT_CHK_INKeHoach_First(String maTinh,
		String maHuyen, String maXa, OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = fetchByT_CHK_INKeHoach_First(maTinh,
				maHuyen, maXa, orderByComparator);

		if (veSinhGiaDinh != null) {
			return veSinhGiaDinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVeSinhGiaDinhException(msg.toString());
	}

	/**
	 * Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh fetchByT_CHK_INKeHoach_First(String maTinh,
		String maHuyen, String maXa, OrderByComparator orderByComparator)
		throws SystemException {
		List<VeSinhGiaDinh> list = findByT_CHK_INKeHoach(maTinh, maHuyen, maXa,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh findByT_CHK_INKeHoach_Last(String maTinh,
		String maHuyen, String maXa, OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = fetchByT_CHK_INKeHoach_Last(maTinh,
				maHuyen, maXa, orderByComparator);

		if (veSinhGiaDinh != null) {
			return veSinhGiaDinh;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", maXa=");
		msg.append(maXa);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVeSinhGiaDinhException(msg.toString());
	}

	/**
	 * Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh fetchByT_CHK_INKeHoach_Last(String maTinh,
		String maHuyen, String maXa, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByT_CHK_INKeHoach(maTinh, maHuyen, maXa);

		if (count == 0) {
			return null;
		}

		List<VeSinhGiaDinh> list = findByT_CHK_INKeHoach(maTinh, maHuyen, maXa,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ve sinh gia dinhs before and after the current ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * @param id the primary key of the current ve sinh gia dinh
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh[] findByT_CHK_INKeHoach_PrevAndNext(int id,
		String maTinh, String maHuyen, String maXa,
		OrderByComparator orderByComparator)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VeSinhGiaDinh[] array = new VeSinhGiaDinhImpl[3];

			array[0] = getByT_CHK_INKeHoach_PrevAndNext(session, veSinhGiaDinh,
					maTinh, maHuyen, maXa, orderByComparator, true);

			array[1] = veSinhGiaDinh;

			array[2] = getByT_CHK_INKeHoach_PrevAndNext(session, veSinhGiaDinh,
					maTinh, maHuyen, maXa, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VeSinhGiaDinh getByT_CHK_INKeHoach_PrevAndNext(Session session,
		VeSinhGiaDinh veSinhGiaDinh, String maTinh, String maHuyen,
		String maXa, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VESINHGIADINH_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_2);
		}

		boolean bindMaHuyen = false;

		if (maHuyen == null) {
			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_1);
		}
		else if (maHuyen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_3);
		}
		else {
			bindMaHuyen = true;

			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_2);
		}

		boolean bindMaXa = false;

		if (maXa == null) {
			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_1);
		}
		else if (maXa.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_3);
		}
		else {
			bindMaXa = true;

			query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_2);
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
			query.append(VeSinhGiaDinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (bindMaHuyen) {
			qPos.add(maHuyen);
		}

		if (bindMaXa) {
			qPos.add(maXa);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(veSinhGiaDinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VeSinhGiaDinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_CHK_INKeHoach(String maTinh, String maHuyen,
		String maXa) throws SystemException {
		for (VeSinhGiaDinh veSinhGiaDinh : findByT_CHK_INKeHoach(maTinh,
				maHuyen, maXa, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(veSinhGiaDinh);
		}
	}

	/**
	 * Returns the number of ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @return the number of matching ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_CHK_INKeHoach(String maTinh, String maHuyen, String maXa)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_CHK_INKEHOACH;

		Object[] finderArgs = new Object[] { maTinh, maHuyen, maXa };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VESINHGIADINH_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_2);
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

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

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

	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_1 = "veSinhGiaDinh.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_2 = "veSinhGiaDinh.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MATINH_3 = "(veSinhGiaDinh.maTinh IS NULL OR veSinhGiaDinh.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_1 = "veSinhGiaDinh.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_2 = "veSinhGiaDinh.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MAHUYEN_3 = "(veSinhGiaDinh.maHuyen IS NULL OR veSinhGiaDinh.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_1 = "veSinhGiaDinh.maXa IS NULL AND  ( veSinhGiaDinh.trangThai = 1 OR veSinhGiaDinh.trangThai = 2 )  AND veSinhGiaDinh.namBaoCao = 0 ";
	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_2 = "veSinhGiaDinh.maXa = ? AND  ( veSinhGiaDinh.trangThai = 1 OR veSinhGiaDinh.trangThai = 2 )  AND veSinhGiaDinh.namBaoCao = 0 ";
	private static final String _FINDER_COLUMN_T_CHK_INKEHOACH_MAXA_3 = "(veSinhGiaDinh.maXa IS NULL OR veSinhGiaDinh.maXa = '') AND  ( veSinhGiaDinh.trangThai = 1 OR veSinhGiaDinh.trangThai = 2 )  AND veSinhGiaDinh.namBaoCao = 0 ";

	public VeSinhGiaDinhPersistenceImpl() {
		setModelClass(VeSinhGiaDinh.class);
	}

	/**
	 * Caches the ve sinh gia dinh in the entity cache if it is enabled.
	 *
	 * @param veSinhGiaDinh the ve sinh gia dinh
	 */
	@Override
	public void cacheResult(VeSinhGiaDinh veSinhGiaDinh) {
		EntityCacheUtil.putResult(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, veSinhGiaDinh.getPrimaryKey(),
			veSinhGiaDinh);

		veSinhGiaDinh.resetOriginalValues();
	}

	/**
	 * Caches the ve sinh gia dinhs in the entity cache if it is enabled.
	 *
	 * @param veSinhGiaDinhs the ve sinh gia dinhs
	 */
	@Override
	public void cacheResult(List<VeSinhGiaDinh> veSinhGiaDinhs) {
		for (VeSinhGiaDinh veSinhGiaDinh : veSinhGiaDinhs) {
			if (EntityCacheUtil.getResult(
						VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
						VeSinhGiaDinhImpl.class, veSinhGiaDinh.getPrimaryKey()) == null) {
				cacheResult(veSinhGiaDinh);
			}
			else {
				veSinhGiaDinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ve sinh gia dinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VeSinhGiaDinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VeSinhGiaDinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ve sinh gia dinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VeSinhGiaDinh veSinhGiaDinh) {
		EntityCacheUtil.removeResult(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, veSinhGiaDinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VeSinhGiaDinh> veSinhGiaDinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VeSinhGiaDinh veSinhGiaDinh : veSinhGiaDinhs) {
			EntityCacheUtil.removeResult(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
				VeSinhGiaDinhImpl.class, veSinhGiaDinh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ve sinh gia dinh with the primary key. Does not add the ve sinh gia dinh to the database.
	 *
	 * @param id the primary key for the new ve sinh gia dinh
	 * @return the new ve sinh gia dinh
	 */
	@Override
	public VeSinhGiaDinh create(int id) {
		VeSinhGiaDinh veSinhGiaDinh = new VeSinhGiaDinhImpl();

		veSinhGiaDinh.setNew(true);
		veSinhGiaDinh.setPrimaryKey(id);

		return veSinhGiaDinh;
	}

	/**
	 * Removes the ve sinh gia dinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ve sinh gia dinh
	 * @return the ve sinh gia dinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh remove(int id)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ve sinh gia dinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ve sinh gia dinh
	 * @return the ve sinh gia dinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh remove(Serializable primaryKey)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VeSinhGiaDinh veSinhGiaDinh = (VeSinhGiaDinh)session.get(VeSinhGiaDinhImpl.class,
					primaryKey);

			if (veSinhGiaDinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVeSinhGiaDinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(veSinhGiaDinh);
		}
		catch (NoSuchVeSinhGiaDinhException nsee) {
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
	protected VeSinhGiaDinh removeImpl(VeSinhGiaDinh veSinhGiaDinh)
		throws SystemException {
		veSinhGiaDinh = toUnwrappedModel(veSinhGiaDinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(veSinhGiaDinh)) {
				veSinhGiaDinh = (VeSinhGiaDinh)session.get(VeSinhGiaDinhImpl.class,
						veSinhGiaDinh.getPrimaryKeyObj());
			}

			if (veSinhGiaDinh != null) {
				session.delete(veSinhGiaDinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (veSinhGiaDinh != null) {
			clearCache(veSinhGiaDinh);
		}

		return veSinhGiaDinh;
	}

	@Override
	public VeSinhGiaDinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh)
		throws SystemException {
		veSinhGiaDinh = toUnwrappedModel(veSinhGiaDinh);

		boolean isNew = veSinhGiaDinh.isNew();

		VeSinhGiaDinhModelImpl veSinhGiaDinhModelImpl = (VeSinhGiaDinhModelImpl)veSinhGiaDinh;

		Session session = null;

		try {
			session = openSession();

			if (veSinhGiaDinh.isNew()) {
				session.save(veSinhGiaDinh);

				veSinhGiaDinh.setNew(false);
			}
			else {
				session.merge(veSinhGiaDinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VeSinhGiaDinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((veSinhGiaDinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						veSinhGiaDinhModelImpl.getOriginalMaTinh(),
						veSinhGiaDinhModelImpl.getOriginalMaHuyen(),
						veSinhGiaDinhModelImpl.getOriginalMaXa(),
						veSinhGiaDinhModelImpl.getOriginalThonXom(),
						veSinhGiaDinhModelImpl.getOriginalTenChuHo(),
						veSinhGiaDinhModelImpl.getOriginalIdNguoiTao()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_CHK_IMPORT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT,
					args);

				args = new Object[] {
						veSinhGiaDinhModelImpl.getMaTinh(),
						veSinhGiaDinhModelImpl.getMaHuyen(),
						veSinhGiaDinhModelImpl.getMaXa(),
						veSinhGiaDinhModelImpl.getThonXom(),
						veSinhGiaDinhModelImpl.getTenChuHo(),
						veSinhGiaDinhModelImpl.getIdNguoiTao()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_CHK_IMPORT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_IMPORT,
					args);
			}

			if ((veSinhGiaDinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_H_XMNN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						veSinhGiaDinhModelImpl.getOriginalMaTinh(),
						veSinhGiaDinhModelImpl.getOriginalMaHuyen(),
						veSinhGiaDinhModelImpl.getOriginalMaXa(),
						veSinhGiaDinhModelImpl.getOriginalMauNgauNhien()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_H_XMNN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_H_XMNN,
					args);

				args = new Object[] {
						veSinhGiaDinhModelImpl.getMaTinh(),
						veSinhGiaDinhModelImpl.getMaHuyen(),
						veSinhGiaDinhModelImpl.getMaXa(),
						veSinhGiaDinhModelImpl.getMauNgauNhien()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_H_XMNN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_H_XMNN,
					args);
			}

			if ((veSinhGiaDinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_INKEHOACH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						veSinhGiaDinhModelImpl.getOriginalMaTinh(),
						veSinhGiaDinhModelImpl.getOriginalMaHuyen(),
						veSinhGiaDinhModelImpl.getOriginalMaXa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_CHK_INKEHOACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_INKEHOACH,
					args);

				args = new Object[] {
						veSinhGiaDinhModelImpl.getMaTinh(),
						veSinhGiaDinhModelImpl.getMaHuyen(),
						veSinhGiaDinhModelImpl.getMaXa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_CHK_INKEHOACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_CHK_INKEHOACH,
					args);
			}
		}

		EntityCacheUtil.putResult(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
			VeSinhGiaDinhImpl.class, veSinhGiaDinh.getPrimaryKey(),
			veSinhGiaDinh);

		return veSinhGiaDinh;
	}

	protected VeSinhGiaDinh toUnwrappedModel(VeSinhGiaDinh veSinhGiaDinh) {
		if (veSinhGiaDinh instanceof VeSinhGiaDinhImpl) {
			return veSinhGiaDinh;
		}

		VeSinhGiaDinhImpl veSinhGiaDinhImpl = new VeSinhGiaDinhImpl();

		veSinhGiaDinhImpl.setNew(veSinhGiaDinh.isNew());
		veSinhGiaDinhImpl.setPrimaryKey(veSinhGiaDinh.getPrimaryKey());

		veSinhGiaDinhImpl.setId(veSinhGiaDinh.getId());
		veSinhGiaDinhImpl.setMaTinh(veSinhGiaDinh.getMaTinh());
		veSinhGiaDinhImpl.setMaHuyen(veSinhGiaDinh.getMaHuyen());
		veSinhGiaDinhImpl.setMaXa(veSinhGiaDinh.getMaXa());
		veSinhGiaDinhImpl.setThonXom(veSinhGiaDinh.getThonXom());
		veSinhGiaDinhImpl.setTenChuHo(veSinhGiaDinh.getTenChuHo());
		veSinhGiaDinhImpl.setGioiTinhChuHo(veSinhGiaDinh.getGioiTinhChuHo());
		veSinhGiaDinhImpl.setTrangThai(veSinhGiaDinh.getTrangThai());
		veSinhGiaDinhImpl.setMauNgauNhien(veSinhGiaDinh.getMauNgauNhien());
		veSinhGiaDinhImpl.setNamBaoCao(veSinhGiaDinh.getNamBaoCao());
		veSinhGiaDinhImpl.setGhiChu(veSinhGiaDinh.getGhiChu());
		veSinhGiaDinhImpl.setNgayTao(veSinhGiaDinh.getNgayTao());
		veSinhGiaDinhImpl.setIdNguoiTao(veSinhGiaDinh.getIdNguoiTao());
		veSinhGiaDinhImpl.setSoNguoiTrongHo(veSinhGiaDinh.getSoNguoiTrongHo());
		veSinhGiaDinhImpl.setThanhPhanHoGD(veSinhGiaDinh.getThanhPhanHoGD());
		veSinhGiaDinhImpl.setKinhDo(veSinhGiaDinh.getKinhDo());
		veSinhGiaDinhImpl.setViDo(veSinhGiaDinh.getViDo());
		veSinhGiaDinhImpl.setCoNhaTieu(veSinhGiaDinh.getCoNhaTieu());
		veSinhGiaDinhImpl.setNhaTieuHVS(veSinhGiaDinh.getNhaTieuHVS());
		veSinhGiaDinhImpl.setLoaiNhaTieu(veSinhGiaDinh.getLoaiNhaTieu());
		veSinhGiaDinhImpl.setDuocCaiTao(veSinhGiaDinh.getDuocCaiTao());
		veSinhGiaDinhImpl.setThangXayDung(veSinhGiaDinh.getThangXayDung());
		veSinhGiaDinhImpl.setNamXayDung(veSinhGiaDinh.getNamXayDung());
		veSinhGiaDinhImpl.setNguonVon(veSinhGiaDinh.getNguonVon());
		veSinhGiaDinhImpl.setNgayKiemDem(veSinhGiaDinh.getNgayKiemDem());
		veSinhGiaDinhImpl.setNgayDanhGia(veSinhGiaDinh.getNgayDanhGia());
		veSinhGiaDinhImpl.setIdNguoiDanhGia(veSinhGiaDinh.getIdNguoiDanhGia());

		return veSinhGiaDinhImpl;
	}

	/**
	 * Returns the ve sinh gia dinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ve sinh gia dinh
	 * @return the ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		VeSinhGiaDinh veSinhGiaDinh = fetchByPrimaryKey(primaryKey);

		if (veSinhGiaDinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVeSinhGiaDinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return veSinhGiaDinh;
	}

	/**
	 * Returns the ve sinh gia dinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException} if it could not be found.
	 *
	 * @param id the primary key of the ve sinh gia dinh
	 * @return the ve sinh gia dinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh findByPrimaryKey(int id)
		throws NoSuchVeSinhGiaDinhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ve sinh gia dinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ve sinh gia dinh
	 * @return the ve sinh gia dinh, or <code>null</code> if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VeSinhGiaDinh veSinhGiaDinh = (VeSinhGiaDinh)EntityCacheUtil.getResult(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
				VeSinhGiaDinhImpl.class, primaryKey);

		if (veSinhGiaDinh == _nullVeSinhGiaDinh) {
			return null;
		}

		if (veSinhGiaDinh == null) {
			Session session = null;

			try {
				session = openSession();

				veSinhGiaDinh = (VeSinhGiaDinh)session.get(VeSinhGiaDinhImpl.class,
						primaryKey);

				if (veSinhGiaDinh != null) {
					cacheResult(veSinhGiaDinh);
				}
				else {
					EntityCacheUtil.putResult(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
						VeSinhGiaDinhImpl.class, primaryKey, _nullVeSinhGiaDinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VeSinhGiaDinhModelImpl.ENTITY_CACHE_ENABLED,
					VeSinhGiaDinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return veSinhGiaDinh;
	}

	/**
	 * Returns the ve sinh gia dinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ve sinh gia dinh
	 * @return the ve sinh gia dinh, or <code>null</code> if a ve sinh gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VeSinhGiaDinh fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ve sinh gia dinhs.
	 *
	 * @return the ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ve sinh gia dinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ve sinh gia dinhs
	 * @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	 * @return the range of ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ve sinh gia dinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ve sinh gia dinhs
	 * @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ve sinh gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VeSinhGiaDinh> findAll(int start, int end,
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

		List<VeSinhGiaDinh> list = (List<VeSinhGiaDinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VESINHGIADINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VESINHGIADINH;

				if (pagination) {
					sql = sql.concat(VeSinhGiaDinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VeSinhGiaDinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VeSinhGiaDinh>(list);
				}
				else {
					list = (List<VeSinhGiaDinh>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ve sinh gia dinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VeSinhGiaDinh veSinhGiaDinh : findAll()) {
			remove(veSinhGiaDinh);
		}
	}

	/**
	 * Returns the number of ve sinh gia dinhs.
	 *
	 * @return the number of ve sinh gia dinhs
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

				Query q = session.createQuery(_SQL_COUNT_VESINHGIADINH);

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
	 * Initializes the ve sinh gia dinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VeSinhGiaDinh>> listenersList = new ArrayList<ModelListener<VeSinhGiaDinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VeSinhGiaDinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VeSinhGiaDinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VESINHGIADINH = "SELECT veSinhGiaDinh FROM VeSinhGiaDinh veSinhGiaDinh";
	private static final String _SQL_SELECT_VESINHGIADINH_WHERE = "SELECT veSinhGiaDinh FROM VeSinhGiaDinh veSinhGiaDinh WHERE ";
	private static final String _SQL_COUNT_VESINHGIADINH = "SELECT COUNT(veSinhGiaDinh) FROM VeSinhGiaDinh veSinhGiaDinh";
	private static final String _SQL_COUNT_VESINHGIADINH_WHERE = "SELECT COUNT(veSinhGiaDinh) FROM VeSinhGiaDinh veSinhGiaDinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "veSinhGiaDinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VeSinhGiaDinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VeSinhGiaDinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VeSinhGiaDinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "maHuyen", "maXa", "thonXom", "tenChuHo",
				"gioiTinhChuHo", "trangThai", "mauNgauNhien", "namBaoCao",
				"ghiChu", "ngayTao", "idNguoiTao", "soNguoiTrongHo",
				"thanhPhanHoGD", "kinhDo", "viDo", "coNhaTieu", "nhaTieuHVS",
				"loaiNhaTieu", "duocCaiTao", "thangXayDung", "namXayDung",
				"nguonVon", "ngayKiemDem", "ngayDanhGia", "idNguoiDanhGia"
			});
	private static VeSinhGiaDinh _nullVeSinhGiaDinh = new VeSinhGiaDinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VeSinhGiaDinh> toCacheModel() {
				return _nullVeSinhGiaDinhCacheModel;
			}
		};

	private static CacheModel<VeSinhGiaDinh> _nullVeSinhGiaDinhCacheModel = new CacheModel<VeSinhGiaDinh>() {
			@Override
			public VeSinhGiaDinh toEntityModel() {
				return _nullVeSinhGiaDinh;
			}
		};
}