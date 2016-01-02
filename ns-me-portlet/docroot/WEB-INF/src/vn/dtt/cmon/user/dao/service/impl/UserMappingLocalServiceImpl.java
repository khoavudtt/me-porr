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

package vn.dtt.cmon.user.dao.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.service.base.UserMappingLocalServiceBaseImpl;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the user mapping local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.cmon.user.dao.service.UserMappingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.cmon.user.dao.service.base.UserMappingLocalServiceBaseImpl
 * @see vn.dtt.sol.cmon.user.dao.service.UserMappingLocalServiceUtil
 */
public class UserMappingLocalServiceImpl extends
		UserMappingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.cmon.user.dao.service.UserMappingLocalServiceUtil} to access
	 * the user mapping local service.
	 */

	public int count(String keyword, int userType, String orgCode1,
			String orgCode2) throws PortalException, SystemException {
		return userMappingFinder.count(keyword, userType, orgCode1, orgCode2);
	}

	public List<UserMapping> find(String keyword, int userType,
			String orgCode1, String orgCode2, int start, int end)
			throws PortalException, SystemException {
		return userMappingFinder.find(keyword, userType, orgCode1, orgCode2,
				start, end);
	}

	public UserMapping getByUserId(long userId) throws PortalException,
			SystemException {
		return userMappingPersistence.findByU_M(userId);
	}

	public List<UserMapping> getByOrg1_Org2(String orgCode1, String orgCode2)
			throws PortalException, SystemException {
		return userMappingPersistence.findByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	public List<UserMapping> getByOrg1(String orgCode1) throws PortalException,
			SystemException {
		return userMappingPersistence.findByO_C_1(orgCode1);
	}

	public List<UserMapping> getByOrg2(String orgCode2) throws PortalException,
			SystemException {
		return userMappingPersistence.findByO_C_1(orgCode2);
	}

	public List<UserMapping> getByTypeOrg1(int userType, String orgCode1)
			throws PortalException, SystemException {
		return userMappingPersistence.findByT_O_C_1(userType, orgCode1);
	}

	public List<UserMapping> getByTypeOrg2(int userType, String orgCode1,
			String orgCode2) throws PortalException, SystemException {
		return userMappingPersistence.findByT_O_C_2(userType, orgCode1,
				orgCode2);
	}

	public List<UserMapping> getByUserType(int userType)
			throws PortalException, SystemException {
		return userMappingPersistence.findByU_T(userType);
	}

	public UserMapping updateUserMapping(long userId, String password1,
			String password2, String firstName, long[] roleIds,
			long[] userGroupIds, ServiceContext serviceContext)
			throws PortalException, SystemException {

		UserMapping userMapping = userMappingPersistence.fetchByU_M(userId);

		User oldUser = userLocalService.fetchUser(userId);

		Calendar cal = Calendar.getInstance();
		
		
		
		java.util.Date date = oldUser.getBirthday();
		
		cal.setTime(date);

		int birthdayMonth = cal.get(Calendar.MONTH);
		int birthdayDay = cal.get(Calendar.DAY_OF_MONTH);
		int birthdayYear = cal.get(Calendar.YEAR);

		if (Validator.isNotNull(oldUser)) {
			try {
				userLocalService.updateUser(userId, oldUser.getPassword(),
						password1, password2, false,
						oldUser.getReminderQueryQuestion(),
						oldUser.getReminderQueryAnswer(),
						oldUser.getScreenName(), oldUser.getEmailAddress(),
						oldUser.getFacebookId(), oldUser.getOpenId(),
						oldUser.getLanguageId(), oldUser.getTimeZoneId(),
						oldUser.getGreeting(), oldUser.getComments(),
						firstName, StringPool.BLANK, StringPool.BLANK, 0, 0,
						oldUser.getMale(), birthdayMonth, birthdayDay,
						birthdayYear, StringPool.BLANK, StringPool.BLANK,
						StringPool.BLANK, StringPool.BLANK, StringPool.BLANK,
						StringPool.BLANK, StringPool.BLANK, StringPool.BLANK,
						StringPool.BLANK, StringPool.BLANK,
						oldUser.getJobTitle(), oldUser.getGroupIds(),
						oldUser.getOrganizationIds(), roleIds,
						new ArrayList<UserGroupRole>(), userGroupIds,
						serviceContext);
				
			} catch (Exception e) {
				throw new NoSuchUserException("khong-them-duoc-user-nguoi-dung");
			}

			if (Validator.isNotNull(userMapping)) {
				userMapping.setName(firstName);

				userMappingPersistence.update(userMapping);
			}
		}

		return userMapping;

	}

	/**
	 * @param userType
	 * @param creatorUserId
	 * @param companyId
	 * @param autoPassword
	 * @param password1
	 * @param password2
	 * @param autoScreenName
	 * @param screenName
	 * @param emailAddress
	 * @param facebookId
	 * @param openId
	 * @param locale
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param prefixId
	 * @param suffixId
	 * @param male
	 * @param birthdayMonth
	 * @param birthdayDay
	 * @param birthdayYear
	 * @param jobTitle
	 * @param groupIds
	 * @param organizationIds
	 * @param roleIds
	 * @param userGroupIds
	 * @param sendEmail
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public UserMapping addUserMapping(String maTinh, int userType, long creatorUserId,
			long companyId, boolean autoPassword, String password1,
			String password2, boolean autoScreenName, String screenName,
			String emailAddress, long facebookId, String openId, Locale locale,
			String firstName, String middleName, String lastName, int prefixId,
			int suffixId, boolean male, int birthdayMonth, int birthdayDay,
			int birthdayYear, String jobTitle, long[] groupIds,
			long[] organizationIds, long[] roleIds, long[] userGroupIds,
			boolean sendEmail, ServiceContext serviceContext)
			throws PortalException, SystemException {

		User user = null;

		try {
			user = userLocalService.addUser(creatorUserId, companyId,
					autoPassword, password1, password2, autoScreenName,
					screenName, emailAddress, facebookId, openId, locale,
					firstName, middleName, lastName, prefixId, suffixId, male,
					birthdayMonth, birthdayDay, birthdayYear, jobTitle,
					groupIds, organizationIds, roleIds, userGroupIds,
					sendEmail, serviceContext);
		} catch (Exception e) {
			throw new NoSuchUserException("khong-them-duoc-user-nguoi-dung");
		}

		long userMappingId = counterLocalService.increment(UserMapping.class
				.getName());

		UserMapping userMapping = userMappingPersistence.create(userMappingId);

		userMapping.setUserId(user.getUserId());

		userMapping.setName(firstName);
		userMapping.setOrgCode1(maTinh);

		userMapping.setUserType(userType);
		

		userMappingLocalService.addUserMapping(userMapping);

		return userMapping;
	}

	public UserMapping addUserMapping(long id, String name, long userId,
			int userType, String orgCode1, String orgCode2)
			throws PortalException, SystemException {
		UserMapping userMapping = null;

		if (id > 0) {
			userMapping = userMappingPersistence.findByPrimaryKey(id);
		} else {
			id = counterLocalService.increment(UserMapping.class.getName());

			userMapping = userMappingPersistence.create(id);

			userMapping.setUserType(userType);
			userMapping.setUserId(userId);
			userMapping.setOrgCode1(orgCode1);
			userMapping.setOrgCode2(orgCode2);

		}

		userMapping.setName(name);

		userMappingPersistence.update(userMapping);

		userMappingPersistence.clearCache();

		return userMapping;
	}

	public UserMapping addUserMapping(long id, long userId, int userType,
			String orgCode1, String orgCode2) throws PortalException,
			SystemException {
		UserMapping userMapping = null;

		if (id > 0) {
			userMapping = userMappingPersistence.findByPrimaryKey(id);
		} else {
			id = counterLocalService.increment(UserMapping.class.getName());

			userMapping = userMappingPersistence.create(id);
		}

		userMapping.setUserType(userType);
		userMapping.setUserId(userId);
		userMapping.setOrgCode1(orgCode1);
		userMapping.setOrgCode2(orgCode2);

		userMappingPersistence.update(userMapping);

		userMappingPersistence.clearCache();

		return userMapping;
	}

}