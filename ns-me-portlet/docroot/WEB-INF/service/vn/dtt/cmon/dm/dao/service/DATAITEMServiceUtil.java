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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for DATAITEM. This utility wraps
 * {@link vn.dtt.cmon.dm.dao.service.impl.DATAITEMServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author khoa.vu
 * @see DATAITEMService
 * @see vn.dtt.cmon.dm.dao.service.base.DATAITEMServiceBaseImpl
 * @see vn.dtt.cmon.dm.dao.service.impl.DATAITEMServiceImpl
 * @generated
 */
public class DATAITEMServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.cmon.dm.dao.service.impl.DATAITEMServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel1(
		long dataGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByDataGroupLevel1(dataGroupId);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel2(
		long dataGroupId, java.lang.String node1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByDataGroupLevel2(dataGroupId, node1);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getByDataGroupLevel3(
		long dataGroupId, java.lang.String node1, java.lang.String node2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByDataGroupLevel3(dataGroupId, node1, node2);
	}

	public static void clearService() {
		_service = null;
	}

	public static DATAITEMService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DATAITEMService.class.getName());

			if (invokableService instanceof DATAITEMService) {
				_service = (DATAITEMService)invokableService;
			}
			else {
				_service = new DATAITEMServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DATAITEMServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DATAITEMService service) {
	}

	private static DATAITEMService _service;
}