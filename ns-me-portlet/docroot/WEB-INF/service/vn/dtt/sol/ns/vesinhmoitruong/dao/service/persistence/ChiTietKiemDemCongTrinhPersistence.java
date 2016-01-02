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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh;

/**
 * The persistence interface for the chi tiet kiem dem cong trinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see ChiTietKiemDemCongTrinhPersistenceImpl
 * @see ChiTietKiemDemCongTrinhUtil
 * @generated
 */
public interface ChiTietKiemDemCongTrinhPersistence extends BasePersistence<ChiTietKiemDemCongTrinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ChiTietKiemDemCongTrinhUtil} to access the chi tiet kiem dem cong trinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @return the matching chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chi tiet kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a matching chi tiet kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh findBy_thongTinKiemDemCongTrinhId_First(
		int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException;

	/**
	* Returns the first chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chi tiet kiem dem cong trinh, or <code>null</code> if a matching chi tiet kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh fetchBy_thongTinKiemDemCongTrinhId_First(
		int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chi tiet kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a matching chi tiet kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh findBy_thongTinKiemDemCongTrinhId_Last(
		int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException;

	/**
	* Returns the last chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chi tiet kiem dem cong trinh, or <code>null</code> if a matching chi tiet kiem dem cong trinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh fetchBy_thongTinKiemDemCongTrinhId_Last(
		int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh[] findBy_thongTinKiemDemCongTrinhId_PrevAndNext(
		int id, int thongTinKiemDemCongTrinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException;

	/**
	* Removes all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63; from the database.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	* @return the number of matching chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the chi tiet kiem dem cong trinh in the entity cache if it is enabled.
	*
	* @param chiTietKiemDemCongTrinh the chi tiet kiem dem cong trinh
	*/
	public void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh);

	/**
	* Caches the chi tiet kiem dem cong trinhs in the entity cache if it is enabled.
	*
	* @param chiTietKiemDemCongTrinhs the chi tiet kiem dem cong trinhs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> chiTietKiemDemCongTrinhs);

	/**
	* Creates a new chi tiet kiem dem cong trinh with the primary key. Does not add the chi tiet kiem dem cong trinh to the database.
	*
	* @param id the primary key for the new chi tiet kiem dem cong trinh
	* @return the new chi tiet kiem dem cong trinh
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh create(
		int id);

	/**
	* Removes the chi tiet kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the chi tiet kiem dem cong trinh
	* @return the chi tiet kiem dem cong trinh that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException;

	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the chi tiet kiem dem cong trinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException} if it could not be found.
	*
	* @param id the primary key of the chi tiet kiem dem cong trinh
	* @return the chi tiet kiem dem cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException;

	/**
	* Returns the chi tiet kiem dem cong trinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the chi tiet kiem dem cong trinh
	* @return the chi tiet kiem dem cong trinh, or <code>null</code> if a chi tiet kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the chi tiet kiem dem cong trinhs.
	*
	* @return the chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the chi tiet kiem dem cong trinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of chi tiet kiem dem cong trinhs.
	*
	* @return the number of chi tiet kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}