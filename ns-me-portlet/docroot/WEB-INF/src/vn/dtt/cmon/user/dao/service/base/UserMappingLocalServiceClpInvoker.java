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

package vn.dtt.cmon.user.dao.service.base;

import vn.dtt.cmon.user.dao.service.UserMappingLocalServiceUtil;

import java.util.Arrays;

/**
 * @author khoa.vu
 * @generated
 */
public class UserMappingLocalServiceClpInvoker {
	public UserMappingLocalServiceClpInvoker() {
		_methodName0 = "addUserMapping";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.cmon.user.dao.model.UserMapping"
			};

		_methodName1 = "createUserMapping";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteUserMapping";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteUserMapping";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.cmon.user.dao.model.UserMapping"
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

		_methodName10 = "fetchUserMapping";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getUserMapping";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getUserMappings";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getUserMappingsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateUserMapping";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.cmon.user.dao.model.UserMapping"
			};

		_methodName58 = "getBeanIdentifier";

		_methodParameterTypes58 = new String[] {  };

		_methodName59 = "setBeanIdentifier";

		_methodParameterTypes59 = new String[] { "java.lang.String" };

		_methodName64 = "count";

		_methodParameterTypes64 = new String[] {
				"java.lang.String", "int", "java.lang.String",
				"java.lang.String"
			};

		_methodName65 = "find";

		_methodParameterTypes65 = new String[] {
				"java.lang.String", "int", "java.lang.String",
				"java.lang.String", "int", "int"
			};

		_methodName66 = "getByUserId";

		_methodParameterTypes66 = new String[] { "long" };

		_methodName67 = "getByOrg1_Org2";

		_methodParameterTypes67 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName68 = "getByOrg1";

		_methodParameterTypes68 = new String[] { "java.lang.String" };

		_methodName69 = "getByOrg2";

		_methodParameterTypes69 = new String[] { "java.lang.String" };

		_methodName70 = "getByTypeOrg1";

		_methodParameterTypes70 = new String[] { "int", "java.lang.String" };

		_methodName71 = "getByTypeOrg2";

		_methodParameterTypes71 = new String[] {
				"int", "java.lang.String", "java.lang.String"
			};

		_methodName72 = "getByUserType";

		_methodParameterTypes72 = new String[] { "int" };

		_methodName73 = "updateUserMapping";

		_methodParameterTypes73 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "long[][]", "long[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName74 = "addUserMapping";

		_methodParameterTypes74 = new String[] {
				"java.lang.String", "int", "long", "long", "boolean",
				"java.lang.String", "java.lang.String", "boolean",
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String", "java.util.Locale", "java.lang.String",
				"java.lang.String", "java.lang.String", "int", "int", "boolean",
				"int", "int", "int", "java.lang.String", "long[][]", "long[][]",
				"long[][]", "long[][]", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName75 = "addUserMapping";

		_methodParameterTypes75 = new String[] {
				"long", "java.lang.String", "long", "int", "java.lang.String",
				"java.lang.String"
			};

		_methodName76 = "addUserMapping";

		_methodParameterTypes76 = new String[] {
				"long", "long", "int", "java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return UserMappingLocalServiceUtil.addUserMapping((vn.dtt.cmon.user.dao.model.UserMapping)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return UserMappingLocalServiceUtil.createUserMapping(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return UserMappingLocalServiceUtil.deleteUserMapping(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return UserMappingLocalServiceUtil.deleteUserMapping((vn.dtt.cmon.user.dao.model.UserMapping)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return UserMappingLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return UserMappingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return UserMappingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return UserMappingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return UserMappingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return UserMappingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return UserMappingLocalServiceUtil.fetchUserMapping(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return UserMappingLocalServiceUtil.getUserMapping(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return UserMappingLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return UserMappingLocalServiceUtil.getUserMappings(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return UserMappingLocalServiceUtil.getUserMappingsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return UserMappingLocalServiceUtil.updateUserMapping((vn.dtt.cmon.user.dao.model.UserMapping)arguments[0]);
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return UserMappingLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			UserMappingLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return UserMappingLocalServiceUtil.count((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			return UserMappingLocalServiceUtil.find((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue());
		}

		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			return UserMappingLocalServiceUtil.getByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName67.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
			return UserMappingLocalServiceUtil.getByOrg1_Org2((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return UserMappingLocalServiceUtil.getByOrg1((java.lang.String)arguments[0]);
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			return UserMappingLocalServiceUtil.getByOrg2((java.lang.String)arguments[0]);
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return UserMappingLocalServiceUtil.getByTypeOrg1(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			return UserMappingLocalServiceUtil.getByTypeOrg2(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			return UserMappingLocalServiceUtil.getByUserType(((Integer)arguments[0]).intValue());
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			return UserMappingLocalServiceUtil.updateUserMapping(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (long[])arguments[4],
				(long[])arguments[5],
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return UserMappingLocalServiceUtil.addUserMapping((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				((Boolean)arguments[4]).booleanValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				((Boolean)arguments[7]).booleanValue(),
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				((Long)arguments[10]).longValue(),
				(java.lang.String)arguments[11],
				(java.util.Locale)arguments[12],
				(java.lang.String)arguments[13],
				(java.lang.String)arguments[14],
				(java.lang.String)arguments[15],
				((Integer)arguments[16]).intValue(),
				((Integer)arguments[17]).intValue(),
				((Boolean)arguments[18]).booleanValue(),
				((Integer)arguments[19]).intValue(),
				((Integer)arguments[20]).intValue(),
				((Integer)arguments[21]).intValue(),
				(java.lang.String)arguments[22], (long[])arguments[23],
				(long[])arguments[24], (long[])arguments[25],
				(long[])arguments[26], ((Boolean)arguments[27]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[28]);
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			return UserMappingLocalServiceUtil.addUserMapping(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue(),
				(java.lang.String)arguments[4], (java.lang.String)arguments[5]);
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return UserMappingLocalServiceUtil.addUserMapping(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4]);
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
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName67;
	private String[] _methodParameterTypes67;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName76;
	private String[] _methodParameterTypes76;
}