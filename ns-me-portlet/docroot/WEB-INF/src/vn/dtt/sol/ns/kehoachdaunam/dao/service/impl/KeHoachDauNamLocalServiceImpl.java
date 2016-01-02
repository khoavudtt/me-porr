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

package vn.dtt.sol.ns.kehoachdaunam.dao.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;
import vn.dtt.sol.ns.kehoachdaunam.dao.service.base.KeHoachDauNamLocalServiceBaseImpl;

/**
 * The implementation of the ke hoach dau nam local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.kehoachdaunam.dao.service.KeHoachDauNamLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HANT
 * @see vn.dtt.sol.ns.kehoachdaunam.dao.service.base.KeHoachDauNamLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.kehoachdaunam.dao.service.KeHoachDauNamLocalServiceUtil
 */
public class KeHoachDauNamLocalServiceImpl
	extends KeHoachDauNamLocalServiceBaseImpl {

	@Override
	public List<KeHoachDauNam>searchByNamAndTinh(long namKeHoach, String maTinh, int start, int end)
	throws PortalException, SystemException{
		
		return keHoachDauNamFinder.searchByNamAndTinh(namKeHoach, maTinh, start, end);
	}
	
	@Override
	public int countByNamAndTinh(long namKeHoach, String maTinh)
	throws PortalException, SystemException{
		
		return keHoachDauNamFinder.countByNamAndTinh(namKeHoach, maTinh);
	}
	
	@Override
	public List<KeHoachDauNam> searchByNamAndTram(long namKeHoach, String maTram, int start, int end)
	throws PortalException, SystemException{
		
		return keHoachDauNamFinder.searchByNamAndTram(namKeHoach, maTram, start, end);
	}
	
	@Override
	public int countByNamAndTram(long namKeHoach, String maTram)
	throws PortalException, SystemException{
		
		return keHoachDauNamFinder.countByNamAndTram(namKeHoach, maTram);
	}
	
	public int countSoNguoiHuongLoiCapNcBenVung(String nam, String maTinh) 
			throws PortalException, SystemException{
		return keHoachDauNamFinder.countSoNguoiHuongLoiCapNcBenVung(nam,maTinh);
	}
	public List<KeHoachDauNam> searchByNamAndMaTinh(String nam, String maTinh) 
			throws PortalException, SystemException{
		return keHoachDauNamFinder.searchByNamAndMaTinh(nam,maTinh);
	}
	public int sumSoDauNoiMoiTW(String namBaoCao, String  maTinh) throws SystemException {
		return keHoachDauNamFinder.sumSoDauNoiMoiTW(namBaoCao,maTinh);
	}
}