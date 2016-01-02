package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import java.util.Iterator;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class DanhGiaVanHanhFinderImpl extends
		BasePersistenceImpl<DanhGiaVanHanh> implements DanhGiaVanHanhFinder {

	public static final String COUNT_MAX_SQL = DanhGiaVanHanhFinder.class
			.getName() + ".countMaxThang";

	public int countMaxThang(int tramCapNuocId, int nam)
			throws PortalException, SystemException {
		
		return _countMaxThang(tramCapNuocId, nam);
	}

	private int _countMaxThang(int tramCapNuocId, int nam)
			throws PortalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_MAX_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(tramCapNuocId);

			qPos.add(nam);

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

	private static final Log _log = LogFactoryUtil
			.getLog(DanhGiaVanHanhFinderImpl.class);
}
