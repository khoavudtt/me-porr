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
 * Provides the local service utility for VeSinhCongTrinh. This utility wraps
 * {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.VeSinhCongTrinhLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author BinhTH
 * @see VeSinhCongTrinhLocalService
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.VeSinhCongTrinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.VeSinhCongTrinhLocalServiceImpl
 * @generated
 */
public class VeSinhCongTrinhLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl.VeSinhCongTrinhLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ve sinh cong trinh to the database. Also notifies the appropriate model listeners.
	*
	* @param veSinhCongTrinh the ve sinh cong trinh
	* @return the ve sinh cong trinh that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh addVeSinhCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh veSinhCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVeSinhCongTrinh(veSinhCongTrinh);
	}

	/**
	* Creates a new ve sinh cong trinh with the primary key. Does not add the ve sinh cong trinh to the database.
	*
	* @param id the primary key for the new ve sinh cong trinh
	* @return the new ve sinh cong trinh
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh createVeSinhCongTrinh(
		int id) {
		return getService().createVeSinhCongTrinh(id);
	}

	/**
	* Deletes the ve sinh cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ve sinh cong trinh
	* @return the ve sinh cong trinh that was removed
	* @throws PortalException if a ve sinh cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh deleteVeSinhCongTrinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVeSinhCongTrinh(id);
	}

	/**
	* Deletes the ve sinh cong trinh from the database. Also notifies the appropriate model listeners.
	*
	* @param veSinhCongTrinh the ve sinh cong trinh
	* @return the ve sinh cong trinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh deleteVeSinhCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh veSinhCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVeSinhCongTrinh(veSinhCongTrinh);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh fetchVeSinhCongTrinh(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchVeSinhCongTrinh(id);
	}

	/**
	* Returns the ve sinh cong trinh with the primary key.
	*
	* @param id the primary key of the ve sinh cong trinh
	* @return the ve sinh cong trinh
	* @throws PortalException if a ve sinh cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh getVeSinhCongTrinh(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVeSinhCongTrinh(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ve sinh cong trinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ve sinh cong trinhs
	* @param end the upper bound of the range of ve sinh cong trinhs (not inclusive)
	* @return the range of ve sinh cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh> getVeSinhCongTrinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVeSinhCongTrinhs(start, end);
	}

	/**
	* Returns the number of ve sinh cong trinhs.
	*
	* @return the number of ve sinh cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int getVeSinhCongTrinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVeSinhCongTrinhsCount();
	}

	/**
	* Updates the ve sinh cong trinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param veSinhCongTrinh the ve sinh cong trinh
	* @return the ve sinh cong trinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh updateVeSinhCongTrinh(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh veSinhCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVeSinhCongTrinh(veSinhCongTrinh);
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

	public static int COUNT_VE_SINH_GIA_DINH_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_VE_SINH_GIA_DINH_ADMIN();
	}

	public static int COUNT_VE_SINH_GIA_DINH_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_VE_SINH_GIA_DINH_TU(userId);
	}

	public static int COUNT_VE_SINH_GIA_DINH_TINH(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_VE_SINH_GIA_DINH_TINH(maTinh, userId);
	}

	public static int COUNT_VE_SINH_GIA_DINH_HUYEN(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_VE_SINH_GIA_DINH_HUYEN(maTinh, userId);
	}

	public static int COUNT_VE_SINH_CONG_TRINH_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_VE_SINH_CONG_TRINH_ADMIN();
	}

	public static int COUNT_VE_SINH_CONG_TRINH_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_VE_SINH_CONG_TRINH_TU(userId);
	}

	public static int COUNT_VE_SINH_CONG_TRINH_TINH(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_VE_SINH_CONG_TRINH_TINH(maTinh, userId);
	}

	public static int COUNT_VE_SINH_CONG_TRINH_HUYEN(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_VE_SINH_CONG_TRINH_HUYEN(maTinh, userId);
	}

	public static int COUNT_KIEM_DEM_VE_SINH_ADMIN(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KIEM_DEM_VE_SINH_ADMIN(userId);
	}

	public static int COUNT_KIEM_DEM_VE_SINH_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KIEM_DEM_VE_SINH_TU(userId);
	}

	public static int COUNT_KIEM_DEM_VE_SINH_TINH(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KIEM_DEM_VE_SINH_TINH(userId);
	}

	public static int COUNT_KIEM_DEM_VE_SINH_HUYEN(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KIEM_DEM_VE_SINH_HUYEN(userId);
	}

	public static int COUNT_KE_HOACH_VE_SINH_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_VE_SINH_ADMIN();
	}

	public static int COUNT_KE_HOACH_VE_SINH_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_VE_SINH_TU();
	}

	public static int COUNT_KE_HOACH_VE_SINH_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_VE_SINH_TINH(maTinh);
	}

	public static int COUNT_KE_HOACH_VE_SINH_HUYEN(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_VE_SINH_HUYEN(maTinh);
	}

	public static int COUNT_DANH_GIA_VE_SINH_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DANH_GIA_VE_SINH_ADMIN();
	}

	public static int COUNT_DANH_GIA_VE_SINH_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DANH_GIA_VE_SINH_TU();
	}

	public static int COUNT_DANH_GIA_VE_SINH_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DANH_GIA_VE_SINH_TINH(maTinh);
	}

	public static int COUNT_DANH_GIA_VE_SINH_HUYEN(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DANH_GIA_VE_SINH_HUYEN(maTinh);
	}

	public static int COUNT_MAU_NGAU_NHIEN_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_MAU_NGAU_NHIEN_ADMIN();
	}

	public static int COUNT_MAU_NGAU_NHIEN_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_MAU_NGAU_NHIEN_TU();
	}

	public static int COUNT_MAU_NGAU_NHIEN_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_MAU_NGAU_NHIEN_TINH(maTinh);
	}

	public static int COUNT_MAU_NGAU_NHIEN_HUYEN(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_MAU_NGAU_NHIEN_HUYEN(maTinh);
	}

	public static int COUNT_DANH_GIA_CUOI_NAM_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DANH_GIA_CUOI_NAM_ADMIN();
	}

	public static int COUNT_DANH_GIA_CUOI_NAM_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DANH_GIA_CUOI_NAM_TU();
	}

	public static int COUNT_DANH_GIA_CUOI_NAM_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DANH_GIA_CUOI_NAM_TINH(maTinh);
	}

	public static int COUNT_DANH_GIA_CUOI_NAM_TRAMCAP(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DANH_GIA_CUOI_NAM_TRAMCAP(maTinh);
	}

	public static int COUNT_KE_HOACH_DAU_NAM_AMDIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_DAU_NAM_AMDIN();
	}

	public static int COUNT_KE_HOACH_DAU_NAM_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_DAU_NAM_TU();
	}

	public static int COUNT_KE_HOACH_DAU_NAM_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_DAU_NAM_TINH(maTinh);
	}

	public static int COUNT_KE_HOACH_DAU_NAM_TRAMCAP(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_DAU_NAM_TRAMCAP(userId);
	}

	public static int COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(userId);
	}

	public static int COUNT_KE_HOACH_DAU_NOI_NUOC_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_DAU_NOI_NUOC_TINH(maTinh);
	}

	public static int COUNT_KE_HOACH_DAU_NOI_NUOC_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_DAU_NOI_NUOC_TU();
	}

	public static int COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN();
	}

	public static int COUNT_DAU_NOI_NUOC_TRAMCAP(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DAU_NOI_NUOC_TRAMCAP(maTinh, userId);
	}

	public static int COUNT_DAU_NOI_NUOC_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DAU_NOI_NUOC_TINH(maTinh);
	}

	public static int COUNT_DAU_NOI_NUOC_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DAU_NOI_NUOC_TU(userId);
	}

	public static int COUNT_DAU_NOI_NUOC_ADMIN(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_DAU_NOI_NUOC_ADMIN(userId);
	}

	public static int COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(userId);
	}

	public static int COUNT_CONG_TRINH_CAP_NUOC_TINH(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_CONG_TRINH_CAP_NUOC_TINH(maTinh, userId);
	}

	public static int COUNT_CONG_TRINH_CAP_NUOC_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_CONG_TRINH_CAP_NUOC_TU(userId);
	}

	public static int COUNT_CONG_TRINH_CAP_NUOC_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().COUNT_CONG_TRINH_CAP_NUOC_ADMIN();
	}

	public static int countDauNoiInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDauNoiInTinh(maTinh);
	}

	public static int countDauNoiPhanKHInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDauNoiPhanKHInTinh(maTinh);
	}

	public static int countDauNoiDongBoInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDauNoiDongBoInTinh(maTinh);
	}

	public static int countHGDInTinh(java.lang.String maTinh, int namXayDung)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countHGDInTinh(maTinh, namXayDung);
	}

	public static int countHGDPhanKHInTinh(java.lang.String maTinh,
		int namXayDung)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countHGDPhanKHInTinh(maTinh, namXayDung);
	}

	public static int countHDGDongBoInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countHDGDongBoInTinh(maTinh);
	}

	public static int countCongTrinhInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countCongTrinhInTinh(maTinh);
	}

	public static int countCongTrinhPhanKHInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countCongTrinhPhanKHInTinh(maTinh);
	}

	public static int countCongTrinhDongBoInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countCongTrinhDongBoInTinh(maTinh);
	}

	public static int countVeSinhCongTrinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String loaiNhaTieuId, java.lang.String loaiCongTrinh,
		java.lang.String trangThai, java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countVeSinhCongTrinhSearch(maTinh, maHuyen, maXa,
			loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh> getVeSinhCongTrinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String loaiCongTrinh, java.lang.String trangThai,
		java.lang.String namBaoCao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getVeSinhCongTrinhSearch(maTinh, maHuyen, maXa,
			loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static VeSinhCongTrinhLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VeSinhCongTrinhLocalService.class.getName());

			if (invokableLocalService instanceof VeSinhCongTrinhLocalService) {
				_service = (VeSinhCongTrinhLocalService)invokableLocalService;
			}
			else {
				_service = new VeSinhCongTrinhLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(VeSinhCongTrinhLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(VeSinhCongTrinhLocalService service) {
	}

	private static VeSinhCongTrinhLocalService _service;
}