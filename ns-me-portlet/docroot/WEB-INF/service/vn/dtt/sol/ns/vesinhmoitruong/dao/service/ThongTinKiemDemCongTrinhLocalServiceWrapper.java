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
 * Provides a wrapper for {@link ThongTinKiemDemCongTrinhLocalService}.
 *
 * @author BinhTH
 * @see ThongTinKiemDemCongTrinhLocalService
 * @generated
 */
public class ThongTinKiemDemCongTrinhLocalServiceWrapper
	implements ThongTinKiemDemCongTrinhLocalService,
		ServiceWrapper<ThongTinKiemDemCongTrinhLocalService> {
	public ThongTinKiemDemCongTrinhLocalServiceWrapper(
		ThongTinKiemDemCongTrinhLocalService thongTinKiemDemCongTrinhLocalService) {
		_thongTinKiemDemCongTrinhLocalService = thongTinKiemDemCongTrinhLocalService;
	}

	/**
	* Adds the thong tin kiem dem cong trinh to the database. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh addThongTinKiemDemCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.addThongTinKiemDemCongTrinh(thongTinKiemDemCongTrinh);
	}

	/**
	* Creates a new thong tin kiem dem cong trinh with the primary key. Does not add the thong tin kiem dem cong trinh to the database.
	*
	* @param id the primary key for the new thong tin kiem dem cong trinh
	* @return the new thong tin kiem dem cong trinh
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh createThongTinKiemDemCongTrinh(
		int id) {
		return _thongTinKiemDemCongTrinhLocalService.createThongTinKiemDemCongTrinh(id);
	}

	/**
	* Deletes the thong tin kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was removed
	* @throws PortalException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh deleteThongTinKiemDemCongTrinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.deleteThongTinKiemDemCongTrinh(id);
	}

	/**
	* Deletes the thong tin kiem dem cong trinh from the database. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh deleteThongTinKiemDemCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.deleteThongTinKiemDemCongTrinh(thongTinKiemDemCongTrinh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thongTinKiemDemCongTrinhLocalService.dynamicQuery();
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
		return _thongTinKiemDemCongTrinhLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thongTinKiemDemCongTrinhLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thongTinKiemDemCongTrinhLocalService.dynamicQuery(dynamicQuery,
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
		return _thongTinKiemDemCongTrinhLocalService.dynamicQueryCount(dynamicQuery);
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
		return _thongTinKiemDemCongTrinhLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchThongTinKiemDemCongTrinh(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.fetchThongTinKiemDemCongTrinh(id);
	}

	/**
	* Returns the thong tin kiem dem cong trinh with the primary key.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh
	* @throws PortalException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh getThongTinKiemDemCongTrinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getThongTinKiemDemCongTrinh(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getThongTinKiemDemCongTrinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getThongTinKiemDemCongTrinhs(start,
			end);
	}

	/**
	* Returns the number of thong tin kiem dem cong trinhs.
	*
	* @return the number of thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getThongTinKiemDemCongTrinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getThongTinKiemDemCongTrinhsCount();
	}

	/**
	* Updates the thong tin kiem dem cong trinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh updateThongTinKiemDemCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.updateThongTinKiemDemCongTrinh(thongTinKiemDemCongTrinh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _thongTinKiemDemCongTrinhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thongTinKiemDemCongTrinhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thongTinKiemDemCongTrinhLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByCTID(
		int veSinhGiaDinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getListThongTinKiemDemCongTrinhByCTID(veSinhGiaDinhId,
			start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByGDID(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getListThongTinKiemDemCongTrinhByGDID(keHoachKiemDemVeSinhId,
			start, end);
	}

	@Override
	public int getCountCongTrinhBykeHoachId(int keHoachKiemDemVeSinhId,
		int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getCountCongTrinhBykeHoachId(keHoachKiemDemVeSinhId,
			daKetThucDieuTra);
	}

	@Override
	public int getCountCongTrinhBykeHoachIdDanhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getCountCongTrinhBykeHoachIdDanhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem);
	}

	@Override
	public int getSumCtBykeHoachKiemDemVsId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getSumCtBykeHoachKiemDemVsId(keHoachKiemDemVeSinhId);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByKeHoachId(
		int keHoachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongTinKiemDemCongTrinhLocalService.getListThongTinKiemDemCongTrinhByKeHoachId(keHoachId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ThongTinKiemDemCongTrinhLocalService getWrappedThongTinKiemDemCongTrinhLocalService() {
		return _thongTinKiemDemCongTrinhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedThongTinKiemDemCongTrinhLocalService(
		ThongTinKiemDemCongTrinhLocalService thongTinKiemDemCongTrinhLocalService) {
		_thongTinKiemDemCongTrinhLocalService = thongTinKiemDemCongTrinhLocalService;
	}

	@Override
	public ThongTinKiemDemCongTrinhLocalService getWrappedService() {
		return _thongTinKiemDemCongTrinhLocalService;
	}

	@Override
	public void setWrappedService(
		ThongTinKiemDemCongTrinhLocalService thongTinKiemDemCongTrinhLocalService) {
		_thongTinKiemDemCongTrinhLocalService = thongTinKiemDemCongTrinhLocalService;
	}

	private ThongTinKiemDemCongTrinhLocalService _thongTinKiemDemCongTrinhLocalService;
}