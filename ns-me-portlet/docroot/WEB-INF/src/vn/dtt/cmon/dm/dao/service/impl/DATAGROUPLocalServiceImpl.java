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

import vn.dtt.cmon.dm.dao.model.DATAGROUP;
import vn.dtt.cmon.dm.dao.service.base.DATAGROUPLocalServiceBaseImpl;

/**
 * The implementation of the d a t a g r o u p local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.cmon.dm.dao.service.DATAGROUPLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.cmon.dm.dao.service.base.DATAGROUPLocalServiceBaseImpl
 * @see vn.dtt.sol.cmon.dm.dao.service.DATAGROUPLocalServiceUtil
 */
public class DATAGROUPLocalServiceImpl extends DATAGROUPLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.cmon.dm.dao.service.DATAGROUPLocalServiceUtil} to access the d
	 * a t a g r o u p local service.
	 */

	public List<DATAGROUP> getAll() throws PortalException, SystemException {
		return datagroupPersistence.findAll();
	}

	public List<DATAGROUP> getAll(int start, int end) throws PortalException,
			SystemException {
		return datagroupPersistence.findAll(start, end);
	}

	public int countAll() throws PortalException, SystemException {
		return datagroupPersistence.countAll();
	}

}