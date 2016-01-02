package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;



import java.util.Calendar;
import java.util.List;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ThongTinKiemDemHoGDFinderImpl extends BasePersistenceImpl<ThongTinKiemDemHoGD> implements ThongTinKiemDemHoGDFinder{
	
	public List<ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThucGroupBy(String maTinh, String namBaoCao, String danhgiakiemdem) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * FROM ME_THONGTINKIEMDEMHOGD ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND YEAR (NGAYKIEMDEM) = ? ");
			}
			if(Validator.isNotNull(danhgiakiemdem)){
				query.append(" AND DANHGIAKIEMDEM = ? ");
			}
			
			query.append(" GROUP BY MAHUYEN, MAXA ");//them maxa
			query.append(" ORDER BY MAHUYEN, MAXA, ID  ");
			
			_log.debug("=getThongTinKiemDemHGDThoiGianThucGroupBy==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(ThongTinKiemDemHoGDImpl.TABLE_NAME,ThongTinKiemDemHoGDImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			if(Validator.isNotNull(danhgiakiemdem)){
				qPos.add(danhgiakiemdem);
			}
			
			return (List<ThongTinKiemDemHoGD>) QueryUtil.list(q, getDialect(),   QueryUtil.ALL_POS,  QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countThongTinKiemDemHGDThoiGianThucGroupBy(String maTinh, String namBaoCao, String danhgiakiemdem, String maHuyen, String maXa) throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM ME_THONGTINKIEMDEMHOGD ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND YEAR(NGAYKIEMDEM) = ? ");
			}
			if(Validator.isNotNull(danhgiakiemdem)){
				query.append(" AND DANHGIAKIEMDEM = ? ");
			}
			if(Validator.isNotNull(maHuyen)){
				query.append(" AND MAHUYEN = ? ");
			}
			if(Validator.isNotNull(maXa)){
				query.append(" AND MAXA = ? ");
			}
			
			_log.info("====countThongTinKiemDemHGDThoiGianThucGroupBy==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			if(Validator.isNotNull(danhgiakiemdem)){
				qPos.add(danhgiakiemdem);
			}
			if(Validator.isNotNull(maHuyen)){
				qPos.add(maHuyen);
			}
			if(Validator.isNotNull(maXa)){
				qPos.add(maXa);
			}
			
			List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lstTotal != null) {
				return lstTotal.get(0);
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThuc(String maTinh, String namBaoCao, String danhgiakiemdem) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * FROM ME_THONGTINKIEMDEMHOGD ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND YEAR (NGAYKIEMDEM) = ? ");
			}
			if(Validator.isNotNull(danhgiakiemdem)){
				query.append(" AND DANHGIAKIEMDEM = ? ");
			}
			
			query.append(" ORDER BY MAHUYEN, MAXA, ID  ");
			
			_log.debug("=getThongTinKiemDemHGDThoiGianThuc==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(ThongTinKiemDemHoGDImpl.TABLE_NAME,ThongTinKiemDemHoGDImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			if(Validator.isNotNull(danhgiakiemdem)){
				qPos.add(danhgiakiemdem);
			}
			
			return (List<ThongTinKiemDemHoGD>) QueryUtil.list(q, getDialect(),   QueryUtil.ALL_POS,  QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByKeHoachId(int keHoachId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * FROM ME_THONGTINKIEMDEMHOGD ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(keHoachId)){
				query.append(" AND KEHOACHKIEMDEMVESINHID = ? ");
			}
	
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(ThongTinKiemDemHoGDImpl.TABLE_NAME,ThongTinKiemDemHoGDImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(keHoachId)){
				qPos.add(keHoachId);
			}
			return (List<ThongTinKiemDemHoGD>) QueryUtil.list(q, getDialect(),   QueryUtil.ALL_POS,  QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	public int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinhChuHo, String danhGiaKiemDem) throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM ME_THONGTINKIEMDEMHOGD ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND YEAR(NGAYKIEMDEM) = ? ");
			}
			if(Validator.isNotNull(gioiTinhChuHo)){
				query.append(" AND GIOITINHCHUHO = ? ");
			}
			if(Validator.isNotNull(danhGiaKiemDem)){
				query.append(" AND DANHGIAKIEMDEM = ? ");
			}
			
			
			_log.info("====countGioiTinhChuHo==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			if(Validator.isNotNull(gioiTinhChuHo)){
				qPos.add(gioiTinhChuHo);
			}
			if(Validator.isNotNull(danhGiaKiemDem)){
				qPos.add(danhGiaKiemDem);
			}
			
			
			List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lstTotal != null) {
				return lstTotal.get(0);
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	Log _log = LogFactoryUtil.getLog(ThongTinKiemDemHoGDFinderImpl.class);
}
