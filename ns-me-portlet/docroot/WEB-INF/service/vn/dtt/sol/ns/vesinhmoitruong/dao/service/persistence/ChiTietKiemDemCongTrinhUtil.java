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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh;

import java.util.List;

/**
 * The persistence utility for the chi tiet kiem dem cong trinh service. This utility wraps {@link ChiTietKiemDemCongTrinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see ChiTietKiemDemCongTrinhPersistence
 * @see ChiTietKiemDemCongTrinhPersistenceImpl
 * @generated
 */
public class ChiTietKiemDemCongTrinhUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		getPersistence().clearCache(chiTietKiemDemCongTrinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ChiTietKiemDemCongTrinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ChiTietKiemDemCongTrinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ChiTietKiemDemCongTrinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ChiTietKiemDemCongTrinh update(
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh)
		throws SystemException {
		return getPersistence().update(chiTietKiemDemCongTrinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ChiTietKiemDemCongTrinh update(
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(chiTietKiemDemCongTrinh, serviceContext);
	}

	/**
	* Returns all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @return the matching chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId);
	}

	/**
	* Returns a range of all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param start the lower bound of the range of chi tiet kiem dem cong trinhs
	* @param end the upper bound of the range of chi tiet kiem dem cong trinhs (not inclusive)
	* @return the range of matching chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId,
			start, end);
	}

	/**
	* Returns an ordered range of all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param start the lower bound of the range of chi tiet kiem dem cong trinhs
	* @param end the upper bound of the range of chi tiet kiem dem cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chi tiet kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a matching chi tiet kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh findBy_thongTinKiemDemCongTrinhId_First(
		int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_thongTinKiemDemCongTrinhId_First(thongTinKiemDemCongTrinhId,
			orderByComparator);
	}

	/**
	* Returns the first chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chi tiet kiem dem cong trinh, or <code>null</code> if a matching chi tiet kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh fetchBy_thongTinKiemDemCongTrinhId_First(
		int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_thongTinKiemDemCongTrinhId_First(thongTinKiemDemCongTrinhId,
			orderByComparator);
	}

	/**
	* Returns the last chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chi tiet kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a matching chi tiet kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh findBy_thongTinKiemDemCongTrinhId_Last(
		int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_thongTinKiemDemCongTrinhId_Last(thongTinKiemDemCongTrinhId,
			orderByComparator);
	}

	/**
	* Returns the last chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chi tiet kiem dem cong trinh, or <code>null</code> if a matching chi tiet kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh fetchBy_thongTinKiemDemCongTrinhId_Last(
		int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_thongTinKiemDemCongTrinhId_Last(thongTinKiemDemCongTrinhId,
			orderByComparator);
	}

	/**
	* Returns the chi tiet kiem dem cong trinhs before and after the current chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param id the primary key of the current chi tiet kiem dem cong trinh
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next chi tiet kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh[] findBy_thongTinKiemDemCongTrinhId_PrevAndNext(
		int id, int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_thongTinKiemDemCongTrinhId_PrevAndNext(id,
			thongTinKiemDemCongTrinhId, orderByComparator);
	}

	/**
	* Removes all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63; from the database.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId);
	}

	/**
	* Returns the number of chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @return the number of matching chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId);
	}

	/**
	* Caches the chi tiet kiem dem cong trinh in the entity cache if it is enabled.
	*
	* @param chiTietKiemDemCongTrinh the chi tiet kiem dem cong trinh
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		getPersistence().cacheResult(chiTietKiemDemCongTrinh);
	}

	/**
	* Caches the chi tiet kiem dem cong trinhs in the entity cache if it is enabled.
	*
	* @param chiTietKiemDemCongTrinhs the chi tiet kiem dem cong trinhs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> chiTietKiemDemCongTrinhs) {
		getPersistence().cacheResult(chiTietKiemDemCongTrinhs);
	}

	/**
	* Creates a new chi tiet kiem dem cong trinh with the primary key. Does not add the chi tiet kiem dem cong trinh to the database.
	*
	* @param id the primary key for the new chi tiet kiem dem cong trinh
	* @return the new chi tiet kiem dem cong trinh
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the chi tiet kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the chi tiet kiem dem cong trinh
	* @return the chi tiet kiem dem cong trinh that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(chiTietKiemDemCongTrinh);
	}

	/**
	* Returns the chi tiet kiem dem cong trinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException} if it could not be found.
	*
	* @param id the primary key of the chi tiet kiem dem cong trinh
	* @return the chi tiet kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the chi tiet kiem dem cong trinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the chi tiet kiem dem cong trinh
	* @return the chi tiet kiem dem cong trinh, or <code>null</code> if a chi tiet kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the chi tiet kiem dem cong trinhs.
	*
	* @return the chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the chi tiet kiem dem cong trinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi tiet kiem dem cong trinhs
	* @param end the upper bound of the range of chi tiet kiem dem cong trinhs (not inclusive)
	* @return the range of chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the chi tiet kiem dem cong trinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi tiet kiem dem cong trinhs
	* @param end the upper bound of the range of chi tiet kiem dem cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the chi tiet kiem dem cong trinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of chi tiet kiem dem cong trinhs.
	*
	* @return the number of chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ChiTietKiemDemCongTrinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ChiTietKiemDemCongTrinhPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					ChiTietKiemDemCongTrinhPersistence.class.getName());

			ReferenceRegistry.registerReference(ChiTietKiemDemCongTrinhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ChiTietKiemDemCongTrinhPersistence persistence) {
	}

	private static ChiTietKiemDemCongTrinhPersistence _persistence;
}