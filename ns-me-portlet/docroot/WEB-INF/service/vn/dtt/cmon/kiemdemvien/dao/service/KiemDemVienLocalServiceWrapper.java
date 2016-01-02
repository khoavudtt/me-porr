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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KiemDemVienLocalService}.
 *
 * @author HANT
 * @see KiemDemVienLocalService
 * @generated
 */
public class KiemDemVienLocalServiceWrapper implements KiemDemVienLocalService,
	ServiceWrapper<KiemDemVienLocalService> {
	public KiemDemVienLocalServiceWrapper(
		KiemDemVienLocalService kiemDemVienLocalService) {
		_kiemDemVienLocalService = kiemDemVienLocalService;
	}

	/**
	* Adds the kiem dem vien to the database. Also notifies the appropriate model listeners.
	*
	* @param kiemDemVien the kiem dem vien
	* @return the kiem dem vien that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien addKiemDemVien(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.addKiemDemVien(kiemDemVien);
	}

	/**
	* Creates a new kiem dem vien with the primary key. Does not add the kiem dem vien to the database.
	*
	* @param id the primary key for the new kiem dem vien
	* @return the new kiem dem vien
	*/
	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien createKiemDemVien(
		long id) {
		return _kiemDemVienLocalService.createKiemDemVien(id);
	}

	/**
	* Deletes the kiem dem vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien that was removed
	* @throws PortalException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien deleteKiemDemVien(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.deleteKiemDemVien(id);
	}

	/**
	* Deletes the kiem dem vien from the database. Also notifies the appropriate model listeners.
	*
	* @param kiemDemVien the kiem dem vien
	* @return the kiem dem vien that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien deleteKiemDemVien(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.deleteKiemDemVien(kiemDemVien);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kiemDemVienLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien fetchKiemDemVien(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.fetchKiemDemVien(id);
	}

	/**
	* Returns the kiem dem vien with the primary key.
	*
	* @param id the primary key of the kiem dem vien
	* @return the kiem dem vien
	* @throws PortalException if a kiem dem vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien getKiemDemVien(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.getKiemDemVien(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> getKiemDemViens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.getKiemDemViens(start, end);
	}

	/**
	* Returns the number of kiem dem viens.
	*
	* @return the number of kiem dem viens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKiemDemViensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.getKiemDemViensCount();
	}

	/**
	* Updates the kiem dem vien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kiemDemVien the kiem dem vien
	* @return the kiem dem vien that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien updateKiemDemVien(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.updateKiemDemVien(kiemDemVien);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _kiemDemVienLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_kiemDemVienLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _kiemDemVienLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findKDVByCTHTT(
		java.lang.String capHoatDong, java.lang.String maTinh,
		java.lang.String maHuyen, long trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.findKDVByCTHTT(capHoatDong, maTinh,
			maHuyen, trangThai, start, end);
	}

	@Override
	public int countCTHTT(java.lang.String capHoatDong,
		java.lang.String maTinh, java.lang.String maHuyen, long trangThai)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.countCTHTT(capHoatDong, maTinh,
			maHuyen, trangThai);
	}

	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien getKiemDemVienByTaiKhoan(
		java.lang.String maTaiKhoan)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.getKiemDemVienByTaiKhoan(maTaiKhoan);
	}

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
	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien updateKiemDemVien(
		long id, java.lang.String hoVaTen, java.lang.String taiKhoan,
		java.lang.String matKhau, int capHoatDong, java.lang.String orgCode1,
		java.lang.String orgCode2, java.lang.String diaChi,
		java.lang.String chungMinhThu, java.lang.String dienThoai,
		java.lang.String imei, long trangThai, long idQuanLy,
		java.lang.String nameQuanLys,
		com.liferay.portal.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.updateKiemDemVien(id, hoVaTen,
			taiKhoan, matKhau, capHoatDong, orgCode1, orgCode2, diaChi,
			chungMinhThu, dienThoai, imei, trangThai, idQuanLy, nameQuanLys,
			context);
	}

	@Override
	public int countAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.countAll();
	}

	@Override
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.findAll();
	}

	@Override
	public void addKiemDemVien(java.lang.String hoVaTen,
		java.lang.String taiKhoan, java.lang.String matKhau, int capHoatDong,
		java.lang.String orgCode1, java.lang.String orgCode2,
		java.lang.String diaChi, java.lang.String chungMinhThu,
		java.lang.String dienThoai, java.lang.String imei, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_kiemDemVienLocalService.addKiemDemVien(hoVaTen, taiKhoan, matKhau,
			capHoatDong, orgCode1, orgCode2, diaChi, chungMinhThu, dienThoai,
			imei, idNguoiTao);
	}

	@Override
	public void chuyenTrangThai(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_kiemDemVienLocalService.chuyenTrangThai(id);
	}

	@Override
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> find(
		java.lang.String capHoatDong, java.lang.String orgCode2, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.find(capHoatDong, orgCode2, start, end);
	}

	@Override
	public long count(java.lang.String capHoatDong, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.count(capHoatDong, orgCode2);
	}

	@Override
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findKiemDemVien(
		java.lang.String capHoatDong, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.findKiemDemVien(capHoatDong, orgCode);
	}

	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien getByTaiKhoan(
		java.lang.String taiKhoan)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kiemDemVienLocalService.getByTaiKhoan(taiKhoan);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KiemDemVienLocalService getWrappedKiemDemVienLocalService() {
		return _kiemDemVienLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKiemDemVienLocalService(
		KiemDemVienLocalService kiemDemVienLocalService) {
		_kiemDemVienLocalService = kiemDemVienLocalService;
	}

	@Override
	public KiemDemVienLocalService getWrappedService() {
		return _kiemDemVienLocalService;
	}

	@Override
	public void setWrappedService(
		KiemDemVienLocalService kiemDemVienLocalService) {
		_kiemDemVienLocalService = kiemDemVienLocalService;
	}

	private KiemDemVienLocalService _kiemDemVienLocalService;
}