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

package vn.dtt.cmon.dm.dao.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.cmon.dm.dao.service.DATAITEMServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link vn.dtt.cmon.dm.dao.service.DATAITEMServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link vn.dtt.cmon.dm.dao.model.DATAITEMSoap}.
 * If the method in the service utility returns a
 * {@link vn.dtt.cmon.dm.dao.model.DATAITEM}, that is translated to a
 * {@link vn.dtt.cmon.dm.dao.model.DATAITEMSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author khoa.vu
 * @see DATAITEMServiceHttp
 * @see vn.dtt.cmon.dm.dao.model.DATAITEMSoap
 * @see vn.dtt.cmon.dm.dao.service.DATAITEMServiceUtil
 * @generated
 */
public class DATAITEMServiceSoap {
	public static vn.dtt.cmon.dm.dao.model.DATAITEMSoap[] getByDataGroupLevel1(
		long dataGroupId) throws RemoteException {
		try {
			java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> returnValue = DATAITEMServiceUtil.getByDataGroupLevel1(dataGroupId);

			return vn.dtt.cmon.dm.dao.model.DATAITEMSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.cmon.dm.dao.model.DATAITEMSoap[] getByDataGroupLevel2(
		long dataGroupId, java.lang.String node1) throws RemoteException {
		try {
			java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> returnValue = DATAITEMServiceUtil.getByDataGroupLevel2(dataGroupId,
					node1);

			return vn.dtt.cmon.dm.dao.model.DATAITEMSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.cmon.dm.dao.model.DATAITEMSoap[] getByDataGroupLevel3(
		long dataGroupId, java.lang.String node1, java.lang.String node2)
		throws RemoteException {
		try {
			java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> returnValue = DATAITEMServiceUtil.getByDataGroupLevel3(dataGroupId,
					node1, node2);

			return vn.dtt.cmon.dm.dao.model.DATAITEMSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DATAITEMServiceSoap.class);
}