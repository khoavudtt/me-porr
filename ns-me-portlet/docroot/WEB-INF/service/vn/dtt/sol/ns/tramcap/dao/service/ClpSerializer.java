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

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVungClp;
import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanhClp;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuocClp;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuocClp;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSachClp;
import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOCClp;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuocClp;

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

		if (oldModelClassName.equals(DanhGiaBenVungClp.class.getName())) {
			return translateInputDanhGiaBenVung(oldModel);
		}

		if (oldModelClassName.equals(DanhGiaVanHanhClp.class.getName())) {
			return translateInputDanhGiaVanHanh(oldModel);
		}

		if (oldModelClassName.equals(DauNoiNuocClp.class.getName())) {
			return translateInputDauNoiNuoc(oldModel);
		}

		if (oldModelClassName.equals(KeHoachKiemDemNuocClp.class.getName())) {
			return translateInputKeHoachKiemDemNuoc(oldModel);
		}

		if (oldModelClassName.equals(KeHoachNuocSachClp.class.getName())) {
			return translateInputKeHoachNuocSach(oldModel);
		}

		if (oldModelClassName.equals(THONGTINKIEMDEMNUOCClp.class.getName())) {
			return translateInputTHONGTINKIEMDEMNUOC(oldModel);
		}

		if (oldModelClassName.equals(TramCapNuocClp.class.getName())) {
			return translateInputTramCapNuoc(oldModel);
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

	public static Object translateInputDanhGiaBenVung(BaseModel<?> oldModel) {
		DanhGiaBenVungClp oldClpModel = (DanhGiaBenVungClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDanhGiaBenVungRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDanhGiaVanHanh(BaseModel<?> oldModel) {
		DanhGiaVanHanhClp oldClpModel = (DanhGiaVanHanhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDanhGiaVanHanhRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDauNoiNuoc(BaseModel<?> oldModel) {
		DauNoiNuocClp oldClpModel = (DauNoiNuocClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDauNoiNuocRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputKeHoachKiemDemNuoc(BaseModel<?> oldModel) {
		KeHoachKiemDemNuocClp oldClpModel = (KeHoachKiemDemNuocClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getKeHoachKiemDemNuocRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputKeHoachNuocSach(BaseModel<?> oldModel) {
		KeHoachNuocSachClp oldClpModel = (KeHoachNuocSachClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getKeHoachNuocSachRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTHONGTINKIEMDEMNUOC(
		BaseModel<?> oldModel) {
		THONGTINKIEMDEMNUOCClp oldClpModel = (THONGTINKIEMDEMNUOCClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTHONGTINKIEMDEMNUOCRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTramCapNuoc(BaseModel<?> oldModel) {
		TramCapNuocClp oldClpModel = (TramCapNuocClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTramCapNuocRemoteModel();

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
					"vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungImpl")) {
			return translateOutputDanhGiaBenVung(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhImpl")) {
			return translateOutputDanhGiaVanHanh(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl")) {
			return translateOutputDauNoiNuoc(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocImpl")) {
			return translateOutputKeHoachKiemDemNuoc(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachImpl")) {
			return translateOutputKeHoachNuocSach(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCImpl")) {
			return translateOutputTHONGTINKIEMDEMNUOC(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocImpl")) {
			return translateOutputTramCapNuoc(oldModel);
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

		if (className.equals(
					"vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException")) {
			return new vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException")) {
			return new vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException")) {
			return new vn.dtt.sol.ns.tramcap.dao.NoSuchDauNoiNuocException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException")) {
			return new vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException")) {
			return new vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException")) {
			return new vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException")) {
			return new vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException();
		}

		return throwable;
	}

	public static Object translateOutputDanhGiaBenVung(BaseModel<?> oldModel) {
		DanhGiaBenVungClp newModel = new DanhGiaBenVungClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDanhGiaBenVungRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDanhGiaVanHanh(BaseModel<?> oldModel) {
		DanhGiaVanHanhClp newModel = new DanhGiaVanHanhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDanhGiaVanHanhRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDauNoiNuoc(BaseModel<?> oldModel) {
		DauNoiNuocClp newModel = new DauNoiNuocClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDauNoiNuocRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputKeHoachKiemDemNuoc(
		BaseModel<?> oldModel) {
		KeHoachKiemDemNuocClp newModel = new KeHoachKiemDemNuocClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setKeHoachKiemDemNuocRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputKeHoachNuocSach(BaseModel<?> oldModel) {
		KeHoachNuocSachClp newModel = new KeHoachNuocSachClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setKeHoachNuocSachRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTHONGTINKIEMDEMNUOC(
		BaseModel<?> oldModel) {
		THONGTINKIEMDEMNUOCClp newModel = new THONGTINKIEMDEMNUOCClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTHONGTINKIEMDEMNUOCRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTramCapNuoc(BaseModel<?> oldModel) {
		TramCapNuocClp newModel = new TramCapNuocClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTramCapNuocRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}