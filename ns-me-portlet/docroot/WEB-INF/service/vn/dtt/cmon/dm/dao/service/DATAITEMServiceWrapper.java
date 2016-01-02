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
 * Provides a wrapper for {@link DATAITEMService}.
 *
 * @author khoa.vu
 * @see DATAITEMService
 * @generated
 */
public class DATAITEMServiceWrapper implements DATAITEMService,
	ServiceWrapper<DATAITEMService> {
	public DATAITEMServiceWrapper(DATAITEMService dataitemService) {
		_dataitemService = dataitemService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dataitemService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dataitemService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dataitemService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel1(
		long dataGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemService.getByDataGroupLevel1(dataGroupId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel2(
		long dataGroupId, java.lang.String node1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemService.getByDataGroupLevel2(dataGroupId, node1);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel3(
		long dataGroupId, java.lang.String node1, java.lang.String node2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dataitemService.getByDataGroupLevel3(dataGroupId, node1, node2);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DATAITEMService getWrappedDATAITEMService() {
		return _dataitemService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDATAITEMService(DATAITEMService dataitemService) {
		_dataitemService = dataitemService;
	}

	@Override
	public DATAITEMService getWrappedService() {
		return _dataitemService;
	}

	@Override
	public void setWrappedService(DATAITEMService dataitemService) {
		_dataitemService = dataitemService;
	}

	private DATAITEMService _dataitemService;
}