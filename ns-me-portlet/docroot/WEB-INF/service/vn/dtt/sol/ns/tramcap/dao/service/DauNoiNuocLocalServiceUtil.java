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
 * Provides the local service utility for DauNoiNuoc. This utility wraps
 * {@link vn.dtt.sol.ns.tramcap.dao.service.impl.DauNoiNuocLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoa.vu
 * @see DauNoiNuocLocalService
 * @see vn.dtt.sol.ns.tramcap.dao.service.base.DauNoiNuocLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.tramcap.dao.service.impl.DauNoiNuocLocalServiceImpl
 * @generated
 */
public class DauNoiNuocLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.tramcap.dao.service.impl.DauNoiNuocLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dau noi nuoc to the database. Also notifies the appropriate model listeners.
	*
	* @param dauNoiNuoc the dau noi nuoc
	* @return the dau noi nuoc that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc addDauNoiNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDauNoiNuoc(dauNoiNuoc);
	}

	/**
	* Creates a new dau noi nuoc with the primary key. Does not add the dau noi nuoc to the database.
	*
	* @param id the primary key for the new dau noi nuoc
	* @return the new dau noi nuoc
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc createDauNoiNuoc(
		long id) {
		return getService().createDauNoiNuoc(id);
	}

	/**
	* Deletes the dau noi nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dau noi nuoc
	* @return the dau noi nuoc that was removed
	* @throws PortalException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc deleteDauNoiNuoc(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDauNoiNuoc(id);
	}

	/**
	* Deletes the dau noi nuoc from the database. Also notifies the appropriate model listeners.
	*
	* @param dauNoiNuoc the dau noi nuoc
	* @return the dau noi nuoc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc deleteDauNoiNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDauNoiNuoc(dauNoiNuoc);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc fetchDauNoiNuoc(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDauNoiNuoc(id);
	}

	/**
	* Returns the dau noi nuoc with the primary key.
	*
	* @param id the primary key of the dau noi nuoc
	* @return the dau noi nuoc
	* @throws PortalException if a dau noi nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc getDauNoiNuoc(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDauNoiNuoc(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dau noi nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dau noi nuocs
	* @param end the upper bound of the range of dau noi nuocs (not inclusive)
	* @return the range of dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiNuocs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDauNoiNuocs(start, end);
	}

	/**
	* Returns the number of dau noi nuocs.
	*
	* @return the number of dau noi nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static int getDauNoiNuocsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDauNoiNuocsCount();
	}

	/**
	* Updates the dau noi nuoc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dauNoiNuoc the dau noi nuoc
	* @return the dau noi nuoc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc updateDauNoiNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDauNoiNuoc(dauNoiNuoc);
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

	public static vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc addNamBaoCao(
		long id, int nambaocao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addNamBaoCao(id, nambaocao);
	}

	/**
	* @param tramCapId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static int countSoNguoiHuongLoi(int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countSoNguoiHuongLoi(tramCapId);
	}

	public static int countDauNoiByTram(int tramCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDauNoiByTram(tramCapId);
	}

	public static int countDauNoiSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String tramCapNuocId, java.lang.String trangThai,
		java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId,
			trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId,
			trangThai, namBaoCao, start, end);
	}

	public static int countThongKeMenuLeft(java.lang.String tableName,
		int initUserType, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countThongKeMenuLeft(tableName, initUserType, orgCode);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiSearch(
		int tramCapNuocId, int idNguoiDanhGia, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDauNoiSearch(tramCapNuocId, idNguoiDanhGia, start, end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getDataItemSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDataItemSearch(maTinh, maHuyen, maXa, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getChkImport(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getChkImport(tramCapNuocId, maTinh, maHuyen, maXa,
			tenChuHo, idNguoiTao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getChkAddDauNoi(
		int tramCapNuocId, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getChkAddDauNoi(tramCapNuocId, maTinh, maHuyen, maXa,
			thonXom, tenChuHo);
	}

	public static int countDauNoiByMaTinhTramIdTrangThaiAndNam(
		java.lang.String maTinh, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao) {
		return getService()
				   .countDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,
			tramCapNuocId, trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNam(
		java.lang.String maTinh, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao) {
		return getService()
				   .getDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,
			tramCapNuocId, trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(
		java.lang.String maTinh, java.lang.String danhgiakiemdem,
		java.lang.String namBaoCao) {
		return getService()
				   .getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(maTinh,
			danhgiakiemdem, namBaoCao);
	}

	public static int countDauNoiSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String tramCapNuocId, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String ngayNhap,
		java.lang.String idNguoiTao, java.lang.String advText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId,
			trangThai, namBaoCao, ngayNhap, idNguoiTao, advText);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao,
		java.lang.String ngayNhap, java.lang.String idNguoiTao,
		java.lang.String advText, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId,
			trangThai, namBaoCao, ngayNhap, idNguoiTao, advText, start, end);
	}

	public static int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String gioiTinh) {
		return getService().countGioiTinhChuHo(maTinh, namBaoCao, gioiTinh);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiGroupByMaTinhTW(
		java.lang.String namBaoCao) {
		return getService().getDauNoiGroupByMaTinhTW(namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiGroupByTramCapIDTW(
		java.lang.String namBaoCao, java.lang.String trangThai) {
		return getService().getDauNoiGroupByTramCapIDTW(namBaoCao, trangThai);
	}

	public static void clearService() {
		_service = null;
	}

	public static DauNoiNuocLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DauNoiNuocLocalService.class.getName());

			if (invokableLocalService instanceof DauNoiNuocLocalService) {
				_service = (DauNoiNuocLocalService)invokableLocalService;
			}
			else {
				_service = new DauNoiNuocLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DauNoiNuocLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DauNoiNuocLocalService service) {
	}

	private static DauNoiNuocLocalService _service;
}