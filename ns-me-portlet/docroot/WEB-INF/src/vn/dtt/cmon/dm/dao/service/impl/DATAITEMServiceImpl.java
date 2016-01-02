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

package vn.dtt.cmon.dm.dao.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.service.base.DATAITEMServiceBaseImpl;

/**
 * The implementation of the d a t a i t e m remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.cmon.dm.dao.service.DATAITEMService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.cmon.dm.dao.service.base.DATAITEMServiceBaseImpl
 * @see vn.dtt.cmon.dm.dao.service.DATAITEMServiceUtil
 */
public class DATAITEMServiceImpl extends DATAITEMServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.cmon.dm.dao.service.DATAITEMServiceUtil} to access the d a t a i t
	 * e m remote service.
	 */

	public List<DATAITEM> getByDataGroupLevel1(long dataGroupId)
			throws PortalException, SystemException {
		return dataitemLocalService.getByDataGroupLevel1(dataGroupId);
	}

	public List<DATAITEM> getByDataGroupLevel2(long dataGroupId, String node1)
			throws PortalException, SystemException {
		return dataitemLocalService.getByDataGroupLevel2(dataGroupId, node1);
	}

	public List<DATAITEM> getByDataGroupLevel3(long dataGroupId, String node1,
			String node2) throws PortalException, SystemException {
		return dataitemLocalService.getByDataGroupLevel3(dataGroupId, node1,
				node2);
	}

}