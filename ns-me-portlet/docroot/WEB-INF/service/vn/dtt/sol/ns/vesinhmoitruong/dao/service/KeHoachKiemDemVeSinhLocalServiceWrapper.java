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
 * Provides a wrapper for {@link KeHoachKiemDemVeSinhLocalService}.
 *
 * @author BinhTH
 * @see KeHoachKiemDemVeSinhLocalService
 * @generated
 */
public class KeHoachKiemDemVeSinhLocalServiceWrapper
	implements KeHoachKiemDemVeSinhLocalService,
		ServiceWrapper<KeHoachKiemDemVeSinhLocalService> {
	public KeHoachKiemDemVeSinhLocalServiceWrapper(
		KeHoachKiemDemVeSinhLocalService keHoachKiemDemVeSinhLocalService) {
		_keHoachKiemDemVeSinhLocalService = keHoachKiemDemVeSinhLocalService;
	}

	/**
	* Adds the ke hoach kiem dem ve sinh to the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemVeSinh the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh addKeHoachKiemDemVeSinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh keHoachKiemDemVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.addKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
	}

	/**
	* Creates a new ke hoach kiem dem ve sinh with the primary key. Does not add the ke hoach kiem dem ve sinh to the database.
	*
	* @param id the primary key for the new ke hoach kiem dem ve sinh
	* @return the new ke hoach kiem dem ve sinh
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh createKeHoachKiemDemVeSinh(
		int id) {
		return _keHoachKiemDemVeSinhLocalService.createKeHoachKiemDemVeSinh(id);
	}

	/**
	* Deletes the ke hoach kiem dem ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh that was removed
	* @throws PortalException if a ke hoach kiem dem ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh deleteKeHoachKiemDemVeSinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.deleteKeHoachKiemDemVeSinh(id);
	}

	/**
	* Deletes the ke hoach kiem dem ve sinh from the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemVeSinh the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh deleteKeHoachKiemDemVeSinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh keHoachKiemDemVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.deleteKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _keHoachKiemDemVeSinhLocalService.dynamicQuery();
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
		return _keHoachKiemDemVeSinhLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _keHoachKiemDemVeSinhLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _keHoachKiemDemVeSinhLocalService.dynamicQuery(dynamicQuery,
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
		return _keHoachKiemDemVeSinhLocalService.dynamicQueryCount(dynamicQuery);
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
		return _keHoachKiemDemVeSinhLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh fetchKeHoachKiemDemVeSinh(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.fetchKeHoachKiemDemVeSinh(id);
	}

	/**
	* Returns the ke hoach kiem dem ve sinh with the primary key.
	*
	* @param id the primary key of the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh
	* @throws PortalException if a ke hoach kiem dem ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh getKeHoachKiemDemVeSinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getKeHoachKiemDemVeSinh(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ke hoach kiem dem ve sinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach kiem dem ve sinhs
	* @param end the upper bound of the range of ke hoach kiem dem ve sinhs (not inclusive)
	* @return the range of ke hoach kiem dem ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getKeHoachKiemDemVeSinhs(start,
			end);
	}

	/**
	* Returns the number of ke hoach kiem dem ve sinhs.
	*
	* @return the number of ke hoach kiem dem ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKeHoachKiemDemVeSinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getKeHoachKiemDemVeSinhsCount();
	}

	/**
	* Updates the ke hoach kiem dem ve sinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemVeSinh the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh updateKeHoachKiemDemVeSinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh keHoachKiemDemVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.updateKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _keHoachKiemDemVeSinhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_keHoachKiemDemVeSinhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _keHoachKiemDemVeSinhLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public int countKeHoachKiemDemVeSinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.countKeHoachKiemDemVeSinhSearch(maTinh,
			maHuyen, kiemDemVienId, trangThai);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String trangThai, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getKeHoachKiemDemVeSinhSearch(maTinh,
			maHuyen, kiemDemVienId, trangThai, start, end);
	}

	@Override
	public java.util.List<java.lang.String> getHuyenXaKeHoachKiemDemGiaDinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getHuyenXaKeHoachKiemDemGiaDinhSearch(keHoachId,
			trangThai, maTinh, start, end);
	}

	@Override
	public java.util.List<java.lang.String> getHuyenXaKeHoachKiemDemCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getHuyenXaKeHoachKiemDemCongTrinhSearch(keHoachId,
			trangThai, maTinh, start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getThongTinKeHoachKiemDemVeSinhGdSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getListThongTinGdByKeHoachId(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getListThongTinGdByKeHoachId(keHoachKiemDemVeSinhId);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getListThongTinCongTringByKeHoachId(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getListThongTinCongTringByKeHoachId(keHoachKiemDemVeSinhId);
	}

	@Override
	public int countThongTinKeHoachKiemDemVeSinhGdSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.countThongTinKeHoachKiemDemVeSinhGdSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}

	@Override
	public int countThongTinKeHoachKiemDemVeSinhCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.countThongTinKeHoachKiemDemVeSinhCongTrinhSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, java.lang.String nguonDL, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, nguonDL,
			start, end);
	}

	@Override
	public int countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, java.lang.String nguonDL, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, nguonDL,
			start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start,
			end);
	}

	@Override
	public int countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start,
			end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String trangThai,
		java.lang.String idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.getKeHoachKiemDemVeSinhSearch(maTinh,
			maHuyen, kiemDemVienId, trangThai, idNguoiTao, start, end);
	}

	@Override
	public int countKeHoachKiemDemVeSinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String trangThai, java.lang.String idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemVeSinhLocalService.countKeHoachKiemDemVeSinhSearch(maTinh,
			maHuyen, kiemDemVienId, trangThai, idNguoiTao);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KeHoachKiemDemVeSinhLocalService getWrappedKeHoachKiemDemVeSinhLocalService() {
		return _keHoachKiemDemVeSinhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKeHoachKiemDemVeSinhLocalService(
		KeHoachKiemDemVeSinhLocalService keHoachKiemDemVeSinhLocalService) {
		_keHoachKiemDemVeSinhLocalService = keHoachKiemDemVeSinhLocalService;
	}

	@Override
	public KeHoachKiemDemVeSinhLocalService getWrappedService() {
		return _keHoachKiemDemVeSinhLocalService;
	}

	@Override
	public void setWrappedService(
		KeHoachKiemDemVeSinhLocalService keHoachKiemDemVeSinhLocalService) {
		_keHoachKiemDemVeSinhLocalService = keHoachKiemDemVeSinhLocalService;
	}

	private KeHoachKiemDemVeSinhLocalService _keHoachKiemDemVeSinhLocalService;
}