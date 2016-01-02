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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;

/**
 * The persistence interface for the kiem dem vien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KiemDemVienPersistenceImpl
 * @see KiemDemVienUtil
 * @generated
 */
public interface KiemDemVienPersistence extends BasePersistence<KiemDemVien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KiemDemVienUtil} to access the kiem dem vien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the kiem dem vien where id = &#63; or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	*
	* @param id the ID
	* @return the matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the kiem dem vien where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the kiem dem vien where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID(long id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the kiem dem vien where id = &#63; from the database.
	*
	* @param id the ID
	* @return the kiem dem vien that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien removeByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the number of kiem dem viens where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByHT(
		java.lang.String hoVaTen)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByHT(
		java.lang.String hoVaTen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByHT(
		java.lang.String hoVaTen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByHT_First(
		java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByHT_First(
		java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByHT_Last(
		java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByHT_Last(
		java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByHT_PrevAndNext(
		long id, java.lang.String hoVaTen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where hoVaTen = &#63; from the database.
	*
	* @param hoVaTen the ho va ten
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHT(java.lang.String hoVaTen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where hoVaTen = &#63;.
	*
	* @param hoVaTen the ho va ten
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByHT(java.lang.String hoVaTen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the kiem dem vien where taiKhoan = &#63; or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	*
	* @param taiKhoan the tai khoan
	* @return the matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByTK(
		java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the kiem dem vien where taiKhoan = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param taiKhoan the tai khoan
	* @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByTK(
		java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the kiem dem vien where taiKhoan = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param taiKhoan the tai khoan
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByTK(
		java.lang.String taiKhoan, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the kiem dem vien where taiKhoan = &#63; from the database.
	*
	* @param taiKhoan the tai khoan
	* @return the kiem dem vien that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien removeByTK(
		java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the number of kiem dem viens where taiKhoan = &#63;.
	*
	* @param taiKhoan the tai khoan
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByTK(java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1(
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1(
		java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1(
		java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_1_First(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_1_First(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_1_Last(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_1_Last(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByO_C_1_PrevAndNext(
		long id, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where orgCode1 = &#63; from the database.
	*
	* @param orgCode1 the org code1
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_1_O_C_2_First(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_1_O_C_2_First(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_1_O_C_2_Last(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_1_O_C_2_Last(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByO_C_1_O_C_2_PrevAndNext(
		long id, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63; from the database.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByC_H_D_O_C_2(
		long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByC_H_D_O_C_2(
		long capHoatDong, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByC_H_D_O_C_2(
		long capHoatDong, java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByC_H_D_O_C_2_First(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByC_H_D_O_C_2_First(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByC_H_D_O_C_2_Last(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByC_H_D_O_C_2_Last(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByC_H_D_O_C_2_PrevAndNext(
		long id, long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63; from the database.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_H_D_O_C_2(long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_H_D_O_C_2(long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_2(
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_2(
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByO_C_2(
		java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_2_First(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_2_First(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByO_C_2_Last(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByO_C_2_Last(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByO_C_2_PrevAndNext(
		long id, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where orgCode2 = &#63; from the database.
	*
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByT_T(
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByT_T(
		long trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByT_T(
		long trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByT_T_First(
		long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByT_T_First(
		long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByT_T_Last(
		long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByT_T_Last(
		long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByT_T_PrevAndNext(
		long id, long trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where trangThai = &#63; from the database.
	*
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_T(long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_T(long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_N_T(
		long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_N_T(
		long idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_N_T(
		long idNguoiTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByID_N_T_PrevAndNext(
		long id, long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where idNguoiTao = &#63; from the database.
	*
	* @param idNguoiTao the id nguoi tao
	* @throws SystemException if a system exception occurred
	*/
	public void removeByID_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByID_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_Q_L(
		long idQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_Q_L(
		long idQuanLy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByID_Q_L(
		long idQuanLy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID_Q_L_First(
		long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID_Q_L_First(
		long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByID_Q_L_Last(
		long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByID_Q_L_Last(
		long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByID_Q_L_PrevAndNext(
		long id, long idQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where idQuanLy = &#63; from the database.
	*
	* @param idQuanLy the id quan ly
	* @throws SystemException if a system exception occurred
	*/
	public void removeByID_Q_L(long idQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where idQuanLy = &#63;.
	*
	* @param idQuanLy the id quan ly
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByID_Q_L(long idQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @return the matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByORG_CHD(
		long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByORG_CHD(
		long capHoatDong, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByORG_CHD(
		long capHoatDong, java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByORG_CHD_First(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByORG_CHD_First(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByORG_CHD_Last(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByORG_CHD_Last(
		long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien[] findByORG_CHD_PrevAndNext(
		long id, long capHoatDong, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Removes all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63; from the database.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByORG_CHD(long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	*
	* @param capHoatDong the cap hoat dong
	* @param orgCode2 the org code2
	* @return the number of matching kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countByORG_CHD(long capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the kiem dem vien in the entity cache if it is enabled.
	*
	* @param kiemDemVien the kiem dem vien
	*/
	public void cacheResult(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien);

	/**
	* Caches the kiem dem viens in the entity cache if it is enabled.
	*
	* @param kiemDemViens the kiem dem viens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> kiemDemViens);

	/**
	* Creates a new kiem dem vien with the primary key. Does not add the kiem dem vien to the database.
	*
	* @param id the primary key for the new kiem dem vien
	* @return the new kiem dem vien
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien create(long id);

	/**
	* Removes the kiem dem vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien that was removed
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien updateImpl(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the kiem dem vien with the primary key or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien
	* @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;

	/**
	* Returns the kiem dem vien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien, or <code>null</code> if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kiem dem viens.
	*
	* @return the kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kiem dem viens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens.
	*
	* @return the number of kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}