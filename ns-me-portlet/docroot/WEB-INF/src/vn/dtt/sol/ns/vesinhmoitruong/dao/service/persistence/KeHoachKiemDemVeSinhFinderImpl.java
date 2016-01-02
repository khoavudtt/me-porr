package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;

import java.util.List;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class KeHoachKiemDemVeSinhFinderImpl extends BasePersistenceImpl<KeHoachKiemDemVeSinh> implements KeHoachKiemDemVeSinhFinder {
	public int countKeHoachKiemDemVeSinhSearch(String maTinh,String maHuyen,String kiemDemVienId,String trangThai ) throws SystemException {
		return countKeHoachKiemDemVeSinhSearch_(maTinh, maHuyen, kiemDemVienId, trangThai);
	}
	private int countKeHoachKiemDemVeSinhSearch_(String maTinh,String maHuyen,String kiemDemVienId,String trangThai ) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_kehoachkiemdemvesinh a ");
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
			if(Validator.isNotNull(maTinh))query.append(" AND a.MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND a.MAHUYEN = ? ");
			if(Validator.isNotNull(kiemDemVienId))query.append(" AND a.kiemdemvienid = ? ");
			_log.debug("==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(Long.valueOf(maTinh));
			if(Validator.isNotNull(maHuyen))qPos.add(Long.valueOf(maHuyen));
			if(Validator.isNotNull(kiemDemVienId))qPos.add(Long.valueOf(kiemDemVienId));
			
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
	public List<KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(String maTinh,String maHuyen,String kiemDemVienId,String trangThai,int start,int end) throws SystemException {
		return getKeHoachKiemDemNuocSearch_(maTinh,maHuyen, kiemDemVienId, trangThai, start, end);
	}
	private List<KeHoachKiemDemVeSinh> getKeHoachKiemDemNuocSearch_(String maTinh,String maHuyen,String kiemDemVienId,String trangThai,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT a.* ");
			query.append(" FROM me_kehoachkiemdemvesinh a ");
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
			if(Validator.isNotNull(maTinh))query.append(" AND a.MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND a.MAHUYEN = ? ");
			if(Validator.isNotNull(kiemDemVienId))query.append(" AND a.kiemdemvienid = ? ");
			query.append(" ORDER BY a.MATINH , a.MAHUYEN , a.kiemdemvienid ");
			_log.debug("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("KeHoachKiemDemVeSinh",KeHoachKiemDemVeSinhImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(Long.valueOf(maTinh));
			if(Validator.isNotNull(maHuyen))qPos.add(Long.valueOf(maHuyen));
			if(Validator.isNotNull(kiemDemVienId))qPos.add(Long.valueOf(kiemDemVienId));
			return (List<KeHoachKiemDemVeSinh>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<String> getHuyenXaKeHoachKiemDemGiaDinhSearch(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
		return getHuyenXaKeHoachKiemDemGiaDinhSearch_(keHoachId,trangThai,maTinh,start, end);
	}
	private List<String> getHuyenXaKeHoachKiemDemGiaDinhSearch_(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT distinct concat(matinh,\',\',mahuyen,\',\',maxa) as lsDataItem ");
			query.append(" FROM me_thongtinkiemdemhogd ");
			query.append(" WHERE 1 = 1 ");
//			daketthucdieutra
			if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemvesinhid = ? ");
			if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
			if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");

			_log.debug("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("lsDataItem", Type.STRING);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
			if(Validator.isNotNull(trangThai))qPos.add(trangThai);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			return (List<String>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<String> getHuyenXaKeHoachKiemDemCongTrinhSearch(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
		return getHuyenXaKeHoachKiemDemCongTrinhSearch_(keHoachId,trangThai,maTinh,start, end);
	}
	private List<String> getHuyenXaKeHoachKiemDemCongTrinhSearch_(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT distinct concat(matinh,\',\',mahuyen,\',\',maxa) as lsDataItem ");
			query.append(" FROM me_thongtinkiemdemcongtrinh ");
			query.append(" WHERE 1 = 1 ");
//			daketthucdieutra
			if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemvesinhid = ? ");
			if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
			if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");

			_log.debug("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("lsDataItem", Type.STRING);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
			if(Validator.isNotNull(trangThai))qPos.add(trangThai);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			return (List<String>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	//ke hoach kiem dem dau noi nuoc
		public List<ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
			return getThongTinKeHoachKiemDemVeSinhGdSearch_(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
		}
		private List<ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearch_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				
				query.append(" SELECT * ");
				query.append(" FROM me_thongtinkiemdemhogd ");
				query.append(" WHERE 1 = 1 ");
//				daketthucdieutra
				if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemvesinhid = ? ");
				if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
				if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");
				if(Validator.isNotNull(maHuyen))query.append(" AND mahuyen = ? ");
				if(Validator.isNotNull(maXa))query.append(" AND maxa = ? ");
				if(Validator.isNotNull(danhGiaKiemDem))query.append(" AND danhgiakiemdem = ? ");
				_log.info("==" + query.toString());
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("ThongTinKiemDemHoGD",ThongTinKiemDemHoGDImpl.class);
				QueryPos qPos = QueryPos.getInstance(q);
				if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
				if(Validator.isNotNull(trangThai))qPos.add(trangThai);
				if(Validator.isNotNull(maTinh))qPos.add(maTinh);
				if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
				if(Validator.isNotNull(maXa))qPos.add(maXa);
				if(Validator.isNotNull(danhGiaKiemDem))qPos.add(danhGiaKiemDem);
				return (List<ThongTinKiemDemHoGD>) QueryUtil.list(q, getDialect(),  start, end);
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}
				public int countThongTinKeHoachKiemDemVeSinhGdSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
					return countThongTinKeHoachKiemDemVeSinhGdSearch_(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
				}
				private int countThongTinKeHoachKiemDemVeSinhGdSearch_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
					Session session = null;
					try {
						session = openSession();
						StringBuilder query = new StringBuilder();
						
						query.append(" SELECT count(*) as total ");
						query.append(" FROM me_thongtinkiemdemhogd ");
						query.append(" WHERE 1 = 1 ");
//						daketthucdieutra
						if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemvesinhid = ? ");
						if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
						if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");
						if(Validator.isNotNull(maHuyen))query.append(" AND mahuyen = ? ");
						if(Validator.isNotNull(maXa))query.append(" AND maxa = ? ");
						if(Validator.isNotNull(danhGiaKiemDem))query.append(" AND danhgiakiemdem = ? ");
						_log.info("==" + query.toString());
						SQLQuery q = session.createSQLQuery(query.toString());
						q.addScalar("total", Type.INTEGER);
						q.setCacheable(false);
						QueryPos qPos = QueryPos.getInstance(q);
						if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
						if(Validator.isNotNull(trangThai))qPos.add(trangThai);
						if(Validator.isNotNull(maTinh))qPos.add(maTinh);
						if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
						if(Validator.isNotNull(maXa))qPos.add(maXa);
						if(Validator.isNotNull(danhGiaKiemDem))qPos.add(danhGiaKiemDem);
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
				public List<ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
					return getThongTinKeHoachKiemDemVeSinhCongTrinhSearch_(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
				}
				private List<ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearch_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
					Session session = null;
					try {
						session = openSession();
						StringBuilder query = new StringBuilder();
						
						query.append(" SELECT * ");
						query.append(" FROM me_thongtinkiemdemcongtrinh ");
						query.append(" WHERE 1 = 1 ");
//						daketthucdieutra
						if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemvesinhid = ? ");
						if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
						if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");
						if(Validator.isNotNull(maHuyen))query.append(" AND mahuyen = ? ");
						if(Validator.isNotNull(maXa))query.append(" AND maxa = ? ");
						if(Validator.isNotNull(danhGiaKiemDem))query.append(" AND danhgiakiemdem = ? ");
						_log.info("==" + query.toString());
						SQLQuery q = session.createSQLQuery(query.toString());
						q.setCacheable(false);
						q.addEntity("ThongTinKiemDemCongTrinh",ThongTinKiemDemCongTrinhImpl.class);
						QueryPos qPos = QueryPos.getInstance(q);
						if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
						if(Validator.isNotNull(trangThai))qPos.add(trangThai);
						if(Validator.isNotNull(maTinh))qPos.add(maTinh);
						if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
						if(Validator.isNotNull(maXa))qPos.add(maXa);
						if(Validator.isNotNull(danhGiaKiemDem))qPos.add(danhGiaKiemDem);
						return (List<ThongTinKiemDemCongTrinh>) QueryUtil.list(q, getDialect(),  start, end);
					} catch (Exception e) {
						throw new SystemException(e);
					} finally {
						closeSession(session);
					}
				}
						public int countThongTinKeHoachKiemDemVeSinhCongTrinhSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
							return countThongTinKeHoachKiemDemVeSinhCongTrinhSearch_(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
						}
						private int countThongTinKeHoachKiemDemVeSinhCongTrinhSearch_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
							Session session = null;
							try {
								session = openSession();
								StringBuilder query = new StringBuilder();
								
								query.append(" SELECT count(*) as total ");
								query.append(" FROM me_thongtinkiemdemcongtrinh ");
								query.append(" WHERE 1 = 1 ");
//								daketthucdieutra
								if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemvesinhid = ? ");
								if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
								if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");
								if(Validator.isNotNull(maHuyen))query.append(" AND mahuyen = ? ");
								if(Validator.isNotNull(maXa))query.append(" AND maxa = ? ");
								if(Validator.isNotNull(danhGiaKiemDem))query.append(" AND danhgiakiemdem = ? ");
								_log.info("==" + query.toString());
								SQLQuery q = session.createSQLQuery(query.toString());
								q.addScalar("total", Type.INTEGER);
								q.setCacheable(false);
								QueryPos qPos = QueryPos.getInstance(q);
								if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
								if(Validator.isNotNull(trangThai))qPos.add(trangThai);
								if(Validator.isNotNull(maTinh))qPos.add(maTinh);
								if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
								if(Validator.isNotNull(maXa))qPos.add(maXa);
								if(Validator.isNotNull(danhGiaKiemDem))qPos.add(danhGiaKiemDem);
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
						
	//search with thon xom
						//ke hoach kiem dem dau noi nuoc
						public List<ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem, String thonXom, String nguonDL,int start,int end) throws SystemException {
							return getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom_(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom,nguonDL, start, end);
						}
						private List<ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem, String thonXom, String nguonDL,int start,int end) throws SystemException {
							Session session = null;
							try {
								session = openSession();
								StringBuilder query = new StringBuilder();
								
								query.append(" SELECT a.* ");
								query.append(" FROM me_thongtinkiemdemhogd a inner join me_vesinhgiadinh b on a.vesinhgiadinhid = b.id ");
								query.append(" WHERE 1 = 1 ");
//								daketthucdieutra
								if(Validator.isNotNull(keHoachId))query.append(" AND a.kehoachkiemdemvesinhid = ? ");
								if(Validator.isNotNull(trangThai))query.append(" AND a.daketthucdieutra = ? ");
								if(Validator.isNotNull(maTinh))query.append(" AND a.matinh = ? ");
								if(Validator.isNotNull(maHuyen))query.append(" AND a.mahuyen = ? ");
								if(Validator.isNotNull(maXa))query.append(" AND a.maxa = ? ");
								if(Validator.isNotNull(danhGiaKiemDem))query.append(" AND a.danhgiakiemdem = ? ");
								if(Validator.isNotNull(thonXom))query.append(" AND ( a.thonxom like ? OR a.tenchuho like ? ) ");
								if(Validator.isNotNull(nguonDL)){
									if(nguonDL.equalsIgnoreCase("0")){
										query.append(" AND b.IDNGUOITAO = 0 ");
									}else{
										query.append(" AND b.IDNGUOITAO > 0 ");
									}
									
								}
								_log.info("==" + query.toString());
								SQLQuery q = session.createSQLQuery(query.toString());
								q.setCacheable(false);
								q.addEntity("ThongTinKiemDemHoGD",ThongTinKiemDemHoGDImpl.class);
								QueryPos qPos = QueryPos.getInstance(q);
								if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
								if(Validator.isNotNull(trangThai))qPos.add(trangThai);
								if(Validator.isNotNull(maTinh))qPos.add(maTinh);
								if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
								if(Validator.isNotNull(maXa))qPos.add(maXa);
								if(Validator.isNotNull(danhGiaKiemDem))qPos.add(danhGiaKiemDem);
								if(Validator.isNotNull(thonXom)){
									qPos.add(thonXom + StringPool.PERCENT);
									qPos.add(thonXom + StringPool.PERCENT);
								}
								return (List<ThongTinKiemDemHoGD>) QueryUtil.list(q, getDialect(),  start, end);
							} catch (Exception e) {
								throw new SystemException(e);
							} finally {
								closeSession(session);
							}
						}
								public int countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,String thonXom, String nguonDL,int start,int end) throws SystemException {
									return countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom_(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom,nguonDL, start, end);
								}
								private int countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,String thonXom, String nguonDL,int start,int end) throws SystemException {
									Session session = null;
									try {
										session = openSession();
										StringBuilder query = new StringBuilder();
										
										query.append(" SELECT count(*) as total ");
										query.append(" FROM me_thongtinkiemdemhogd a inner join me_vesinhgiadinh b on a.vesinhgiadinhid = b.id ");
										query.append(" WHERE 1 = 1 ");
//										daketthucdieutra
										if(Validator.isNotNull(keHoachId))query.append(" AND a.kehoachkiemdemvesinhid = ? ");
										if(Validator.isNotNull(trangThai))query.append(" AND a.daketthucdieutra = ? ");
										if(Validator.isNotNull(maTinh))query.append(" AND a.matinh = ? ");
										if(Validator.isNotNull(maHuyen))query.append(" AND a.mahuyen = ? ");
										if(Validator.isNotNull(maXa))query.append(" AND a.maxa = ? ");
										if(Validator.isNotNull(danhGiaKiemDem))query.append(" AND a.danhgiakiemdem = ? ");
										if(Validator.isNotNull(thonXom))query.append(" AND ( a.thonxom like ? OR a.tenchuho like ? ) ");
										if(Validator.isNotNull(nguonDL)){
											if(nguonDL.equalsIgnoreCase("0")){
												query.append(" AND b.IDNGUOITAO = 0 ");
											}else{
												query.append(" AND b.IDNGUOITAO > 0 ");
											}
											
										}
										_log.info("==" + query.toString());
										SQLQuery q = session.createSQLQuery(query.toString());
										q.addScalar("total", Type.INTEGER);
										q.setCacheable(false);
										QueryPos qPos = QueryPos.getInstance(q);
										if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
										if(Validator.isNotNull(trangThai))qPos.add(trangThai);
										if(Validator.isNotNull(maTinh))qPos.add(maTinh);
										if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
										if(Validator.isNotNull(maXa))qPos.add(maXa);
										if(Validator.isNotNull(danhGiaKiemDem))qPos.add(danhGiaKiemDem);
										if(Validator.isNotNull(thonXom))qPos.add(StringPool.PERCENT +thonXom+StringPool.PERCENT);
										if(Validator.isNotNull(thonXom)){
											qPos.add(thonXom + StringPool.PERCENT);
											qPos.add(thonXom + StringPool.PERCENT);
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
								public List<ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem, String thonXom,int start,int end) throws SystemException {
									return getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom_(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start, end);
								}
								private List<ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem, String thonXom,int start,int end) throws SystemException {
									Session session = null;
									try {
										session = openSession();
										StringBuilder query = new StringBuilder();
										
										query.append(" SELECT * ");
										query.append(" FROM me_thongtinkiemdemcongtrinh ");
										query.append(" WHERE 1 = 1 ");
//										daketthucdieutra
										if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemvesinhid = ? ");
										if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
										if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");
										if(Validator.isNotNull(maHuyen))query.append(" AND mahuyen = ? ");
										if(Validator.isNotNull(maXa))query.append(" AND maxa = ? ");
										if(Validator.isNotNull(danhGiaKiemDem))query.append(" AND danhgiakiemdem = ? ");
										if(Validator.isNotNull(thonXom))query.append(" AND ( diachi like ? or tencongtrinh like ? ) ");
										_log.info("==" + query.toString());
										SQLQuery q = session.createSQLQuery(query.toString());
										q.setCacheable(false);
										q.addEntity("ThongTinKiemDemCongTrinh",ThongTinKiemDemCongTrinhImpl.class);
										QueryPos qPos = QueryPos.getInstance(q);
										if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
										if(Validator.isNotNull(trangThai))qPos.add(trangThai);
										if(Validator.isNotNull(maTinh))qPos.add(maTinh);
										if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
										if(Validator.isNotNull(maXa))qPos.add(maXa);
										if(Validator.isNotNull(danhGiaKiemDem))qPos.add(danhGiaKiemDem);
										if(Validator.isNotNull(thonXom)){
											qPos.add(thonXom + StringPool.PERCENT);
											qPos.add(thonXom + StringPool.PERCENT);
										}
										return (List<ThongTinKiemDemCongTrinh>) QueryUtil.list(q, getDialect(),  start, end);
									} catch (Exception e) {
										throw new SystemException(e);
									} finally {
										closeSession(session);
									}
								}
										public int countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem, String thonXom,int start,int end) throws SystemException {
											return countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom_(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start, end);
										}
										private int countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem, String thonXom,int start,int end) throws SystemException {
											Session session = null;
											try {
												session = openSession();
												StringBuilder query = new StringBuilder();
												
												query.append(" SELECT count(*) as total ");
												query.append(" FROM me_thongtinkiemdemcongtrinh ");
												query.append(" WHERE 1 = 1 ");
//												daketthucdieutra
												if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemvesinhid = ? ");
												if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
												if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");
												if(Validator.isNotNull(maHuyen))query.append(" AND mahuyen = ? ");
												if(Validator.isNotNull(maXa))query.append(" AND maxa = ? ");
												if(Validator.isNotNull(danhGiaKiemDem))query.append(" AND danhgiakiemdem = ? ");
												if(Validator.isNotNull(thonXom))query.append(" AND ( diachi like ? or tencongtrinh like ? ) ");
												_log.info("==" + query.toString());
												SQLQuery q = session.createSQLQuery(query.toString());
												q.addScalar("total", Type.INTEGER);
												q.setCacheable(false);
												QueryPos qPos = QueryPos.getInstance(q);
												if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
												if(Validator.isNotNull(trangThai))qPos.add(trangThai);
												if(Validator.isNotNull(maTinh))qPos.add(maTinh);
												if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
												if(Validator.isNotNull(maXa))qPos.add(maXa);
												if(Validator.isNotNull(danhGiaKiemDem))qPos.add(danhGiaKiemDem);
												if(Validator.isNotNull(thonXom)){
													qPos.add(thonXom + StringPool.PERCENT);
													qPos.add(thonXom + StringPool.PERCENT);
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
										
										
	public int countKeHoachKiemDemVeSinhSearch(String maTinh,String maHuyen,String kiemDemVienId,String trangThai ,String idNguoiTao) throws SystemException {
		return countKeHoachKiemDemVeSinhSearch_(maTinh, maHuyen, kiemDemVienId, trangThai,idNguoiTao);
	}
	private int countKeHoachKiemDemVeSinhSearch_(String maTinh,String maHuyen,String kiemDemVienId,String trangThai ,String idNguoiTao) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_kehoachkiemdemvesinh a ");
			query.append(" WHERE 1 = 1 ");
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
			if(Validator.isNotNull(maTinh))query.append(" AND a.MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND a.MAHUYEN = ? ");
			if(Validator.isNotNull(kiemDemVienId))query.append(" AND a.kiemdemvienid = ? ");
			if(Validator.isNotNull(idNguoiTao))query.append(" AND a.idnguoitao = ? ");
			_log.debug("==" + query.toString());
												
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
												
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(Long.valueOf(maTinh));
			if(Validator.isNotNull(maHuyen))qPos.add(Long.valueOf(maHuyen));
			if(Validator.isNotNull(kiemDemVienId))qPos.add(Long.valueOf(kiemDemVienId));
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
			public List<KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(String maTinh,String maHuyen,String kiemDemVienId,String trangThai,String idNguoiTao,int start,int end) throws SystemException {
				return getKeHoachKiemDemNuocSearch_(maTinh,maHuyen, kiemDemVienId, trangThai, start, end);
			}
			private List<KeHoachKiemDemVeSinh> getKeHoachKiemDemNuocSearch_(String maTinh,String maHuyen,String kiemDemVienId,String trangThai,String idNguoiTao,int start,int end) throws SystemException {
				Session session = null;
				try {
					session = openSession();
					StringBuilder query = new StringBuilder();
												
					query.append(" SELECT a.* ");
					query.append(" FROM me_kehoachkiemdemvesinh a ");
					query.append(" WHERE 1 = 1 ");
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
					if(Validator.isNotNull(maTinh))query.append(" AND a.MATINH = ? ");
					if(Validator.isNotNull(maHuyen))query.append(" AND a.MAHUYEN = ? ");
					if(Validator.isNotNull(kiemDemVienId))query.append(" AND a.kiemdemvienid = ? ");
					if(Validator.isNotNull(idNguoiTao))query.append(" AND a.idnguoitao = ? ");
					query.append(" ORDER BY a.MATINH , a.MAHUYEN , a.kiemdemvienid ");
					_log.debug("==" + query.toString());
					SQLQuery q = session.createSQLQuery(query.toString());
					q.setCacheable(false);
					q.addEntity("KeHoachKiemDemVeSinh",KeHoachKiemDemVeSinhImpl.class);
					QueryPos qPos = QueryPos.getInstance(q);
					if(Validator.isNotNull(maTinh))qPos.add(Long.valueOf(maTinh));
					if(Validator.isNotNull(maHuyen))qPos.add(Long.valueOf(maHuyen));
					if(Validator.isNotNull(kiemDemVienId))qPos.add(Long.valueOf(kiemDemVienId));
					if(Validator.isNotNull(idNguoiTao))qPos.add(Long.valueOf(idNguoiTao));	
						return (List<KeHoachKiemDemVeSinh>) QueryUtil.list(q, getDialect(),  start, end);
					} catch (Exception e) {
						throw new SystemException(e);
					} finally {
						closeSession(session);
					}
			}
	Log _log = LogFactoryUtil.getLog(KeHoachKiemDemVeSinhFinderImpl.class);
}
