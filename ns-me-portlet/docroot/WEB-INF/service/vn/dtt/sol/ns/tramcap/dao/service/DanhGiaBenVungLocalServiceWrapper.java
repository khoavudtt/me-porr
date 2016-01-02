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
 * Provides a wrapper for {@link DanhGiaBenVungLocalService}.
 *
 * @author khoa.vu
 * @see DanhGiaBenVungLocalService
 * @generated
 */
public class DanhGiaBenVungLocalServiceWrapper
	implements DanhGiaBenVungLocalService,
		ServiceWrapper<DanhGiaBenVungLocalService> {
	public DanhGiaBenVungLocalServiceWrapper(
		DanhGiaBenVungLocalService danhGiaBenVungLocalService) {
		_danhGiaBenVungLocalService = danhGiaBenVungLocalService;
	}

	/**
	* Adds the danh gia ben vung to the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaBenVung the danh gia ben vung
	* @return the danh gia ben vung that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung addDanhGiaBenVung(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.addDanhGiaBenVung(danhGiaBenVung);
	}

	/**
	* Creates a new danh gia ben vung with the primary key. Does not add the danh gia ben vung to the database.
	*
	* @param id the primary key for the new danh gia ben vung
	* @return the new danh gia ben vung
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung createDanhGiaBenVung(
		long id) {
		return _danhGiaBenVungLocalService.createDanhGiaBenVung(id);
	}

	/**
	* Deletes the danh gia ben vung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia ben vung
	* @return the danh gia ben vung that was removed
	* @throws PortalException if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung deleteDanhGiaBenVung(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.deleteDanhGiaBenVung(id);
	}

	/**
	* Deletes the danh gia ben vung from the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaBenVung the danh gia ben vung
	* @return the danh gia ben vung that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung deleteDanhGiaBenVung(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.deleteDanhGiaBenVung(danhGiaBenVung);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _danhGiaBenVungLocalService.dynamicQuery();
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
		return _danhGiaBenVungLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _danhGiaBenVungLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _danhGiaBenVungLocalService.dynamicQuery(dynamicQuery, start,
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
		return _danhGiaBenVungLocalService.dynamicQueryCount(dynamicQuery);
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
		return _danhGiaBenVungLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchDanhGiaBenVung(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.fetchDanhGiaBenVung(id);
	}

	/**
	* Returns the danh gia ben vung with the primary key.
	*
	* @param id the primary key of the danh gia ben vung
	* @return the danh gia ben vung
	* @throws PortalException if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung getDanhGiaBenVung(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.getDanhGiaBenVung(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the danh gia ben vungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @return the range of danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> getDanhGiaBenVungs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.getDanhGiaBenVungs(start, end);
	}

	/**
	* Returns the number of danh gia ben vungs.
	*
	* @return the number of danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDanhGiaBenVungsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.getDanhGiaBenVungsCount();
	}

	/**
	* Updates the danh gia ben vung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhGiaBenVung the danh gia ben vung
	* @return the danh gia ben vung that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung updateDanhGiaBenVung(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.updateDanhGiaBenVung(danhGiaBenVung);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _danhGiaBenVungLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_danhGiaBenVungLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _danhGiaBenVungLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int countByTram(int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.countByTram(tramCapId);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findByTram(
		int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.findByTram(tramCapId);
	}

	@Override
	public int countAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.countAll();
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findDanhGia(
		int[] lsTramCap, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.findDanhGia(lsTramCap, start, end);
	}

	@Override
	public int countDanhGia(int[] lsTramCap)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.countDanhGia(lsTramCap);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung getDanhGiaByNam(
		int nam, int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.getDanhGiaByNam(nam, tramCapId);
	}

	/**
	* UPDATE DLI
	*
	* @param id
	* @param baoCaoDLI
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung updateDLI(long id,
		int baoCaoDLI)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.updateDLI(id, baoCaoDLI);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung updateDanhGiaBenVung(
		long id, int tramCapNuocId, int idNguoiTao, int nam,
		int trangThaiCapNuoc, int tongDauNoiMoi, int congXuatThucTe,
		int tongDauNoiThucTe, int soNguoiCapThucTe, int nuocThatThoat,
		int nuocDatTieuChuan, int nuocCoAsen, int tongChiPhi, int tongDoanhThu,
		java.lang.String ghiChu, int ketQuaDanhGia, int baoCaoDLI)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.updateDanhGiaBenVung(id,
			tramCapNuocId, idNguoiTao, nam, trangThaiCapNuoc, tongDauNoiMoi,
			congXuatThucTe, tongDauNoiThucTe, soNguoiCapThucTe, nuocThatThoat,
			nuocDatTieuChuan, nuocCoAsen, tongChiPhi, tongDoanhThu, ghiChu,
			ketQuaDanhGia, baoCaoDLI);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung updateDanhGiaBenVung(
		long id, int tramCapNuocId, int idNguoiTao, int nam,
		int trangThaiCapNuoc, int congXuatThucTe, int tongDauNoiThucTe,
		int soNguoiCapThucTe, int nuocThatThoat, int nuocDatTieuChuan,
		int nuocCoAsen, int tongChiPhi, int tongDoanhThu,
		java.lang.String ghiChu, int ketQuaDanhGia, int baoCaoDLI)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.updateDanhGiaBenVung(id,
			tramCapNuocId, idNguoiTao, nam, trangThaiCapNuoc, congXuatThucTe,
			tongDauNoiThucTe, soNguoiCapThucTe, nuocThatThoat,
			nuocDatTieuChuan, nuocCoAsen, tongChiPhi, tongDoanhThu, ghiChu,
			ketQuaDanhGia, baoCaoDLI);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung updaTramCapNuoc(
		long id, int idNguoiTao, int nam, int trangThaiCapNuoc,
		int congXuatThucTe, int tongDauNoiThucTe, int soNguoiCapThucTe,
		int nuocThatThoat, int nuocDatTieuChuan, int nuocCoAsen,
		int tongChiPhi, int tongDoanhThu, java.lang.String ghiChu,
		int ketQuaDanhGia, int baoCaoDLI)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaBenVungLocalService.updaTramCapNuoc(id, idNguoiTao, nam,
			trangThaiCapNuoc, congXuatThucTe, tongDauNoiThucTe,
			soNguoiCapThucTe, nuocThatThoat, nuocDatTieuChuan, nuocCoAsen,
			tongChiPhi, tongDoanhThu, ghiChu, ketQuaDanhGia, baoCaoDLI);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung getDanhGiaBenVungByTramCapNuocAndNam(
		long tramCapNuocId, java.lang.String nam, java.lang.String ketquadanhgia) {
		return _danhGiaBenVungLocalService.getDanhGiaBenVungByTramCapNuocAndNam(tramCapNuocId,
			nam, ketquadanhgia);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DanhGiaBenVungLocalService getWrappedDanhGiaBenVungLocalService() {
		return _danhGiaBenVungLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDanhGiaBenVungLocalService(
		DanhGiaBenVungLocalService danhGiaBenVungLocalService) {
		_danhGiaBenVungLocalService = danhGiaBenVungLocalService;
	}

	@Override
	public DanhGiaBenVungLocalService getWrappedService() {
		return _danhGiaBenVungLocalService;
	}

	@Override
	public void setWrappedService(
		DanhGiaBenVungLocalService danhGiaBenVungLocalService) {
		_danhGiaBenVungLocalService = danhGiaBenVungLocalService;
	}

	private DanhGiaBenVungLocalService _danhGiaBenVungLocalService;
}