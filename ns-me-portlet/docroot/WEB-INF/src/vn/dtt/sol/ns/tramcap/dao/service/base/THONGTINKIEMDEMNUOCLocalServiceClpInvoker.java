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

package vn.dtt.sol.ns.tramcap.dao.service.base;

import vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil;

import java.util.Arrays;

/**
 * @author khoa.vu
 * @generated
 */
public class THONGTINKIEMDEMNUOCLocalServiceClpInvoker {
	public THONGTINKIEMDEMNUOCLocalServiceClpInvoker() {
		_methodName0 = "addTHONGTINKIEMDEMNUOC";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC"
			};

		_methodName1 = "createTHONGTINKIEMDEMNUOC";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTHONGTINKIEMDEMNUOC";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTHONGTINKIEMDEMNUOC";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC"
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

		_methodName10 = "fetchTHONGTINKIEMDEMNUOC";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTHONGTINKIEMDEMNUOC";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTHONGTINKIEMDEMNUOCs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTHONGTINKIEMDEMNUOCsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTHONGTINKIEMDEMNUOC";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC"
			};

		_methodName68 = "getBeanIdentifier";

		_methodParameterTypes68 = new String[] {  };

		_methodName69 = "setBeanIdentifier";

		_methodParameterTypes69 = new String[] { "java.lang.String" };

		_methodName74 = "getListByDauNoiId";

		_methodParameterTypes74 = new String[] { "long", "int", "int" };

		_methodName75 = "getListBykeHoachKiemDemNuocId";

		_methodParameterTypes75 = new String[] { "int", "int", "int" };

		_methodName76 = "getThongTinKeHoachKiemDemNuocSearch";

		_methodParameterTypes76 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int"
			};

		_methodName77 = "getHuyenXaKeHoachKiemDemNuocSearch";

		_methodParameterTypes77 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName78 = "getSumDauNoiBykeHoachKiemDemNuocId";

		_methodParameterTypes78 = new String[] { "int" };

		_methodName79 = "getCountDauNoiBykeHoachKiemDemNuocId";

		_methodParameterTypes79 = new String[] { "int", "int" };

		_methodName80 = "getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem";

		_methodParameterTypes80 = new String[] { "int", "int" };

		_methodName81 = "getThongTinDNNThoiGianThuc";

		_methodParameterTypes81 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName82 = "getThongTinKeHoachKiemDemNuocSearch";

		_methodParameterTypes82 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "int", "int"
			};

		_methodName83 = "countGioiTinhChuHo";

		_methodParameterTypes83 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.addTHONGTINKIEMDEMNUOC((vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.createTHONGTINKIEMDEMNUOC(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.deleteTHONGTINKIEMDEMNUOC(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.deleteTHONGTINKIEMDEMNUOC((vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.fetchTHONGTINKIEMDEMNUOC(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getTHONGTINKIEMDEMNUOC(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getTHONGTINKIEMDEMNUOCs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getTHONGTINKIEMDEMNUOCsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.updateTHONGTINKIEMDEMNUOC((vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC)arguments[0]);
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			THONGTINKIEMDEMNUOCLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getListByDauNoiId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getListBykeHoachKiemDemNuocId(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getThongTinKeHoachKiemDemNuocSearch((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue());
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getHuyenXaKeHoachKiemDemNuocSearch((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getSumDauNoiBykeHoachKiemDemNuocId(((Integer)arguments[0]).intValue());
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getCountDauNoiBykeHoachKiemDemNuocId(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getThongTinDNNThoiGianThuc((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.getThongTinKeHoachKiemDemNuocSearch((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue());
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return THONGTINKIEMDEMNUOCLocalServiceUtil.countGioiTinhChuHo((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3]);
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
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName78;
	private String[] _methodParameterTypes78;
	private String _methodName79;
	private String[] _methodParameterTypes79;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName81;
	private String[] _methodParameterTypes81;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
}