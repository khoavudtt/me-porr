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

package vn.dtt.cmon.kiemdemvien.dao.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for KiemDemVien. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author HANT
 * @see KiemDemVienLocalServiceUtil
 * @see vn.dtt.cmon.kiemdemvien.dao.service.base.KiemDemVienLocalServiceBaseImpl
 * @see vn.dtt.cmon.kiemdemvien.dao.service.impl.KiemDemVienLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface KiemDemVienLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KiemDemVienLocalServiceUtil} to access the kiem dem vien local service. Add custom service methods to {@link vn.dtt.cmon.kiemdemvien.dao.service.impl.KiemDemVienLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the kiem dem vien to the database. Also notifies the appropriate model listeners.
	*
	* @param kiemDemVien the kiem dem vien
	* @return the kiem dem vien that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien addKiemDemVien(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new kiem dem vien with the primary key. Does not add the kiem dem vien to the database.
	*
	* @param id the primary key for the new kiem dem vien
	* @return the new kiem dem vien
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien createKiemDemVien(
		long id);

	/**
	* Deletes the kiem dem vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien that was removed
	* @throws PortalException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien deleteKiemDemVien(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the kiem dem vien from the database. Also notifies the appropriate model listeners.
	*
	* @param kiemDemVien the kiem dem vien
	* @return the kiem dem vien that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien deleteKiemDemVien(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchKiemDemVien(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the kiem dem vien with the primary key.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien
	* @throws PortalException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien getKiemDemVien(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the kiem dem viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kiem dem viens
	* @param end the upper bound of the range of kiem dem viens (not inclusive)
	* @return the range of kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> getKiemDemViens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kiem dem viens.
	*
	* @return the number of kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getKiemDemViensCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the kiem dem vien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kiemDemVien the kiem dem vien
	* @return the kiem dem vien that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien updateKiemDemVien(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findKDVByCTHTT(
		java.lang.String capHoatDong, java.lang.String maTinh,
		java.lang.String maHuyen, long trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countCTHTT(java.lang.String capHoatDong,
		java.lang.String maTinh, java.lang.String maHuyen, long trangThai)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien getKiemDemVienByTaiKhoan(
		java.lang.String maTaiKhoan)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param id
	* @param hoVaTen
	* @param taiKhoan
	* @param matKhau
	* @param capHoatDong
	* @param orgCode1
	* @param orgCode2
	* @param diaChi
	* @param chungMinhThu
	* @param dienThoai
	* @param imei
	* @param trangThai
	* @param idQuanLy
	* @param nameQuanLys
	* @param context
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien updateKiemDemVien(
		long id, java.lang.String hoVaTen, java.lang.String taiKhoan,
		java.lang.String matKhau, int capHoatDong, java.lang.String orgCode1,
		java.lang.String orgCode2, java.lang.String diaChi,
		java.lang.String chungMinhThu, java.lang.String dienThoai,
		java.lang.String imei, long trangThai, long idQuanLy,
		java.lang.String nameQuanLys,
		com.liferay.portal.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addKiemDemVien(java.lang.String hoVaTen,
		java.lang.String taiKhoan, java.lang.String matKhau, int capHoatDong,
		java.lang.String orgCode1, java.lang.String orgCode2,
		java.lang.String diaChi, java.lang.String chungMinhThu,
		java.lang.String dienThoai, java.lang.String imei, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void chuyenTrangThai(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> find(
		java.lang.String capHoatDong, java.lang.String orgCode2, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public long count(java.lang.String capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findKiemDemVien(
		java.lang.String capHoatDong, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien getByTaiKhoan(
		java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}