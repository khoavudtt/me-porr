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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service;

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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinhClp;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewClp;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFakeClp;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinhClp;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinhClp;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGDClp;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinhClp;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinhClp;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNewClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BinhTH
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

		if (oldModelClassName.equals(ChiTietKiemDemCongTrinhClp.class.getName())) {
			return translateInputChiTietKiemDemCongTrinh(oldModel);
		}

		if (oldModelClassName.equals(DanhGiaVeSinhXaNewClp.class.getName())) {
			return translateInputDanhGiaVeSinhXaNew(oldModel);
		}

		if (oldModelClassName.equals(DanhGiaVeSinhXaNewFakeClp.class.getName())) {
			return translateInputDanhGiaVeSinhXaNewFake(oldModel);
		}

		if (oldModelClassName.equals(KeHoachKiemDemVeSinhClp.class.getName())) {
			return translateInputKeHoachKiemDemVeSinh(oldModel);
		}

		if (oldModelClassName.equals(keHoachVeSinhXaNewClp.class.getName())) {
			return translateInputkeHoachVeSinhXaNew(oldModel);
		}

		if (oldModelClassName.equals(
					ThongTinKiemDemCongTrinhClp.class.getName())) {
			return translateInputThongTinKiemDemCongTrinh(oldModel);
		}

		if (oldModelClassName.equals(ThongTinKiemDemHoGDClp.class.getName())) {
			return translateInputThongTinKiemDemHoGD(oldModel);
		}

		if (oldModelClassName.equals(VeSinhCongTrinhClp.class.getName())) {
			return translateInputVeSinhCongTrinh(oldModel);
		}

		if (oldModelClassName.equals(VeSinhGiaDinhClp.class.getName())) {
			return translateInputVeSinhGiaDinh(oldModel);
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

	public static Object translateInputChiTietKiemDemCongTrinh(
		BaseModel<?> oldModel) {
		ChiTietKiemDemCongTrinhClp oldClpModel = (ChiTietKiemDemCongTrinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getChiTietKiemDemCongTrinhRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDanhGiaVeSinhXaNew(BaseModel<?> oldModel) {
		DanhGiaVeSinhXaNewClp oldClpModel = (DanhGiaVeSinhXaNewClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDanhGiaVeSinhXaNewRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDanhGiaVeSinhXaNewFake(
		BaseModel<?> oldModel) {
		DanhGiaVeSinhXaNewFakeClp oldClpModel = (DanhGiaVeSinhXaNewFakeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDanhGiaVeSinhXaNewFakeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputKeHoachKiemDemVeSinh(
		BaseModel<?> oldModel) {
		KeHoachKiemDemVeSinhClp oldClpModel = (KeHoachKiemDemVeSinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getKeHoachKiemDemVeSinhRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputkeHoachVeSinhXaNew(BaseModel<?> oldModel) {
		keHoachVeSinhXaNewClp oldClpModel = (keHoachVeSinhXaNewClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getkeHoachVeSinhXaNewRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputThongTinKiemDemCongTrinh(
		BaseModel<?> oldModel) {
		ThongTinKiemDemCongTrinhClp oldClpModel = (ThongTinKiemDemCongTrinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getThongTinKiemDemCongTrinhRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputThongTinKiemDemHoGD(
		BaseModel<?> oldModel) {
		ThongTinKiemDemHoGDClp oldClpModel = (ThongTinKiemDemHoGDClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getThongTinKiemDemHoGDRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVeSinhCongTrinh(BaseModel<?> oldModel) {
		VeSinhCongTrinhClp oldClpModel = (VeSinhCongTrinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVeSinhCongTrinhRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVeSinhGiaDinh(BaseModel<?> oldModel) {
		VeSinhGiaDinhClp oldClpModel = (VeSinhGiaDinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVeSinhGiaDinhRemoteModel();

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
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhImpl")) {
			return translateOutputChiTietKiemDemCongTrinh(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewImpl")) {
			return translateOutputDanhGiaVeSinhXaNew(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeImpl")) {
			return translateOutputDanhGiaVeSinhXaNewFake(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhImpl")) {
			return translateOutputKeHoachKiemDemVeSinh(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.keHoachVeSinhXaNewImpl")) {
			return translateOutputkeHoachVeSinhXaNew(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhImpl")) {
			return translateOutputThongTinKiemDemCongTrinh(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDImpl")) {
			return translateOutputThongTinKiemDemHoGD(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhImpl")) {
			return translateOutputVeSinhCongTrinh(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhImpl")) {
			return translateOutputVeSinhGiaDinh(oldModel);
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
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchKeHoachKiemDemVeSinhException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchKeHoachKiemDemVeSinhException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException();
		}

		if (className.equals(
					"vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException")) {
			return new vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException();
		}

		return throwable;
	}

	public static Object translateOutputChiTietKiemDemCongTrinh(
		BaseModel<?> oldModel) {
		ChiTietKiemDemCongTrinhClp newModel = new ChiTietKiemDemCongTrinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setChiTietKiemDemCongTrinhRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDanhGiaVeSinhXaNew(
		BaseModel<?> oldModel) {
		DanhGiaVeSinhXaNewClp newModel = new DanhGiaVeSinhXaNewClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDanhGiaVeSinhXaNewRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDanhGiaVeSinhXaNewFake(
		BaseModel<?> oldModel) {
		DanhGiaVeSinhXaNewFakeClp newModel = new DanhGiaVeSinhXaNewFakeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDanhGiaVeSinhXaNewFakeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputKeHoachKiemDemVeSinh(
		BaseModel<?> oldModel) {
		KeHoachKiemDemVeSinhClp newModel = new KeHoachKiemDemVeSinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setKeHoachKiemDemVeSinhRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputkeHoachVeSinhXaNew(
		BaseModel<?> oldModel) {
		keHoachVeSinhXaNewClp newModel = new keHoachVeSinhXaNewClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setkeHoachVeSinhXaNewRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputThongTinKiemDemCongTrinh(
		BaseModel<?> oldModel) {
		ThongTinKiemDemCongTrinhClp newModel = new ThongTinKiemDemCongTrinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setThongTinKiemDemCongTrinhRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputThongTinKiemDemHoGD(
		BaseModel<?> oldModel) {
		ThongTinKiemDemHoGDClp newModel = new ThongTinKiemDemHoGDClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setThongTinKiemDemHoGDRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVeSinhCongTrinh(BaseModel<?> oldModel) {
		VeSinhCongTrinhClp newModel = new VeSinhCongTrinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVeSinhCongTrinhRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVeSinhGiaDinh(BaseModel<?> oldModel) {
		VeSinhGiaDinhClp newModel = new VeSinhGiaDinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVeSinhGiaDinhRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}