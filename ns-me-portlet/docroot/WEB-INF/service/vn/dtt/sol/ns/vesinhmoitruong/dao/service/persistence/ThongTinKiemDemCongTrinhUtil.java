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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;

import java.util.List;

/**
 * The persistence utility for the thong tin kiem dem cong trinh service. This utility wraps {@link ThongTinKiemDemCongTrinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see ThongTinKiemDemCongTrinhPersistence
 * @see ThongTinKiemDemCongTrinhPersistenceImpl
 * @generated
 */
public class ThongTinKiemDemCongTrinhUtil {
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
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh) {
		getPersistence().clearCache(thongTinKiemDemCongTrinh);
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
	public static List<ThongTinKiemDemCongTrinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ThongTinKiemDemCongTrinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ThongTinKiemDemCongTrinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ThongTinKiemDemCongTrinh update(
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws SystemException {
		return getPersistence().update(thongTinKiemDemCongTrinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ThongTinKiemDemCongTrinh update(
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(thongTinKiemDemCongTrinh, serviceContext);
	}

	/**
	* Returns all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_veSinhConTrinhId(veSinhConTrinhId);
	}

	/**
	* Returns a range of all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @return the range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_veSinhConTrinhId(veSinhConTrinhId, start, end);
	}

	/**
	* Returns an ordered range of all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_veSinhConTrinhId(veSinhConTrinhId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_veSinhConTrinhId_First(
		int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_veSinhConTrinhId_First(veSinhConTrinhId,
			orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_veSinhConTrinhId_First(
		int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_veSinhConTrinhId_First(veSinhConTrinhId,
			orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_veSinhConTrinhId_Last(
		int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_veSinhConTrinhId_Last(veSinhConTrinhId,
			orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_veSinhConTrinhId_Last(
		int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_veSinhConTrinhId_Last(veSinhConTrinhId,
			orderByComparator);
	}

	/**
	* Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem cong trinh
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_veSinhConTrinhId_PrevAndNext(
		int id, int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_veSinhConTrinhId_PrevAndNext(id, veSinhConTrinhId,
			orderByComparator);
	}

	/**
	* Removes all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63; from the database.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_veSinhConTrinhId(int veSinhConTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_veSinhConTrinhId(veSinhConTrinhId);
	}

	/**
	* Returns the number of thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_veSinhConTrinhId(int veSinhConTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_veSinhConTrinhId(veSinhConTrinhId);
	}

	/**
	* Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
	}

	/**
	* Returns a range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @return the range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId,
			start, end);
	}

	/**
	* Returns an ordered range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_First(keHoachKiemDemVeSinhId,
			orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_keHoachKiemDemVeSinhId_First(keHoachKiemDemVeSinhId,
			orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_Last(keHoachKiemDemVeSinhId,
			orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_keHoachKiemDemVeSinhId_Last(keHoachKiemDemVeSinhId,
			orderByComparator);
	}

	/**
	* Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem cong trinh
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_PrevAndNext(id,
			keHoachKiemDemVeSinhId, orderByComparator);
	}

	/**
	* Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
	}

	/**
	* Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_keHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
	}

	/**
	* Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra);
	}

	/**
	* Returns a range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @return the range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, start, end);
	}

	/**
	* Returns an ordered range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, start, end, orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, orderByComparator);
	}

	/**
	* Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem cong trinh
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(id,
			keHoachKiemDemVeSinhId, daKetThucDieuTra, orderByComparator);
	}

	/**
	* Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra);
	}

	/**
	* Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra);
	}

	/**
	* Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem);
	}

	/**
	* Returns a range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @return the range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, start, end);
	}

	/**
	* Returns an ordered range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, start, end, orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, orderByComparator);
	}

	/**
	* Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem cong trinh
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(id,
			keHoachKiemDemVeSinhId, danhGiaKiemDem, orderByComparator);
	}

	/**
	* Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem);
	}

	/**
	* Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem);
	}

	/**
	* Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_CountCTByKeHoach(keHoachKiemDemVeSinhId);
	}

	/**
	* Returns a range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @return the range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_CountCTByKeHoach(keHoachKiemDemVeSinhId, start, end);
	}

	/**
	* Returns an ordered range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_CountCTByKeHoach(keHoachKiemDemVeSinhId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_CountCTByKeHoach_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_CountCTByKeHoach_First(keHoachKiemDemVeSinhId,
			orderByComparator);
	}

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_CountCTByKeHoach_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_CountCTByKeHoach_First(keHoachKiemDemVeSinhId,
			orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_CountCTByKeHoach_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_CountCTByKeHoach_Last(keHoachKiemDemVeSinhId,
			orderByComparator);
	}

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_CountCTByKeHoach_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_CountCTByKeHoach_Last(keHoachKiemDemVeSinhId,
			orderByComparator);
	}

	/**
	* Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem cong trinh
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_CountCTByKeHoach_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence()
				   .findBy_CountCTByKeHoach_PrevAndNext(id,
			keHoachKiemDemVeSinhId, orderByComparator);
	}

	/**
	* Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_CountCTByKeHoach(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_CountCTByKeHoach(keHoachKiemDemVeSinhId);
	}

	/**
	* Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_CountCTByKeHoach(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_CountCTByKeHoach(keHoachKiemDemVeSinhId);
	}

	/**
	* Caches the thong tin kiem dem cong trinh in the entity cache if it is enabled.
	*
	* @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh) {
		getPersistence().cacheResult(thongTinKiemDemCongTrinh);
	}

	/**
	* Caches the thong tin kiem dem cong trinhs in the entity cache if it is enabled.
	*
	* @param thongTinKiemDemCongTrinhs the thong tin kiem dem cong trinhs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> thongTinKiemDemCongTrinhs) {
		getPersistence().cacheResult(thongTinKiemDemCongTrinhs);
	}

	/**
	* Creates a new thong tin kiem dem cong trinh with the primary key. Does not add the thong tin kiem dem cong trinh to the database.
	*
	* @param id the primary key for the new thong tin kiem dem cong trinh
	* @return the new thong tin kiem dem cong trinh
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the thong tin kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(thongTinKiemDemCongTrinh);
	}

	/**
	* Returns the thong tin kiem dem cong trinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException} if it could not be found.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the thong tin kiem dem cong trinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh, or <code>null</code> if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the thong tin kiem dem cong trinhs.
	*
	* @return the thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the thong tin kiem dem cong trinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @return the range of thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the thong tin kiem dem cong trinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the thong tin kiem dem cong trinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of thong tin kiem dem cong trinhs.
	*
	* @return the number of thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ThongTinKiemDemCongTrinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ThongTinKiemDemCongTrinhPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					ThongTinKiemDemCongTrinhPersistence.class.getName());

			ReferenceRegistry.registerReference(ThongTinKiemDemCongTrinhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ThongTinKiemDemCongTrinhPersistence persistence) {
	}

	private static ThongTinKiemDemCongTrinhPersistence _persistence;
}