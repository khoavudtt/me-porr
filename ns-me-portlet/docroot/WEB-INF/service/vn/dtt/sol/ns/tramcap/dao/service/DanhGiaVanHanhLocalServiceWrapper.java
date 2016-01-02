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
 * Provides a wrapper for {@link DanhGiaVanHanhLocalService}.
 *
 * @author khoa.vu
 * @see DanhGiaVanHanhLocalService
 * @generated
 */
public class DanhGiaVanHanhLocalServiceWrapper
	implements DanhGiaVanHanhLocalService,
		ServiceWrapper<DanhGiaVanHanhLocalService> {
	public DanhGiaVanHanhLocalServiceWrapper(
		DanhGiaVanHanhLocalService danhGiaVanHanhLocalService) {
		_danhGiaVanHanhLocalService = danhGiaVanHanhLocalService;
	}

	/**
	* Adds the danh gia van hanh to the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaVanHanh the danh gia van hanh
	* @return the danh gia van hanh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh addDanhGiaVanHanh(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh danhGiaVanHanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.addDanhGiaVanHanh(danhGiaVanHanh);
	}

	/**
	* Creates a new danh gia van hanh with the primary key. Does not add the danh gia van hanh to the database.
	*
	* @param id the primary key for the new danh gia van hanh
	* @return the new danh gia van hanh
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh createDanhGiaVanHanh(
		long id) {
		return _danhGiaVanHanhLocalService.createDanhGiaVanHanh(id);
	}

	/**
	* Deletes the danh gia van hanh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia van hanh
	* @return the danh gia van hanh that was removed
	* @throws PortalException if a danh gia van hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh deleteDanhGiaVanHanh(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.deleteDanhGiaVanHanh(id);
	}

	/**
	* Deletes the danh gia van hanh from the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaVanHanh the danh gia van hanh
	* @return the danh gia van hanh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh deleteDanhGiaVanHanh(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh danhGiaVanHanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.deleteDanhGiaVanHanh(danhGiaVanHanh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _danhGiaVanHanhLocalService.dynamicQuery();
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
		return _danhGiaVanHanhLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _danhGiaVanHanhLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _danhGiaVanHanhLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _danhGiaVanHanhLocalService.dynamicQueryCount(dynamicQuery);
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
		return _danhGiaVanHanhLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchDanhGiaVanHanh(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.fetchDanhGiaVanHanh(id);
	}

	/**
	* Returns the danh gia van hanh with the primary key.
	*
	* @param id the primary key of the danh gia van hanh
	* @return the danh gia van hanh
	* @throws PortalException if a danh gia van hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh getDanhGiaVanHanh(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getDanhGiaVanHanh(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the danh gia van hanhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @return the range of danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> getDanhGiaVanHanhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getDanhGiaVanHanhs(start, end);
	}

	/**
	* Returns the number of danh gia van hanhs.
	*
	* @return the number of danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDanhGiaVanHanhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getDanhGiaVanHanhsCount();
	}

	/**
	* Updates the danh gia van hanh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhGiaVanHanh the danh gia van hanh
	* @return the danh gia van hanh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh updateDanhGiaVanHanh(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh danhGiaVanHanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.updateDanhGiaVanHanh(danhGiaVanHanh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _danhGiaVanHanhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_danhGiaVanHanhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _danhGiaVanHanhLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh getLastestByTramCap(
		int tramCapId, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getLastestByTramCap(tramCapId, nam);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh getLastestByTramCap(
		int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getLastestByTramCap(tramCapId);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh getDanhGiaByThanhNamTram(
		long tramCapId, int thangId, int namId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getDanhGiaByThanhNamTram(tramCapId,
			thangId, namId);
	}

	@Override
	public int tongNuocThatThoat(int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.tongNuocThatThoat(tramCapId);
	}

	@Override
	public int tongNuocThatThoat(int tramCapId, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.tongNuocThatThoat(tramCapId, nam);
	}

	@Override
	public int tongDoanhThu(int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.tongDoanhThu(tramCapId);
	}

	@Override
	public int tongDoanhThu(int tramCapId, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.tongDoanhThu(tramCapId, nam);
	}

	@Override
	public int tongChiPhiTram(int tramCapId, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.tongChiPhiTram(tramCapId, nam);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> getByTramCapAndNam(
		int tramCapNuocId, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getByTramCapAndNam(tramCapNuocId, nam);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> getByTramCapAndNam(
		int tramCapNuocId, int nam, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getByTramCapAndNam(tramCapNuocId,
			nam, start, end);
	}

	@Override
	public int coutByTramCapAndNam(int tramCapNuocId, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.coutByTramCapAndNam(tramCapNuocId,
			nam);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> getByTramCap(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.getByTramCap(tramCapNuocId);
	}

	/**
	* Cap nhat danh gia van hanh
	*
	* @param id
	* @param userId
	* @param tramCapNuocId
	* @param thang
	* @param nam
	* @param congXuatThucTe
	* @param nuocThatThoat
	* @param nuocDatTieuChuan
	* @param nuocCoAsen
	* @param trangThaiCapNuoc
	* @param chiPhiHoaChat
	* @param chiPhiDien
	* @param luongNhanVien
	* @param chiPhiSuaChua
	* @param doanhThu
	* @param ghiChu
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh updateDanhGiaVanHanh(
		long id, int userId, int tramCapNuocId, int thang, int nam,
		int congXuatThucTe, int nuocThatThoat, int nuocDatTieuChuan,
		int nuocCoAsen, int trangThaiCapNuoc, int chiPhiHoaChat,
		int chiPhiDien, int luongNhanVien, int chiPhiSuaChua, int doanhThu,
		java.lang.String ghiChu)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.updateDanhGiaVanHanh(id, userId,
			tramCapNuocId, thang, nam, congXuatThucTe, nuocThatThoat,
			nuocDatTieuChuan, nuocCoAsen, trangThaiCapNuoc, chiPhiHoaChat,
			chiPhiDien, luongNhanVien, chiPhiSuaChua, doanhThu, ghiChu);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh updateDanhGiaVanHanh(
		long id, int userId, int tramCapNuocId, int thang, int nam,
		int congXuatThucTe, int nuocThatThoat, int nuocDatTieuChuan,
		int nuocCoAsen, int trangThaiCapNuoc, int chiPhiHoaChat,
		int chiPhiDien, int luongNhanVien, int chiPhiSuaChua, int doanhThu,
		java.lang.String ghiChu, int sanLuongSanXuat, int sanLuongTieuHao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVanHanhLocalService.updateDanhGiaVanHanh(id, userId,
			tramCapNuocId, thang, nam, congXuatThucTe, nuocThatThoat,
			nuocDatTieuChuan, nuocCoAsen, trangThaiCapNuoc, chiPhiHoaChat,
			chiPhiDien, luongNhanVien, chiPhiSuaChua, doanhThu, ghiChu,
			sanLuongSanXuat, sanLuongTieuHao);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DanhGiaVanHanhLocalService getWrappedDanhGiaVanHanhLocalService() {
		return _danhGiaVanHanhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDanhGiaVanHanhLocalService(
		DanhGiaVanHanhLocalService danhGiaVanHanhLocalService) {
		_danhGiaVanHanhLocalService = danhGiaVanHanhLocalService;
	}

	@Override
	public DanhGiaVanHanhLocalService getWrappedService() {
		return _danhGiaVanHanhLocalService;
	}

	@Override
	public void setWrappedService(
		DanhGiaVanHanhLocalService danhGiaVanHanhLocalService) {
		_danhGiaVanHanhLocalService = danhGiaVanHanhLocalService;
	}

	private DanhGiaVanHanhLocalService _danhGiaVanHanhLocalService;
}