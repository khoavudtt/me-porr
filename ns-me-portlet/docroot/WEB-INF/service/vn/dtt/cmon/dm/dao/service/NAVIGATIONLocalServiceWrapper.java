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
 * Provides a wrapper for {@link NAVIGATIONLocalService}.
 *
 * @author khoa.vu
 * @see NAVIGATIONLocalService
 * @generated
 */
public class NAVIGATIONLocalServiceWrapper implements NAVIGATIONLocalService,
	ServiceWrapper<NAVIGATIONLocalService> {
	public NAVIGATIONLocalServiceWrapper(
		NAVIGATIONLocalService navigationLocalService) {
		_navigationLocalService = navigationLocalService;
	}

	/**
	* Adds the n a v i g a t i o n to the database. Also notifies the appropriate model listeners.
	*
	* @param navigation the n a v i g a t i o n
	* @return the n a v i g a t i o n that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION addNAVIGATION(
		vn.dtt.cmon.dm.dao.model.NAVIGATION navigation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.addNAVIGATION(navigation);
	}

	/**
	* Creates a new n a v i g a t i o n with the primary key. Does not add the n a v i g a t i o n to the database.
	*
	* @param id the primary key for the new n a v i g a t i o n
	* @return the new n a v i g a t i o n
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION createNAVIGATION(long id) {
		return _navigationLocalService.createNAVIGATION(id);
	}

	/**
	* Deletes the n a v i g a t i o n with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the n a v i g a t i o n
	* @return the n a v i g a t i o n that was removed
	* @throws PortalException if a n a v i g a t i o n with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION deleteNAVIGATION(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.deleteNAVIGATION(id);
	}

	/**
	* Deletes the n a v i g a t i o n from the database. Also notifies the appropriate model listeners.
	*
	* @param navigation the n a v i g a t i o n
	* @return the n a v i g a t i o n that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION deleteNAVIGATION(
		vn.dtt.cmon.dm.dao.model.NAVIGATION navigation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.deleteNAVIGATION(navigation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _navigationLocalService.dynamicQuery();
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
		return _navigationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _navigationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _navigationLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _navigationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _navigationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION fetchNAVIGATION(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.fetchNAVIGATION(id);
	}

	/**
	* Returns the n a v i g a t i o n with the primary key.
	*
	* @param id the primary key of the n a v i g a t i o n
	* @return the n a v i g a t i o n
	* @throws PortalException if a n a v i g a t i o n with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION getNAVIGATION(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.getNAVIGATION(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the n a v i g a t i o ns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of n a v i g a t i o ns
	* @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	* @return the range of n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> getNAVIGATIONs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.getNAVIGATIONs(start, end);
	}

	/**
	* Returns the number of n a v i g a t i o ns.
	*
	* @return the number of n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNAVIGATIONsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.getNAVIGATIONsCount();
	}

	/**
	* Updates the n a v i g a t i o n in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param navigation the n a v i g a t i o n
	* @return the n a v i g a t i o n that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION updateNAVIGATION(
		vn.dtt.cmon.dm.dao.model.NAVIGATION navigation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.updateNAVIGATION(navigation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _navigationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_navigationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _navigationLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> getLeftMenu(
		int parentId, int hidden)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _navigationLocalService.getLeftMenu(parentId, hidden);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NAVIGATIONLocalService getWrappedNAVIGATIONLocalService() {
		return _navigationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNAVIGATIONLocalService(
		NAVIGATIONLocalService navigationLocalService) {
		_navigationLocalService = navigationLocalService;
	}

	@Override
	public NAVIGATIONLocalService getWrappedService() {
		return _navigationLocalService;
	}

	@Override
	public void setWrappedService(NAVIGATIONLocalService navigationLocalService) {
		_navigationLocalService = navigationLocalService;
	}

	private NAVIGATIONLocalService _navigationLocalService;
}