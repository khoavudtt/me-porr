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
 * Provides the local service utility for KeHoachKiemDemVeSinh. This utility wraps
 * {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.KeHoachKiemDemVeSinhLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author BinhTH
 * @see KeHoachKiemDemVeSinhLocalService
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.KeHoachKiemDemVeSinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.KeHoachKiemDemVeSinhLocalServiceImpl
 * @generated
 */
public class KeHoachKiemDemVeSinhLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.KeHoachKiemDemVeSinhLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ke hoach kiem dem ve sinh to the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemVeSinh the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh addKeHoachKiemDemVeSinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh keHoachKiemDemVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
	}

	/**
	* Creates a new ke hoach kiem dem ve sinh with the primary key. Does not add the ke hoach kiem dem ve sinh to the database.
	*
	* @param id the primary key for the new ke hoach kiem dem ve sinh
	* @return the new ke hoach kiem dem ve sinh
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh createKeHoachKiemDemVeSinh(
		int id) {
		return getService().createKeHoachKiemDemVeSinh(id);
	}

	/**
	* Deletes the ke hoach kiem dem ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh that was removed
	* @throws PortalException if a ke hoach kiem dem ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh deleteKeHoachKiemDemVeSinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteKeHoachKiemDemVeSinh(id);
	}

	/**
	* Deletes the ke hoach kiem dem ve sinh from the database. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemVeSinh the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh deleteKeHoachKiemDemVeSinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh keHoachKiemDemVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh fetchKeHoachKiemDemVeSinh(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchKeHoachKiemDemVeSinh(id);
	}

	/**
	* Returns the ke hoach kiem dem ve sinh with the primary key.
	*
	* @param id the primary key of the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh
	* @throws PortalException if a ke hoach kiem dem ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh getKeHoachKiemDemVeSinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getKeHoachKiemDemVeSinh(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ke hoach kiem dem ve sinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach kiem dem ve sinhs
	* @param end the upper bound of the range of ke hoach kiem dem ve sinhs (not inclusive)
	* @return the range of ke hoach kiem dem ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKeHoachKiemDemVeSinhs(start, end);
	}

	/**
	* Returns the number of ke hoach kiem dem ve sinhs.
	*
	* @return the number of ke hoach kiem dem ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int getKeHoachKiemDemVeSinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKeHoachKiemDemVeSinhsCount();
	}

	/**
	* Updates the ke hoach kiem dem ve sinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param keHoachKiemDemVeSinh the ke hoach kiem dem ve sinh
	* @return the ke hoach kiem dem ve sinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh updateKeHoachKiemDemVeSinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh keHoachKiemDemVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
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

	public static int countKeHoachKiemDemVeSinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countKeHoachKiemDemVeSinhSearch(maTinh, maHuyen,
			kiemDemVienId, trangThai);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String trangThai, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getKeHoachKiemDemVeSinhSearch(maTinh, maHuyen,
			kiemDemVienId, trangThai, start, end);
	}

	public static java.util.List<java.lang.String> getHuyenXaKeHoachKiemDemGiaDinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getHuyenXaKeHoachKiemDemGiaDinhSearch(keHoachId, trangThai,
			maTinh, start, end);
	}

	public static java.util.List<java.lang.String> getHuyenXaKeHoachKiemDemCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getHuyenXaKeHoachKiemDemCongTrinhSearch(keHoachId,
			trangThai, maTinh, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getThongTinKeHoachKiemDemVeSinhGdSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getListThongTinGdByKeHoachId(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getListThongTinGdByKeHoachId(keHoachKiemDemVeSinhId);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getListThongTinCongTringByKeHoachId(
		int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getListThongTinCongTringByKeHoachId(keHoachKiemDemVeSinhId);
	}

	public static int countThongTinKeHoachKiemDemVeSinhGdSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countThongTinKeHoachKiemDemVeSinhGdSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}

	public static int countThongTinKeHoachKiemDemVeSinhCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countThongTinKeHoachKiemDemVeSinhCongTrinhSearch(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, java.lang.String nguonDL, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, nguonDL,
			start, end);
	}

	public static int countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, java.lang.String nguonDL, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, nguonDL,
			start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start,
			end);
	}

	public static int countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(keHoachId,
			trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start,
			end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String trangThai,
		java.lang.String idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getKeHoachKiemDemVeSinhSearch(maTinh, maHuyen,
			kiemDemVienId, trangThai, idNguoiTao, start, end);
	}

	public static int countKeHoachKiemDemVeSinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String trangThai, java.lang.String idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countKeHoachKiemDemVeSinhSearch(maTinh, maHuyen,
			kiemDemVienId, trangThai, idNguoiTao);
	}

	public static void clearService() {
		_service = null;
	}

	public static KeHoachKiemDemVeSinhLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					KeHoachKiemDemVeSinhLocalService.class.getName());

			if (invokableLocalService instanceof KeHoachKiemDemVeSinhLocalService) {
				_service = (KeHoachKiemDemVeSinhLocalService)invokableLocalService;
			}
			else {
				_service = new KeHoachKiemDemVeSinhLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(KeHoachKiemDemVeSinhLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(KeHoachKiemDemVeSinhLocalService service) {
	}

	private static KeHoachKiemDemVeSinhLocalService _service;
}