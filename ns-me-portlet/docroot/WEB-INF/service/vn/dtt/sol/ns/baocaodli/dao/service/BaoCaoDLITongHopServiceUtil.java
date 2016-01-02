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

package vn.dtt.sol.ns.baocaodli.dao.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for BaoCaoDLITongHop. This utility wraps
 * {@link vn.dtt.sol.ns.baocaodli.dao.service.impl.BaoCaoDLITongHopServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author HuyMQ
 * @see BaoCaoDLITongHopService
 * @see vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLITongHopServiceBaseImpl
 * @see vn.dtt.sol.ns.baocaodli.dao.service.impl.BaoCaoDLITongHopServiceImpl
 * @generated
 */
public class BaoCaoDLITongHopServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.baocaodli.dao.service.impl.BaoCaoDLITongHopServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static void addBaoCaoDLITongHop(int soDauNoiTheoKeHoach,
		int soDauNoiMoi, int soNhaTieuHVSTheoKH, int soNhaTieuHVSMoi,
		int soNguoiHuongLoiNuocSach, int soXa, int tiLeHGDCoNhaTieu,
		int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS, int tiLeTramYTeHVS,
		int soNguoiHuongLoiVSTX, java.lang.String keHoachPheDuyet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addBaoCaoDLITongHop(soDauNoiTheoKeHoach, soDauNoiMoi,
			soNhaTieuHVSTheoKH, soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa,
			tiLeHGDCoNhaTieu, tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS,
			tiLeTramYTeHVS, soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

	public static void clearService() {
		_service = null;
	}

	public static BaoCaoDLITongHopService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BaoCaoDLITongHopService.class.getName());

			if (invokableService instanceof BaoCaoDLITongHopService) {
				_service = (BaoCaoDLITongHopService)invokableService;
			}
			else {
				_service = new BaoCaoDLITongHopServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(BaoCaoDLITongHopServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BaoCaoDLITongHopService service) {
	}

	private static BaoCaoDLITongHopService _service;
}