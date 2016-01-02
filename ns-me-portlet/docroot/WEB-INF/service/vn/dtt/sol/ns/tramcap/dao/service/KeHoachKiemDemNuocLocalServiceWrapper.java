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
 * Provides a wrapper for {@link KeHoachKiemDemNuocLocalService}.
 *
 * @author khoa.vu
 * @see KeHoachKiemDemNuocLocalService
 * @generated
 */
public class KeHoachKiemDemNuocLocalServiceWrapper
	implements KeHoachKiemDemNuocLocalService,
		ServiceWrapper<KeHoachKiemDemNuocLocalService> {
	public KeHoachKiemDemNuocLocalServiceWrapper(
		KeHoachKiemDemNuocLocalService keHoachKiemDemNuocLocalService) {
		_keHoachKiemDemNuocLocalService = keHoachKiemDemNuocLocalService;
	}

	/**
	* Adds the ke hoach kiem dem nuoc to the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemNuoc the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc addKeHoachKiemDemNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.addKeHoachKiemDemNuoc(keHoachKiemDemNuoc);
	}

	/**
	* Creates a new ke hoach kiem dem nuoc with the primary key. Does not add the ke hoach kiem dem nuoc to the database.
	*
	* @param id the primary key for the new ke hoach kiem dem nuoc
	* @return the new ke hoach kiem dem nuoc
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc createKeHoachKiemDemNuoc(
		int id) {
		return _keHoachKiemDemNuocLocalService.createKeHoachKiemDemNuoc(id);
	}

	/**
	* Deletes the ke hoach kiem dem nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was removed
	* @throws PortalException if a ke hoach kiem dem nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc deleteKeHoachKiemDemNuoc(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.deleteKeHoachKiemDemNuoc(id);
	}

	/**
	* Deletes the ke hoach kiem dem nuoc from the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemNuoc the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc deleteKeHoachKiemDemNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.deleteKeHoachKiemDemNuoc(keHoachKiemDemNuoc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _keHoachKiemDemNuocLocalService.dynamicQuery();
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
		return _keHoachKiemDemNuocLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _keHoachKiemDemNuocLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _keHoachKiemDemNuocLocalService.dynamicQuery(dynamicQuery,
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
		return _keHoachKiemDemNuocLocalService.dynamicQueryCount(dynamicQuery);
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
		return _keHoachKiemDemNuocLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc fetchKeHoachKiemDemNuoc(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.fetchKeHoachKiemDemNuoc(id);
	}

	/**
	* Returns the ke hoach kiem dem nuoc with the primary key.
	*
	* @param id the primary key of the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc
	* @throws PortalException if a ke hoach kiem dem nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc getKeHoachKiemDemNuoc(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.getKeHoachKiemDemNuoc(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ke hoach kiem dem nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach kiem dem nuocs
	* @param end the upper bound of the range of ke hoach kiem dem nuocs (not inclusive)
	* @return the range of ke hoach kiem dem nuocs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.getKeHoachKiemDemNuocs(start, end);
	}

	/**
	* Returns the number of ke hoach kiem dem nuocs.
	*
	* @return the number of ke hoach kiem dem nuocs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKeHoachKiemDemNuocsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.getKeHoachKiemDemNuocsCount();
	}

	/**
	* Updates the ke hoach kiem dem nuoc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemNuoc the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc updateKeHoachKiemDemNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.updateKeHoachKiemDemNuoc(keHoachKiemDemNuoc);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _keHoachKiemDemNuocLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_keHoachKiemDemNuocLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _keHoachKiemDemNuocLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public int countKeHoachKiemDemNuocSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String tramCapNuocId, java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.countKeHoachKiemDemNuocSearch(maTinh,
			maHuyen, kiemDemVienId, tramCapNuocId, trangThai);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.getKeHoachKiemDemNuocSearch(maTinh,
			maHuyen, kiemDemVienId, tramCapNuocId, trangThai, start, end);
	}

	@Override
	public int countKeHoachKiemDemNuocSearchNam(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String tramCapNuocId, java.lang.String trangThai,
		java.lang.String nam, java.lang.String idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.countKeHoachKiemDemNuocSearchNam(maTinh,
			maHuyen, kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearchNam(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String nam,
		java.lang.String idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachKiemDemNuocLocalService.getKeHoachKiemDemNuocSearchNam(maTinh,
			maHuyen, kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao,
			start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KeHoachKiemDemNuocLocalService getWrappedKeHoachKiemDemNuocLocalService() {
		return _keHoachKiemDemNuocLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKeHoachKiemDemNuocLocalService(
		KeHoachKiemDemNuocLocalService keHoachKiemDemNuocLocalService) {
		_keHoachKiemDemNuocLocalService = keHoachKiemDemNuocLocalService;
	}

	@Override
	public KeHoachKiemDemNuocLocalService getWrappedService() {
		return _keHoachKiemDemNuocLocalService;
	}

	@Override
	public void setWrappedService(
		KeHoachKiemDemNuocLocalService keHoachKiemDemNuocLocalService) {
		_keHoachKiemDemNuocLocalService = keHoachKiemDemNuocLocalService;
	}

	private KeHoachKiemDemNuocLocalService _keHoachKiemDemNuocLocalService;
}