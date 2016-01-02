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

package vn.dtt.cmon.user.dao.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.dtt.cmon.user.dao.model.UserHuyenClp;
import vn.dtt.cmon.user.dao.model.UserMappingClp;
import vn.dtt.cmon.user.dao.model.UserTUClp;
import vn.dtt.cmon.user.dao.model.UserTinhClp;
import vn.dtt.cmon.user.dao.model.UserTramCapClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author khoa.vu
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"ns-me-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"ns-me-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "ns-me-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(UserHuyenClp.class.getName())) {
			return translateInputUserHuyen(oldModel);
		}

		if (oldModelClassName.equals(UserMappingClp.class.getName())) {
			return translateInputUserMapping(oldModel);
		}

		if (oldModelClassName.equals(UserTinhClp.class.getName())) {
			return translateInputUserTinh(oldModel);
		}

		if (oldModelClassName.equals(UserTramCapClp.class.getName())) {
			return translateInputUserTramCap(oldModel);
		}

		if (oldModelClassName.equals(UserTUClp.class.getName())) {
			return translateInputUserTU(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputUserHuyen(BaseModel<?> oldModel) {
		UserHuyenClp oldClpModel = (UserHuyenClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserHuyenRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserMapping(BaseModel<?> oldModel) {
		UserMappingClp oldClpModel = (UserMappingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserMappingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserTinh(BaseModel<?> oldModel) {
		UserTinhClp oldClpModel = (UserTinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserTinhRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserTramCap(BaseModel<?> oldModel) {
		UserTramCapClp oldClpModel = (UserTramCapClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserTramCapRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserTU(BaseModel<?> oldModel) {
		UserTUClp oldClpModel = (UserTUClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserTURemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"vn.dtt.cmon.user.dao.model.impl.UserHuyenImpl")) {
			return translateOutputUserHuyen(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.cmon.user.dao.model.impl.UserMappingImpl")) {
			return translateOutputUserMapping(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.cmon.user.dao.model.impl.UserTinhImpl")) {
			return translateOutputUserTinh(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.cmon.user.dao.model.impl.UserTramCapImpl")) {
			return translateOutputUserTramCap(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.cmon.user.dao.model.impl.UserTUImpl")) {
			return translateOutputUserTU(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("vn.dtt.cmon.user.dao.UserSystemException")) {
			return new vn.dtt.cmon.user.dao.UserSystemException();
		}

		if (className.equals("vn.dtt.cmon.user.dao.NoSuchUserHuyenException")) {
			return new vn.dtt.cmon.user.dao.NoSuchUserHuyenException();
		}

		if (className.equals("vn.dtt.cmon.user.dao.NoSuchUserMappingException")) {
			return new vn.dtt.cmon.user.dao.NoSuchUserMappingException();
		}

		if (className.equals("vn.dtt.cmon.user.dao.NoSuchUserTinhException")) {
			return new vn.dtt.cmon.user.dao.NoSuchUserTinhException();
		}

		if (className.equals("vn.dtt.cmon.user.dao.NoSuchUserTramCapException")) {
			return new vn.dtt.cmon.user.dao.NoSuchUserTramCapException();
		}

		if (className.equals("vn.dtt.cmon.user.dao.NoSuchUserTUException")) {
			return new vn.dtt.cmon.user.dao.NoSuchUserTUException();
		}

		return throwable;
	}

	public static Object translateOutputUserHuyen(BaseModel<?> oldModel) {
		UserHuyenClp newModel = new UserHuyenClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserHuyenRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserMapping(BaseModel<?> oldModel) {
		UserMappingClp newModel = new UserMappingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserMappingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserTinh(BaseModel<?> oldModel) {
		UserTinhClp newModel = new UserTinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserTinhRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserTramCap(BaseModel<?> oldModel) {
		UserTramCapClp newModel = new UserTramCapClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserTramCapRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserTU(BaseModel<?> oldModel) {
		UserTUClp newModel = new UserTUClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserTURemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}