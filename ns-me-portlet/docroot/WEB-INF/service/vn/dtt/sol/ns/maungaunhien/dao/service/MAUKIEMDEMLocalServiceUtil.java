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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MAUKIEMDEM. This utility wraps
 * {@link vn.dtt.sol.ns.maungaunhien.dao.service.impl.MAUKIEMDEMLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoa.vu
 * @see MAUKIEMDEMLocalService
 * @see vn.dtt.sol.ns.maungaunhien.dao.service.base.MAUKIEMDEMLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.maungaunhien.dao.service.impl.MAUKIEMDEMLocalServiceImpl
 * @generated
 */
public class MAUKIEMDEMLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.maungaunhien.dao.service.impl.MAUKIEMDEMLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the m a u k i e m d e m to the database. Also notifies the appropriate model listeners.
	*
	* @param maukiemdem the m a u k i e m d e m
	* @return the m a u k i e m d e m that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM addMAUKIEMDEM(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMAUKIEMDEM(maukiemdem);
	}

	/**
	* Creates a new m a u k i e m d e m with the primary key. Does not add the m a u k i e m d e m to the database.
	*
	* @param id the primary key for the new m a u k i e m d e m
	* @return the new m a u k i e m d e m
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM createMAUKIEMDEM(
		long id) {
		return getService().createMAUKIEMDEM(id);
	}

	/**
	* Deletes the m a u k i e m d e m with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m that was removed
	* @throws PortalException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM deleteMAUKIEMDEM(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMAUKIEMDEM(id);
	}

	/**
	* Deletes the m a u k i e m d e m from the database. Also notifies the appropriate model listeners.
	*
	* @param maukiemdem the m a u k i e m d e m
	* @return the m a u k i e m d e m that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM deleteMAUKIEMDEM(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMAUKIEMDEM(maukiemdem);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchMAUKIEMDEM(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMAUKIEMDEM(id);
	}

	/**
	* Returns the m a u k i e m d e m with the primary key.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m
	* @throws PortalException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM getMAUKIEMDEM(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMAUKIEMDEM(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> getMAUKIEMDEMs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMAUKIEMDEMs(start, end);
	}

	/**
	* Returns the number of m a u k i e m d e ms.
	*
	* @return the number of m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static int getMAUKIEMDEMsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMAUKIEMDEMsCount();
	}

	/**
	* Updates the m a u k i e m d e m in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param maukiemdem the m a u k i e m d e m
	* @return the m a u k i e m d e m that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateMAUKIEMDEM(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMAUKIEMDEM(maukiemdem);
	}

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

	public static int countByTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countByTinh(maTinh);
	}

	public static int countByHuyen(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countByHuyen(maHuyen);
	}

	public static int countAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countAll();
	}

	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM getMauKiemDemByTHXN(
		java.lang.String maTinh, java.lang.String maXa,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMauKiemDemByTHXN(maTinh, maXa, maHuyen, nam);
	}

	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findMKD(
		int nam, java.lang.String tinh, java.lang.String huyen,
		java.lang.String xa, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findMKD(nam, tinh, huyen, xa, start, end);
	}

	public static int countMKD(int nam, java.lang.String tinh,
		java.lang.String huyen, java.lang.String xa)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countMKD(nam, tinh, huyen, xa);
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
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateMauKiemDem(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam, int soMauHVS, int soMauCoNhaTieu,
		int soMauKiemDem, com.liferay.portal.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateMauKiemDem(maTinh, maHuyen, maXa, nam, soMauHVS,
			soMauCoNhaTieu, soMauKiemDem, context);
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
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateMauKiemDem(
		long id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam, int tongSoHGD, int tongSoMau,
		int soMauNgauNhien, int soMauDuPhong,
		com.liferay.portal.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateMauKiemDem(id, maTinh, maHuyen, maXa, nam, tongSoHGD,
			tongSoMau, soMauNgauNhien, soMauDuPhong, context);
	}

	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateMauKiemDem(
		long id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam, int tongSoHGD, int tongSoMau,
		int soMauHVS, int soMauCoNhaTieu, int soMauKiemDem,
		com.liferay.portal.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateMauKiemDem(id, maTinh, maHuyen, maXa, nam, tongSoHGD,
			tongSoMau, soMauHVS, soMauCoNhaTieu, soMauKiemDem, context);
	}

	public static void clearService() {
		_service = null;
	}

	public static MAUKIEMDEMLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MAUKIEMDEMLocalService.class.getName());

			if (invokableLocalService instanceof MAUKIEMDEMLocalService) {
				_service = (MAUKIEMDEMLocalService)invokableLocalService;
			}
			else {
				_service = new MAUKIEMDEMLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MAUKIEMDEMLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MAUKIEMDEMLocalService service) {
	}

	private static MAUKIEMDEMLocalService _service;
}