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

package vn.dtt.sol.ns.kehoachvesinh.dao.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KeHoachVeSinhLocalService}.
 *
 * @author HANT
 * @see KeHoachVeSinhLocalService
 * @generated
 */
public class KeHoachVeSinhLocalServiceWrapper
	implements KeHoachVeSinhLocalService,
		ServiceWrapper<KeHoachVeSinhLocalService> {
	public KeHoachVeSinhLocalServiceWrapper(
		KeHoachVeSinhLocalService keHoachVeSinhLocalService) {
		_keHoachVeSinhLocalService = keHoachVeSinhLocalService;
	}

	/**
	* Adds the ke hoach ve sinh to the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachVeSinh the ke hoach ve sinh
	* @return the ke hoach ve sinh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh addKeHoachVeSinh(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.addKeHoachVeSinh(keHoachVeSinh);
	}

	/**
	* Creates a new ke hoach ve sinh with the primary key. Does not add the ke hoach ve sinh to the database.
	*
	* @param id the primary key for the new ke hoach ve sinh
	* @return the new ke hoach ve sinh
	*/
	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh createKeHoachVeSinh(
		long id) {
		return _keHoachVeSinhLocalService.createKeHoachVeSinh(id);
	}

	/**
	* Deletes the ke hoach ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach ve sinh
	* @return the ke hoach ve sinh that was removed
	* @throws PortalException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh deleteKeHoachVeSinh(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.deleteKeHoachVeSinh(id);
	}

	/**
	* Deletes the ke hoach ve sinh from the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachVeSinh the ke hoach ve sinh
	* @return the ke hoach ve sinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh deleteKeHoachVeSinh(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.deleteKeHoachVeSinh(keHoachVeSinh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _keHoachVeSinhLocalService.dynamicQuery();
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
		return _keHoachVeSinhLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _keHoachVeSinhLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _keHoachVeSinhLocalService.dynamicQuery(dynamicQuery, start,
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
		return _keHoachVeSinhLocalService.dynamicQueryCount(dynamicQuery);
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
		return _keHoachVeSinhLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchKeHoachVeSinh(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.fetchKeHoachVeSinh(id);
	}

	/**
	* Returns the ke hoach ve sinh with the primary key.
	*
	* @param id the primary key of the ke hoach ve sinh
	* @return the ke hoach ve sinh
	* @throws PortalException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh getKeHoachVeSinh(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.getKeHoachVeSinh(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ke hoach ve sinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @return the range of ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> getKeHoachVeSinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.getKeHoachVeSinhs(start, end);
	}

	/**
	* Returns the number of ke hoach ve sinhs.
	*
	* @return the number of ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKeHoachVeSinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.getKeHoachVeSinhsCount();
	}

	/**
	* Updates the ke hoach ve sinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param keHoachVeSinh the ke hoach ve sinh
	* @return the ke hoach ve sinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh updateKeHoachVeSinh(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.updateKeHoachVeSinh(keHoachVeSinh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _keHoachVeSinhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_keHoachVeSinhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _keHoachVeSinhLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> search(
		long nam, java.lang.String maTinh, java.lang.String maHuyen, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.search(nam, maTinh, maHuyen, start,
			end);
	}

	@Override
	public int count(long nam, java.lang.String maTinh, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.count(nam, maTinh, maHuyen);
	}

	@Override
	public int countSoDanHuongLoi(java.lang.String nam,
		java.lang.String maTinh, java.lang.String dangkyvstx)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.countSoDanHuongLoi(nam, maTinh,
			dangkyvstx);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> getKeHoachVeSinhByNamTinhDangKyVSTX(
		java.lang.String nam, java.lang.String maTinh,
		java.lang.String dangkyvstx)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.getKeHoachVeSinhByNamTinhDangKyVSTX(nam,
			maTinh, dangkyvstx);
	}

	@Override
	public int sumSoNhaTieuHVSMoiTW(java.lang.String namBaoCao,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keHoachVeSinhLocalService.sumSoNhaTieuHVSMoiTW(namBaoCao, maTinh);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KeHoachVeSinhLocalService getWrappedKeHoachVeSinhLocalService() {
		return _keHoachVeSinhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKeHoachVeSinhLocalService(
		KeHoachVeSinhLocalService keHoachVeSinhLocalService) {
		_keHoachVeSinhLocalService = keHoachVeSinhLocalService;
	}

	@Override
	public KeHoachVeSinhLocalService getWrappedService() {
		return _keHoachVeSinhLocalService;
	}

	@Override
	public void setWrappedService(
		KeHoachVeSinhLocalService keHoachVeSinhLocalService) {
		_keHoachVeSinhLocalService = keHoachVeSinhLocalService;
	}

	private KeHoachVeSinhLocalService _keHoachVeSinhLocalService;
}