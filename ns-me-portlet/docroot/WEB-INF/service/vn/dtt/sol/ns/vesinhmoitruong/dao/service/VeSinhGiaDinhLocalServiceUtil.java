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
 * Provides the local service utility for VeSinhGiaDinh. This utility wraps
 * {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.VeSinhGiaDinhLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author BinhTH
 * @see VeSinhGiaDinhLocalService
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.VeSinhGiaDinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.VeSinhGiaDinhLocalServiceImpl
 * @generated
 */
public class VeSinhGiaDinhLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.VeSinhGiaDinhLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ve sinh gia dinh to the database. Also notifies the appropriate model listeners.
	*
	* @param veSinhGiaDinh the ve sinh gia dinh
	* @return the ve sinh gia dinh that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh addVeSinhGiaDinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVeSinhGiaDinh(veSinhGiaDinh);
	}

	/**
	* Creates a new ve sinh gia dinh with the primary key. Does not add the ve sinh gia dinh to the database.
	*
	* @param id the primary key for the new ve sinh gia dinh
	* @return the new ve sinh gia dinh
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh createVeSinhGiaDinh(
		int id) {
		return getService().createVeSinhGiaDinh(id);
	}

	/**
	* Deletes the ve sinh gia dinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ve sinh gia dinh
	* @return the ve sinh gia dinh that was removed
	* @throws PortalException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh deleteVeSinhGiaDinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVeSinhGiaDinh(id);
	}

	/**
	* Deletes the ve sinh gia dinh from the database. Also notifies the appropriate model listeners.
	*
	* @param veSinhGiaDinh the ve sinh gia dinh
	* @return the ve sinh gia dinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh deleteVeSinhGiaDinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVeSinhGiaDinh(veSinhGiaDinh);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchVeSinhGiaDinh(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchVeSinhGiaDinh(id);
	}

	/**
	* Returns the ve sinh gia dinh with the primary key.
	*
	* @param id the primary key of the ve sinh gia dinh
	* @return the ve sinh gia dinh
	* @throws PortalException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh getVeSinhGiaDinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVeSinhGiaDinh(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ve sinh gia dinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @return the range of ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVeSinhGiaDinhs(start, end);
	}

	/**
	* Returns the number of ve sinh gia dinhs.
	*
	* @return the number of ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int getVeSinhGiaDinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVeSinhGiaDinhsCount();
	}

	/**
	* Updates the ve sinh gia dinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param veSinhGiaDinh the ve sinh gia dinh
	* @return the ve sinh gia dinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh updateVeSinhGiaDinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVeSinhGiaDinh(veSinhGiaDinh);
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

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVSGDByTHXMNN(
		java.lang.String tinh, java.lang.String huyen, java.lang.String xa,
		int mauNgauNhien, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getVSGDByTHXMNN(tinh, huyen, xa, mauNgauNhien, start, end);
	}

	public static int countVSGDByTHXMNN(java.lang.String tinh,
		java.lang.String huyen, java.lang.String xa, int mauNgauNhien)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countVSGDByTHXMNN(tinh, huyen, xa, mauNgauNhien);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVSGDByTHXMNN(
		java.lang.String tinh, java.lang.String huyen, java.lang.String xa,
		int mauNgauNhien)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVSGDByTHXMNN(tinh, huyen, xa, mauNgauNhien);
	}

	public static int countVeSinhGiaDinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String loaiNhaTieuId, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String namBaoCaoVstx)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countVeSinhGiaDinhSearch(maTinh, maHuyen, maXa,
			loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String trangThai, java.lang.String namBaoCao,
		java.lang.String namBaoCaoVstx, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getVeSinhGiaDinhSearch(maTinh, maHuyen, maXa,
			loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx, start, end);
	}

	public static void updateVeSinhHoGiaDinhChonMau(int id, int namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().updateVeSinhHoGiaDinhChonMau(id, namBaoCao);
	}

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh updateMauNgauNhien(
		long id, int namBaoCao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMauNgauNhien(id, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaHuyen(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String trangThai, java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getVeSinhGiaDinhGroupByMaHuyen(maTinh, maHuyen, maXa,
			loaiNhaTieuId, trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_Import(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByT_CHK_Import(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao);
	}

	public static boolean chkGDinKeHoach(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().chkGDinKeHoach(maTinh, maHuyen, maXa);
	}

	public static int countVeSinhGiaDinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String loaiNhaTieuId, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String namBaoCaoVstx,
		java.lang.String ngayNhap, java.lang.String idNguoiTao,
		java.lang.String advText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countVeSinhGiaDinhSearch(maTinh, maHuyen, maXa,
			loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx, ngayNhap,
			idNguoiTao, advText);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String trangThai, java.lang.String namBaoCao,
		java.lang.String namBaoCaoVstx, java.lang.String ngayNhap,
		java.lang.String idNguoiTao, java.lang.String advText, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getVeSinhGiaDinhSearch(maTinh, maHuyen, maXa,
			loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx, ngayNhap,
			idNguoiTao, advText, start, end);
	}

	public static int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String namXayDung,
		java.lang.String gioiTinhChuHo, java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countGioiTinhChuHo(maTinh, namBaoCao, namXayDung,
			gioiTinhChuHo, trangThai);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaTinhTW(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String trangThai, java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getVeSinhGiaDinhGroupByMaTinhTW(maTinh, maHuyen, maXa,
			loaiNhaTieuId, trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaHuyenMaXaAndMaXaNotInTW(
		java.lang.String maTinh, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String dangKyVSTX)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getVeSinhGiaDinhGroupByMaHuyenMaXaAndMaXaNotInTW(maTinh,
			trangThai, namBaoCao, dangKyVSTX);
	}

	public static void clearService() {
		_service = null;
	}

	public static VeSinhGiaDinhLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VeSinhGiaDinhLocalService.class.getName());

			if (invokableLocalService instanceof VeSinhGiaDinhLocalService) {
				_service = (VeSinhGiaDinhLocalService)invokableLocalService;
			}
			else {
				_service = new VeSinhGiaDinhLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(VeSinhGiaDinhLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(VeSinhGiaDinhLocalService service) {
	}

	private static VeSinhGiaDinhLocalService _service;
}