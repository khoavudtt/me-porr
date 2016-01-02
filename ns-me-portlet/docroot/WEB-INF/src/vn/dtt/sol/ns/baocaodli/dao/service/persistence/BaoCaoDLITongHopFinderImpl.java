package vn.dtt.sol.ns.baocaodli.dao.service.persistence;



import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;
import vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopImpl;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class BaoCaoDLITongHopFinderImpl extends BasePersistenceImpl<BaoCaoDLITongHop> implements BaoCaoDLITongHopFinder {
	private static final Log _log = LogFactoryUtil.getLog(BaoCaoDLITongHopFinderImpl.class);
	/**
	 * @author tailt
	 * @param maTinh
	 * @param namBaoCao
	 * @return
	 */
	
	public BaoCaoDLITongHop getBaoCaoDLITongHopByTinhVaNam(String maTinh, String namBaoCao){
		List<BaoCaoDLITongHop>  result = null;
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * FROM ME_TONGHOPDLI ");
			query.append(" WHERE 1=1 ");
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH =  ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				if(namBaoCao.equalsIgnoreCase("0")){
					query.append(" AND ( NAM =  ? OR NAM =  ? ) ");
				}else{
					query.append(" AND NAM = ? ");
				}
			}
			
			query.append(" ORDER BY NAM, MATINH ASC  ");
			_log.info("==getBaoCaoDLITongHopByTinhVaNam==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity(BaoCaoDLITongHopImpl.TABLE_NAME,BaoCaoDLITongHopImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			if(Validator.isNotNull(namBaoCao)){
				if(namBaoCao.equalsIgnoreCase("0")){
					qPos.add(namBaoCao);
					qPos.add(FormatData.getCurrentYear());
				}else{
					qPos.add(namBaoCao);
				}
			}
			result = (List<BaoCaoDLITongHop>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
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
		
	public List<BaoCaoDLITongHop> getListBaoCaoDLITongHopByNamTW(String namBaoCao)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * FROM ME_TONGHOPDLI ");
			query.append(" WHERE 1=1 ");
			
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND NAM = ? ");
			}
			query.append(" ORDER BY  MATINH ,NAM ASC ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(BaoCaoDLITongHopImpl.TABLE_NAME,BaoCaoDLITongHopImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			return (List<BaoCaoDLITongHop>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}	
}
