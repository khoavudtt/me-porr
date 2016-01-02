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
 * Provides a wrapper for {@link BaoCaoDLIService}.
 *
 * @author HuyMQ
 * @see BaoCaoDLIService
 * @generated
 */
public class BaoCaoDLIServiceWrapper implements BaoCaoDLIService,
	ServiceWrapper<BaoCaoDLIService> {
	public BaoCaoDLIServiceWrapper(BaoCaoDLIService baoCaoDLIService) {
		_baoCaoDLIService = baoCaoDLIService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _baoCaoDLIService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_baoCaoDLIService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _baoCaoDLIService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public void initBaoCaoDLI()
		throws com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLIService.initBaoCaoDLI();
	}

	@Override
	public void deleteBaoCao(long baoCaoDLIId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLIService.deleteBaoCao(baoCaoDLIId);
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI updateBaoCao(
		long groupId, long baoCaoDLIId, int nam, java.lang.String maTinh,
		java.lang.String soBaoCao, java.lang.String nguoiLap,
		java.lang.String nguoiDuyet, int ngayBaoCaoMonth, int ngayBaoCaoDay,
		int ngayBaoCaoYear, long folderId, java.io.File luuTruPDF1,
		java.io.File luuTruPDF2, java.io.File luuTruCSV1,
		java.io.File luuTruCSV2, int trangThai,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLIService.updateBaoCao(groupId, baoCaoDLIId, nam,
			maTinh, soBaoCao, nguoiLap, nguoiDuyet, ngayBaoCaoMonth,
			ngayBaoCaoDay, ngayBaoCaoYear, folderId, luuTruPDF1, luuTruPDF2,
			luuTruCSV1, luuTruCSV2, trangThai, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BaoCaoDLIService getWrappedBaoCaoDLIService() {
		return _baoCaoDLIService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBaoCaoDLIService(BaoCaoDLIService baoCaoDLIService) {
		_baoCaoDLIService = baoCaoDLIService;
	}

	@Override
	public BaoCaoDLIService getWrappedService() {
		return _baoCaoDLIService;
	}

	@Override
	public void setWrappedService(BaoCaoDLIService baoCaoDLIService) {
		_baoCaoDLIService = baoCaoDLIService;
	}

	private BaoCaoDLIService _baoCaoDLIService;
}