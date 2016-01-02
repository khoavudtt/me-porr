package vn.dtt.cmon.user.dao.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.impl.UserMappingImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class UserMappingFinderImpl extends BasePersistenceImpl<UserMapping>
		implements UserMappingFinder {

	public static final String FINDER_SQL = UserMappingFinder.class.getName()
			+ ".finder";

	public static final String COUNT_SQL = UserMappingFinder.class.getName()
			+ ".count";

	/**
	 * @param keyword
	 * @param userType
	 * @param orgCode1
	 * @param orgCode2
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public int count(String keyword, int userType, String orgCode1,
			String orgCode2) throws PortalException, SystemException {

		String[] names = null;
		boolean andOperator = false;

		if (Validator.isNotNull(keyword)) {
			names = CustomSQLUtil.keywords(keyword);
		} else {
			andOperator = true;
		}

		return countByK_(names, andOperator, userType, orgCode1, orgCode2);
	}

	private int countByK_(String[] keywords, boolean andOperator, int userType,
			String orgCode1, String orgCode2) throws PortalException,
			SystemException {
		Session session = null;

		keywords = CustomSQLUtil.keywords(keywords);

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_SQL);

			sql = CustomSQLUtil.replaceKeywords(sql, "lower(a1.name)",
					StringPool.LIKE, true, keywords);

			if (userType <= 0) {
				sql = StringUtil.replace(sql, "AND (a1.USERTYPE = ?)",
						StringPool.BLANK);
			}

			if (orgCode1.contentEquals(StringPool.BLANK)) {
				sql = StringUtil.replace(sql, "AND (a1.ORGCODE1 = ?)",
						StringPool.BLANK);
			}

			if (orgCode2.contentEquals(StringPool.BLANK)) {
				sql = StringUtil.replace(sql, "AND (a1.ORGCODE2 = ?)",
						StringPool.BLANK);
			}

			sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(keywords, 2);

			if (userType > 0) {
				qPos.add(userType);
			}

			if (!orgCode1.contentEquals(StringPool.BLANK)) {
				qPos.add(orgCode1);
			}

			if (!orgCode2.contentEquals(StringPool.BLANK)) {
				qPos.add(orgCode2);
			}

			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;

		} catch (Exception e) {
			_log.error(e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	/**
	 * @param keyword
	 * @param userType
	 * @param orgCode1
	 * @param orgCode2
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<UserMapping> find(String keyword, int userType,
			String orgCode1, String orgCode2, int start, int end)
			throws PortalException, SystemException {

		String[] names = null;
		boolean andOperator = false;

		if (Validator.isNotNull(keyword)) {
			names = CustomSQLUtil.keywords(keyword);
		} else {
			andOperator = true;
		}

		return findByK_(names, andOperator, userType, orgCode1, orgCode2,
				start, end);

	}

	private List<UserMapping> findByK_(String[] keywords, boolean andOperator,
			int userType, String orgCode1, String orgCode2, int start, int end)
			throws PortalException, SystemException {
		Session session = null;

		keywords = CustomSQLUtil.keywords(keywords);

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_SQL);

			sql = CustomSQLUtil.replaceKeywords(sql, "lower(a1.name)",
					StringPool.LIKE, true, keywords);

			if (userType <= 0) {
				sql = StringUtil.replace(sql, "AND (a1.USERTYPE = ?)",
						StringPool.BLANK);
			}

			if (orgCode1.contentEquals(StringPool.BLANK)) {
				sql = StringUtil.replace(sql, "AND (a1.ORGCODE1 = ?)",
						StringPool.BLANK);
			}

			if (orgCode2.contentEquals(StringPool.BLANK)) {
				sql = StringUtil.replace(sql, "AND (a1.ORGCODE2 = ?)",
						StringPool.BLANK);
			}

			sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("UserMapping", UserMappingImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(keywords, 2);

			if (userType > 0) {
				qPos.add(userType);
			}

			if (!orgCode1.contentEquals(StringPool.BLANK)) {
				qPos.add(orgCode1);
			}

			if (!orgCode2.contentEquals(StringPool.BLANK)) {
				qPos.add(orgCode2);
			}

			return (List<UserMapping>) QueryUtil.list(q, getDialect(), start,
					end);

		} catch (Exception e) {
			_log.error(e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private static final Log _log = LogFactoryUtil
			.getLog(UserMappingFinderImpl.class);

}
