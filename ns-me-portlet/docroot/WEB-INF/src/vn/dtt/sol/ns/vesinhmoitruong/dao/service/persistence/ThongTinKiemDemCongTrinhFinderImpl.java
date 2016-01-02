package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;

import java.util.List;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ThongTinKiemDemCongTrinhFinderImpl extends BasePersistenceImpl<ThongTinKiemDemCongTrinh> implements ThongTinKiemDemCongTrinhFinder{
	
	public List<ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByKeHoachId(int keHoachId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * FROM me_thongtinkiemdemcongtrinh ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(keHoachId)){
				query.append(" AND KEHOACHKIEMDEMVESINHID = ? ");
			}
	
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(ThongTinKiemDemCongTrinhImpl.TABLE_NAME,ThongTinKiemDemCongTrinhImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(keHoachId)){
				qPos.add(keHoachId);
			}
			return (List<ThongTinKiemDemCongTrinh>) QueryUtil.list(q, getDialect(),   QueryUtil.ALL_POS,  QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	Log _log = LogFactoryUtil.getLog(ThongTinKiemDemCongTrinhFinderImpl.class);
}
