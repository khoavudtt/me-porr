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

import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;

/**
 * The persistence interface for the t h o n g t i n k i e m d e m n u o c service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see THONGTINKIEMDEMNUOCPersistenceImpl
 * @see THONGTINKIEMDEMNUOCUtil
 * @generated
 */
public interface THONGTINKIEMDEMNUOCPersistence extends BasePersistence<THONGTINKIEMDEMNUOC> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link THONGTINKIEMDEMNUOCUtil} to access the t h o n g t i n k i e m d e m n u o c persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(
		long dauNoiNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(
		long dauNoiNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(
		long dauNoiNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_dauNoiNuocId_First(
		long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_dauNoiNuocId_First(
		long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_dauNoiNuocId_Last(
		long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_dauNoiNuocId_Last(
		long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findByD_dauNoiNuocId_PrevAndNext(
		long id, long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63; from the database.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByD_dauNoiNuocId(long dauNoiNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public int countByD_dauNoiNuocId(long dauNoiNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_First(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_First(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_Last(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_Last(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_PrevAndNext(
		long id, int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; from the database.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByD_keHoachKiemDemNuocId(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public int countByD_keHoachKiemDemNuocId(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_daKetThucDieuTra_PrevAndNext(
		long id, int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63; from the database.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @throws SystemException if a system exception occurred
	*/
	public void removeByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public int countByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_danhGiaKiemDem_PrevAndNext(
		long id, int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63; from the database.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @throws SystemException if a system exception occurred
	*/
	public void removeByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public int countByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findBy_CountDauNoiByKeHoach_First(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchBy_CountDauNoiByKeHoach_First(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findBy_CountDauNoiByKeHoach_Last(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchBy_CountDauNoiByKeHoach_Last(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findBy_CountDauNoiByKeHoach_PrevAndNext(
		long id, int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; from the database.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_CountDauNoiByKeHoach(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_CountDauNoiByKeHoach(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the t h o n g t i n k i e m d e m n u o c in the entity cache if it is enabled.
	*
	* @param thongtinkiemdemnuoc the t h o n g t i n k i e m d e m n u o c
	*/
	public void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc);

	/**
	* Caches the t h o n g t i n k i e m d e m n u o cs in the entity cache if it is enabled.
	*
	* @param thongtinkiemdemnuocs the t h o n g t i n k i e m d e m n u o cs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> thongtinkiemdemnuocs);

	/**
	* Creates a new t h o n g t i n k i e m d e m n u o c with the primary key. Does not add the t h o n g t i n k i e m d e m n u o c to the database.
	*
	* @param id the primary key for the new t h o n g t i n k i e m d e m n u o c
	* @return the new t h o n g t i n k i e m d e m n u o c
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC create(long id);

	/**
	* Removes the t h o n g t i n k i e m d e m n u o c with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g t i n k i e m d e m n u o c with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException} if it could not be found.
	*
	* @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;

	/**
	* Returns the t h o n g t i n k i e m d e m n u o c with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs.
	*
	* @return the t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs.
	*
	* @return the number of t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}