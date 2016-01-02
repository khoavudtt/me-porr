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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BaoCaoDLITongHop. This utility wraps
 * {@link vn.dtt.sol.ns.baocaodli.dao.service.impl.BaoCaoDLITongHopLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author HuyMQ
 * @see BaoCaoDLITongHopLocalService
 * @see vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLITongHopLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.baocaodli.dao.service.impl.BaoCaoDLITongHopLocalServiceImpl
 * @generated
 */
public class BaoCaoDLITongHopLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.baocaodli.dao.service.impl.BaoCaoDLITongHopLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the bao cao d l i tong hop to the database. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLITongHop the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop addBaoCaoDLITongHop(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBaoCaoDLITongHop(baoCaoDLITongHop);
	}

	/**
	* Creates a new bao cao d l i tong hop with the primary key. Does not add the bao cao d l i tong hop to the database.
	*
	* @param id the primary key for the new bao cao d l i tong hop
	* @return the new bao cao d l i tong hop
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop createBaoCaoDLITongHop(
		long id) {
		return getService().createBaoCaoDLITongHop(id);
	}

	/**
	* Deletes the bao cao d l i tong hop with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was removed
	* @throws PortalException if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop deleteBaoCaoDLITongHop(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBaoCaoDLITongHop(id);
	}

	/**
	* Deletes the bao cao d l i tong hop from the database. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLITongHop the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop deleteBaoCaoDLITongHop(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBaoCaoDLITongHop(baoCaoDLITongHop);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchBaoCaoDLITongHop(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBaoCaoDLITongHop(id);
	}

	/**
	* Returns the bao cao d l i tong hop with the primary key.
	*
	* @param id the primary key of the bao cao d l i tong hop
	* @return the bao cao d l i tong hop
	* @throws PortalException if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop getBaoCaoDLITongHop(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBaoCaoDLITongHop(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> getBaoCaoDLITongHops(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBaoCaoDLITongHops(start, end);
	}

	/**
	* Returns the number of bao cao d l i tong hops.
	*
	* @return the number of bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public static int getBaoCaoDLITongHopsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBaoCaoDLITongHopsCount();
	}

	/**
	* Updates the bao cao d l i tong hop in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param baoCaoDLITongHop the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop updateBaoCaoDLITongHop(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBaoCaoDLITongHop(baoCaoDLITongHop);
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

	public static void initBaoCaoDLITongHop(java.lang.String maTinh, int nam,
		int soDauNoiTheoKeHoach, int soDauNoiMoi, int soNhaTieuHVSTheoKH,
		int soNhaTieuHVSMoi, int soNguoiHuongLoiNuocSach, int soXa,
		int tiLeHGDCoNhaTieu, int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS,
		int tiLeTramYTeHVS, int soNguoiHuongLoiVSTX,
		java.lang.String keHoachPheDuyet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.initBaoCaoDLITongHop(maTinh, nam, soDauNoiTheoKeHoach,
			soDauNoiMoi, soNhaTieuHVSTheoKH, soNhaTieuHVSMoi,
			soNguoiHuongLoiNuocSach, soXa, tiLeHGDCoNhaTieu,
			tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS, tiLeTramYTeHVS,
			soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

	public static void initBaoCaoDLITongHop(int nam, int soDauNoiTheoKeHoach,
		int soDauNoiMoi, int soNhaTieuHVSTheoKH, int soNhaTieuHVSMoi,
		int soNguoiHuongLoiNuocSach, int soXa, int tiLeHGDCoNhaTieu,
		int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS, int tiLeTramYTeHVS,
		int soNguoiHuongLoiVSTX, java.lang.String keHoachPheDuyet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.initBaoCaoDLITongHop(nam, soDauNoiTheoKeHoach, soDauNoiMoi,
			soNhaTieuHVSTheoKH, soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa,
			tiLeHGDCoNhaTieu, tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS,
			tiLeTramYTeHVS, soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop addBaoCaoTH(
		java.lang.String maTinh, int nam, int soDauNoiTheoKeHoach,
		int soDauNoiMoi, int soNhaTieuHVSTheoKH, int soNhaTieuHVSMoi,
		int soNguoiHuongLoiNuocSach, int soXa, int tiLeHGDCoNhaTieu,
		int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS, int tiLeTramYTeHVS,
		int soNguoiHuongLoiVSTX, java.lang.String keHoachPheDuyet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addBaoCaoTH(maTinh, nam, soDauNoiTheoKeHoach, soDauNoiMoi,
			soNhaTieuHVSTheoKH, soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa,
			tiLeHGDCoNhaTieu, tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS,
			tiLeTramYTeHVS, soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop getBaoCaoDLITongHopByTinhVaNam(
		java.lang.String maTinh, java.lang.String namBaoCao) {
		return getService().getBaoCaoDLITongHopByTinhVaNam(maTinh, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> getListBaoCaoDLITongHopByNamTW(
		java.lang.String namBaoCao) {
		return getService().getListBaoCaoDLITongHopByNamTW(namBaoCao);
	}

	public static void clearService() {
		_service = null;
	}

	public static BaoCaoDLITongHopLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BaoCaoDLITongHopLocalService.class.getName());

			if (invokableLocalService instanceof BaoCaoDLITongHopLocalService) {
				_service = (BaoCaoDLITongHopLocalService)invokableLocalService;
			}
			else {
				_service = new BaoCaoDLITongHopLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BaoCaoDLITongHopLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BaoCaoDLITongHopLocalService service) {
	}

	private static BaoCaoDLITongHopLocalService _service;
}