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
 * Provides a wrapper for {@link DauNoiNuocLocalService}.
 *
 * @author khoa.vu
 * @see DauNoiNuocLocalService
 * @generated
 */
public class DauNoiNuocLocalServiceWrapper implements DauNoiNuocLocalService,
	ServiceWrapper<DauNoiNuocLocalService> {
	public DauNoiNuocLocalServiceWrapper(
		DauNoiNuocLocalService dauNoiNuocLocalService) {
		_dauNoiNuocLocalService = dauNoiNuocLocalService;
	}

	/**
	* Adds the dau noi nuoc to the database. Also notifies the appropriate model listeners.
	*
	* @param dauNoiNuoc the dau noi nuoc
	* @return the dau noi nuoc that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc addDauNoiNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.addDauNoiNuoc(dauNoiNuoc);
	}

	/**
	* Creates a new dau noi nuoc with the primary key. Does not add the dau noi nuoc to the database.
	*
	* @param id the primary key for the new dau noi nuoc
	* @return the new dau noi nuoc
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc createDauNoiNuoc(long id) {
		return _dauNoiNuocLocalService.createDauNoiNuoc(id);
	}

	/**
	* Deletes the dau noi nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dau noi nuoc
	* @return the dau noi nuoc that was removed
	* @throws PortalException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc deleteDauNoiNuoc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.deleteDauNoiNuoc(id);
	}

	/**
	* Deletes the dau noi nuoc from the database. Also notifies the appropriate model listeners.
	*
	* @param dauNoiNuoc the dau noi nuoc
	* @return the dau noi nuoc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc deleteDauNoiNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.deleteDauNoiNuoc(dauNoiNuoc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dauNoiNuocLocalService.dynamicQuery();
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
		return _dauNoiNuocLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dauNoiNuocLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dauNoiNuocLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _dauNoiNuocLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dauNoiNuocLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchDauNoiNuoc(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.fetchDauNoiNuoc(id);
	}

	/**
	* Returns the dau noi nuoc with the primary key.
	*
	* @param id the primary key of the dau noi nuoc
	* @return the dau noi nuoc
	* @throws PortalException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc getDauNoiNuoc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getDauNoiNuoc(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiNuocs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getDauNoiNuocs(start, end);
	}

	/**
	* Returns the number of dau noi nuocs.
	*
	* @return the number of dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDauNoiNuocsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getDauNoiNuocsCount();
	}

	/**
	* Updates the dau noi nuoc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dauNoiNuoc the dau noi nuoc
	* @return the dau noi nuoc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc updateDauNoiNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.updateDauNoiNuoc(dauNoiNuoc);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dauNoiNuocLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dauNoiNuocLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dauNoiNuocLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc addNamBaoCao(long id,
		int nambaocao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.addNamBaoCao(id, nambaocao);
	}

	/**
	* @param tramCapId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public int countSoNguoiHuongLoi(int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.countSoNguoiHuongLoi(tramCapId);
	}

	@Override
	public int countDauNoiByTram(int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.countDauNoiByTram(tramCapId);
	}

	@Override
	public int countDauNoiSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String tramCapNuocId, java.lang.String trangThai,
		java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.countDauNoiSearch(maTinh, maHuyen, maXa,
			tramCapNuocId, trangThai, namBaoCao);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getDauNoiSearch(maTinh, maHuyen, maXa,
			tramCapNuocId, trangThai, namBaoCao, start, end);
	}

	@Override
	public int countThongKeMenuLeft(java.lang.String tableName,
		int initUserType, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.countThongKeMenuLeft(tableName,
			initUserType, orgCode);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiSearch(
		int tramCapNuocId, int idNguoiDanhGia, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getDauNoiSearch(tramCapNuocId,
			idNguoiDanhGia, start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getDataItemSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getDataItemSearch(maTinh, maHuyen, maXa,
			start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getChkImport(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getChkImport(tramCapNuocId, maTinh,
			maHuyen, maXa, tenChuHo, idNguoiTao);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getChkAddDauNoi(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getChkAddDauNoi(tramCapNuocId, maTinh,
			maHuyen, maXa, thonXom, tenChuHo);
	}

	@Override
	public int countDauNoiByMaTinhTramIdTrangThaiAndNam(
		java.lang.String maTinh, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao) {
		return _dauNoiNuocLocalService.countDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,
			tramCapNuocId, trangThai, namBaoCao);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNam(
		java.lang.String maTinh, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao) {
		return _dauNoiNuocLocalService.getDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,
			tramCapNuocId, trangThai, namBaoCao);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(
		java.lang.String maTinh, java.lang.String danhgiakiemdem,
		java.lang.String namBaoCao) {
		return _dauNoiNuocLocalService.getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(maTinh,
			danhgiakiemdem, namBaoCao);
	}

	@Override
	public int countDauNoiSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String tramCapNuocId, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String ngayNhap,
		java.lang.String idNguoiTao, java.lang.String advText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.countDauNoiSearch(maTinh, maHuyen, maXa,
			tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao,
		java.lang.String ngayNhap, java.lang.String idNguoiTao,
		java.lang.String advText, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dauNoiNuocLocalService.getDauNoiSearch(maTinh, maHuyen, maXa,
			tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText,
			start, end);
	}

	@Override
	public int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String gioiTinh) {
		return _dauNoiNuocLocalService.countGioiTinhChuHo(maTinh, namBaoCao,
			gioiTinh);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiGroupByMaTinhTW(
		java.lang.String namBaoCao) {
		return _dauNoiNuocLocalService.getDauNoiGroupByMaTinhTW(namBaoCao);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiGroupByTramCapIDTW(
		java.lang.String namBaoCao, java.lang.String trangThai) {
		return _dauNoiNuocLocalService.getDauNoiGroupByTramCapIDTW(namBaoCao,
			trangThai);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DauNoiNuocLocalService getWrappedDauNoiNuocLocalService() {
		return _dauNoiNuocLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDauNoiNuocLocalService(
		DauNoiNuocLocalService dauNoiNuocLocalService) {
		_dauNoiNuocLocalService = dauNoiNuocLocalService;
	}

	@Override
	public DauNoiNuocLocalService getWrappedService() {
		return _dauNoiNuocLocalService;
	}

	@Override
	public void setWrappedService(DauNoiNuocLocalService dauNoiNuocLocalService) {
		_dauNoiNuocLocalService = dauNoiNuocLocalService;
	}

	private DauNoiNuocLocalService _dauNoiNuocLocalService;
}