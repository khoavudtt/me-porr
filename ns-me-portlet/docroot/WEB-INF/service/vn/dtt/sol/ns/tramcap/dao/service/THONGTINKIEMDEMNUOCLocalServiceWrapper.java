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

package vn.dtt.sol.ns.tramcap.dao.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link THONGTINKIEMDEMNUOCLocalService}.
 *
 * @author khoa.vu
 * @see THONGTINKIEMDEMNUOCLocalService
 * @generated
 */
public class THONGTINKIEMDEMNUOCLocalServiceWrapper
	implements THONGTINKIEMDEMNUOCLocalService,
		ServiceWrapper<THONGTINKIEMDEMNUOCLocalService> {
	public THONGTINKIEMDEMNUOCLocalServiceWrapper(
		THONGTINKIEMDEMNUOCLocalService thongtinkiemdemnuocLocalService) {
		_thongtinkiemdemnuocLocalService = thongtinkiemdemnuocLocalService;
	}

	/**
	* Adds the t h o n g t i n k i e m d e m n u o c to the database. Also notifies the appropriate model listeners.
	*
	* @param thongtinkiemdemnuoc the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC addTHONGTINKIEMDEMNUOC(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.addTHONGTINKIEMDEMNUOC(thongtinkiemdemnuoc);
	}

	/**
	* Creates a new t h o n g t i n k i e m d e m n u o c with the primary key. Does not add the t h o n g t i n k i e m d e m n u o c to the database.
	*
	* @param id the primary key for the new t h o n g t i n k i e m d e m n u o c
	* @return the new t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC createTHONGTINKIEMDEMNUOC(
		long id) {
		return _thongtinkiemdemnuocLocalService.createTHONGTINKIEMDEMNUOC(id);
	}

	/**
	* Deletes the t h o n g t i n k i e m d e m n u o c with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c that was removed
	* @throws PortalException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC deleteTHONGTINKIEMDEMNUOC(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.deleteTHONGTINKIEMDEMNUOC(id);
	}

	/**
	* Deletes the t h o n g t i n k i e m d e m n u o c from the database. Also notifies the appropriate model listeners.
	*
	* @param thongtinkiemdemnuoc the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC deleteTHONGTINKIEMDEMNUOC(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.deleteTHONGTINKIEMDEMNUOC(thongtinkiemdemnuoc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thongtinkiemdemnuocLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchTHONGTINKIEMDEMNUOC(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.fetchTHONGTINKIEMDEMNUOC(id);
	}

	/**
	* Returns the t h o n g t i n k i e m d e m n u o c with the primary key.
	*
	* @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c
	* @throws PortalException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC getTHONGTINKIEMDEMNUOC(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getTHONGTINKIEMDEMNUOC(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getTHONGTINKIEMDEMNUOCs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getTHONGTINKIEMDEMNUOCs(start,
			end);
	}

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs.
	*
	* @return the number of t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTHONGTINKIEMDEMNUOCsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getTHONGTINKIEMDEMNUOCsCount();
	}

	/**
	* Updates the t h o n g t i n k i e m d e m n u o c in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thongtinkiemdemnuoc the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC updateTHONGTINKIEMDEMNUOC(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.updateTHONGTINKIEMDEMNUOC(thongtinkiemdemnuoc);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _thongtinkiemdemnuocLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thongtinkiemdemnuocLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thongtinkiemdemnuocLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getListByDauNoiId(
		long dauNoiNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getListByDauNoiId(dauNoiNuocId,
			start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getListBykeHoachKiemDemNuocId(
		int keHoachKiemDemNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getListBykeHoachKiemDemNuocId(keHoachKiemDemNuocId,
			start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String nguonDL,
		java.lang.String danhGiaKiemDem, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getThongTinKeHoachKiemDemNuocSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, nguonDL, danhGiaKiemDem, start,
			end);
	}

	@Override
	public java.util.List<java.lang.String> getHuyenXaKeHoachKiemDemNuocSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getHuyenXaKeHoachKiemDemNuocSearch(keHoachId,
			trangThai, maTinh, start, end);
	}

	@Override
	public int getSumDauNoiBykeHoachKiemDemNuocId(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getSumDauNoiBykeHoachKiemDemNuocId(keHoachKiemDemNuocId);
	}

	@Override
	public int getCountDauNoiBykeHoachKiemDemNuocId(int keHoachKiemDemNuocId,
		int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDemNuocId,
			daKetThucDieuTra);
	}

	@Override
	public int getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(keHoachKiemDemNuocId,
			danhGiaKiemDem);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getThongTinDNNThoiGianThuc(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getThongTinDNNThoiGianThuc(maTinh,
			namBaoCao, danhgiakiemdem);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String nguonDL,
		java.lang.String danhGiaKiemDem, java.lang.String advText, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _thongtinkiemdemnuocLocalService.getThongTinKeHoachKiemDemNuocSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, nguonDL, danhGiaKiemDem, advText,
			start, end);
	}

	@Override
	public int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String gioiTinhChuHo,
		java.lang.String danhGiaKiemDem) {
		return _thongtinkiemdemnuocLocalService.countGioiTinhChuHo(maTinh,
			namBaoCao, gioiTinhChuHo, danhGiaKiemDem);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public THONGTINKIEMDEMNUOCLocalService getWrappedTHONGTINKIEMDEMNUOCLocalService() {
		return _thongtinkiemdemnuocLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTHONGTINKIEMDEMNUOCLocalService(
		THONGTINKIEMDEMNUOCLocalService thongtinkiemdemnuocLocalService) {
		_thongtinkiemdemnuocLocalService = thongtinkiemdemnuocLocalService;
	}

	@Override
	public THONGTINKIEMDEMNUOCLocalService getWrappedService() {
		return _thongtinkiemdemnuocLocalService;
	}

	@Override
	public void setWrappedService(
		THONGTINKIEMDEMNUOCLocalService thongtinkiemdemnuocLocalService) {
		_thongtinkiemdemnuocLocalService = thongtinkiemdemnuocLocalService;
	}

	private THONGTINKIEMDEMNUOCLocalService _thongtinkiemdemnuocLocalService;
}