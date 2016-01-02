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
 * Provides a wrapper for {@link BaoCaoDLITongHopLocalService}.
 *
 * @author HuyMQ
 * @see BaoCaoDLITongHopLocalService
 * @generated
 */
public class BaoCaoDLITongHopLocalServiceWrapper
	implements BaoCaoDLITongHopLocalService,
		ServiceWrapper<BaoCaoDLITongHopLocalService> {
	public BaoCaoDLITongHopLocalServiceWrapper(
		BaoCaoDLITongHopLocalService baoCaoDLITongHopLocalService) {
		_baoCaoDLITongHopLocalService = baoCaoDLITongHopLocalService;
	}

	/**
	* Adds the bao cao d l i tong hop to the database. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLITongHop the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop addBaoCaoDLITongHop(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.addBaoCaoDLITongHop(baoCaoDLITongHop);
	}

	/**
	* Creates a new bao cao d l i tong hop with the primary key. Does not add the bao cao d l i tong hop to the database.
	*
	* @param id the primary key for the new bao cao d l i tong hop
	* @return the new bao cao d l i tong hop
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop createBaoCaoDLITongHop(
		long id) {
		return _baoCaoDLITongHopLocalService.createBaoCaoDLITongHop(id);
	}

	/**
	* Deletes the bao cao d l i tong hop with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was removed
	* @throws PortalException if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop deleteBaoCaoDLITongHop(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.deleteBaoCaoDLITongHop(id);
	}

	/**
	* Deletes the bao cao d l i tong hop from the database. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLITongHop the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop deleteBaoCaoDLITongHop(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.deleteBaoCaoDLITongHop(baoCaoDLITongHop);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _baoCaoDLITongHopLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchBaoCaoDLITongHop(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.fetchBaoCaoDLITongHop(id);
	}

	/**
	* Returns the bao cao d l i tong hop with the primary key.
	*
	* @param id the primary key of the bao cao d l i tong hop
	* @return the bao cao d l i tong hop
	* @throws PortalException if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop getBaoCaoDLITongHop(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.getBaoCaoDLITongHop(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the bao cao d l i tong hops.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bao cao d l i tong hops
	* @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	* @return the range of bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> getBaoCaoDLITongHops(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.getBaoCaoDLITongHops(start, end);
	}

	/**
	* Returns the number of bao cao d l i tong hops.
	*
	* @return the number of bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBaoCaoDLITongHopsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.getBaoCaoDLITongHopsCount();
	}

	/**
	* Updates the bao cao d l i tong hop in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLITongHop the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop updateBaoCaoDLITongHop(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.updateBaoCaoDLITongHop(baoCaoDLITongHop);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _baoCaoDLITongHopLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_baoCaoDLITongHopLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _baoCaoDLITongHopLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public void initBaoCaoDLITongHop(java.lang.String maTinh, int nam,
		int soDauNoiTheoKeHoach, int soDauNoiMoi, int soNhaTieuHVSTheoKH,
		int soNhaTieuHVSMoi, int soNguoiHuongLoiNuocSach, int soXa,
		int tiLeHGDCoNhaTieu, int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS,
		int tiLeTramYTeHVS, int soNguoiHuongLoiVSTX,
		java.lang.String keHoachPheDuyet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLITongHopLocalService.initBaoCaoDLITongHop(maTinh, nam,
			soDauNoiTheoKeHoach, soDauNoiMoi, soNhaTieuHVSTheoKH,
			soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa, tiLeHGDCoNhaTieu,
			tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS, tiLeTramYTeHVS,
			soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

	@Override
	public void initBaoCaoDLITongHop(int nam, int soDauNoiTheoKeHoach,
		int soDauNoiMoi, int soNhaTieuHVSTheoKH, int soNhaTieuHVSMoi,
		int soNguoiHuongLoiNuocSach, int soXa, int tiLeHGDCoNhaTieu,
		int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS, int tiLeTramYTeHVS,
		int soNguoiHuongLoiVSTX, java.lang.String keHoachPheDuyet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLITongHopLocalService.initBaoCaoDLITongHop(nam,
			soDauNoiTheoKeHoach, soDauNoiMoi, soNhaTieuHVSTheoKH,
			soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa, tiLeHGDCoNhaTieu,
			tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS, tiLeTramYTeHVS,
			soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop addBaoCaoTH(
		java.lang.String maTinh, int nam, int soDauNoiTheoKeHoach,
		int soDauNoiMoi, int soNhaTieuHVSTheoKH, int soNhaTieuHVSMoi,
		int soNguoiHuongLoiNuocSach, int soXa, int tiLeHGDCoNhaTieu,
		int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS, int tiLeTramYTeHVS,
		int soNguoiHuongLoiVSTX, java.lang.String keHoachPheDuyet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLITongHopLocalService.addBaoCaoTH(maTinh, nam,
			soDauNoiTheoKeHoach, soDauNoiMoi, soNhaTieuHVSTheoKH,
			soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa, tiLeHGDCoNhaTieu,
			tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS, tiLeTramYTeHVS,
			soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop getBaoCaoDLITongHopByTinhVaNam(
		java.lang.String maTinh, java.lang.String namBaoCao) {
		return _baoCaoDLITongHopLocalService.getBaoCaoDLITongHopByTinhVaNam(maTinh,
			namBaoCao);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> getListBaoCaoDLITongHopByNamTW(
		java.lang.String namBaoCao) {
		return _baoCaoDLITongHopLocalService.getListBaoCaoDLITongHopByNamTW(namBaoCao);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BaoCaoDLITongHopLocalService getWrappedBaoCaoDLITongHopLocalService() {
		return _baoCaoDLITongHopLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBaoCaoDLITongHopLocalService(
		BaoCaoDLITongHopLocalService baoCaoDLITongHopLocalService) {
		_baoCaoDLITongHopLocalService = baoCaoDLITongHopLocalService;
	}

	@Override
	public BaoCaoDLITongHopLocalService getWrappedService() {
		return _baoCaoDLITongHopLocalService;
	}

	@Override
	public void setWrappedService(
		BaoCaoDLITongHopLocalService baoCaoDLITongHopLocalService) {
		_baoCaoDLITongHopLocalService = baoCaoDLITongHopLocalService;
	}

	private BaoCaoDLITongHopLocalService _baoCaoDLITongHopLocalService;
}