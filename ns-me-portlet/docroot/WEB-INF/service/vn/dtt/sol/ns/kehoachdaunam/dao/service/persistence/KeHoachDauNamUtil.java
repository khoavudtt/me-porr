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

package vn.dtt.sol.ns.kehoachdaunam.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;

import java.util.List;

/**
 * The persistence utility for the ke hoach dau nam service. This utility wraps {@link KeHoachDauNamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KeHoachDauNamPersistence
 * @see KeHoachDauNamPersistenceImpl
 * @generated
 */
public class KeHoachDauNamUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(KeHoachDauNam keHoachDauNam) {
		getPersistence().clearCache(keHoachDauNam);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KeHoachDauNam> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KeHoachDauNam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KeHoachDauNam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KeHoachDauNam update(KeHoachDauNam keHoachDauNam)
		throws SystemException {
		return getPersistence().update(keHoachDauNam);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KeHoachDauNam update(KeHoachDauNam keHoachDauNam,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(keHoachDauNam, serviceContext);
	}

	/**
	* Returns the ke hoach dau nam where id = &#63; or throws a {@link vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException} if it could not be found.
	*
	* @param id the ID
	* @return the matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_ID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_ID(id);
	}

	/**
	* Returns the ke hoach dau nam where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_ID(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_ID(id);
	}

	/**
	* Returns the ke hoach dau nam where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_ID(
		long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_ID(id, retrieveFromCache);
	}

	/**
	* Removes the ke hoach dau nam where id = &#63; from the database.
	*
	* @param id the ID
	* @return the ke hoach dau nam that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam removeBy_ID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().removeBy_ID(id);
	}

	/**
	* Returns the number of ke hoach dau nams where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_ID(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_ID(id);
	}

	/**
	* Returns all the ke hoach dau nams where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_N_T(
		long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_N_T(idNguoiTao);
	}

	/**
	* Returns a range of all the ke hoach dau nams where idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_N_T(
		long idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_N_T(idNguoiTao, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach dau nams where idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_N_T(
		long idNguoiTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_N_T(idNguoiTao, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_N_T_First(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_N_T_First(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_N_T_Last(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_N_T_Last(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_N_T_PrevAndNext(
		long id, long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findBy_N_T_PrevAndNext(id, idNguoiTao, orderByComparator);
	}

	/**
	* Removes all the ke hoach dau nams where idNguoiTao = &#63; from the database.
	*
	* @param idNguoiTao the id nguoi tao
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_N_T(idNguoiTao);
	}

	/**
	* Returns the number of ke hoach dau nams where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_N_T(idNguoiTao);
	}

	/**
	* Returns all the ke hoach dau nams where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_T_C_N(
		long tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_T_C_N(tramCapNuocId);
	}

	/**
	* Returns a range of all the ke hoach dau nams where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_T_C_N(
		long tramCapNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_T_C_N(tramCapNuocId, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach dau nams where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_T_C_N(
		long tramCapNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_T_C_N(tramCapNuocId, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_T_C_N_First(
		long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findBy_T_C_N_First(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_T_C_N_First(
		long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_T_C_N_First(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_T_C_N_Last(
		long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findBy_T_C_N_Last(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_T_C_N_Last(
		long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_T_C_N_Last(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_T_C_N_PrevAndNext(
		long id, long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findBy_T_C_N_PrevAndNext(id, tramCapNuocId,
			orderByComparator);
	}

	/**
	* Removes all the ke hoach dau nams where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_T_C_N(long tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_T_C_N(tramCapNuocId);
	}

	/**
	* Returns the number of ke hoach dau nams where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_T_C_N(long tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_T_C_N(tramCapNuocId);
	}

	/**
	* Returns all the ke hoach dau nams where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_Y(
		long nam) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_Y(nam);
	}

	/**
	* Returns a range of all the ke hoach dau nams where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_Y(
		long nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_Y(nam, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach dau nams where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_Y(
		long nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_Y(nam, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_Y_First(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_Y_First(nam, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_Y_First(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_Y_First(nam, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_Y_Last(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_Y_Last(nam, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_Y_Last(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_Y_Last(nam, orderByComparator);
	}

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_Y_PrevAndNext(
		long id, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_Y_PrevAndNext(id, nam, orderByComparator);
	}

	/**
	* Removes all the ke hoach dau nams where nam = &#63; from the database.
	*
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_Y(long nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_Y(nam);
	}

	/**
	* Returns the number of ke hoach dau nams where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_Y(long nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_Y(nam);
	}

	/**
	* Returns all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findByTramCap_Nam(
		long tramCapNuocId, long nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTramCap_Nam(tramCapNuocId, nam);
	}

	/**
	* Returns a range of all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findByTramCap_Nam(
		long tramCapNuocId, long nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTramCap_Nam(tramCapNuocId, nam, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findByTramCap_Nam(
		long tramCapNuocId, long nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTramCap_Nam(tramCapNuocId, nam, start, end,
			orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findByTramCap_Nam_First(
		long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findByTramCap_Nam_First(tramCapNuocId, nam,
			orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchByTramCap_Nam_First(
		long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTramCap_Nam_First(tramCapNuocId, nam,
			orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findByTramCap_Nam_Last(
		long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findByTramCap_Nam_Last(tramCapNuocId, nam, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchByTramCap_Nam_Last(
		long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTramCap_Nam_Last(tramCapNuocId, nam,
			orderByComparator);
	}

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findByTramCap_Nam_PrevAndNext(
		long id, long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findByTramCap_Nam_PrevAndNext(id, tramCapNuocId, nam,
			orderByComparator);
	}

	/**
	* Removes all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTramCap_Nam(long tramCapNuocId, long nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTramCap_Nam(tramCapNuocId, nam);
	}

	/**
	* Returns the number of ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTramCap_Nam(long tramCapNuocId, long nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTramCap_Nam(tramCapNuocId, nam);
	}

	/**
	* Returns all the ke hoach dau nams where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D_L_I(
		long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_D_L_I(baoCaoDLI);
	}

	/**
	* Returns a range of all the ke hoach dau nams where baoCaoDLI = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param baoCaoDLI the bao cao d l i
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D_L_I(
		long baoCaoDLI, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_D_L_I(baoCaoDLI, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach dau nams where baoCaoDLI = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param baoCaoDLI the bao cao d l i
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D_L_I(
		long baoCaoDLI, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_D_L_I(baoCaoDLI, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_D_L_I_First(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_D_L_I_First(baoCaoDLI, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_D_L_I_First(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_D_L_I_First(baoCaoDLI, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_D_L_I_Last(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_D_L_I_Last(baoCaoDLI, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_D_L_I_Last(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_D_L_I_Last(baoCaoDLI, orderByComparator);
	}

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_D_L_I_PrevAndNext(
		long id, long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findBy_D_L_I_PrevAndNext(id, baoCaoDLI, orderByComparator);
	}

	/**
	* Removes all the ke hoach dau nams where baoCaoDLI = &#63; from the database.
	*
	* @param baoCaoDLI the bao cao d l i
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_D_L_I(long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_D_L_I(baoCaoDLI);
	}

	/**
	* Returns the number of ke hoach dau nams where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_D_L_I(long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_D_L_I(baoCaoDLI);
	}

	/**
	* Returns all the ke hoach dau nams where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D(
		java.util.Date ngayTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_D(ngayTao);
	}

	/**
	* Returns a range of all the ke hoach dau nams where ngayTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayTao the ngay tao
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D(
		java.util.Date ngayTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_D(ngayTao, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach dau nams where ngayTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayTao the ngay tao
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D(
		java.util.Date ngayTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_D(ngayTao, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_D_First(
		java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_D_First(ngayTao, orderByComparator);
	}

	/**
	* Returns the first ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_D_First(
		java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_D_First(ngayTao, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_D_Last(
		java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findBy_D_Last(ngayTao, orderByComparator);
	}

	/**
	* Returns the last ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_D_Last(
		java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_D_Last(ngayTao, orderByComparator);
	}

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_D_PrevAndNext(
		long id, java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence()
				   .findBy_D_PrevAndNext(id, ngayTao, orderByComparator);
	}

	/**
	* Removes all the ke hoach dau nams where ngayTao = &#63; from the database.
	*
	* @param ngayTao the ngay tao
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_D(java.util.Date ngayTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_D(ngayTao);
	}

	/**
	* Returns the number of ke hoach dau nams where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_D(java.util.Date ngayTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_D(ngayTao);
	}

	/**
	* Caches the ke hoach dau nam in the entity cache if it is enabled.
	*
	* @param keHoachDauNam the ke hoach dau nam
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam keHoachDauNam) {
		getPersistence().cacheResult(keHoachDauNam);
	}

	/**
	* Caches the ke hoach dau nams in the entity cache if it is enabled.
	*
	* @param keHoachDauNams the ke hoach dau nams
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> keHoachDauNams) {
		getPersistence().cacheResult(keHoachDauNams);
	}

	/**
	* Creates a new ke hoach dau nam with the primary key. Does not add the ke hoach dau nam to the database.
	*
	* @param id the primary key for the new ke hoach dau nam
	* @return the new ke hoach dau nam
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the ke hoach dau nam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach dau nam
	* @return the ke hoach dau nam that was removed
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam updateImpl(
		vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam keHoachDauNam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(keHoachDauNam);
	}

	/**
	* Returns the ke hoach dau nam with the primary key or throws a {@link vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException} if it could not be found.
	*
	* @param id the primary key of the ke hoach dau nam
	* @return the ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the ke hoach dau nam with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ke hoach dau nam
	* @return the ke hoach dau nam, or <code>null</code> if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the ke hoach dau nams.
	*
	* @return the ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ke hoach dau nams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach dau nams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ke hoach dau nams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ke hoach dau nams.
	*
	* @return the number of ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KeHoachDauNamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KeHoachDauNamPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.kehoachdaunam.dao.service.ClpSerializer.getServletContextName(),
					KeHoachDauNamPersistence.class.getName());

			ReferenceRegistry.registerReference(KeHoachDauNamUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KeHoachDauNamPersistence persistence) {
	}

	private static KeHoachDauNamPersistence _persistence;
}