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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ThongTinKiemDemHoGDLocalService}.
 *
 * @author BinhTH
 * @see ThongTinKiemDemHoGDLocalService
 * @generated
 */
public class ThongTinKiemDemHoGDLocalServiceWrapper
	implements ThongTinKiemDemHoGDLocalService,
		ServiceWrapper<ThongTinKiemDemHoGDLocalService> {
	public ThongTinKiemDemHoGDLocalServiceWrapper(
		ThongTinKiemDemHoGDLocalService thongTinKiemDemHoGDLocalService) {
		_thongTinKiemDemHoGDLocalService = thongTinKiemDemHoGDLocalService;
	}

	/**
	* Adds the thong tin kiem dem ho g d to the database. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemHoGD the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD addThongTinKiemDemHoGD(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.addThongTinKiemDemHoGD(thongTinKiemDemHoGD);
	}

	/**
	* Creates a new thong tin kiem dem ho g d with the primary key. Does not add the thong tin kiem dem ho g d to the database.
	*
	* @param id the primary key for the new thong tin kiem dem ho g d
	* @return the new thong tin kiem dem ho g d
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD createThongTinKiemDemHoGD(
		int id) {
		return _thongTinKiemDemHoGDLocalService.createThongTinKiemDemHoGD(id);
	}

	/**
	* Deletes the thong tin kiem dem ho g d with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was removed
	* @throws PortalException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD deleteThongTinKiemDemHoGD(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.deleteThongTinKiemDemHoGD(id);
	}

	/**
	* Deletes the thong tin kiem dem ho g d from the database. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemHoGD the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD deleteThongTinKiemDemHoGD(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.deleteThongTinKiemDemHoGD(thongTinKiemDemHoGD);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thongTinKiemDemHoGDLocalService.dynamicQuery();
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
		return _thongTinKiemDemHoGDLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thongTinKiemDemHoGDLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thongTinKiemDemHoGDLocalService.dynamicQuery(dynamicQuery,
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
		return _thongTinKiemDemHoGDLocalService.dynamicQueryCount(dynamicQuery);
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
		return _thongTinKiemDemHoGDLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchThongTinKiemDemHoGD(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.fetchThongTinKiemDemHoGD(id);
	}

	/**
	* Returns the thong tin kiem dem ho g d with the primary key.
	*
	* @param id the primary key of the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d
	* @throws PortalException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD getThongTinKiemDemHoGD(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getThongTinKiemDemHoGD(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKiemDemHoGDs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getThongTinKiemDemHoGDs(start,
			end);
	}

	/**
	* Returns the number of thong tin kiem dem ho g ds.
	*
	* @return the number of thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getThongTinKiemDemHoGDsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getThongTinKiemDemHoGDsCount();
	}

	/**
	* Updates the thong tin kiem dem ho g d in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemHoGD the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD updateThongTinKiemDemHoGD(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.updateThongTinKiemDemHoGD(thongTinKiemDemHoGD);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _thongTinKiemDemHoGDLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thongTinKiemDemHoGDLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thongTinKiemDemHoGDLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByGDID(
		int veSinhGiaDinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getListThongTinKiemDemHoGiaDinhByGDID(veSinhGiaDinhId,
			start, end);
	}

	@Override
	public int getCountGiaDinhBykeHoachId(int keHoachKiemDemVeSinhId,
		int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getCountGiaDinhBykeHoachId(keHoachKiemDemVeSinhId,
			daKetThucDieuTra);
	}

	@Override
	public int getCountGiaDinhBykeHoachIdDanhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getCountGiaDinhBykeHoachIdDanhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem);
	}

	@Override
	public int getCountCoNhaVeSinh(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getCountCoNhaVeSinh(keHoachKiemDemVeSinhId);
	}

	@Override
	public int getCountcoHVS(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getCountcoHVS(keHoachKiemDemVeSinhId);
	}

	@Override
	public int getCountcoHVSXayMoi(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getCountcoHVSXayMoi(keHoachKiemDemVeSinhId);
	}

	@Override
	public int getSumHDGBykeHoachKiemDemVsId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getSumHDGBykeHoachKiemDemVsId(keHoachKiemDemVeSinhId);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThucGroupBy(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getThongTinKiemDemHGDThoiGianThucGroupBy(maTinh,
			namBaoCao, danhgiakiemdem);
	}

	@Override
	public int countThongTinKiemDemHGDThoiGianThucGroupBy(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem, java.lang.String maHuyen,
		java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.countThongTinKiemDemHGDThoiGianThucGroupBy(maTinh,
			namBaoCao, danhgiakiemdem, maHuyen, maXa);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThuc(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getThongTinKiemDemHGDThoiGianThuc(maTinh,
			namBaoCao, danhgiakiemdem);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByKeHoachId(
		int keHoachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.getListThongTinKiemDemHoGiaDinhByKeHoachId(keHoachId);
	}

	@Override
	public int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String gioiTinhChuHo,
		java.lang.String danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemHoGDLocalService.countGioiTinhChuHo(maTinh,
			namBaoCao, gioiTinhChuHo, danhGiaKiemDem);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ThongTinKiemDemHoGDLocalService getWrappedThongTinKiemDemHoGDLocalService() {
		return _thongTinKiemDemHoGDLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedThongTinKiemDemHoGDLocalService(
		ThongTinKiemDemHoGDLocalService thongTinKiemDemHoGDLocalService) {
		_thongTinKiemDemHoGDLocalService = thongTinKiemDemHoGDLocalService;
	}

	@Override
	public ThongTinKiemDemHoGDLocalService getWrappedService() {
		return _thongTinKiemDemHoGDLocalService;
	}

	@Override
	public void setWrappedService(
		ThongTinKiemDemHoGDLocalService thongTinKiemDemHoGDLocalService) {
		_thongTinKiemDemHoGDLocalService = thongTinKiemDemHoGDLocalService;
	}

	private ThongTinKiemDemHoGDLocalService _thongTinKiemDemHoGDLocalService;
}