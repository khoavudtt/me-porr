package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import java.util.List;

import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCImpl;

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

public class THONGTINKIEMDEMNUOCFinderImpl extends BasePersistenceImpl<THONGTINKIEMDEMNUOC> implements THONGTINKIEMDEMNUOCFinder{
	private static final Log _log = LogFactoryUtil.getLog(THONGTINKIEMDEMNUOCFinderImpl.class);
	
	public List<THONGTINKIEMDEMNUOC> getThongTinDNNThoiGianThuc(String maTinh, String namBaoCao, String danhgiakiemdem) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append(" SELECT  k.* FROM ME_TRAMCAPNUOC as t ");
			query.append(" INNER JOIN ME_DAUNOINUOC as d ON t.ID = d.TRAMCAPNUOCID ");
			query.append(" INNER JOIN ME_THONGTINKIEMDEMNUOC as k ON d.ID = k.DAUNOINUOCID ");
			query.append(" WHERE 1=1 ");
			if (Validator.isNotNull(maTinh)) {
				query.append(" AND d.MATINH =  ? ");
			}
			if (Validator.isNotNull(namBaoCao)) {
				query.append(" AND YEAR(k.NGAYKIEMDEM) =  ? ");
			}
			if (Validator.isNotNull(danhgiakiemdem)) {
				query.append(" AND k.DANHGIAKIEMDEM = ? ");
			}
			
			query.append(" ORDER BY  k.ID, k.MAHUYEN, k.MAXA  ASC ");
			
			_log.info("==getThongTinDNNThoiGianThuc==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(THONGTINKIEMDEMNUOCImpl.TABLE_NAME, THONGTINKIEMDEMNUOCImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(maTinh)) {
				qPos.add(maTinh);
			}
			if (Validator.isNotNull(namBaoCao)) {
				qPos.add(namBaoCao);
			}
			if (Validator.isNotNull(danhgiakiemdem)) {
				qPos.add(danhgiakiemdem);
			}
			return (List<THONGTINKIEMDEMNUOC>) QueryUtil.list(q, getDialect(),QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

		
	}
	
	public int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinhChuHo, String danhGiaKiemDem) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM ME_THONGTINKIEMDEMNUOC ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND YEAR(NGAYKIEMDEM) =  ? ");
			}
			if(Validator.isNotNull(gioiTinhChuHo)){
				query.append(" AND GIOITINHCHUHO = ? ");
			}
			if (Validator.isNotNull(danhGiaKiemDem)) {
				query.append(" AND DANHGIAKIEMDEM = ? ");
			}
			
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
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
}
