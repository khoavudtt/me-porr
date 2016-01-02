package vn.dtt.sol.ns.kehoachvesinh.dao.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;
import vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhImpl;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocImpl;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author HANT
 *
 */
public class KeHoachVeSinhFinderImpl extends BasePersistenceImpl<KeHoachVeSinh> 
	implements KeHoachVeSinhFinder {
	
	public List<KeHoachVeSinh> search(long nam, String maTinh, String maHuyen, int start, int end)
		throws PortalException, SystemException{
		
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * ");
			query.append(" FROM me_kehoachvesinhxa ");
			query.append(" WHERE 1 = 1 ");
			
			if(nam!=0){
				query.append(" AND NAM = " + Long.valueOf(nam) +" ");
			}
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = '" + maTinh +"' ");
			}
			
			if(Validator.isNotNull(maHuyen)){
				query.append(" AND MAHUYEN = '" + maHuyen +"' ");
			}
			
			_log.debug("==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(KeHoachVeSinhImpl.TABLE_NAME, KeHoachVeSinhImpl.class);

			return (List<KeHoachVeSinh>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int count(long nam, String maTinh, String maHuyen)
			throws PortalException, SystemException{
		
		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as COUNT_VALUE ");
			query.append(" FROM me_kehoachvesinhxa ");
			query.append(" WHERE 1 = 1 ");
			
			if(nam !=0){
				query.append(" AND NAM = " + Long.valueOf(nam) +" ");
			}
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = '" + maTinh +"' ");
			}
			
			if(Validator.isNotNull(maHuyen)){
				query.append(" AND MAHUYEN = '" + maHuyen +"' ");
			}
			
			_log.debug("==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			q.setCacheable(false);
			
			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}
			return 0;

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countSoDanHuongLoi(String nam, String maTinh, String dangkyvstx)
			throws PortalException, SystemException{
		
		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT SUM(SODAN) as COUNT_VALUE ");
			query.append(" FROM ME_KEHOACHVESINHXA ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(nam)){
				query.append(" AND NAM = ? ");
			}
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			
			if(Validator.isNotNull(dangkyvstx)){
				query.append(" AND DANGKYVSTX = ? ");
			}
			
			_log.debug("==countSoDanHuongLoi==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(nam)){
				qPos.add(nam);
			}
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			if(Validator.isNotNull(dangkyvstx)){
				qPos.add(dangkyvstx);
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
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<KeHoachVeSinh> getKeHoachVeSinhByNamTinhDangKyVSTX(String nam, String maTinh, String dangkyvstx) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append(" SELECT * FROM me_kehoachvesinhxa ");
			query.append(" WHERE 1=1 ");

			if (Validator.isNotNull(nam)) {
				if(nam.equalsIgnoreCase("0")){
					query.append(" AND ( nam =  ? OR nam =  ? ) ");
					query.append("  ");
				}else{
					query.append(" AND nam =  ? ");
				}
				
			}
			if (Validator.isNotNull(maTinh)) {
				query.append(" AND matinh =  ? ");
			}
			if (Validator.isNotNull(dangkyvstx)) {
				query.append(" AND DANGKYVSTX = ? ");
			}
			query.append(" ORDER BY NAM,MATINH,MAHUYEN,MAXA ASC ");
			
			_log.info("==getKeHoachVeSinhByNamTinhDangKyVSTX===" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(KeHoachVeSinhImpl.TABLE_NAME, KeHoachVeSinhImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(nam)) {
				if(nam.equalsIgnoreCase("0")){
					qPos.add(nam);
					qPos.add(FormatData.getCurrentYear());
				}else{
					qPos.add(nam);
				}
				
			}
			if (Validator.isNotNull(maTinh)) {
				qPos.add(maTinh);
			}
			if (Validator.isNotNull(dangkyvstx)) {
				qPos.add(dangkyvstx);
			}
			return (List<KeHoachVeSinh>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

		
	}
	
	public int sumSoNhaTieuHVSMoiTW( String namBaoCao, String maTinh) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT SUM(SONHATIEUHVSMOI) AS total ");
			query.append(" FROM me_kehoachvesinhxa  ");
			
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND NAM = ? ");
			}
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("--sumSoNhaTieuHVSMoiTW----"+query.toString()+"===");
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			
			
			List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (Validator.isNotNull(lstTotal) && Validator.isNotNull(lstTotal.get(0))) {
				return lstTotal.get(0);
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}	
	private static Log _log = LogFactoryUtil.getLog(KeHoachVeSinhFinderImpl.class);
}
