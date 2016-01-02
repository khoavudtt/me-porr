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

package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;

/**
 * The persistence interface for the dau noi nuoc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DauNoiNuocPersistenceImpl
 * @see DauNoiNuocUtil
 * @generated
 */
public interface DauNoiNuocPersistence extends BasePersistence<DauNoiNuoc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DauNoiNuocUtil} to access the dau noi nuoc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dau noi nuocs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dau noi nuocs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @return the range of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_(
		int tramCapNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dau noi nuocs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_(
		int tramCapNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dau noi nuocs before and after the current dau noi nuoc in the ordered set where tramCapNuocId = &#63;.
	*
	* @param id the primary key of the current dau noi nuoc
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc[] findByT__PrevAndNext(
		long id, int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Removes all the dau noi nuocs where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dau noi nuocs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @return the matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_tramCapNuocId_idNguoiDanhGia(
		int tramCapNuocId, int idNguoiDanhGia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @return the range of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_tramCapNuocId_idNguoiDanhGia(
		int tramCapNuocId, int idNguoiDanhGia, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_tramCapNuocId_idNguoiDanhGia(
		int tramCapNuocId, int idNguoiDanhGia, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByT_tramCapNuocId_idNguoiDanhGia_First(
		int tramCapNuocId, int idNguoiDanhGia,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByT_tramCapNuocId_idNguoiDanhGia_First(
		int tramCapNuocId, int idNguoiDanhGia,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByT_tramCapNuocId_idNguoiDanhGia_Last(
		int tramCapNuocId, int idNguoiDanhGia,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByT_tramCapNuocId_idNguoiDanhGia_Last(
		int tramCapNuocId, int idNguoiDanhGia,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dau noi nuocs before and after the current dau noi nuoc in the ordered set where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* @param id the primary key of the current dau noi nuoc
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc[] findByT_tramCapNuocId_idNguoiDanhGia_PrevAndNext(
		long id, int tramCapNuocId, int idNguoiDanhGia,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Removes all the dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_tramCapNuocId_idNguoiDanhGia(int tramCapNuocId,
		int idNguoiDanhGia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dau noi nuocs where tramCapNuocId = &#63; and idNguoiDanhGia = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param idNguoiDanhGia the id nguoi danh gia
	* @return the number of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_tramCapNuocId_idNguoiDanhGia(int tramCapNuocId,
		int idNguoiDanhGia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @return the matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_CHK_Import(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @return the range of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_CHK_Import(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_CHK_Import(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByT_CHK_Import_First(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByT_CHK_Import_First(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByT_CHK_Import_Last(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByT_CHK_Import_Last(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dau noi nuocs before and after the current dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param id the primary key of the current dau noi nuoc
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc[] findByT_CHK_Import_PrevAndNext(
		long id, int tramCapNuocId, java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Removes all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_CHK_Import(int tramCapNuocId,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @return the number of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_CHK_Import(int tramCapNuocId, java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @return the matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_CHK_ADDDAUNOI(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @return the range of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_CHK_ADDDAUNOI(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findByT_CHK_ADDDAUNOI(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByT_CHK_ADDDAUNOI_First(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the first dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByT_CHK_ADDDAUNOI_First(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByT_CHK_ADDDAUNOI_Last(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the last dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dau noi nuoc, or <code>null</code> if a matching dau noi nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByT_CHK_ADDDAUNOI_Last(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dau noi nuocs before and after the current dau noi nuoc in the ordered set where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* @param id the primary key of the current dau noi nuoc
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc[] findByT_CHK_ADDDAUNOI_PrevAndNext(
		long id, int tramCapNuocId, java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String thonXom, java.lang.String tenChuHo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Removes all the dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_CHK_ADDDAUNOI(int tramCapNuocId,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dau noi nuocs where tramCapNuocId = &#63; and maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @return the number of matching dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_CHK_ADDDAUNOI(int tramCapNuocId,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dau noi nuoc in the entity cache if it is enabled.
	*
	* @param dauNoiNuoc the dau noi nuoc
	*/
	public void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc);

	/**
	* Caches the dau noi nuocs in the entity cache if it is enabled.
	*
	* @param dauNoiNuocs the dau noi nuocs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> dauNoiNuocs);

	/**
	* Creates a new dau noi nuoc with the primary key. Does not add the dau noi nuoc to the database.
	*
	* @param id the primary key for the new dau noi nuoc
	* @return the new dau noi nuoc
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc create(long id);

	/**
	* Removes the dau noi nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dau noi nuoc
	* @return the dau noi nuoc that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dau noi nuoc with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException} if it could not be found.
	*
	* @param id the primary key of the dau noi nuoc
	* @return the dau noi nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException;

	/**
	* Returns the dau noi nuoc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dau noi nuoc
	* @return the dau noi nuoc, or <code>null</code> if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dau noi nuocs.
	*
	* @return the dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dau noi nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @return the range of dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dau noi nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dau noi nuocs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dau noi nuocs.
	*
	* @return the number of dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}