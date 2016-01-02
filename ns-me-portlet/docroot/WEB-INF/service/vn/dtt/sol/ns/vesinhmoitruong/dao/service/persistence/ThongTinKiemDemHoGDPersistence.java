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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;

/**
 * The persistence interface for the thong tin kiem dem ho g d service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see ThongTinKiemDemHoGDPersistenceImpl
 * @see ThongTinKiemDemHoGDUtil
 * @generated
 */
public interface ThongTinKiemDemHoGDPersistence extends BasePersistence<ThongTinKiemDemHoGD> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ThongTinKiemDemHoGDUtil} to access the thong tin kiem dem ho g d persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63;.
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @return the matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_veSinhGiaDinhId(
		int veSinhGiaDinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_veSinhGiaDinhId(
		int veSinhGiaDinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_veSinhGiaDinhId(
		int veSinhGiaDinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_veSinhGiaDinhId_First(
		int veSinhGiaDinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_veSinhGiaDinhId_First(
		int veSinhGiaDinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_veSinhGiaDinhId_Last(
		int veSinhGiaDinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_veSinhGiaDinhId_Last(
		int veSinhGiaDinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem ho g d
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD[] findBy_veSinhGiaDinhId_PrevAndNext(
		int id, int veSinhGiaDinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Removes all the thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63; from the database.
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_veSinhGiaDinhId(int veSinhGiaDinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63;.
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID
	* @return the number of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_veSinhGiaDinhId(int veSinhGiaDinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem ho g d
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD[] findBy_keHoachKiemDemVeSinhId_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_keHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_keHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem ho g d
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD[] findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the number of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem ho g d
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD[] findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the number of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coNhaVeSinh(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coNhaVeSinh(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coNhaVeSinh(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_coNhaVeSinh_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_coNhaVeSinh_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_coNhaVeSinh_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_coNhaVeSinh_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem ho g d
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD[] findBy_coNhaVeSinh_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_coNhaVeSinh(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_coNhaVeSinh(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coHVS(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coHVS(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coHVS(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_coHVS_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_coHVS_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_coHVS_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_coHVS_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem ho g d
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD[] findBy_coHVS_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_coHVS(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_coHVS(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coHVSXayMoi(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coHVSXayMoi(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_coHVSXayMoi(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_coHVSXayMoi_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_coHVSXayMoi_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_coHVSXayMoi_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_coHVSXayMoi_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem ho g d
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD[] findBy_coHVSXayMoi_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_coHVSXayMoi(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_coHVSXayMoi(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_CountHGDByKeHoach(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_CountHGDByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findBy_CountHGDByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_CountHGDByKeHoach_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_CountHGDByKeHoach_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findBy_CountHGDByKeHoach_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchBy_CountHGDByKeHoach_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param id the primary key of the current thong tin kiem dem ho g d
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD[] findBy_CountHGDByKeHoach_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_CountHGDByKeHoach(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_CountHGDByKeHoach(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the thong tin kiem dem ho g d in the entity cache if it is enabled.
	*
	* @param thongTinKiemDemHoGD the thong tin kiem dem ho g d
	*/
	public void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD);

	/**
	* Caches the thong tin kiem dem ho g ds in the entity cache if it is enabled.
	*
	* @param thongTinKiemDemHoGDs the thong tin kiem dem ho g ds
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> thongTinKiemDemHoGDs);

	/**
	* Creates a new thong tin kiem dem ho g d with the primary key. Does not add the thong tin kiem dem ho g d to the database.
	*
	* @param id the primary key for the new thong tin kiem dem ho g d
	* @return the new thong tin kiem dem ho g d
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD create(
		int id);

	/**
	* Removes the thong tin kiem dem ho g d with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem ho g d with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException} if it could not be found.
	*
	* @param id the primary key of the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;

	/**
	* Returns the thong tin kiem dem ho g d with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d, or <code>null</code> if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem ho g ds.
	*
	* @return the thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the thong tin kiem dem ho g ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the thong tin kiem dem ho g ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the thong tin kiem dem ho g ds from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem ho g ds.
	*
	* @return the number of thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}