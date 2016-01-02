package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import java.util.List;

import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocImpl;

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

public class KeHoachKiemDemNuocFinderImpl extends BasePersistenceImpl<KeHoachKiemDemNuoc> implements KeHoachKiemDemNuocFinder{

	public int countKeHoachKiemDemNuocSearch(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai ) throws SystemException {
		return countKeHoachKiemDemNuocSearch_(maTinh, maHuyen, kiemDemVienId, tramCapNuocId, trangThai);
	}
	private int countKeHoachKiemDemNuocSearch_(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai ) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_kehoachkiemdemnuoc a left join me_tramcapnuoc b ");
			query.append(" on a.TRAMCAPNUOCID = b.ID ");
			query.append(" WHERE 1 = 1 ");
			
			//chua co ma tinh + trang thai
//			if(!maTinh.isEmpty())query.append(" AND MATINH = " + maTinh +" ");
			//chua co ma tinh + trang thai
			if(Validator.isNotNull(trangThai)){
				if(trangThai.equalsIgnoreCase("0")){
					query.append(" AND a.ngayxuatban is null ");
					query.append(" AND a.ngaydong is null ");
				}else if(trangThai.equalsIgnoreCase("1")){
					query.append(" AND a.ngayxuatban is not null ");
					query.append(" AND a.ngaydong is null ");
				}else if(trangThai.equalsIgnoreCase("2")){
					query.append(" AND a.ngayxuatban is not null ");
					query.append(" AND a.ngaydong is not null ");
				}
			}
			if(Validator.isNotNull(maTinh))query.append(" AND b.MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND b.MAHUYEN = ? ");
			if(Validator.isNotNull(kiemDemVienId))query.append(" AND a.kiemdemvienid = ? ");
			if(Validator.isNotNull(tramCapNuocId))query.append(" AND a.TRAMCAPNUOCID = ? ");
			_log.debug("==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(Long.valueOf(maTinh));
			if(Validator.isNotNull(maHuyen))qPos.add(Long.valueOf(maHuyen));
			if(Validator.isNotNull(kiemDemVienId))qPos.add(Long.valueOf(kiemDemVienId));
			if(Validator.isNotNull(tramCapNuocId))qPos.add(Long.valueOf(tramCapNuocId));
			
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
	public List<KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearch(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai,int start,int end) throws SystemException {
		return getKeHoachKiemDemNuocSearch_(maTinh,maHuyen, kiemDemVienId, tramCapNuocId, trangThai, start, end);
	}
	private List<KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearch_(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT a.* ");
			query.append(" FROM me_kehoachkiemdemnuoc a left join me_tramcapnuoc b ");
			query.append(" on a.TRAMCAPNUOCID = b.ID ");
			query.append(" WHERE 1 = 1 ");
			
			//chua co ma tinh + trang thai
//			if(!maTinh.isEmpty())query.append(" AND MATINH = " + maTinh +" ");
			//chua co ma tinh + trang thai
			if(Validator.isNotNull(trangThai)){
				if(trangThai.equalsIgnoreCase("0")){
					query.append(" AND a.ngayxuatban is null ");
					query.append(" AND a.ngaydong is null ");
				}else if(trangThai.equalsIgnoreCase("1")){
					query.append(" AND a.ngayxuatban is not null ");
					query.append(" AND a.ngaydong is null ");
				}else if(trangThai.equalsIgnoreCase("2")){
					query.append(" AND a.ngayxuatban is not null ");
					query.append(" AND a.ngaydong is not null ");
				}
			}
			if(Validator.isNotNull(maTinh))query.append(" AND b.MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND b.MAHUYEN = ? ");
			if(Validator.isNotNull(kiemDemVienId))query.append(" AND a.kiemdemvienid = ? ");
			if(Validator.isNotNull(tramCapNuocId))query.append(" AND a.TRAMCAPNUOCID = ? ");
			query.append(" ORDER BY a.TRAMCAPNUOCID , a.kiemdemvienid ");
			_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("KeHoachKiemDemNuoc",KeHoachKiemDemNuocImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(Long.valueOf(maTinh));
			if(Validator.isNotNull(maHuyen))qPos.add(Long.valueOf(maHuyen));
			if(Validator.isNotNull(kiemDemVienId))qPos.add(Long.valueOf(kiemDemVienId));
			if(Validator.isNotNull(tramCapNuocId))qPos.add(Long.valueOf(tramCapNuocId));
			return (List<KeHoachKiemDemNuoc>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countKeHoachKiemDemNuocSearchNam(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai,String nam, String idNguoiTao ) throws SystemException {
		return countKeHoachKiemDemNuocSearchNam_(maTinh, maHuyen, kiemDemVienId, tramCapNuocId, trangThai,nam,idNguoiTao);
	}
	private int countKeHoachKiemDemNuocSearchNam_(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai,String nam, String idNguoiTao ) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_kehoachkiemdemnuoc a left join me_tramcapnuoc b ");
			query.append(" on a.TRAMCAPNUOCID = b.ID ");
			query.append(" WHERE 1 = 1 ");
			
			//chua co ma tinh + trang thai
//			if(!maTinh.isEmpty())query.append(" AND MATINH = " + maTinh +" ");
			//chua co ma tinh + trang thai
			if(Validator.isNotNull(trangThai)){
				if(trangThai.equalsIgnoreCase("0")){
					query.append(" AND a.ngayxuatban is null ");
					query.append(" AND a.ngaydong is null ");
				}else if(trangThai.equalsIgnoreCase("1")){
					query.append(" AND a.ngayxuatban is not null ");
					query.append(" AND a.ngaydong is null ");
				}else if(trangThai.equalsIgnoreCase("2")){
					query.append(" AND a.ngayxuatban is not null ");
					query.append(" AND a.ngaydong is not null ");
				}
			}
			if(Validator.isNotNull(maTinh))query.append(" AND b.MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND b.MAHUYEN = ? ");
			if(Validator.isNotNull(kiemDemVienId))query.append(" AND a.kiemdemvienid = ? ");
			if(Validator.isNotNull(tramCapNuocId))query.append(" AND a.TRAMCAPNUOCID = ? ");
			if(Validator.isNotNull(nam))query.append(" AND a.nam = ? ");
			if(Validator.isNotNull(idNguoiTao))query.append(" AND a.idnguoitao = ? ");
			_log.debug("==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(Long.valueOf(maTinh));
			if(Validator.isNotNull(maHuyen))qPos.add(Long.valueOf(maHuyen));
			if(Validator.isNotNull(kiemDemVienId))qPos.add(Long.valueOf(kiemDemVienId));
			if(Validator.isNotNull(tramCapNuocId))qPos.add(Long.valueOf(tramCapNuocId));
			if(Validator.isNotNull(nam))qPos.add(Long.valueOf(nam));
			if(Validator.isNotNull(idNguoiTao))qPos.add(Long.valueOf(idNguoiTao));
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
	public List<KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearchNam(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai, String nam, String idNguoiTao,int start,int end) throws SystemException {
		return getKeHoachKiemDemNuocSearchNam_(maTinh,maHuyen, kiemDemVienId, tramCapNuocId, trangThai,nam,idNguoiTao, start, end);
	}
	private List<KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearchNam_(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai, String nam, String idNguoiTao,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT a.* ");
			query.append(" FROM me_kehoachkiemdemnuoc a left join me_tramcapnuoc b ");
			query.append(" on a.TRAMCAPNUOCID = b.ID ");
			query.append(" WHERE 1 = 1 ");
			
			//chua co ma tinh + trang thai
//			if(!maTinh.isEmpty())query.append(" AND MATINH = " + maTinh +" ");
			//chua co ma tinh + trang thai
			if(Validator.isNotNull(trangThai)){
				if(trangThai.equalsIgnoreCase("0")){
					query.append(" AND a.ngayxuatban is null ");
					query.append(" AND a.ngaydong is null ");
				}else if(trangThai.equalsIgnoreCase("1")){
					query.append(" AND a.ngayxuatban is not null ");
					query.append(" AND a.ngaydong is null ");
				}else if(trangThai.equalsIgnoreCase("2")){
					query.append(" AND a.ngayxuatban is not null ");
					query.append(" AND a.ngaydong is not null ");
				}
			}
			if(Validator.isNotNull(maTinh))query.append(" AND b.MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND b.MAHUYEN = ? ");
			if(Validator.isNotNull(kiemDemVienId))query.append(" AND a.kiemdemvienid = ? ");
			if(Validator.isNotNull(tramCapNuocId))query.append(" AND a.TRAMCAPNUOCID = ? ");
			if(Validator.isNotNull(nam))query.append(" AND a.nam = ? ");
			if(Validator.isNotNull(idNguoiTao))query.append(" AND a.idnguoitao = ? ");
			query.append(" ORDER BY a.TRAMCAPNUOCID , a.kiemdemvienid ");
			_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("KeHoachKiemDemNuoc",KeHoachKiemDemNuocImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(Long.valueOf(maTinh));
			if(Validator.isNotNull(maHuyen))qPos.add(Long.valueOf(maHuyen));
			if(Validator.isNotNull(kiemDemVienId))qPos.add(Long.valueOf(kiemDemVienId));
			if(Validator.isNotNull(tramCapNuocId))qPos.add(Long.valueOf(tramCapNuocId));
			if(Validator.isNotNull(nam))qPos.add(Long.valueOf(nam));
			if(Validator.isNotNull(idNguoiTao))qPos.add(Long.valueOf(idNguoiTao));
			return (List<KeHoachKiemDemNuoc>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	Log _log = LogFactoryUtil.getLog(KeHoachKiemDemNuocFinderImpl.class);
}
