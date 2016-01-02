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

package vn.dtt.cmon.dm.dao.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DATAGROUP. This utility wraps
 * {@link vn.dtt.cmon.dm.dao.service.impl.DATAGROUPLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoa.vu
 * @see DATAGROUPLocalService
 * @see vn.dtt.cmon.dm.dao.service.base.DATAGROUPLocalServiceBaseImpl
 * @see vn.dtt.cmon.dm.dao.service.impl.DATAGROUPLocalServiceImpl
 * @generated
 */
public class DATAGROUPLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.cmon.dm.dao.service.impl.DATAGROUPLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the d a t a g r o u p to the database. Also notifies the appropriate model listeners.
	*
	* @param datagroup the d a t a g r o u p
	* @return the d a t a g r o u p that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP addDATAGROUP(
		vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDATAGROUP(datagroup);
	}

	/**
	* Creates a new d a t a g r o u p with the primary key. Does not add the d a t a g r o u p to the database.
	*
	* @param id the primary key for the new d a t a g r o u p
	* @return the new d a t a g r o u p
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP createDATAGROUP(long id) {
		return getService().createDATAGROUP(id);
	}

	/**
	* Deletes the d a t a g r o u p with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p that was removed
	* @throws PortalException if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP deleteDATAGROUP(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDATAGROUP(id);
	}

	/**
	* Deletes the d a t a g r o u p from the database. Also notifies the appropriate model listeners.
	*
	* @param datagroup the d a t a g r o u p
	* @return the d a t a g r o u p that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP deleteDATAGROUP(
		vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDATAGROUP(datagroup);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.cmon.dm.dao.model.DATAGROUP fetchDATAGROUP(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDATAGROUP(id);
	}

	/**
	* Returns the d a t a g r o u p with the primary key.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p
	* @throws PortalException if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP getDATAGROUP(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDATAGROUP(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the d a t a g r o u ps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d a t a g r o u ps
	* @param end the upper bound of the range of d a t a g r o u ps (not inclusive)
	* @return the range of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> getDATAGROUPs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDATAGROUPs(start, end);
	}

	/**
	* Returns the number of d a t a g r o u ps.
	*
	* @return the number of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public static int getDATAGROUPsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDATAGROUPsCount();
	}

	/**
	* Updates the d a t a g r o u p in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param datagroup the d a t a g r o u p
	* @return the d a t a g r o u p that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP updateDATAGROUP(
		vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDATAGROUP(datagroup);
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

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll();
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> getAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll(start, end);
	}

	public static int countAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countAll();
	}

	public static void clearService() {
		_service = null;
	}

	public static DATAGROUPLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DATAGROUPLocalService.class.getName());

			if (invokableLocalService instanceof DATAGROUPLocalService) {
				_service = (DATAGROUPLocalService)invokableLocalService;
			}
			else {
				_service = new DATAGROUPLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DATAGROUPLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DATAGROUPLocalService service) {
	}

	private static DATAGROUPLocalService _service;
}