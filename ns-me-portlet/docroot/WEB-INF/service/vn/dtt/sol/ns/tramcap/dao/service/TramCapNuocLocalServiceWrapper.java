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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TramCapNuocLocalService}.
 *
 * @author khoa.vu
 * @see TramCapNuocLocalService
 * @generated
 */
public class TramCapNuocLocalServiceWrapper implements TramCapNuocLocalService,
	ServiceWrapper<TramCapNuocLocalService> {
	public TramCapNuocLocalServiceWrapper(
		TramCapNuocLocalService tramCapNuocLocalService) {
		_tramCapNuocLocalService = tramCapNuocLocalService;
	}

	/**
	* Adds the tram cap nuoc to the database. Also notifies the appropriate model listeners.
	*
	* @param tramCapNuoc the tram cap nuoc
	* @return the tram cap nuoc that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc addTramCapNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc tramCapNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.addTramCapNuoc(tramCapNuoc);
	}

	/**
	* Creates a new tram cap nuoc with the primary key. Does not add the tram cap nuoc to the database.
	*
	* @param id the primary key for the new tram cap nuoc
	* @return the new tram cap nuoc
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc createTramCapNuoc(
		long id) {
		return _tramCapNuocLocalService.createTramCapNuoc(id);
	}

	/**
	* Deletes the tram cap nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tram cap nuoc
	* @return the tram cap nuoc that was removed
	* @throws PortalException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc deleteTramCapNuoc(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.deleteTramCapNuoc(id);
	}

	/**
	* Deletes the tram cap nuoc from the database. Also notifies the appropriate model listeners.
	*
	* @param tramCapNuoc the tram cap nuoc
	* @return the tram cap nuoc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc deleteTramCapNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc tramCapNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.deleteTramCapNuoc(tramCapNuoc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tramCapNuocLocalService.dynamicQuery();
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
		return _tramCapNuocLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tramCapNuocLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tramCapNuocLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tramCapNuocLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tramCapNuocLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc fetchTramCapNuoc(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.fetchTramCapNuoc(id);
	}

	/**
	* Returns the tram cap nuoc with the primary key.
	*
	* @param id the primary key of the tram cap nuoc
	* @return the tram cap nuoc
	* @throws PortalException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc getTramCapNuoc(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getTramCapNuoc(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tram cap nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @return the range of tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getTramCapNuocs(start, end);
	}

	/**
	* Returns the number of tram cap nuocs.
	*
	* @return the number of tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTramCapNuocsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getTramCapNuocsCount();
	}

	/**
	* Updates the tram cap nuoc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tramCapNuoc the tram cap nuoc
	* @return the tram cap nuoc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc updateTramCapNuoc(
		vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc tramCapNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.updateTramCapNuoc(tramCapNuoc);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tramCapNuocLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tramCapNuocLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tramCapNuocLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int getDoublicate(java.lang.String maTinh,
		java.lang.String tenTramCap)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getDoublicate(maTinh, tenTramCap);
	}

	@Override
	public int danhGiaTram()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.danhGiaTram();
	}

	/**
	* @param maTinh
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public int countTramCapByTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.countTramCapByTinh(maTinh);
	}

	/**
	* @param maTinh
	* @param start
	* @param end
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.findByTinh(maTinh, start, end);
	}

	/**
	* @param id
	* @param trangThaiDanhGia
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc updaTrangThaiDanhGia(
		long id, int trangThaiDanhGia)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.updaTrangThaiDanhGia(id,
			trangThaiDanhGia);
	}

	/**
	* @param id
	* @param idNguoiDanhGia
	* @param ngayDanhGia
	* @param trangThaiCapNuoc
	* @param congXuatThucTe
	* @param tongDauNoiThucTe
	* @param soNguoiCapThucTe
	* @param tongChiPhi
	* @param tongDoanhThu
	* @param nuocDatTieuChuan
	* @param nuocCoAsen
	* @param nuocThatThoat
	* @param trangThaiDanhGia
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc updateDanhGiaTram(
		long id, long idNguoiDanhGia, java.util.Date ngayDanhGia,
		int trangThaiCapNuoc, int congXuatThucTe, int tongDauNoiThucTe,
		int soNguoiCapThucTe, int tongChiPhi, int tongDoanhThu,
		int nuocDatTieuChuan, int nuocCoAsen, int nuocThatThoat,
		int trangThaiDanhGia)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.updateDanhGiaTram(id, idNguoiDanhGia,
			ngayDanhGia, trangThaiCapNuoc, congXuatThucTe, tongDauNoiThucTe,
			soNguoiCapThucTe, tongChiPhi, tongDoanhThu, nuocDatTieuChuan,
			nuocCoAsen, nuocThatThoat, trangThaiDanhGia);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc updateDanhGiaTram(
		long id, long idNguoiDanhGia, java.util.Date ngayDanhGia,
		int trangThaiCapNuoc, int congXuatThucTe, int tongDauNoiThucTe,
		int soNguoiCapThucTe, int tongChiPhi, int tongDoanhThu,
		int nuocDatTieuChuan, int nuocCoAsen, int nuocThatThoat,
		int trangThaiDanhGia, int sanLuongSanXuat, int sanLuongTieuHao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.updateDanhGiaTram(id, idNguoiDanhGia,
			ngayDanhGia, trangThaiCapNuoc, congXuatThucTe, tongDauNoiThucTe,
			soNguoiCapThucTe, tongChiPhi, tongDoanhThu, nuocDatTieuChuan,
			nuocCoAsen, nuocThatThoat, trangThaiDanhGia, sanLuongSanXuat,
			sanLuongTieuHao);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc updateTramCap(long id,
		java.lang.String maTram, java.lang.String tenTram,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String diaChi,
		java.lang.String kinhDo, java.lang.String viDo, int loaiHinh,
		java.lang.String maMoHinh, int congXuatThietKe, int tongDauNoiThietKe,
		int soNguoiCapThietKe, int tinhTrangDuAn, int tienDoXayDung,
		int namXayDung, int namHoanThanh, java.util.Date ngayVanHanh,
		int boMayVanHanh, java.lang.String ghiChu)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.updateTramCap(id, maTram, tenTram,
			maTinh, maHuyen, maXa, diaChi, kinhDo, viDo, loaiHinh, maMoHinh,
			congXuatThietKe, tongDauNoiThietKe, soNguoiCapThietKe,
			tinhTrangDuAn, tienDoXayDung, namXayDung, namHoanThanh,
			ngayVanHanh, boMayVanHanh, ghiChu);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc updateTramCap(long id,
		long nguoiTaoId, java.lang.String maTram, java.lang.String tenTram,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String diaChi,
		java.lang.String kinhDo, java.lang.String viDo, int loaiHinh,
		java.lang.String maMoHinh, int congXuatThietKe, int tongDauNoiThietKe,
		int soNguoiCapThietKe, int tinhTrangDuAn, int tienDoXayDung,
		int namXayDung, int namHoanThanh, java.util.Date ngayVanHanh,
		int boMayVanHanh, java.lang.String ghiChu)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.updateTramCap(id, nguoiTaoId, maTram,
			tenTram, maTinh, maHuyen, maXa, diaChi, kinhDo, viDo, loaiHinh,
			maMoHinh, congXuatThietKe, tongDauNoiThietKe, soNguoiCapThietKe,
			tinhTrangDuAn, tienDoXayDung, namXayDung, namHoanThanh,
			ngayVanHanh, boMayVanHanh, ghiChu);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCap(
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getTramCap(start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getAllTramCap()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getAllTramCap();
	}

	@Override
	public int countAllTramCap()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.countAllTramCap();
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getByTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getByTinh(maTinh, start, end);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getByTinh(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getByTinh(maTinh);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getByTenTram(
		java.lang.String tenTram)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getByTenTram(tenTram);
	}

	@Override
	public int countByTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.countByTinh(maTinh);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByTinhDauNoiNuoc(
		java.lang.String maTinh, java.lang.String namBaoCao) {
		return _tramCapNuocLocalService.getTramCapNuocByTinhDauNoiNuoc(maTinh,
			namBaoCao);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByDanhGiaBenVung(
		java.lang.String maTinh, java.lang.String nam,
		java.lang.String danhGiaBenVung) {
		return _tramCapNuocLocalService.getTramCapNuocByDanhGiaBenVung(maTinh,
			nam, danhGiaBenVung);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocJoinDanhGiaBenVung(
		java.lang.String maTinh, java.lang.String nam) {
		return _tramCapNuocLocalService.getTramCapNuocJoinDanhGiaBenVung(maTinh,
			nam);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByThoiGianThuc(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem) {
		return _tramCapNuocLocalService.getTramCapNuocByThoiGianThuc(maTinh,
			namBaoCao, danhgiakiemdem);
	}

	@Override
	public int countTramCapThoiGianThuc(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String danhgiakiemdem,
		java.lang.String tramCapNuocId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.countTramCapThoiGianThuc(maTinh,
			namBaoCao, danhgiakiemdem, tramCapNuocId);
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc getTramCapNuocByMaTinhAndDNNID(
		java.lang.String maTinh, java.lang.String dauNoiNuocID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramCapNuocLocalService.getTramCapNuocByMaTinhAndDNNID(maTinh,
			dauNoiNuocID);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TramCapNuocLocalService getWrappedTramCapNuocLocalService() {
		return _tramCapNuocLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTramCapNuocLocalService(
		TramCapNuocLocalService tramCapNuocLocalService) {
		_tramCapNuocLocalService = tramCapNuocLocalService;
	}

	@Override
	public TramCapNuocLocalService getWrappedService() {
		return _tramCapNuocLocalService;
	}

	@Override
	public void setWrappedService(
		TramCapNuocLocalService tramCapNuocLocalService) {
		_tramCapNuocLocalService = tramCapNuocLocalService;
	}

	private TramCapNuocLocalService _tramCapNuocLocalService;
}