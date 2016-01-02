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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;

/**
 * The persistence interface for the thong tin kiem dem cong trinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see ThongTinKiemDemCongTrinhPersistenceImpl
 * @see ThongTinKiemDemCongTrinhUtil
 * @generated
 */
public interface ThongTinKiemDemCongTrinhPersistence extends BasePersistence<ThongTinKiemDemCongTrinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ThongTinKiemDemCongTrinhUtil} to access the thong tin kiem dem cong trinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_veSinhConTrinhId_First(
		int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_veSinhConTrinhId_First(
		int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_veSinhConTrinhId_Last(
		int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_veSinhConTrinhId_Last(
		int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_veSinhConTrinhId_PrevAndNext(
		int id, int veSinhConTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Removes all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63; from the database.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_veSinhConTrinhId(int veSinhConTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_veSinhConTrinhId(int veSinhConTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_keHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_keHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_CountCTByKeHoach_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_CountCTByKeHoach_First(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findBy_CountCTByKeHoach_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchBy_CountCTByKeHoach_Last(
		int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh[] findBy_CountCTByKeHoach_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; from the database.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_CountCTByKeHoach(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	* @return the number of matching thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_CountCTByKeHoach(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the thong tin kiem dem cong trinh in the entity cache if it is enabled.
	*
	* @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	*/
	public void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh);

	/**
	* Caches the thong tin kiem dem cong trinhs in the entity cache if it is enabled.
	*
	* @param thongTinKiemDemCongTrinhs the thong tin kiem dem cong trinhs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> thongTinKiemDemCongTrinhs);

	/**
	* Creates a new thong tin kiem dem cong trinh with the primary key. Does not add the thong tin kiem dem cong trinh to the database.
	*
	* @param id the primary key for the new thong tin kiem dem cong trinh
	* @return the new thong tin kiem dem cong trinh
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh create(
		int id);

	/**
	* Removes the thong tin kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thong tin kiem dem cong trinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException} if it could not be found.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;

	/**
	* Returns the thong tin kiem dem cong trinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh, or <code>null</code> if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thong tin kiem dem cong trinhs.
	*
	* @return the thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the thong tin kiem dem cong trinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thong tin kiem dem cong trinhs.
	*
	* @return the number of thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}