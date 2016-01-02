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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake;

import java.util.List;

/**
 * The persistence utility for the danh gia ve sinh xa new fake service. This utility wraps {@link DanhGiaVeSinhXaNewFakePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNewFakePersistence
 * @see DanhGiaVeSinhXaNewFakePersistenceImpl
 * @generated
 */
public class DanhGiaVeSinhXaNewFakeUtil {
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
	public static void clearCache(DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake) {
		getPersistence().clearCache(danhGiaVeSinhXaNewFake);
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
	public static List<DanhGiaVeSinhXaNewFake> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DanhGiaVeSinhXaNewFake> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DanhGiaVeSinhXaNewFake> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DanhGiaVeSinhXaNewFake update(
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake)
		throws SystemException {
		return getPersistence().update(danhGiaVeSinhXaNewFake);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DanhGiaVeSinhXaNewFake update(
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(danhGiaVeSinhXaNewFake, serviceContext);
	}

	/**
	* Returns all the danh gia ve sinh xa new fakes where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching danh gia ve sinh xa new fakes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> findByF_MATINH(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_MATINH(maTinh);
	}

	/**
	* Returns a range of all the danh gia ve sinh xa new fakes where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of danh gia ve sinh xa new fakes
	* @param end the upper bound of the range of danh gia ve sinh xa new fakes (not inclusive)
	* @return the range of matching danh gia ve sinh xa new fakes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> findByF_MATINH(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_MATINH(maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia ve sinh xa new fakes where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of danh gia ve sinh xa new fakes
	* @param end the upper bound of the range of danh gia ve sinh xa new fakes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia ve sinh xa new fakes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> findByF_MATINH(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_MATINH(maTinh, start, end, orderByComparator);
	}

	/**
	* Returns the first danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ve sinh xa new fake
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a matching danh gia ve sinh xa new fake could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake findByF_MATINH_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException {
		return getPersistence().findByF_MATINH_First(maTinh, orderByComparator);
	}

	/**
	* Returns the first danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ve sinh xa new fake, or <code>null</code> if a matching danh gia ve sinh xa new fake could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake fetchByF_MATINH_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_MATINH_First(maTinh, orderByComparator);
	}

	/**
	* Returns the last danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ve sinh xa new fake
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a matching danh gia ve sinh xa new fake could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake findByF_MATINH_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException {
		return getPersistence().findByF_MATINH_Last(maTinh, orderByComparator);
	}

	/**
	* Returns the last danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ve sinh xa new fake, or <code>null</code> if a matching danh gia ve sinh xa new fake could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake fetchByF_MATINH_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_MATINH_Last(maTinh, orderByComparator);
	}

	/**
	* Returns the danh gia ve sinh xa new fakes before and after the current danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	*
	* @param id the primary key of the current danh gia ve sinh xa new fake
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia ve sinh xa new fake
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a danh gia ve sinh xa new fake with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake[] findByF_MATINH_PrevAndNext(
		int id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException {
		return getPersistence()
				   .findByF_MATINH_PrevAndNext(id, maTinh, orderByComparator);
	}

	/**
	* Removes all the danh gia ve sinh xa new fakes where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_MATINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_MATINH(maTinh);
	}

	/**
	* Returns the number of danh gia ve sinh xa new fakes where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching danh gia ve sinh xa new fakes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_MATINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_MATINH(maTinh);
	}

	/**
	* Caches the danh gia ve sinh xa new fake in the entity cache if it is enabled.
	*
	* @param danhGiaVeSinhXaNewFake the danh gia ve sinh xa new fake
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake) {
		getPersistence().cacheResult(danhGiaVeSinhXaNewFake);
	}

	/**
	* Caches the danh gia ve sinh xa new fakes in the entity cache if it is enabled.
	*
	* @param danhGiaVeSinhXaNewFakes the danh gia ve sinh xa new fakes
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> danhGiaVeSinhXaNewFakes) {
		getPersistence().cacheResult(danhGiaVeSinhXaNewFakes);
	}

	/**
	* Creates a new danh gia ve sinh xa new fake with the primary key. Does not add the danh gia ve sinh xa new fake to the database.
	*
	* @param id the primary key for the new danh gia ve sinh xa new fake
	* @return the new danh gia ve sinh xa new fake
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the danh gia ve sinh xa new fake with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia ve sinh xa new fake
	* @return the danh gia ve sinh xa new fake that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a danh gia ve sinh xa new fake with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(danhGiaVeSinhXaNewFake);
	}

	/**
	* Returns the danh gia ve sinh xa new fake with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException} if it could not be found.
	*
	* @param id the primary key of the danh gia ve sinh xa new fake
	* @return the danh gia ve sinh xa new fake
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a danh gia ve sinh xa new fake with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the danh gia ve sinh xa new fake with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the danh gia ve sinh xa new fake
	* @return the danh gia ve sinh xa new fake, or <code>null</code> if a danh gia ve sinh xa new fake with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the danh gia ve sinh xa new fakes.
	*
	* @return the danh gia ve sinh xa new fakes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the danh gia ve sinh xa new fakes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ve sinh xa new fakes
	* @param end the upper bound of the range of danh gia ve sinh xa new fakes (not inclusive)
	* @return the range of danh gia ve sinh xa new fakes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the danh gia ve sinh xa new fakes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ve sinh xa new fakes
	* @param end the upper bound of the range of danh gia ve sinh xa new fakes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of danh gia ve sinh xa new fakes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the danh gia ve sinh xa new fakes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of danh gia ve sinh xa new fakes.
	*
	* @return the number of danh gia ve sinh xa new fakes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DanhGiaVeSinhXaNewFakePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DanhGiaVeSinhXaNewFakePersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					DanhGiaVeSinhXaNewFakePersistence.class.getName());

			ReferenceRegistry.registerReference(DanhGiaVeSinhXaNewFakeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DanhGiaVeSinhXaNewFakePersistence persistence) {
	}

	private static DanhGiaVeSinhXaNewFakePersistence _persistence;
}