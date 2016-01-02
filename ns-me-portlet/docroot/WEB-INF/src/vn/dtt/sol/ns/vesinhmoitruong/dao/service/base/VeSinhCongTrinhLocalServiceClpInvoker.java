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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service.base;

import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;

import java.util.Arrays;

/**
 * @author BinhTH
 * @generated
 */
public class VeSinhCongTrinhLocalServiceClpInvoker {
	public VeSinhCongTrinhLocalServiceClpInvoker() {
		_methodName0 = "addVeSinhCongTrinh";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh"
			};

		_methodName1 = "createVeSinhCongTrinh";

		_methodParameterTypes1 = new String[] { "int" };

		_methodName2 = "deleteVeSinhCongTrinh";

		_methodParameterTypes2 = new String[] { "int" };

		_methodName3 = "deleteVeSinhCongTrinh";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchVeSinhCongTrinh";

		_methodParameterTypes10 = new String[] { "int" };

		_methodName11 = "getVeSinhCongTrinh";

		_methodParameterTypes11 = new String[] { "int" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getVeSinhCongTrinhs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getVeSinhCongTrinhsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateVeSinhCongTrinh";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh"
			};

		_methodName76 = "getBeanIdentifier";

		_methodParameterTypes76 = new String[] {  };

		_methodName77 = "setBeanIdentifier";

		_methodParameterTypes77 = new String[] { "java.lang.String" };

		_methodName82 = "COUNT_VE_SINH_GIA_DINH_ADMIN";

		_methodParameterTypes82 = new String[] {  };

		_methodName83 = "COUNT_VE_SINH_GIA_DINH_TU";

		_methodParameterTypes83 = new String[] { "long" };

		_methodName84 = "COUNT_VE_SINH_GIA_DINH_TINH";

		_methodParameterTypes84 = new String[] { "java.lang.String", "long" };

		_methodName85 = "COUNT_VE_SINH_GIA_DINH_HUYEN";

		_methodParameterTypes85 = new String[] { "java.lang.String", "long" };

		_methodName86 = "COUNT_VE_SINH_CONG_TRINH_ADMIN";

		_methodParameterTypes86 = new String[] {  };

		_methodName87 = "COUNT_VE_SINH_CONG_TRINH_TU";

		_methodParameterTypes87 = new String[] { "long" };

		_methodName88 = "COUNT_VE_SINH_CONG_TRINH_TINH";

		_methodParameterTypes88 = new String[] { "java.lang.String", "long" };

		_methodName89 = "COUNT_VE_SINH_CONG_TRINH_HUYEN";

		_methodParameterTypes89 = new String[] { "java.lang.String", "long" };

		_methodName90 = "COUNT_KIEM_DEM_VE_SINH_ADMIN";

		_methodParameterTypes90 = new String[] { "long" };

		_methodName91 = "COUNT_KIEM_DEM_VE_SINH_TU";

		_methodParameterTypes91 = new String[] { "long" };

		_methodName92 = "COUNT_KIEM_DEM_VE_SINH_TINH";

		_methodParameterTypes92 = new String[] { "long" };

		_methodName93 = "COUNT_KIEM_DEM_VE_SINH_HUYEN";

		_methodParameterTypes93 = new String[] { "long" };

		_methodName94 = "COUNT_KE_HOACH_VE_SINH_ADMIN";

		_methodParameterTypes94 = new String[] {  };

		_methodName95 = "COUNT_KE_HOACH_VE_SINH_TU";

		_methodParameterTypes95 = new String[] {  };

		_methodName96 = "COUNT_KE_HOACH_VE_SINH_TINH";

		_methodParameterTypes96 = new String[] { "java.lang.String" };

		_methodName97 = "COUNT_KE_HOACH_VE_SINH_HUYEN";

		_methodParameterTypes97 = new String[] { "java.lang.String" };

		_methodName98 = "COUNT_DANH_GIA_VE_SINH_ADMIN";

		_methodParameterTypes98 = new String[] {  };

		_methodName99 = "COUNT_DANH_GIA_VE_SINH_TU";

		_methodParameterTypes99 = new String[] {  };

		_methodName100 = "COUNT_DANH_GIA_VE_SINH_TINH";

		_methodParameterTypes100 = new String[] { "java.lang.String" };

		_methodName101 = "COUNT_DANH_GIA_VE_SINH_HUYEN";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName102 = "COUNT_MAU_NGAU_NHIEN_ADMIN";

		_methodParameterTypes102 = new String[] {  };

		_methodName103 = "COUNT_MAU_NGAU_NHIEN_TU";

		_methodParameterTypes103 = new String[] {  };

		_methodName104 = "COUNT_MAU_NGAU_NHIEN_TINH";

		_methodParameterTypes104 = new String[] { "java.lang.String" };

		_methodName105 = "COUNT_MAU_NGAU_NHIEN_HUYEN";

		_methodParameterTypes105 = new String[] { "java.lang.String" };

		_methodName106 = "COUNT_DANH_GIA_CUOI_NAM_ADMIN";

		_methodParameterTypes106 = new String[] {  };

		_methodName107 = "COUNT_DANH_GIA_CUOI_NAM_TU";

		_methodParameterTypes107 = new String[] {  };

		_methodName108 = "COUNT_DANH_GIA_CUOI_NAM_TINH";

		_methodParameterTypes108 = new String[] { "java.lang.String" };

		_methodName109 = "COUNT_DANH_GIA_CUOI_NAM_TRAMCAP";

		_methodParameterTypes109 = new String[] { "java.lang.String" };

		_methodName110 = "COUNT_KE_HOACH_DAU_NAM_AMDIN";

		_methodParameterTypes110 = new String[] {  };

		_methodName111 = "COUNT_KE_HOACH_DAU_NAM_TU";

		_methodParameterTypes111 = new String[] {  };

		_methodName112 = "COUNT_KE_HOACH_DAU_NAM_TINH";

		_methodParameterTypes112 = new String[] { "java.lang.String" };

		_methodName113 = "COUNT_KE_HOACH_DAU_NAM_TRAMCAP";

		_methodParameterTypes113 = new String[] { "long" };

		_methodName114 = "COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP";

		_methodParameterTypes114 = new String[] { "long" };

		_methodName115 = "COUNT_KE_HOACH_DAU_NOI_NUOC_TINH";

		_methodParameterTypes115 = new String[] { "java.lang.String" };

		_methodName116 = "COUNT_KE_HOACH_DAU_NOI_NUOC_TU";

		_methodParameterTypes116 = new String[] {  };

		_methodName117 = "COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN";

		_methodParameterTypes117 = new String[] {  };

		_methodName118 = "COUNT_DAU_NOI_NUOC_TRAMCAP";

		_methodParameterTypes118 = new String[] { "java.lang.String", "long" };

		_methodName119 = "COUNT_DAU_NOI_NUOC_TINH";

		_methodParameterTypes119 = new String[] { "java.lang.String" };

		_methodName120 = "COUNT_DAU_NOI_NUOC_TU";

		_methodParameterTypes120 = new String[] { "long" };

		_methodName121 = "COUNT_DAU_NOI_NUOC_ADMIN";

		_methodParameterTypes121 = new String[] { "long" };

		_methodName122 = "COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP";

		_methodParameterTypes122 = new String[] { "long" };

		_methodName123 = "COUNT_CONG_TRINH_CAP_NUOC_TINH";

		_methodParameterTypes123 = new String[] { "java.lang.String", "long" };

		_methodName124 = "COUNT_CONG_TRINH_CAP_NUOC_TU";

		_methodParameterTypes124 = new String[] { "long" };

		_methodName125 = "COUNT_CONG_TRINH_CAP_NUOC_ADMIN";

		_methodParameterTypes125 = new String[] {  };

		_methodName126 = "countDauNoiInTinh";

		_methodParameterTypes126 = new String[] { "java.lang.String" };

		_methodName127 = "countDauNoiPhanKHInTinh";

		_methodParameterTypes127 = new String[] { "java.lang.String" };

		_methodName128 = "countDauNoiDongBoInTinh";

		_methodParameterTypes128 = new String[] { "java.lang.String" };

		_methodName129 = "countHGDInTinh";

		_methodParameterTypes129 = new String[] { "java.lang.String", "int" };

		_methodName130 = "countHGDPhanKHInTinh";

		_methodParameterTypes130 = new String[] { "java.lang.String", "int" };

		_methodName131 = "countHDGDongBoInTinh";

		_methodParameterTypes131 = new String[] { "java.lang.String" };

		_methodName132 = "countCongTrinhInTinh";

		_methodParameterTypes132 = new String[] { "java.lang.String" };

		_methodName133 = "countCongTrinhPhanKHInTinh";

		_methodParameterTypes133 = new String[] { "java.lang.String" };

		_methodName134 = "countCongTrinhDongBoInTinh";

		_methodParameterTypes134 = new String[] { "java.lang.String" };

		_methodName135 = "countVeSinhCongTrinhSearch";

		_methodParameterTypes135 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName136 = "getVeSinhCongTrinhSearch";

		_methodParameterTypes136 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.addVeSinhCongTrinh((vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.createVeSinhCongTrinh(((Integer)arguments[0]).intValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.deleteVeSinhCongTrinh(((Integer)arguments[0]).intValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.deleteVeSinhCongTrinh((vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.fetchVeSinhCongTrinh(((Integer)arguments[0]).intValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinh(((Integer)arguments[0]).intValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.updateVeSinhCongTrinh((vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh)arguments[0]);
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			VeSinhCongTrinhLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_GIA_DINH_ADMIN();
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_GIA_DINH_TU(((Long)arguments[0]).longValue());
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_GIA_DINH_TINH((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_GIA_DINH_HUYEN((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_CONG_TRINH_ADMIN();
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_CONG_TRINH_TU(((Long)arguments[0]).longValue());
		}

		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_CONG_TRINH_TINH((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName89.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_VE_SINH_CONG_TRINH_HUYEN((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KIEM_DEM_VE_SINH_ADMIN(((Long)arguments[0]).longValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KIEM_DEM_VE_SINH_TU(((Long)arguments[0]).longValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KIEM_DEM_VE_SINH_TINH(((Long)arguments[0]).longValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KIEM_DEM_VE_SINH_HUYEN(((Long)arguments[0]).longValue());
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_VE_SINH_ADMIN();
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_VE_SINH_TU();
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_VE_SINH_TINH((java.lang.String)arguments[0]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_VE_SINH_HUYEN((java.lang.String)arguments[0]);
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_VE_SINH_ADMIN();
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_VE_SINH_TU();
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_VE_SINH_TINH((java.lang.String)arguments[0]);
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_VE_SINH_HUYEN((java.lang.String)arguments[0]);
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_MAU_NGAU_NHIEN_ADMIN();
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_MAU_NGAU_NHIEN_TU();
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_MAU_NGAU_NHIEN_TINH((java.lang.String)arguments[0]);
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_MAU_NGAU_NHIEN_HUYEN((java.lang.String)arguments[0]);
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_CUOI_NAM_ADMIN();
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_CUOI_NAM_TU();
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_CUOI_NAM_TINH((java.lang.String)arguments[0]);
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DANH_GIA_CUOI_NAM_TRAMCAP((java.lang.String)arguments[0]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_DAU_NAM_AMDIN();
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_DAU_NAM_TU();
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_DAU_NAM_TINH((java.lang.String)arguments[0]);
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_DAU_NAM_TRAMCAP(((Long)arguments[0]).longValue());
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(((Long)arguments[0]).longValue());
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_DAU_NOI_NUOC_TINH((java.lang.String)arguments[0]);
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_DAU_NOI_NUOC_TU();
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN();
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DAU_NOI_NUOC_TRAMCAP((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DAU_NOI_NUOC_TINH((java.lang.String)arguments[0]);
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DAU_NOI_NUOC_TU(((Long)arguments[0]).longValue());
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_DAU_NOI_NUOC_ADMIN(((Long)arguments[0]).longValue());
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(((Long)arguments[0]).longValue());
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_CONG_TRINH_CAP_NUOC_TINH((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_CONG_TRINH_CAP_NUOC_TU(((Long)arguments[0]).longValue());
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.COUNT_CONG_TRINH_CAP_NUOC_ADMIN();
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh((java.lang.String)arguments[0]);
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh((java.lang.String)arguments[0]);
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh((java.lang.String)arguments[0]);
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countHGDInTinh((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh((java.lang.String)arguments[0]);
		}

		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh((java.lang.String)arguments[0]);
		}

		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh((java.lang.String)arguments[0]);
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh((java.lang.String)arguments[0]);
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6]);
		}

		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
			return VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhSearch((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName85;
	private String[] _methodParameterTypes85;
	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName87;
	private String[] _methodParameterTypes87;
	private String _methodName88;
	private String[] _methodParameterTypes88;
	private String _methodName89;
	private String[] _methodParameterTypes89;
	private String _methodName90;
	private String[] _methodParameterTypes90;
	private String _methodName91;
	private String[] _methodParameterTypes91;
	private String _methodName92;
	private String[] _methodParameterTypes92;
	private String _methodName93;
	private String[] _methodParameterTypes93;
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName98;
	private String[] _methodParameterTypes98;
	private String _methodName99;
	private String[] _methodParameterTypes99;
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
	private String _methodName134;
	private String[] _methodParameterTypes134;
	private String _methodName135;
	private String[] _methodParameterTypes135;
	private String _methodName136;
	private String[] _methodParameterTypes136;
}