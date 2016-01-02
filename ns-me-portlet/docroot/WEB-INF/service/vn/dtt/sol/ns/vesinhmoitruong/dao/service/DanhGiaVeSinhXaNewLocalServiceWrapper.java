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
 * Provides a wrapper for {@link DanhGiaVeSinhXaNewLocalService}.
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNewLocalService
 * @generated
 */
public class DanhGiaVeSinhXaNewLocalServiceWrapper
	implements DanhGiaVeSinhXaNewLocalService,
		ServiceWrapper<DanhGiaVeSinhXaNewLocalService> {
	public DanhGiaVeSinhXaNewLocalServiceWrapper(
		DanhGiaVeSinhXaNewLocalService danhGiaVeSinhXaNewLocalService) {
		_danhGiaVeSinhXaNewLocalService = danhGiaVeSinhXaNewLocalService;
	}

	/**
	* Adds the danh gia ve sinh xa new to the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaVeSinhXaNew the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew addDanhGiaVeSinhXaNew(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.addDanhGiaVeSinhXaNew(danhGiaVeSinhXaNew);
	}

	/**
	* Creates a new danh gia ve sinh xa new with the primary key. Does not add the danh gia ve sinh xa new to the database.
	*
	* @param id the primary key for the new danh gia ve sinh xa new
	* @return the new danh gia ve sinh xa new
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew createDanhGiaVeSinhXaNew(
		int id) {
		return _danhGiaVeSinhXaNewLocalService.createDanhGiaVeSinhXaNew(id);
	}

	/**
	* Deletes the danh gia ve sinh xa new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new that was removed
	* @throws PortalException if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew deleteDanhGiaVeSinhXaNew(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.deleteDanhGiaVeSinhXaNew(id);
	}

	/**
	* Deletes the danh gia ve sinh xa new from the database. Also notifies the appropriate model listeners.
	*
	* @param danhGiaVeSinhXaNew the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew deleteDanhGiaVeSinhXaNew(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.deleteDanhGiaVeSinhXaNew(danhGiaVeSinhXaNew);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _danhGiaVeSinhXaNewLocalService.dynamicQuery();
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
		return _danhGiaVeSinhXaNewLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _danhGiaVeSinhXaNewLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _danhGiaVeSinhXaNewLocalService.dynamicQuery(dynamicQuery,
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
		return _danhGiaVeSinhXaNewLocalService.dynamicQueryCount(dynamicQuery);
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
		return _danhGiaVeSinhXaNewLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchDanhGiaVeSinhXaNew(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.fetchDanhGiaVeSinhXaNew(id);
	}

	/**
	* Returns the danh gia ve sinh xa new with the primary key.
	*
	* @param id the primary key of the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new
	* @throws PortalException if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew getDanhGiaVeSinhXaNew(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.getDanhGiaVeSinhXaNew(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the danh gia ve sinh xa news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ve sinh xa news
	* @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	* @return the range of danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> getDanhGiaVeSinhXaNews(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.getDanhGiaVeSinhXaNews(start, end);
	}

	/**
	* Returns the number of danh gia ve sinh xa news.
	*
	* @return the number of danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDanhGiaVeSinhXaNewsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.getDanhGiaVeSinhXaNewsCount();
	}

	/**
	* Updates the danh gia ve sinh xa new in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhGiaVeSinhXaNew the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew updateDanhGiaVeSinhXaNew(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.updateDanhGiaVeSinhXaNew(danhGiaVeSinhXaNew);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _danhGiaVeSinhXaNewLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_danhGiaVeSinhXaNewLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _danhGiaVeSinhXaNewLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public void initDanhGiaVeSinh(java.lang.String maTinh,
		java.lang.String maHuyen, int nam, int userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhGiaVeSinhXaNewLocalService.initDanhGiaVeSinh(maTinh, maHuyen, nam,
			userId);
	}

	@Override
	public int countByMaTinhHuyenNam(java.lang.String maTinh,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.countByMaTinhHuyenNam(maTinh,
			maHuyen, nam);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> getListInsertVeSinhXa(
		java.lang.String maTinh, java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhGiaVeSinhXaNewLocalService.getListInsertVeSinhXa(maTinh,
			maHuyen, nam);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DanhGiaVeSinhXaNewLocalService getWrappedDanhGiaVeSinhXaNewLocalService() {
		return _danhGiaVeSinhXaNewLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDanhGiaVeSinhXaNewLocalService(
		DanhGiaVeSinhXaNewLocalService danhGiaVeSinhXaNewLocalService) {
		_danhGiaVeSinhXaNewLocalService = danhGiaVeSinhXaNewLocalService;
	}

	@Override
	public DanhGiaVeSinhXaNewLocalService getWrappedService() {
		return _danhGiaVeSinhXaNewLocalService;
	}

	@Override
	public void setWrappedService(
		DanhGiaVeSinhXaNewLocalService danhGiaVeSinhXaNewLocalService) {
		_danhGiaVeSinhXaNewLocalService = danhGiaVeSinhXaNewLocalService;
	}

	private DanhGiaVeSinhXaNewLocalService _danhGiaVeSinhXaNewLocalService;
}