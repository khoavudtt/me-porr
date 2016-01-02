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
 * Provides a wrapper for {@link DATAITEMLocalService}.
 *
 * @author khoa.vu
 * @see DATAITEMLocalService
 * @generated
 */
public class DATAITEMLocalServiceWrapper implements DATAITEMLocalService,
	ServiceWrapper<DATAITEMLocalService> {
	public DATAITEMLocalServiceWrapper(
		DATAITEMLocalService dataitemLocalService) {
		_dataitemLocalService = dataitemLocalService;
	}

	/**
	* Adds the d a t a i t e m to the database. Also notifies the appropriate model listeners.
	*
	* @param dataitem the d a t a i t e m
	* @return the d a t a i t e m that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM addDATAITEM(
		vn.dtt.cmon.dm.dao.model.DATAITEM dataitem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.addDATAITEM(dataitem);
	}

	/**
	* Creates a new d a t a i t e m with the primary key. Does not add the d a t a i t e m to the database.
	*
	* @param id the primary key for the new d a t a i t e m
	* @return the new d a t a i t e m
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM createDATAITEM(long id) {
		return _dataitemLocalService.createDATAITEM(id);
	}

	/**
	* Deletes the d a t a i t e m with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the d a t a i t e m
	* @return the d a t a i t e m that was removed
	* @throws PortalException if a d a t a i t e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM deleteDATAITEM(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.deleteDATAITEM(id);
	}

	/**
	* Deletes the d a t a i t e m from the database. Also notifies the appropriate model listeners.
	*
	* @param dataitem the d a t a i t e m
	* @return the d a t a i t e m that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM deleteDATAITEM(
		vn.dtt.cmon.dm.dao.model.DATAITEM dataitem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.deleteDATAITEM(dataitem);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dataitemLocalService.dynamicQuery();
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
		return _dataitemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dataitemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dataitemLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dataitemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dataitemLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM fetchDATAITEM(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.fetchDATAITEM(id);
	}

	/**
	* Returns the d a t a i t e m with the primary key.
	*
	* @param id the primary key of the d a t a i t e m
	* @return the d a t a i t e m
	* @throws PortalException if a d a t a i t e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM getDATAITEM(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getDATAITEM(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the d a t a i t e ms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d a t a i t e ms
	* @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	* @return the range of d a t a i t e ms
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getDATAITEMs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getDATAITEMs(start, end);
	}

	/**
	* Returns the number of d a t a i t e ms.
	*
	* @return the number of d a t a i t e ms
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDATAITEMsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getDATAITEMsCount();
	}

	/**
	* Updates the d a t a i t e m in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataitem the d a t a i t e m
	* @return the d a t a i t e m that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM updateDATAITEM(
		vn.dtt.cmon.dm.dao.model.DATAITEM dataitem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.updateDATAITEM(dataitem);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dataitemLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dataitemLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dataitemLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM getDataItem(int dataGroupId,
		int level, java.lang.String node)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getDataItem(dataGroupId, level, node);
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM getNode3(long dataGroupId,
		java.lang.String node3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getNode3(dataGroupId, node3);
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM getNode2(long dataGroupId,
		java.lang.String node1, java.lang.String node2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getNode2(dataGroupId, node1, node2);
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM getNode1(long dataGroupId,
		java.lang.String node1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getNode1(dataGroupId, node1);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupId(
		long dataGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getByDataGroupId(dataGroupId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupId(
		long dataGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getByDataGroupId(dataGroupId, start, end);
	}

	@Override
	public int countByDataGroupId(long dataGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.countByDataGroupId(dataGroupId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel1(
		long dataGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getByDataGroupLevel1(dataGroupId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel1(
		long dataGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getByDataGroupLevel1(dataGroupId, start,
			end);
	}

	@Override
	public int countByDataGroupLevel1(long dataGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.countByDataGroupLevel1(dataGroupId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel2(
		long dataGroupId, java.lang.String node1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getByDataGroupLevel2(dataGroupId, node1);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel2(
		long dataGroupId, java.lang.String node1, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getByDataGroupLevel2(dataGroupId, node1,
			start, end);
	}

	@Override
	public int countByDataGroupLevel2(long dataGroupId, java.lang.String node1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.countByDataGroupLevel2(dataGroupId, node1);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel3(
		long dataGroupId, java.lang.String node1, java.lang.String node2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getByDataGroupLevel3(dataGroupId, node1,
			node2);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel3(
		long dataGroupId, java.lang.String node1, java.lang.String node2,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getByDataGroupLevel3(dataGroupId, node1,
			node2, start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getDATAITEMByTen(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.getDATAITEMByTen(name);
	}

	@Override
	public int countByDataGroupLevel3(long dataGroupId, java.lang.String node1,
		java.lang.String node2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.countByDataGroupLevel3(dataGroupId, node1,
			node2);
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM findDataItemByName(
		java.lang.String name, java.lang.String maUni, int level)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemLocalService.findDataItemByName(name, maUni, level);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DATAITEMLocalService getWrappedDATAITEMLocalService() {
		return _dataitemLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDATAITEMLocalService(
		DATAITEMLocalService dataitemLocalService) {
		_dataitemLocalService = dataitemLocalService;
	}

	@Override
	public DATAITEMLocalService getWrappedService() {
		return _dataitemLocalService;
	}

	@Override
	public void setWrappedService(DATAITEMLocalService dataitemLocalService) {
		_dataitemLocalService = dataitemLocalService;
	}

	private DATAITEMLocalService _dataitemLocalService;
}