package vn.dtt.sol.ns.kehoachdaunam.dao.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;
import vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamImpl;
import vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl;
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

public class KeHoachDauNamFinderImpl extends BasePersistenceImpl<KeHoachDauNam>
	implements KeHoachDauNamFinder {

	@Override
	public List<KeHoachDauNam> searchByNamAndTinh(long namKeHoach, String maTinh, int start, int end) 
			throws PortalException, SystemException{
		
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT me_kehoachnuocsach.ID AS ID, "
					+ "me_kehoachnuocsach.TRAMCAPNUOCID AS TRAMCAPNUOCID,"
					+ " me_kehoachnuocsach.NAM AS NAM, "
					+ "me_kehoachnuocsach.SODAUNOIMOI AS SODAUNOIMOI, "
					+ "me_kehoachnuocsach.SOHOHUONGLOI AS SOHOHUONGLOI, "
					+ "me_kehoachnuocsach.SONGUOIHUONGLOI AS SONGUOIHUONGLOI, "
					+ "me_kehoachnuocsach.GHICHU AS GHICHU, "
					+ "me_kehoachnuocsach.BAOCAODLI AS BAOCAODLI, "
					+ "me_kehoachnuocsach.NGAYTAO AS NGAYTAO, "
					+ "me_kehoachnuocsach.IDNGUOITAO AS IDNGUOITAO ");
			query.append(" FROM me_kehoachnuocsach ");
			query.append(" INNER JOIN me_tramcapnuoc ");
			query.append(" ON me_kehoachnuocsach.TRAMCAPNUOCID = me_tramcapnuoc.ID ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(namKeHoach)){
				query.append(" AND me_kehoachnuocsach.NAM = " + Long.valueOf(namKeHoach) +" ");
			}
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND me_tramcapnuoc.MATINH = '" + maTinh +"' ");
			}
			query.append(" ORDER BY NAM DESC");
			
			_log.debug("==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(KeHoachDauNamModelImpl.TABLE_NAME, KeHoachDauNamImpl.class);

			return (List<KeHoachDauNam>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		
	}
	
	@Override
	public int countByNamAndTinh(long namKeHoach, String maTinh) 
			throws PortalException, SystemException{
		int rows = 0;
		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as COUNT_VALUE ");
			query.append(" FROM me_kehoachnuocsach ");
			query.append(" INNER JOIN me_tramcapnuoc ");
			query.append(" ON me_kehoachnuocsach.TRAMCAPNUOCID = me_tramcapnuoc.ID ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(namKeHoach)){
				query.append(" AND me_kehoachnuocsach.NAM = " + Long.valueOf(namKeHoach) +" ");
			}
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND me_tramcapnuoc.MATINH = '" + maTinh +"' ");
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
	
	public List<KeHoachDauNam> searchByNamAndTram(long namKeHoach, String maTram, int start, int end) 
			throws PortalException, SystemException{
		
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * ");
			query.append(" FROM me_kehoachnuocsach ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(namKeHoach)){
				query.append(" AND NAM = " + Long.valueOf(namKeHoach) +" ");
			}
			
			if(Validator.isNotNull(maTram)){
				query.append(" AND TRAMCAPNUOCID = '" + maTram +"' ");
			}
			query.append(" ORDER BY NAM DESC");
			
			_log.debug("==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(KeHoachDauNamModelImpl.TABLE_NAME, KeHoachDauNamImpl.class);

			return (List<KeHoachDauNam>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		
	}
	
	public int countByNamAndTram(long namKeHoach, String MaTram) 
			throws PortalException, SystemException{
		int rows = 0;
		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as COUNT_VALUE ");
			query.append(" FROM me_kehoachnuocsach ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(namKeHoach)){
				query.append(" AND NAM = " + Long.valueOf(namKeHoach) +" ");
			}
			
			if(Validator.isNotNull(MaTram)){
				query.append(" AND TRAMCAPNUOCID = '" + MaTram +"' ");
			}
			
			_log.debug("==countByNamAndTram==" + query.toString());
			
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
	
	public int countSoNguoiHuongLoiCapNcBenVung(String nam, String maTinh) 
			throws PortalException, SystemException{
		
		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT SUM(SONGUOIHUONGLOI) as COUNT_VALUE ");
			query.append(" FROM ME_KEHOACHNUOCSACH ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(nam)){
				query.append(" AND NAM = ? ");
			}
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND TRAMCAPNUOCID IN  (SELECT ME_TRAMCAPNUOC.ID FROM ME_TRAMCAPNUOC WHERE MATINH = ? ) ");
			}
			
			_log.debug("==countSoNguoiHuongLoiCapNcBenVung==" + query.toString());
			
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
	
	
	public List<KeHoachDauNam> searchByNamAndMaTinh(String nam, String maTinh) 
			throws PortalException, SystemException{
		
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT k.* FROM ME_KEHOACHNUOCSACH AS k ");
			query.append(" INNER JOIN ME_TRAMCAPNUOC AS t ");
			query.append(" ON k.TRAMCAPNUOCID = t.ID ");
			query.append(" WHERE 1=1 ");
			
			if(Validator.isNotNull(nam)){
				if(nam.equalsIgnoreCase("0")){
					query.append(" AND ( k.NAM = ? OR k.NAM = ? ) ");
				}else{
					query.append(" AND k.NAM = ? ");
				}				
			}
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND t.MATINH = ? ");
			}
			
			query.append(" ORDER BY k.NAM, MATINH, MAHUYEN, MAXA , TRAMCAPNUOCID ASC  ");
			_log.debug("==searchByNamAndMaTinh==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(KeHoachDauNamModelImpl.TABLE_NAME, KeHoachDauNamImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(nam)){
				if(nam.equalsIgnoreCase("0")){
					qPos.add(nam);
					qPos.add(FormatData.getCurrentYear());
				}else{
					qPos.add(nam);
				}
				
			}
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			return (List<KeHoachDauNam>) QueryUtil.list(q, getDialect(),QueryUtil.ALL_POS,QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		
	}
	
	public int sumSoDauNoiMoiTW( String namBaoCao, String maTinh) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT SUM(k.SODAUNOIMOI) AS total ");
			query.append(" FROM me_kehoachnuocsach AS k ");
			query.append(" INNER JOIN me_tramcapnuoc AS t ON k.tramcapnuocid = t.id ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND k.NAM = ? ");
			}
			if(Validator.isNotNull(maTinh)){
				query.append(" AND t.MATINH = ? ");
			}
			
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("--sumSoDauNoiMoiTW----"+query.toString()+"===");
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
			if (lstTotal != null && Validator.isNotNull(lstTotal.get(0))) {
				return lstTotal.get(0);
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}	
	private static Log _log = LogFactoryUtil.getLog(KeHoachDauNamFinderImpl.class);
}
