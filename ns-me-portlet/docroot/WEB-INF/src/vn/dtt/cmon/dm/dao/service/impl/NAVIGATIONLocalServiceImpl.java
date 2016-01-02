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

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.cmon.dm.dao.model.NAVIGATION;
import vn.dtt.cmon.dm.dao.service.base.NAVIGATIONLocalServiceBaseImpl;

/**
 * The implementation of the n a v i g a t i o n local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.cmon.dm.dao.service.NAVIGATIONLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.cmon.dm.dao.service.base.NAVIGATIONLocalServiceBaseImpl
 * @see vn.dtt.cmon.dm.dao.service.NAVIGATIONLocalServiceUtil
 */
public class NAVIGATIONLocalServiceImpl extends NAVIGATIONLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.cmon.dm.dao.service.NAVIGATIONLocalServiceUtil} to access the n a v i g a t i o n local service.
	 */
	public List<NAVIGATION> getLeftMenu(int parentId, int hidden) throws SystemException {
		return navigationPersistence.findByPARENTID(parentId,hidden);
	}
}