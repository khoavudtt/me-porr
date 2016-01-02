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

package vn.dtt.cmon.dm.dao.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DATAGROUPLocalService}.
 *
 * @author khoa.vu
 * @see DATAGROUPLocalService
 * @generated
 */
public class DATAGROUPLocalServiceWrapper implements DATAGROUPLocalService,
	ServiceWrapper<DATAGROUPLocalService> {
	public DATAGROUPLocalServiceWrapper(
		DATAGROUPLocalService datagroupLocalService) {
		_datagroupLocalService = datagroupLocalService;
	}

	/**
	* Adds the d a t a g r o u p to the database. Also notifies the appropriate model listeners.
	*
	* @param datagroup the d a t a g r o u p
	* @return the d a t a g r o u p that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP addDATAGROUP(
		vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.addDATAGROUP(datagroup);
	}

	/**
	* Creates a new d a t a g r o u p with the primary key. Does not add the d a t a g r o u p to the database.
	*
	* @param id the primary key for the new d a t a g r o u p
	* @return the new d a t a g r o u p
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP createDATAGROUP(long id) {
		return _datagroupLocalService.createDATAGROUP(id);
	}

	/**
	* Deletes the d a t a g r o u p with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p that was removed
	* @throws PortalException if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP deleteDATAGROUP(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.deleteDATAGROUP(id);
	}

	/**
	* Deletes the d a t a g r o u p from the database. Also notifies the appropriate model listeners.
	*
	* @param datagroup the d a t a g r o u p
	* @return the d a t a g r o u p that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP deleteDATAGROUP(
		vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.deleteDATAGROUP(datagroup);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _datagroupLocalService.dynamicQuery();
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
		return _datagroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _datagroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _datagroupLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _datagroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _datagroupLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP fetchDATAGROUP(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.fetchDATAGROUP(id);
	}

	/**
	* Returns the d a t a g r o u p with the primary key.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p
	* @throws PortalException if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP getDATAGROUP(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.getDATAGROUP(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the d a t a g r o u ps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d a t a g r o u ps
	* @param end the upper bound of the range of d a t a g r o u ps (not inclusive)
	* @return the range of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> getDATAGROUPs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.getDATAGROUPs(start, end);
	}

	/**
	* Returns the number of d a t a g r o u ps.
	*
	* @return the number of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDATAGROUPsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.getDATAGROUPsCount();
	}

	/**
	* Updates the d a t a g r o u p in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param datagroup the d a t a g r o u p
	* @return the d a t a g r o u p that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP updateDATAGROUP(
		vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.updateDATAGROUP(datagroup);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _datagroupLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_datagroupLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _datagroupLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.getAll();
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> getAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.getAll(start, end);
	}

	@Override
	public int countAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _datagroupLocalService.countAll();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DATAGROUPLocalService getWrappedDATAGROUPLocalService() {
		return _datagroupLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDATAGROUPLocalService(
		DATAGROUPLocalService datagroupLocalService) {
		_datagroupLocalService = datagroupLocalService;
	}

	@Override
	public DATAGROUPLocalService getWrappedService() {
		return _datagroupLocalService;
	}

	@Override
	public void setWrappedService(DATAGROUPLocalService datagroupLocalService) {
		_datagroupLocalService = datagroupLocalService;
	}

	private DATAGROUPLocalService _datagroupLocalService;
}