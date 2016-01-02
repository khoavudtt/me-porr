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

import vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil;

import java.util.Arrays;

/**
 * @author khoa.vu
 * @generated
 */
public class TramCapNuocLocalServiceClpInvoker {
	public TramCapNuocLocalServiceClpInvoker() {
		_methodName0 = "addTramCapNuoc";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"
			};

		_methodName1 = "createTramCapNuoc";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTramCapNuoc";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTramCapNuoc";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"
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

		_methodName10 = "fetchTramCapNuoc";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTramCapNuoc";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTramCapNuocs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTramCapNuocsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTramCapNuoc";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"
			};

		_methodName68 = "getBeanIdentifier";

		_methodParameterTypes68 = new String[] {  };

		_methodName69 = "setBeanIdentifier";

		_methodParameterTypes69 = new String[] { "java.lang.String" };

		_methodName74 = "getDoublicate";

		_methodParameterTypes74 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName75 = "danhGiaTram";

		_methodParameterTypes75 = new String[] {  };

		_methodName76 = "countTramCapByTinh";

		_methodParameterTypes76 = new String[] { "java.lang.String" };

		_methodName77 = "findByTinh";

		_methodParameterTypes77 = new String[] { "java.lang.String", "int", "int" };

		_methodName78 = "updaTrangThaiDanhGia";

		_methodParameterTypes78 = new String[] { "long", "int" };

		_methodName79 = "updateDanhGiaTram";

		_methodParameterTypes79 = new String[] {
				"long", "long", "java.util.Date", "int", "int", "int", "int",
				"int", "int", "int", "int", "int", "int"
			};

		_methodName80 = "updateDanhGiaTram";

		_methodParameterTypes80 = new String[] {
				"long", "long", "java.util.Date", "int", "int", "int", "int",
				"int", "int", "int", "int", "int", "int", "int", "int"
			};

		_methodName81 = "updateTramCap";

		_methodParameterTypes81 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "java.lang.String", "int", "int", "int", "int", "int",
				"int", "int", "java.util.Date", "int", "java.lang.String"
			};

		_methodName82 = "updateTramCap";

		_methodParameterTypes82 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "java.lang.String", "int", "int", "int", "int", "int",
				"int", "int", "java.util.Date", "int", "java.lang.String"
			};

		_methodName83 = "getTramCap";

		_methodParameterTypes83 = new String[] { "int", "int" };

		_methodName84 = "getAllTramCap";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "countAllTramCap";

		_methodParameterTypes85 = new String[] {  };

		_methodName86 = "getByTinh";

		_methodParameterTypes86 = new String[] { "java.lang.String", "int", "int" };

		_methodName87 = "getByTinh";

		_methodParameterTypes87 = new String[] { "java.lang.String" };

		_methodName88 = "getByTenTram";

		_methodParameterTypes88 = new String[] { "java.lang.String" };

		_methodName89 = "countByTinh";

		_methodParameterTypes89 = new String[] { "java.lang.String" };

		_methodName90 = "getTramCapNuocByTinhDauNoiNuoc";

		_methodParameterTypes90 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName91 = "getTramCapNuocByDanhGiaBenVung";

		_methodParameterTypes91 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName92 = "getTramCapNuocJoinDanhGiaBenVung";

		_methodParameterTypes92 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName93 = "getTramCapNuocByThoiGianThuc";

		_methodParameterTypes93 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName94 = "countTramCapThoiGianThuc";

		_methodParameterTypes94 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName95 = "getTramCapNuocByMaTinhAndDNNID";

		_methodParameterTypes95 = new String[] {
				"java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.addTramCapNuoc((vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.createTramCapNuoc(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.deleteTramCapNuoc(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.deleteTramCapNuoc((vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.fetchTramCapNuoc(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCapNuoc(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCapNuocs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCapNuocsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.updateTramCapNuoc((vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc)arguments[0]);
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			TramCapNuocLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getDoublicate((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.danhGiaTram();
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.countTramCapByTinh((java.lang.String)arguments[0]);
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.findByTinh((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.updaTrangThaiDanhGia(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.updateDanhGiaTram(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.util.Date)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue(),
				((Integer)arguments[10]).intValue(),
				((Integer)arguments[11]).intValue(),
				((Integer)arguments[12]).intValue());
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.updateDanhGiaTram(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.util.Date)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue(),
				((Integer)arguments[10]).intValue(),
				((Integer)arguments[11]).intValue(),
				((Integer)arguments[12]).intValue(),
				((Integer)arguments[13]).intValue(),
				((Integer)arguments[14]).intValue());
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.updateTramCap(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				((Integer)arguments[9]).intValue(),
				(java.lang.String)arguments[10],
				((Integer)arguments[11]).intValue(),
				((Integer)arguments[12]).intValue(),
				((Integer)arguments[13]).intValue(),
				((Integer)arguments[14]).intValue(),
				((Integer)arguments[15]).intValue(),
				((Integer)arguments[16]).intValue(),
				((Integer)arguments[17]).intValue(),
				(java.util.Date)arguments[18],
				((Integer)arguments[19]).intValue(),
				(java.lang.String)arguments[20]);
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.updateTramCap(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				(java.lang.String)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				((Integer)arguments[10]).intValue(),
				(java.lang.String)arguments[11],
				((Integer)arguments[12]).intValue(),
				((Integer)arguments[13]).intValue(),
				((Integer)arguments[14]).intValue(),
				((Integer)arguments[15]).intValue(),
				((Integer)arguments[16]).intValue(),
				((Integer)arguments[17]).intValue(),
				((Integer)arguments[18]).intValue(),
				(java.util.Date)arguments[19],
				((Integer)arguments[20]).intValue(),
				(java.lang.String)arguments[21]);
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCap(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getAllTramCap();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.countAllTramCap();
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getByTinh((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getByTinh((java.lang.String)arguments[0]);
		}

		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getByTenTram((java.lang.String)arguments[0]);
		}

		if (_methodName89.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.countByTinh((java.lang.String)arguments[0]);
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCapNuocByTinhDauNoiNuoc((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCapNuocByDanhGiaBenVung((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCapNuocJoinDanhGiaBenVung((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCapNuocByThoiGianThuc((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.countTramCapThoiGianThuc((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3]);
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return TramCapNuocLocalServiceUtil.getTramCapNuocByMaTinhAndDNNID((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
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
}