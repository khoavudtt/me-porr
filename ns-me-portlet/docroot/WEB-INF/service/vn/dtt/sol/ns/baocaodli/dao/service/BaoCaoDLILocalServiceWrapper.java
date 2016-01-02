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
 * Provides a wrapper for {@link BaoCaoDLILocalService}.
 *
 * @author HuyMQ
 * @see BaoCaoDLILocalService
 * @generated
 */
public class BaoCaoDLILocalServiceWrapper implements BaoCaoDLILocalService,
	ServiceWrapper<BaoCaoDLILocalService> {
	public BaoCaoDLILocalServiceWrapper(
		BaoCaoDLILocalService baoCaoDLILocalService) {
		_baoCaoDLILocalService = baoCaoDLILocalService;
	}

	/**
	* Adds the bao cao d l i to the database. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the bao cao d l i that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI addBaoCaoDLI(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.addBaoCaoDLI(baoCaoDLI);
	}

	/**
	* Creates a new bao cao d l i with the primary key. Does not add the bao cao d l i to the database.
	*
	* @param id the primary key for the new bao cao d l i
	* @return the new bao cao d l i
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI createBaoCaoDLI(long id) {
		return _baoCaoDLILocalService.createBaoCaoDLI(id);
	}

	/**
	* Deletes the bao cao d l i with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bao cao d l i
	* @return the bao cao d l i that was removed
	* @throws PortalException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI deleteBaoCaoDLI(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.deleteBaoCaoDLI(id);
	}

	/**
	* Deletes the bao cao d l i from the database. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the bao cao d l i that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI deleteBaoCaoDLI(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.deleteBaoCaoDLI(baoCaoDLI);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _baoCaoDLILocalService.dynamicQuery();
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
		return _baoCaoDLILocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _baoCaoDLILocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _baoCaoDLILocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _baoCaoDLILocalService.dynamicQueryCount(dynamicQuery);
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
		return _baoCaoDLILocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchBaoCaoDLI(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.fetchBaoCaoDLI(id);
	}

	/**
	* Returns the bao cao d l i with the primary key.
	*
	* @param id the primary key of the bao cao d l i
	* @return the bao cao d l i
	* @throws PortalException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI getBaoCaoDLI(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.getBaoCaoDLI(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the bao cao d l is.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @return the range of bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> getBaoCaoDLIs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.getBaoCaoDLIs(start, end);
	}

	/**
	* Returns the number of bao cao d l is.
	*
	* @return the number of bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBaoCaoDLIsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.getBaoCaoDLIsCount();
	}

	/**
	* Updates the bao cao d l i in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the bao cao d l i that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI updateBaoCaoDLI(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.updateBaoCaoDLI(baoCaoDLI);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _baoCaoDLILocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_baoCaoDLILocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _baoCaoDLILocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public boolean hasInitBaoCaoTongHop()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.hasInitBaoCaoTongHop();
	}

	@Override
	public void initBaoCao(int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLILocalService.initBaoCao(nam);
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI addBaoCao(int nam,
		java.lang.String maTinh, int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.addBaoCao(nam, maTinh, loaiBaoCao);
	}

	@Override
	public void deleteBaoCao(long baoCaoDLIId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLILocalService.deleteBaoCao(baoCaoDLIId);
	}

	/**
	* Khi xoa se empty het du lieu cua bao cao
	*/
	@Override
	public void deleteBaoCao(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLILocalService.deleteBaoCao(baoCaoDLI);
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI updateBaoCao(
		long userId, long groupId, long baoCaoDLIId, int nam,
		java.lang.String maTinh, java.lang.String soBaoCao,
		java.lang.String nguoiLap, java.lang.String nguoiDuyet,
		int ngayBaoCaoMonth, int ngayBaoCaoDay, int ngayBaoCaoYear,
		long folderId, java.io.File luuTruPDF1, java.io.File luuTruPDF2,
		java.io.File luuTruCSV1, java.io.File luuTruCSV2, int trangThai,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.updateBaoCao(userId, groupId,
			baoCaoDLIId, nam, maTinh, soBaoCao, nguoiLap, nguoiDuyet,
			ngayBaoCaoMonth, ngayBaoCaoDay, ngayBaoCaoYear, folderId,
			luuTruPDF1, luuTruPDF2, luuTruCSV1, luuTruCSV2, trangThai,
			serviceContext);
	}

	/**
	* @param maTinh
	* @return
	* @throws SystemException
	*/
	@Override
	public int countByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.countByMaTinh(maTinh);
	}

	/**
	* @param nam
	* @return
	* @throws SystemException
	*/
	@Override
	public int countByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.countByNam(nam);
	}

	/**
	* @param maTinh
	* @param nam
	* @return
	* @throws SystemException
	*/
	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI getByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.getByMaTinh_Nam(maTinh, nam);
	}

	/**
	* @param maTinh
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> getByMaTinh(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.getByMaTinh(maTinh, start, end, obc);
	}

	/**
	* @param nam
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> getByNam(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.getByNam(nam, start, end, obc);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> search(
		java.lang.String maTinh, int loaiBaoCao, int nam,
		java.lang.Integer trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.search(maTinh, loaiBaoCao, nam,
			trangThai, start, end, obc);
	}

	@Override
	public int searchCount(java.lang.String maTinh, int loaiBaoCao, int nam,
		java.lang.Integer trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.searchCount(maTinh, loaiBaoCao, nam,
			trangThai);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> search(
		java.lang.String maTinh, int nam, java.lang.Integer trangThai,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.search(maTinh, nam, trangThai, start,
			end, obc);
	}

	@Override
	public int searchCount(java.lang.String maTinh, int nam,
		java.lang.Integer trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _baoCaoDLILocalService.searchCount(maTinh, nam, trangThai);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BaoCaoDLILocalService getWrappedBaoCaoDLILocalService() {
		return _baoCaoDLILocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBaoCaoDLILocalService(
		BaoCaoDLILocalService baoCaoDLILocalService) {
		_baoCaoDLILocalService = baoCaoDLILocalService;
	}

	@Override
	public BaoCaoDLILocalService getWrappedService() {
		return _baoCaoDLILocalService;
	}

	@Override
	public void setWrappedService(BaoCaoDLILocalService baoCaoDLILocalService) {
		_baoCaoDLILocalService = baoCaoDLILocalService;
	}

	private BaoCaoDLILocalService _baoCaoDLILocalService;
}