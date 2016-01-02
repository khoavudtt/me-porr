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

package vn.dtt.cmon.kiemdemvien.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;

import java.util.List;

/**
 * The persistence utility for the kiem dem vien service. This utility wraps {@link KiemDemVienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KiemDemVienPersistence
 * @see KiemDemVienPersistenceImpl
 * @generated
 */
public class KiemDemVienUtil {
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
	public static void clearCache(KiemDemVien kiemDemVien) {
		getPersistence().clearCache(kiemDemVien);
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
	public static List<KiemDemVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KiemDemVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KiemDemVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KiemDemVien update(KiemDemVien kiemDemVien)
		throws SystemException {
		return getPersistence().update(kiemDemVien);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KiemDemVien update(KiemDemVien kiemDemVien,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(kiemDemVien, serviceContext);
	}

	/**
	* Returns the kiem dem vien where id = &#63; or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	*
	* @param id the ID
	* @return the matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByID(id);
	}

	/**
	* Returns the kiem dem vien where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByID(id);
	}

	/**
	* Returns the kiem dem vien where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID(
		long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByID(id, retrieveFromCache);
	}

	/**
	* Removes the kiem dem vien where id = &#63; from the database.
	*
	* @param id the ID
	* @return the kiem dem vien that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien removeByID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().removeByID(id);
	}

	/**
	* Returns the number of kiem dem viens where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByID(id);
	}

	/**
	* Returns all the kiem dem viens where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByHT(
		java.lang.String hoVaTen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHT(hoVaTen);
	}

	/**
	* Returns a range of all the kiem dem viens where hoVaTen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoVaTen the ho va ten
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByHT(
		java.lang.String hoVaTen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHT(hoVaTen, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where hoVaTen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoVaTen the ho va ten
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByHT(
		java.lang.String hoVaTen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHT(hoVaTen, start, end, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByHT_First(
		java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByHT_First(hoVaTen, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByHT_First(
		java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByHT_First(hoVaTen, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByHT_Last(
		java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByHT_Last(hoVaTen, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByHT_Last(
		java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByHT_Last(hoVaTen, orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByHT_PrevAndNext(
		long id, java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByHT_PrevAndNext(id, hoVaTen, orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where hoVaTen = &#63; from the database.
	*
	* @param hoVaTen the ho va ten
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHT(java.lang.String hoVaTen)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHT(hoVaTen);
	}

	/**
	* Returns the number of kiem dem viens where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHT(java.lang.String hoVaTen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHT(hoVaTen);
	}

	/**
	* Returns the kiem dem vien where taiKhoan = &#63; or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	*
	* @param taiKhoan the tai khoan
	* @return the matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByTK(
		java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByTK(taiKhoan);
	}

	/**
	* Returns the kiem dem vien where taiKhoan = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param taiKhoan the tai khoan
	* @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByTK(
		java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTK(taiKhoan);
	}

	/**
	* Returns the kiem dem vien where taiKhoan = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param taiKhoan the tai khoan
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByTK(
		java.lang.String taiKhoan, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTK(taiKhoan, retrieveFromCache);
	}

	/**
	* Removes the kiem dem vien where taiKhoan = &#63; from the database.
	*
	* @param taiKhoan the tai khoan
	* @return the kiem dem vien that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien removeByTK(
		java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().removeByTK(taiKhoan);
	}

	/**
	* Returns the number of kiem dem viens where taiKhoan = &#63;.
	*
	* @param taiKhoan the tai khoan
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTK(java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTK(taiKhoan);
	}

	/**
	* Returns all the kiem dem viens where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1(
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_1(orgCode1);
	}

	/**
	* Returns a range of all the kiem dem viens where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1(
		java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_1(orgCode1, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1(
		java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByO_C_1(orgCode1, start, end, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_1_First(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByO_C_1_First(orgCode1, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_1_First(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_C_1_First(orgCode1, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_1_Last(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByO_C_1_Last(orgCode1, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_1_Last(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_C_1_Last(orgCode1, orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByO_C_1_PrevAndNext(
		long id, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByO_C_1_PrevAndNext(id, orgCode1, orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where orgCode1 = &#63; from the database.
	*
	* @param orgCode1 the org code1
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByO_C_1(orgCode1);
	}

	/**
	* Returns the number of kiem dem viens where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByO_C_1(orgCode1);
	}

	/**
	* Returns all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	/**
	* Returns a range of all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_1_O_C_2(orgCode1, orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByO_C_1_O_C_2(orgCode1, orgCode2, start, end,
			orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_1_O_C_2_First(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByO_C_1_O_C_2_First(orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_1_O_C_2_First(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByO_C_1_O_C_2_First(orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_1_O_C_2_Last(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByO_C_1_O_C_2_Last(orgCode1, orgCode2, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_1_O_C_2_Last(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByO_C_1_O_C_2_Last(orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByO_C_1_O_C_2_PrevAndNext(
		long id, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByO_C_1_O_C_2_PrevAndNext(id, orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63; from the database.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	/**
	* Returns the number of kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	/**
	* Returns all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByC_H_D_O_C_2(
		long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_H_D_O_C_2(capHoatDong, orgCode2);
	}

	/**
	* Returns a range of all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByC_H_D_O_C_2(
		long capHoatDong, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_H_D_O_C_2(capHoatDong, orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByC_H_D_O_C_2(
		long capHoatDong, java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_H_D_O_C_2(capHoatDong, orgCode2, start, end,
			orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByC_H_D_O_C_2_First(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByC_H_D_O_C_2_First(capHoatDong, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByC_H_D_O_C_2_First(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_H_D_O_C_2_First(capHoatDong, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByC_H_D_O_C_2_Last(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByC_H_D_O_C_2_Last(capHoatDong, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByC_H_D_O_C_2_Last(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_H_D_O_C_2_Last(capHoatDong, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByC_H_D_O_C_2_PrevAndNext(
		long id, long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByC_H_D_O_C_2_PrevAndNext(id, capHoatDong, orgCode2,
			orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63; from the database.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_H_D_O_C_2(long capHoatDong,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_H_D_O_C_2(capHoatDong, orgCode2);
	}

	/**
	* Returns the number of kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_H_D_O_C_2(long capHoatDong,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_H_D_O_C_2(capHoatDong, orgCode2);
	}

	/**
	* Returns all the kiem dem viens where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_2(
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_2(orgCode2);
	}

	/**
	* Returns a range of all the kiem dem viens where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_2(
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_2(orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_2(
		java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByO_C_2(orgCode2, start, end, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_2_First(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByO_C_2_First(orgCode2, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_2_First(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_C_2_First(orgCode2, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_2_Last(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByO_C_2_Last(orgCode2, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_2_Last(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_C_2_Last(orgCode2, orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByO_C_2_PrevAndNext(
		long id, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByO_C_2_PrevAndNext(id, orgCode2, orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where orgCode2 = &#63; from the database.
	*
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByO_C_2(orgCode2);
	}

	/**
	* Returns the number of kiem dem viens where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByO_C_2(orgCode2);
	}

	/**
	* Returns all the kiem dem viens where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByT_T(
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_T(trangThai);
	}

	/**
	* Returns a range of all the kiem dem viens where trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThai the trang thai
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByT_T(
		long trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_T(trangThai, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThai the trang thai
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByT_T(
		long trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_T(trangThai, start, end, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByT_T_First(
		long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByT_T_First(trangThai, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByT_T_First(
		long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT_T_First(trangThai, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByT_T_Last(
		long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByT_T_Last(trangThai, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByT_T_Last(
		long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT_T_Last(trangThai, orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByT_T_PrevAndNext(
		long id, long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByT_T_PrevAndNext(id, trangThai, orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where trangThai = &#63; from the database.
	*
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_T(long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_T(trangThai);
	}

	/**
	* Returns the number of kiem dem viens where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_T(long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_T(trangThai);
	}

	/**
	* Returns all the kiem dem viens where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_N_T(
		long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByID_N_T(idNguoiTao);
	}

	/**
	* Returns a range of all the kiem dem viens where idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_N_T(
		long idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByID_N_T(idNguoiTao, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_N_T(
		long idNguoiTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByID_N_T(idNguoiTao, start, end, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByID_N_T_First(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByID_N_T_First(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByID_N_T_Last(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByID_N_T_Last(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByID_N_T_PrevAndNext(
		long id, long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByID_N_T_PrevAndNext(id, idNguoiTao, orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where idNguoiTao = &#63; from the database.
	*
	* @param idNguoiTao the id nguoi tao
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByID_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByID_N_T(idNguoiTao);
	}

	/**
	* Returns the number of kiem dem viens where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByID_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByID_N_T(idNguoiTao);
	}

	/**
	* Returns all the kiem dem viens where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_Q_L(
		long idQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByID_Q_L(idQuanLy);
	}

	/**
	* Returns a range of all the kiem dem viens where idQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idQuanLy the id quan ly
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_Q_L(
		long idQuanLy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByID_Q_L(idQuanLy, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where idQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idQuanLy the id quan ly
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_Q_L(
		long idQuanLy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByID_Q_L(idQuanLy, start, end, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID_Q_L_First(
		long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByID_Q_L_First(idQuanLy, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID_Q_L_First(
		long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByID_Q_L_First(idQuanLy, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID_Q_L_Last(
		long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByID_Q_L_Last(idQuanLy, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID_Q_L_Last(
		long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByID_Q_L_Last(idQuanLy, orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByID_Q_L_PrevAndNext(
		long id, long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByID_Q_L_PrevAndNext(id, idQuanLy, orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where idQuanLy = &#63; from the database.
	*
	* @param idQuanLy the id quan ly
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByID_Q_L(long idQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByID_Q_L(idQuanLy);
	}

	/**
	* Returns the number of kiem dem viens where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByID_Q_L(long idQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByID_Q_L(idQuanLy);
	}

	/**
	* Returns all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByORG_CHD(
		long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByORG_CHD(capHoatDong, orgCode2);
	}

	/**
	* Returns a range of all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByORG_CHD(
		long capHoatDong, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByORG_CHD(capHoatDong, orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByORG_CHD(
		long capHoatDong, java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByORG_CHD(capHoatDong, orgCode2, start, end,
			orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByORG_CHD_First(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByORG_CHD_First(capHoatDong, orgCode2, orderByComparator);
	}

	/**
	* Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByORG_CHD_First(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByORG_CHD_First(capHoatDong, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByORG_CHD_Last(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByORG_CHD_Last(capHoatDong, orgCode2, orderByComparator);
	}

	/**
	* Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByORG_CHD_Last(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByORG_CHD_Last(capHoatDong, orgCode2, orderByComparator);
	}

	/**
	* Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current kiem dem vien
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByORG_CHD_PrevAndNext(
		long id, long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence()
				   .findByORG_CHD_PrevAndNext(id, capHoatDong, orgCode2,
			orderByComparator);
	}

	/**
	* Removes all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63; from the database.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByORG_CHD(long capHoatDong,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByORG_CHD(capHoatDong, orgCode2);
	}

	/**
	* Returns the number of kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByORG_CHD(long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByORG_CHD(capHoatDong, orgCode2);
	}

	/**
	* Caches the kiem dem vien in the entity cache if it is enabled.
	*
	* @param kiemDemVien the kiem dem vien
	*/
	public static void cacheResult(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien) {
		getPersistence().cacheResult(kiemDemVien);
	}

	/**
	* Caches the kiem dem viens in the entity cache if it is enabled.
	*
	* @param kiemDemViens the kiem dem viens
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> kiemDemViens) {
		getPersistence().cacheResult(kiemDemViens);
	}

	/**
	* Creates a new kiem dem vien with the primary key. Does not add the kiem dem vien to the database.
	*
	* @param id the primary key for the new kiem dem vien
	* @return the new kiem dem vien
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the kiem dem vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien that was removed
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien updateImpl(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(kiemDemVien);
	}

	/**
	* Returns the kiem dem vien with the primary key or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the kiem dem vien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien, or <code>null</code> if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the kiem dem viens.
	*
	* @return the kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the kiem dem viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the kiem dem viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the kiem dem viens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of kiem dem viens.
	*
	* @return the number of kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KiemDemVienPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KiemDemVienPersistence)PortletBeanLocatorUtil.locate(vn.dtt.cmon.kiemdemvien.dao.service.ClpSerializer.getServletContextName(),
					KiemDemVienPersistence.class.getName());

			ReferenceRegistry.registerReference(KiemDemVienUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KiemDemVienPersistence persistence) {
	}

	private static KiemDemVienPersistence _persistence;
}