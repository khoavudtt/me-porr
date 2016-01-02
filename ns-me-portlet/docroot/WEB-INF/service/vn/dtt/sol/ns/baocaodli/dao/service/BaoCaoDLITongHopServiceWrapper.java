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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BaoCaoDLITongHopService}.
 *
 * @author HuyMQ
 * @see BaoCaoDLITongHopService
 * @generated
 */
public class BaoCaoDLITongHopServiceWrapper implements BaoCaoDLITongHopService,
	ServiceWrapper<BaoCaoDLITongHopService> {
	public BaoCaoDLITongHopServiceWrapper(
		BaoCaoDLITongHopService baoCaoDLITongHopService) {
		_baoCaoDLITongHopService = baoCaoDLITongHopService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _baoCaoDLITongHopService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_baoCaoDLITongHopService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _baoCaoDLITongHopService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public void addBaoCaoDLITongHop(int soDauNoiTheoKeHoach, int soDauNoiMoi,
		int soNhaTieuHVSTheoKH, int soNhaTieuHVSMoi,
		int soNguoiHuongLoiNuocSach, int soXa, int tiLeHGDCoNhaTieu,
		int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS, int tiLeTramYTeHVS,
		int soNguoiHuongLoiVSTX, java.lang.String keHoachPheDuyet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLITongHopService.addBaoCaoDLITongHop(soDauNoiTheoKeHoach,
			soDauNoiMoi, soNhaTieuHVSTheoKH, soNhaTieuHVSMoi,
			soNguoiHuongLoiNuocSach, soXa, tiLeHGDCoNhaTieu,
			tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS, tiLeTramYTeHVS,
			soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BaoCaoDLITongHopService getWrappedBaoCaoDLITongHopService() {
		return _baoCaoDLITongHopService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBaoCaoDLITongHopService(
		BaoCaoDLITongHopService baoCaoDLITongHopService) {
		_baoCaoDLITongHopService = baoCaoDLITongHopService;
	}

	@Override
	public BaoCaoDLITongHopService getWrappedService() {
		return _baoCaoDLITongHopService;
	}

	@Override
	public void setWrappedService(
		BaoCaoDLITongHopService baoCaoDLITongHopService) {
		_baoCaoDLITongHopService = baoCaoDLITongHopService;
	}

	private BaoCaoDLITongHopService _baoCaoDLITongHopService;
}