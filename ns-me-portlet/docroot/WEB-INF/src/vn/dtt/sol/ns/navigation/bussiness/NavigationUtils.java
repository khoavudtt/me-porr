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
package vn.dtt.sol.ns.navigation.bussiness;

import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class NavigationUtils {

	public static int countMenu(String tableName, int userType,
			boolean isAdmin, String maTinh, long userId) {
		int count = 0;

		if (tableName.contentEquals("me_tramcapnuoc")) {
			count = countTramCap(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_daunoinuoc")) {
			count = countDauNoiNuoc(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_kehoachkiemdemnuoc")) {
			count = countKeHoachDauNoiNuoc(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_danhgiabenvung")) {
			count = countDanhGiaCuoiNam(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_kehoachdaunam")) {
			count = countKeHoachDauNam(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_thongke_nuocsach")) {
			count = countThongKeNuocThoiGianThuc(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_vesinhgiadinh")) {
			count = countVeSinhGiaDinh(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_vesinhcongtrinh")) {
			count = countVeSinhCongTrinh(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_kehoachkiemdemvesinh")) {
			count = countKiemDemVeSinh(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_vesinhtoanxa")) {
			count = countDanhGIaVeSinh(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_kehoachvesinh")) {
			count = countKeHoachKiemDemVeSinh(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_maungaunnhien")) {
			count = countMauNgauNhien(userType, isAdmin, maTinh, userId);
		} else if (tableName.contentEquals("me_nha_tieu_hvs")) {
			count = countThongKeHopVeSinh(userType, isAdmin, maTinh, userId);
		}

		return count;

	}
	
	private static int countThongKeHopVeSinh(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = 8;
			} else {
				if (userType == 1) {
					count = 8;
				} else if (userType == 2) {
					count = 1;
				} else if (userType == 3) {
					count = 1;
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;

	}

	
	private static int countMauNgauNhien(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil.COUNT_MAU_NGAU_NHIEN_ADMIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_MAU_NGAU_NHIEN_TU();
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_MAU_NGAU_NHIEN_TINH(maTinh);
				} else if (userType == 3) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_MAU_NGAU_NHIEN_HUYEN(maTinh);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	
	private static int countDanhGIaVeSinh(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_VE_SINH_ADMIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_VE_SINH_TU();
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_VE_SINH_TINH(maTinh);
				} else if (userType == 3) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_VE_SINH_HUYEN(maTinh);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	
	private static int countKeHoachKiemDemVeSinh(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_VE_SINH_ADMIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_VE_SINH_TU();
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_VE_SINH_TINH(maTinh);
				} else if (userType == 3) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_VE_SINH_HUYEN(maTinh);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	
	private static int countKiemDemVeSinh(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil.COUNT_KIEM_DEM_VE_SINH_ADMIN(userId);
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_KIEM_DEM_VE_SINH_TU(userId);
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_KIEM_DEM_VE_SINH_TINH(userId);
				} else if (userType == 3) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_KIEM_DEM_VE_SINH_HUYEN(userId);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	
	private static int countVeSinhCongTrinh(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_CONG_TRINH_ADMIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_CONG_TRINH_TU(userId);
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_CONG_TRINH_TINH(maTinh, userId);
				} else if (userType == 3) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_CONG_TRINH_HUYEN(maTinh, userId);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;

	}

	private static int countVeSinhGiaDinh(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_GIA_DINH_ADMIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_GIA_DINH_TU(userId);
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_GIA_DINH_TINH(maTinh, userId);
				} else if (userType == 3) {
					count = VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_GIA_DINH_HUYEN(maTinh, userId);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;

	}


	private static int countThongKeNuocThoiGianThuc(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = 8;
			} else {
				if (userType == 1) {
					count = 8;
				} else if (userType == 2) {
					count = 1;
				} else if (userType == 4) {
					count = 1;
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;

	}


	private static int countKeHoachDauNam(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil
						.COUNT_KE_HOACH_DAU_NAM_AMDIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_KE_HOACH_DAU_NAM_TU();
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_KE_HOACH_DAU_NAM_TINH(maTinh);
				} else if (userType == 4) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_KE_HOACH_DAU_NAM_TRAMCAP(userId);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;

	}

	private static int countDanhGiaCuoiNam(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil
						.COUNT_DANH_GIA_CUOI_NAM_ADMIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_DANH_GIA_CUOI_NAM_TU();
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_DANH_GIA_CUOI_NAM_TINH(maTinh);
				} else if (userType == 4) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_DANH_GIA_CUOI_NAM_TRAMCAP(maTinh);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	/**
	 * @param userType
	 * @param isAdmin
	 * @param maTinh
	 * @param userId
	 * @return
	 */
	private static int countTramCap(int userType, boolean isAdmin,
			String maTinh, long userId) {

		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil
						.COUNT_CONG_TRINH_CAP_NUOC_ADMIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_CONG_TRINH_CAP_NUOC_TU(userId);
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_CONG_TRINH_CAP_NUOC_TINH(maTinh, userId);
				} else if (userType == 4) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(userId);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	private static int countDauNoiNuoc(int userType, boolean isAdmin,
			String maTinh, long userId) {
		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil
						.COUNT_DAU_NOI_NUOC_ADMIN(userId);
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_DAU_NOI_NUOC_TU(userId);
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_DAU_NOI_NUOC_TINH(maTinh);
				} else if (userType == 4) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_DAU_NOI_NUOC_TRAMCAP(maTinh, userId);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	/**
	 * @param userType
	 * @param isAdmin
	 * @param maTinh
	 * @param userId
	 * @return
	 */
	private static int countKeHoachDauNoiNuoc(int userType, boolean isAdmin,
			String maTinh, long userId) {

		int count = 0;

		try {
			if (isAdmin) {
				count = VeSinhCongTrinhLocalServiceUtil
						.COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN();
			} else {
				if (userType == 1) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_KE_HOACH_DAU_NOI_NUOC_TU();
				} else if (userType == 2) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_KE_HOACH_DAU_NOI_NUOC_TINH(maTinh);
				} else if (userType == 4) {
					count = VeSinhCongTrinhLocalServiceUtil
							.COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(userId);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	private static Log _log = LogFactoryUtil.getLog(NavigationUtils.class);
}
