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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ThongTinKiemDemCongTrinh. This utility wraps
 * {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.ThongTinKiemDemCongTrinhLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author BinhTH
 * @see ThongTinKiemDemCongTrinhLocalService
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.ThongTinKiemDemCongTrinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.ThongTinKiemDemCongTrinhLocalServiceImpl
 * @generated
 */
public class ThongTinKiemDemCongTrinhLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.ThongTinKiemDemCongTrinhLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the thong tin kiem dem cong trinh to the database. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh addThongTinKiemDemCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addThongTinKiemDemCongTrinh(thongTinKiemDemCongTrinh);
	}

	/**
	* Creates a new thong tin kiem dem cong trinh with the primary key. Does not add the thong tin kiem dem cong trinh to the database.
	*
	* @param id the primary key for the new thong tin kiem dem cong trinh
	* @return the new thong tin kiem dem cong trinh
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh createThongTinKiemDemCongTrinh(
		int id) {
		return getService().createThongTinKiemDemCongTrinh(id);
	}

	/**
	* Deletes the thong tin kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was removed
	* @throws PortalException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh deleteThongTinKiemDemCongTrinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteThongTinKiemDemCongTrinh(id);
	}

	/**
	* Deletes the thong tin kiem dem cong trinh from the database. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh deleteThongTinKiemDemCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteThongTinKiemDemCongTrinh(thongTinKiemDemCongTrinh);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh fetchThongTinKiemDemCongTrinh(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchThongTinKiemDemCongTrinh(id);
	}

	/**
	* Returns the thong tin kiem dem cong trinh with the primary key.
	*
	* @param id the primary key of the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh
	* @throws PortalException if a thong tin kiem dem cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh getThongTinKiemDemCongTrinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getThongTinKiemDemCongTrinh(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the thong tin kiem dem cong trinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of thong tin kiem dem cong trinhs
	* @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	* @return the range of thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getThongTinKiemDemCongTrinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getThongTinKiemDemCongTrinhs(start, end);
	}

	/**
	* Returns the number of thong tin kiem dem cong trinhs.
	*
	* @return the number of thong tin kiem dem cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int getThongTinKiemDemCongTrinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getThongTinKiemDemCongTrinhsCount();
	}

	/**
	* Updates the thong tin kiem dem cong trinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	* @return the thong tin kiem dem cong trinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh updateThongTinKiemDemCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateThongTinKiemDemCongTrinh(thongTinKiemDemCongTrinh);
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

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByCTID(
		int veSinhGiaDinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getListThongTinKiemDemCongTrinhByCTID(veSinhGiaDinhId,
			start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByGDID(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getListThongTinKiemDemCongTrinhByGDID(keHoachKiemDemVeSinhId,
			start, end);
	}

	public static int getCountCongTrinhBykeHoachId(int keHoachKiemDemVeSinhId,
		int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCountCongTrinhBykeHoachId(keHoachKiemDemVeSinhId,
			daKetThucDieuTra);
	}

	public static int getCountCongTrinhBykeHoachIdDanhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCountCongTrinhBykeHoachIdDanhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem);
	}

	public static int getSumCtBykeHoachKiemDemVsId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSumCtBykeHoachKiemDemVsId(keHoachKiemDemVeSinhId);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByKeHoachId(
		int keHoachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getListThongTinKiemDemCongTrinhByKeHoachId(keHoachId);
	}

	public static void clearService() {
		_service = null;
	}

	public static ThongTinKiemDemCongTrinhLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ThongTinKiemDemCongTrinhLocalService.class.getName());

			if (invokableLocalService instanceof ThongTinKiemDemCongTrinhLocalService) {
				_service = (ThongTinKiemDemCongTrinhLocalService)invokableLocalService;
			}
			else {
				_service = new ThongTinKiemDemCongTrinhLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ThongTinKiemDemCongTrinhLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ThongTinKiemDemCongTrinhLocalService service) {
	}

	private static ThongTinKiemDemCongTrinhLocalService _service;
}