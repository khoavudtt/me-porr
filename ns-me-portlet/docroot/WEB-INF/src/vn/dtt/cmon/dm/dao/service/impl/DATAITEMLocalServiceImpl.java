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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.service.base.DATAITEMLocalServiceBaseImpl;

/**
 * The implementation of the d a t a i t e m local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.cmon.dm.dao.service.DATAITEMLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.cmon.dm.dao.service.base.DATAITEMLocalServiceBaseImpl
 * @see vn.dtt.sol.cmon.dm.dao.service.DATAITEMLocalServiceUtil
 */
public class DATAITEMLocalServiceImpl extends DATAITEMLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.cmon.dm.dao.service.DATAITEMLocalServiceUtil} to access the d
	 * a t a i t e m local service.
	 */

	public DATAITEM getDataItem(int dataGroupId, int level, String node)
			throws PortalException, SystemException {

		List<DATAITEM> ls = dataitemFinder.find(dataGroupId, level, node);

		if (ls.size() != 0)
			return ls.get(0);
		else
			return null;
	}

	public DATAITEM getNode3(long dataGroupId, String node3)
			throws PortalException, SystemException {
		return dataitemPersistence.findByENTRY_NODE_3(dataGroupId, node3);
	}

	public DATAITEM getNode2(long dataGroupId, String node1, String node2)
			throws PortalException, SystemException {
		return dataitemPersistence
				.findByENTRY_NODE_2(dataGroupId, node1, node2);
	}

	public DATAITEM getNode1(long dataGroupId, String node1)
			throws PortalException, SystemException {
		return dataitemPersistence.findByENTRY_NODE_1(dataGroupId, node1);
	}

	public List<DATAITEM> getByDataGroupId(long dataGroupId)
			throws PortalException, SystemException {
		return dataitemPersistence.findByD_G(dataGroupId);
	}

	public List<DATAITEM> getByDataGroupId(long dataGroupId, int start, int end)
			throws PortalException, SystemException {
		return dataitemPersistence.findByD_G(dataGroupId, start, end);
	}

	public int countByDataGroupId(long dataGroupId) throws PortalException,
			SystemException {
		return dataitemPersistence.countByD_G(dataGroupId);
	}

	public List<DATAITEM> getByDataGroupLevel1(long dataGroupId)
			throws PortalException, SystemException {
		return dataitemPersistence.findByD_G_L_1(dataGroupId);
	}

	public List<DATAITEM> getByDataGroupLevel1(long dataGroupId, int start,
			int end) throws PortalException, SystemException {
		return dataitemPersistence.findByD_G_L_1(dataGroupId, start, end);
	}

	public int countByDataGroupLevel1(long dataGroupId) throws PortalException,
			SystemException {
		return dataitemPersistence.countByD_G_L_1(dataGroupId);
	}

	public List<DATAITEM> getByDataGroupLevel2(long dataGroupId, String node1)
			throws PortalException, SystemException {
		return dataitemPersistence.findByD_G_L_2(dataGroupId, node1);
	}

	public List<DATAITEM> getByDataGroupLevel2(long dataGroupId, String node1,
			int start, int end) throws PortalException, SystemException {
		return dataitemPersistence
				.findByD_G_L_2(dataGroupId, node1, start, end);
	}

	public int countByDataGroupLevel2(long dataGroupId, String node1)
			throws PortalException, SystemException {
		return dataitemPersistence.countByD_G_L_2(dataGroupId, node1);
	}

	public List<DATAITEM> getByDataGroupLevel3(long dataGroupId, String node1,
			String node2) throws PortalException, SystemException {
		return dataitemPersistence.findByD_G_L_3(dataGroupId, node1, node2);
	}

	public List<DATAITEM> getByDataGroupLevel3(long dataGroupId, String node1,
			String node2, int start, int end) throws PortalException,
			SystemException {
		return dataitemPersistence.findByD_G_L_3(dataGroupId, node1, node2,
				start, end);
	}

	public List<DATAITEM> getDATAITEMByTen(String name) throws PortalException,
			SystemException {
		return dataitemPersistence.findByENTRY_NAME(name);
	}

	public int countByDataGroupLevel3(long dataGroupId, String node1,
			String node2) throws PortalException, SystemException {
		return dataitemPersistence.countByD_G_L_3(dataGroupId, node1, node2);
	}

	public DATAITEM findDataItemByName(String name,String maUni,int level) throws PortalException,
			SystemException {
		return dataitemFinder.findDataItemByName(name, maUni, level);
	}
}