package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungImpl;

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

public class DanhGiaBenVungFinderImpl extends
		BasePersistenceImpl<DanhGiaBenVung> implements DanhGiaBenVungFinder {

	public static final String FINDER_SQL = DanhGiaBenVungFinder.class
			.getName() + ".finder";

	public static final String COUNT_SQL = DanhGiaBenVungFinder.class.getName()
			+ ".count";

	Log _log = LogFactoryUtil.getLog(DanhGiaBenVungFinderImpl.class);

	/**
	 * @param lsTramCap
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<DanhGiaBenVung> findDanhGiaBenVung(int[] lsTramCap, int start,
			int end) throws PortalException, SystemException {
		return _findDanhGiaBenVung(lsTramCap, start, end);
	}

	public int countDanhGia(int[] lsTramCap) throws PortalException,
			SystemException {
		return _countDanhGia(lsTramCap);
	}

	private int _countDanhGia(int[] lsTramCap) throws PortalException,
			SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_SQL);

			String inClause = StringPool.BLANK;

			StringBuffer sb = new StringBuffer();

			if (lsTramCap.length != 0) {
				sb = sb.append("WHERE me_danhgiabenvung.TRAMCAPNUOCID IN (");

				int i = 0;

				for (int value : lsTramCap) {
					i++;

					if (i >= lsTramCap.length) {
						sb.append(value);
					} else {
						sb.append(value + ",");
					}
				}

				sb = sb.append(")");

				inClause = sb.toString();
			}

			sql = StringUtil.replace(sql, "[$WHERE_CLAUSE$]", inClause);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

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
	 * @param lsTramCap
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	private List<DanhGiaBenVung> _findDanhGiaBenVung(int[] lsTramCap,
			int start, int end) throws PortalException, SystemException {

		Session session = null;

		try {

			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_SQL);

			String inClause = StringPool.BLANK;

			StringBuffer sb = new StringBuffer();

			if (lsTramCap.length != 0) {
				sb = sb.append("WHERE me_danhgiabenvung.TRAMCAPNUOCID IN (");

				int i = 0;

				for (int value : lsTramCap) {
					i++;

					if (i >= lsTramCap.length) {
						sb.append(value);
					} else {
						sb.append(value + ",");
					}
				}

				sb = sb.append(")");

				inClause = sb.toString();
			}

			sql = StringUtil.replace(sql, "[$WHERE_CLAUSE$]", inClause);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DanhGiaBenVung", DanhGiaBenVungImpl.class);

			return (List<DanhGiaBenVung>) QueryUtil.list(q, getDialect(),
					start, end);

		} catch (Exception e) {
			_log.error(e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	/**
	 * author : tailt
	 */
	public DanhGiaBenVung getDanhGiaBenVungByTramCapNuocAndNam(
			long tramCapNuocId, String nam, String ketquadanhgia) {
		Session session = null;
		List<DanhGiaBenVung> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append(" SELECT d.* FROM me_danhgiabenvung AS d ");
			query.append(" INNER JOIN me_tramcapnuoc AS t ");
			query.append(" ON d.tramcapnuocid = t.id ");
			query.append(" WHERE 1=1 ");

			if (tramCapNuocId > 0) {
				query.append("  AND d.tramcapnuocid = ?  ");
			}
			if (Validator.isNotNull(nam)) {
				query.append("  AND d.nam = ?  ");
			}
			if (Validator.isNotNull(ketquadanhgia)) {
				query.append("  AND d.ketquadanhgia = ?  ");
			}
			_log.info("=========getDanhGiaBenVungByTramCapNuocAndNam==="
					+ query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DanhGiaBenVung", DanhGiaBenVungImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			if (tramCapNuocId > 0) {
				qPos.add(tramCapNuocId);
			}
			if (Validator.isNotNull(nam)) {
				qPos.add(nam);
			}
			if (Validator.isNotNull(ketquadanhgia)) {
				qPos.add(ketquadanhgia);
			}

			result = (List<DanhGiaBenVung>) QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (result != null && result.size() > 0) {
				return result.get(0);
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return null;
	}
}
