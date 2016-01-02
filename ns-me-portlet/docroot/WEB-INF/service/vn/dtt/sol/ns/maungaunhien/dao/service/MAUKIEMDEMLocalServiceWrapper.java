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

package vn.dtt.sol.ns.maungaunhien.dao.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MAUKIEMDEMLocalService}.
 *
 * @author khoa.vu
 * @see MAUKIEMDEMLocalService
 * @generated
 */
public class MAUKIEMDEMLocalServiceWrapper implements MAUKIEMDEMLocalService,
	ServiceWrapper<MAUKIEMDEMLocalService> {
	public MAUKIEMDEMLocalServiceWrapper(
		MAUKIEMDEMLocalService maukiemdemLocalService) {
		_maukiemdemLocalService = maukiemdemLocalService;
	}

	/**
	* Adds the m a u k i e m d e m to the database. Also notifies the appropriate model listeners.
	*
	* @param maukiemdem the m a u k i e m d e m
	* @return the m a u k i e m d e m that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM addMAUKIEMDEM(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.addMAUKIEMDEM(maukiemdem);
	}

	/**
	* Creates a new m a u k i e m d e m with the primary key. Does not add the m a u k i e m d e m to the database.
	*
	* @param id the primary key for the new m a u k i e m d e m
	* @return the new m a u k i e m d e m
	*/
	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM createMAUKIEMDEM(
		long id) {
		return _maukiemdemLocalService.createMAUKIEMDEM(id);
	}

	/**
	* Deletes the m a u k i e m d e m with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m that was removed
	* @throws PortalException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM deleteMAUKIEMDEM(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.deleteMAUKIEMDEM(id);
	}

	/**
	* Deletes the m a u k i e m d e m from the database. Also notifies the appropriate model listeners.
	*
	* @param maukiemdem the m a u k i e m d e m
	* @return the m a u k i e m d e m that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM deleteMAUKIEMDEM(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.deleteMAUKIEMDEM(maukiemdem);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _maukiemdemLocalService.dynamicQuery();
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
		return _maukiemdemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _maukiemdemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _maukiemdemLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _maukiemdemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _maukiemdemLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchMAUKIEMDEM(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.fetchMAUKIEMDEM(id);
	}

	/**
	* Returns the m a u k i e m d e m with the primary key.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m
	* @throws PortalException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM getMAUKIEMDEM(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.getMAUKIEMDEM(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the m a u k i e m d e ms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of m a u k i e m d e ms
	* @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	* @return the range of m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> getMAUKIEMDEMs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.getMAUKIEMDEMs(start, end);
	}

	/**
	* Returns the number of m a u k i e m d e ms.
	*
	* @return the number of m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMAUKIEMDEMsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.getMAUKIEMDEMsCount();
	}

	/**
	* Updates the m a u k i e m d e m in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param maukiemdem the m a u k i e m d e m
	* @return the m a u k i e m d e m that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateMAUKIEMDEM(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.updateMAUKIEMDEM(maukiemdem);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _maukiemdemLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_maukiemdemLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _maukiemdemLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int countByTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.countByTinh(maTinh);
	}

	@Override
	public int countByHuyen(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.countByHuyen(maHuyen);
	}

	@Override
	public int countAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.countAll();
	}

	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM getMauKiemDemByTHXN(
		java.lang.String maTinh, java.lang.String maXa,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.getMauKiemDemByTHXN(maTinh, maXa,
			maHuyen, nam);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findMKD(
		int nam, java.lang.String tinh, java.lang.String huyen,
		java.lang.String xa, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.findMKD(nam, tinh, huyen, xa, start, end);
	}

	@Override
	public int countMKD(int nam, java.lang.String tinh, java.lang.String huyen,
		java.lang.String xa)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.countMKD(nam, tinh, huyen, xa);
	}

	/**
	* Cap nhat soMauCoNhaTieu, soMauDaKiemDem, soMauSoNhaTieuHVS
	*
	* @param maTinh
	* @param maHuyen
	* @param maXa
	* @param nam
	* @param soMauHVS
	* @param soMauCoNhaTieu
	* @param soMauKiemDem
	* @param context
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateMauKiemDem(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam, int soMauHVS, int soMauCoNhaTieu,
		int soMauKiemDem, com.liferay.portal.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.updateMauKiemDem(maTinh, maHuyen, maXa,
			nam, soMauHVS, soMauCoNhaTieu, soMauKiemDem, context);
	}

	/**
	* @param id
	* @param maTinh
	* @param maHuyen
	* @param maXa
	* @param nam
	* @param tongSoHGD
	* @param tongSoMau
	* @param soMauNgauNhien
	* @param soMauDuPhong
	* @param context
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateMauKiemDem(
		long id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam, int tongSoHGD, int tongSoMau,
		int soMauNgauNhien, int soMauDuPhong,
		com.liferay.portal.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.updateMauKiemDem(id, maTinh, maHuyen,
			maXa, nam, tongSoHGD, tongSoMau, soMauNgauNhien, soMauDuPhong,
			context);
	}

	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateMauKiemDem(
		long id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam, int tongSoHGD, int tongSoMau,
		int soMauHVS, int soMauCoNhaTieu, int soMauKiemDem,
		com.liferay.portal.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdemLocalService.updateMauKiemDem(id, maTinh, maHuyen,
			maXa, nam, tongSoHGD, tongSoMau, soMauHVS, soMauCoNhaTieu,
			soMauKiemDem, context);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MAUKIEMDEMLocalService getWrappedMAUKIEMDEMLocalService() {
		return _maukiemdemLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMAUKIEMDEMLocalService(
		MAUKIEMDEMLocalService maukiemdemLocalService) {
		_maukiemdemLocalService = maukiemdemLocalService;
	}

	@Override
	public MAUKIEMDEMLocalService getWrappedService() {
		return _maukiemdemLocalService;
	}

	@Override
	public void setWrappedService(MAUKIEMDEMLocalService maukiemdemLocalService) {
		_maukiemdemLocalService = maukiemdemLocalService;
	}

	private MAUKIEMDEMLocalService _maukiemdemLocalService;
}