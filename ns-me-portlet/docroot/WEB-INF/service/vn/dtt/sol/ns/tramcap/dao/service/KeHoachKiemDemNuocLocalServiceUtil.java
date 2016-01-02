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

package vn.dtt.sol.ns.tramcap.dao.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for KeHoachKiemDemNuoc. This utility wraps
 * {@link vn.dtt.sol.ns.tramcap.dao.service.impl.KeHoachKiemDemNuocLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoa.vu
 * @see KeHoachKiemDemNuocLocalService
 * @see vn.dtt.sol.ns.tramcap.dao.service.base.KeHoachKiemDemNuocLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.tramcap.dao.service.impl.KeHoachKiemDemNuocLocalServiceImpl
 * @generated
 */
public class KeHoachKiemDemNuocLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.tramcap.dao.service.impl.KeHoachKiemDemNuocLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ke hoach kiem dem nuoc to the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemNuoc the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc addKeHoachKiemDemNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addKeHoachKiemDemNuoc(keHoachKiemDemNuoc);
	}

	/**
	* Creates a new ke hoach kiem dem nuoc with the primary key. Does not add the ke hoach kiem dem nuoc to the database.
	*
	* @param id the primary key for the new ke hoach kiem dem nuoc
	* @return the new ke hoach kiem dem nuoc
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc createKeHoachKiemDemNuoc(
		int id) {
		return getService().createKeHoachKiemDemNuoc(id);
	}

	/**
	* Deletes the ke hoach kiem dem nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was removed
	* @throws PortalException if a ke hoach kiem dem nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc deleteKeHoachKiemDemNuoc(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteKeHoachKiemDemNuoc(id);
	}

	/**
	* Deletes the ke hoach kiem dem nuoc from the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemNuoc the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc deleteKeHoachKiemDemNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteKeHoachKiemDemNuoc(keHoachKiemDemNuoc);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc fetchKeHoachKiemDemNuoc(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchKeHoachKiemDemNuoc(id);
	}

	/**
	* Returns the ke hoach kiem dem nuoc with the primary key.
	*
	* @param id the primary key of the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc
	* @throws PortalException if a ke hoach kiem dem nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc getKeHoachKiemDemNuoc(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getKeHoachKiemDemNuoc(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ke hoach kiem dem nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach kiem dem nuocs
	* @param end the upper bound of the range of ke hoach kiem dem nuocs (not inclusive)
	* @return the range of ke hoach kiem dem nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKeHoachKiemDemNuocs(start, end);
	}

	/**
	* Returns the number of ke hoach kiem dem nuocs.
	*
	* @return the number of ke hoach kiem dem nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static int getKeHoachKiemDemNuocsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKeHoachKiemDemNuocsCount();
	}

	/**
	* Updates the ke hoach kiem dem nuoc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemNuoc the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc updateKeHoachKiemDemNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateKeHoachKiemDemNuoc(keHoachKiemDemNuoc);
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

	public static int countKeHoachKiemDemNuocSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String tramCapNuocId, java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countKeHoachKiemDemNuocSearch(maTinh, maHuyen,
			kiemDemVienId, tramCapNuocId, trangThai);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getKeHoachKiemDemNuocSearch(maTinh, maHuyen, kiemDemVienId,
			tramCapNuocId, trangThai, start, end);
	}

	public static int countKeHoachKiemDemNuocSearchNam(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String nam,
		java.lang.String idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countKeHoachKiemDemNuocSearchNam(maTinh, maHuyen,
			kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearchNam(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String nam,
		java.lang.String idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getKeHoachKiemDemNuocSearchNam(maTinh, maHuyen,
			kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static KeHoachKiemDemNuocLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					KeHoachKiemDemNuocLocalService.class.getName());

			if (invokableLocalService instanceof KeHoachKiemDemNuocLocalService) {
				_service = (KeHoachKiemDemNuocLocalService)invokableLocalService;
			}
			else {
				_service = new KeHoachKiemDemNuocLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(KeHoachKiemDemNuocLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(KeHoachKiemDemNuocLocalService service) {
	}

	private static KeHoachKiemDemNuocLocalService _service;
}