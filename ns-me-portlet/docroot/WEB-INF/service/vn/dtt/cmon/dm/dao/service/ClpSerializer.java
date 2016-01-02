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

package vn.dtt.cmon.dm.dao.service;

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

import vn.dtt.cmon.dm.dao.model.DATAGROUPClp;
import vn.dtt.cmon.dm.dao.model.DATAITEMClp;
import vn.dtt.cmon.dm.dao.model.NAVIGATIONClp;

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

		if (oldModelClassName.equals(DATAGROUPClp.class.getName())) {
			return translateInputDATAGROUP(oldModel);
		}

		if (oldModelClassName.equals(DATAITEMClp.class.getName())) {
			return translateInputDATAITEM(oldModel);
		}

		if (oldModelClassName.equals(NAVIGATIONClp.class.getName())) {
			return translateInputNAVIGATION(oldModel);
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

	public static Object translateInputDATAGROUP(BaseModel<?> oldModel) {
		DATAGROUPClp oldClpModel = (DATAGROUPClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDATAGROUPRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDATAITEM(BaseModel<?> oldModel) {
		DATAITEMClp oldClpModel = (DATAITEMClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDATAITEMRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputNAVIGATION(BaseModel<?> oldModel) {
		NAVIGATIONClp oldClpModel = (NAVIGATIONClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getNAVIGATIONRemoteModel();

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
					"vn.dtt.cmon.dm.dao.model.impl.DATAGROUPImpl")) {
			return translateOutputDATAGROUP(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl")) {
			return translateOutputDATAITEM(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONImpl")) {
			return translateOutputNAVIGATION(oldModel);
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

		if (className.equals("vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException")) {
			return new vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException();
		}

		if (className.equals("vn.dtt.cmon.dm.dao.NoSuchDATAITEMException")) {
			return new vn.dtt.cmon.dm.dao.NoSuchDATAITEMException();
		}

		if (className.equals("vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException")) {
			return new vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException();
		}

		return throwable;
	}

	public static Object translateOutputDATAGROUP(BaseModel<?> oldModel) {
		DATAGROUPClp newModel = new DATAGROUPClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDATAGROUPRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDATAITEM(BaseModel<?> oldModel) {
		DATAITEMClp newModel = new DATAITEMClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDATAITEMRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputNAVIGATION(BaseModel<?> oldModel) {
		NAVIGATIONClp newModel = new NAVIGATIONClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setNAVIGATIONRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}