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
 * Provides the local service utility for ThongTinKiemDemHoGD. This utility wraps
 * {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.ThongTinKiemDemHoGDLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author BinhTH
 * @see ThongTinKiemDemHoGDLocalService
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.ThongTinKiemDemHoGDLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.ThongTinKiemDemHoGDLocalServiceImpl
 * @generated
 */
public class ThongTinKiemDemHoGDLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.ThongTinKiemDemHoGDLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the thong tin kiem dem ho g d to the database. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemHoGD the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD addThongTinKiemDemHoGD(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addThongTinKiemDemHoGD(thongTinKiemDemHoGD);
	}

	/**
	* Creates a new thong tin kiem dem ho g d with the primary key. Does not add the thong tin kiem dem ho g d to the database.
	*
	* @param id the primary key for the new thong tin kiem dem ho g d
	* @return the new thong tin kiem dem ho g d
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD createThongTinKiemDemHoGD(
		int id) {
		return getService().createThongTinKiemDemHoGD(id);
	}

	/**
	* Deletes the thong tin kiem dem ho g d with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was removed
	* @throws PortalException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD deleteThongTinKiemDemHoGD(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteThongTinKiemDemHoGD(id);
	}

	/**
	* Deletes the thong tin kiem dem ho g d from the database. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemHoGD the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD deleteThongTinKiemDemHoGD(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteThongTinKiemDemHoGD(thongTinKiemDemHoGD);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD fetchThongTinKiemDemHoGD(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchThongTinKiemDemHoGD(id);
	}

	/**
	* Returns the thong tin kiem dem ho g d with the primary key.
	*
	* @param id the primary key of the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d
	* @throws PortalException if a thong tin kiem dem ho g d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD getThongTinKiemDemHoGD(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getThongTinKiemDemHoGD(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the thong tin kiem dem ho g ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of thong tin kiem dem ho g ds
	* @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	* @return the range of thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKiemDemHoGDs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getThongTinKiemDemHoGDs(start, end);
	}

	/**
	* Returns the number of thong tin kiem dem ho g ds.
	*
	* @return the number of thong tin kiem dem ho g ds
	* @throws SystemException if a system exception occurred
	*/
	public static int getThongTinKiemDemHoGDsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getThongTinKiemDemHoGDsCount();
	}

	/**
	* Updates the thong tin kiem dem ho g d in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thongTinKiemDemHoGD the thong tin kiem dem ho g d
	* @return the thong tin kiem dem ho g d that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD updateThongTinKiemDemHoGD(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateThongTinKiemDemHoGD(thongTinKiemDemHoGD);
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

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByGDID(
		int veSinhGiaDinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getListThongTinKiemDemHoGiaDinhByGDID(veSinhGiaDinhId,
			start, end);
	}

	public static int getCountGiaDinhBykeHoachId(int keHoachKiemDemVeSinhId,
		int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCountGiaDinhBykeHoachId(keHoachKiemDemVeSinhId,
			daKetThucDieuTra);
	}

	public static int getCountGiaDinhBykeHoachIdDanhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCountGiaDinhBykeHoachIdDanhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem);
	}

	public static int getCountCoNhaVeSinh(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCountCoNhaVeSinh(keHoachKiemDemVeSinhId);
	}

	public static int getCountcoHVS(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCountcoHVS(keHoachKiemDemVeSinhId);
	}

	public static int getCountcoHVSXayMoi(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCountcoHVSXayMoi(keHoachKiemDemVeSinhId);
	}

	public static int getSumHDGBykeHoachKiemDemVsId(int keHoachKiemDemVeSinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSumHDGBykeHoachKiemDemVsId(keHoachKiemDemVeSinhId);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThucGroupBy(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getThongTinKiemDemHGDThoiGianThucGroupBy(maTinh, namBaoCao,
			danhgiakiemdem);
	}

	public static int countThongTinKiemDemHGDThoiGianThucGroupBy(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem, java.lang.String maHuyen,
		java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countThongTinKiemDemHGDThoiGianThucGroupBy(maTinh,
			namBaoCao, danhgiakiemdem, maHuyen, maXa);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThuc(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getThongTinKiemDemHGDThoiGianThuc(maTinh, namBaoCao,
			danhgiakiemdem);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByKeHoachId(
		int keHoachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getListThongTinKiemDemHoGiaDinhByKeHoachId(keHoachId);
	}

	public static int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String gioiTinhChuHo,
		java.lang.String danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countGioiTinhChuHo(maTinh, namBaoCao, gioiTinhChuHo,
			danhGiaKiemDem);
	}

	public static void clearService() {
		_service = null;
	}

	public static ThongTinKiemDemHoGDLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ThongTinKiemDemHoGDLocalService.class.getName());

			if (invokableLocalService instanceof ThongTinKiemDemHoGDLocalService) {
				_service = (ThongTinKiemDemHoGDLocalService)invokableLocalService;
			}
			else {
				_service = new ThongTinKiemDemHoGDLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ThongTinKiemDemHoGDLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ThongTinKiemDemHoGDLocalService service) {
	}

	private static ThongTinKiemDemHoGDLocalService _service;
}