
package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.sol.ns.business.BaoCaoDLIBusiness;
import vn.dtt.sol.ns.business.KeHoachNuocSachBusiness;
import vn.dtt.sol.ns.business.KeHoachVeSinhBusiness;
import vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString;
import vn.dtt.sol.ns.tramcap.business.DanhGiaBenVungBussiness;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCImpl;
import vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.KeHoachKiemDemNuocLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewFakeLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.KeHoachKiemDemVeSinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DauNoiNuocFinderImpl extends BasePersistenceImpl<DauNoiNuoc> implements DauNoiNuocFinder{

	public int countThongKeMenuLeft(String tableName,int initUserType,String orgCode) throws SystemException {
		return countThongKeMenuLeft_(tableName, initUserType, orgCode);
	}
	private int countThongKeMenuLeft_(String tableName,int initUserType,String orgCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			if(tableName.equalsIgnoreCase("me_daunoinuoc")){
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					return DauNoiNuocLocalServiceUtil.getDauNoiNuocsCount();
				}else{
					query.append(" SELECT count(*) as total ");
					query.append(" FROM me_daunoinuoc ");
					query.append(" WHERE 1 = 1 ");
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						query.append(" AND MATINH = ? ");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						query.append(" AND MAHUYEN = ? ");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						query.append(" AND MATINH = ? ");
						query.append(" AND TRAMCAPNUOCID = ? ");
					}
					SQLQuery q = session.createSQLQuery(query.toString());
					q.addScalar("total", Type.INTEGER);
					q.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(q);
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						qPos.add(orgCode);
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						qPos.add(orgCode);
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						TramCapNuoc tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(Long.valueOf(orgCode));
						qPos.add(tramCap.getMaTinh());
						qPos.add(tramCap.getId());
					}
					List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					if (lstTotal != null) {
						return lstTotal.get(0);
					}
				}
				
			}else if(tableName.equalsIgnoreCase("me_tramcapnuoc")){
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					return TramCapNuocLocalServiceUtil.countAllTramCap();
				}else{
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						return TramCapNuocLocalServiceUtil.countTramCapByTinh(orgCode);
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						return 1;
					}
				}
				
			}else if(tableName.equalsIgnoreCase("me_kehoachkiemdemnuoc")){
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					return KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocsCount();
				}else{
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						return KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearch(orgCode,"", "", "", "");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						return KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearch("",orgCode, "", "", "");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						TramCapNuoc tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(Long.valueOf(orgCode));
						return KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearch(tramCap.getMaTinh(),"", "", tramCap.getId()+"", "");
					}
				}
				
			}
			else if (tableName.equalsIgnoreCase("me_dli_1_1")) {
				int count = 0;
				
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = BaoCaoDLIBusiness.searchCount(StringPool.BLANK, 1, cal.get(Calendar.YEAR), null);
				}else{
					count = BaoCaoDLIBusiness.searchCount(orgCode, 1, 0, null);
				}
				
				return count;
			} else if (tableName.equalsIgnoreCase("me_dli_1_2")) {
				int count = 0;
				
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = BaoCaoDLIBusiness.searchCount(StringPool.BLANK, 2, cal.get(Calendar.YEAR), null);
				}else{
					count = BaoCaoDLIBusiness.searchCount(orgCode, 2, 0, null);
				}
				
				return count;
			} else if (tableName.equalsIgnoreCase("me_dli_2_1")) {
				int count = 0;
				
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = BaoCaoDLIBusiness.searchCount(StringPool.BLANK, 1, cal.get(Calendar.YEAR), null);
				}else{
					count = BaoCaoDLIBusiness.searchCount(orgCode, 2, 0, null);
				}
				
				return count;
			} else if (tableName.equalsIgnoreCase("me_dli_2_2")) {
				int count = 0;
				
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = BaoCaoDLIBusiness.searchCount(StringPool.BLANK, 3, cal.get(Calendar.YEAR), null);
				}else{
					count = BaoCaoDLIBusiness.searchCount(orgCode, 3, 0, null);
				}
				
				return count;
			} else if (tableName.equalsIgnoreCase("me_dli_3")) {
				int count = 0;
				
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = BaoCaoDLIBusiness.searchCount(StringPool.BLANK, 4, cal.get(Calendar.YEAR), null);
				}else{
					count = BaoCaoDLIBusiness.searchCount(orgCode, 4, 0, null);
				}
				
				return count;
			} else if (tableName.equalsIgnoreCase("me_dli_tonghop")) {
				int count = 0;
				
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = BaoCaoDLIBusiness.searchCount(StringPool.BLANK, 5, cal.get(Calendar.YEAR), null);
				}else{
					count = BaoCaoDLIBusiness.searchCount(orgCode, 5, 0, null);
				}
				
				return count;
			} else if (tableName.equalsIgnoreCase("me_kehoachdaunam")) {
				int count = 0;
				
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = KeHoachNuocSachBusiness.countByNamAndTinh(0, null);
				} else {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = KeHoachNuocSachBusiness.countByNamAndTinh(0, orgCode);
				}
				
				return count;
			} else if (tableName.equalsIgnoreCase("me_kehoachvesinh")) {
				int count = 0;
				
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = KeHoachVeSinhBusiness.count(0, null, null);
				}else{
					Date now = new Date();
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(now);
					
					count = KeHoachVeSinhBusiness.count(0, orgCode, null);
				}
				
				return count;
			}
			else if (tableName.equalsIgnoreCase("me_vesinhgiadinh")) {
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					return VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhsCount();
				}else{
					query.append(" SELECT count(*) as total ");
					query.append(" FROM me_vesinhgiadinh ");
					query.append(" WHERE 1 = 1 ");
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						query.append(" AND MATINH = ? ");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						query.append(" AND MAHUYEN = ? ");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						query.append(" AND MATINH = ? ");
					}
					SQLQuery q = session.createSQLQuery(query.toString());
					q.addScalar("total", Type.INTEGER);
					q.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(q);
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						qPos.add(orgCode);
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						qPos.add(orgCode);
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						TramCapNuoc tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(Long.valueOf(orgCode));
						qPos.add(tramCap.getMaTinh());
					}
					List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					if (lstTotal != null) {
						return lstTotal.get(0);
					}
				}
			}
			else if (tableName.equalsIgnoreCase("me_vesinhcongtrinh")) {
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					return VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhsCount();
				}else{
					query.append(" SELECT count(*) as total ");
					query.append(" FROM me_vesinhcongtrinh ");
					query.append(" WHERE 1 = 1 ");
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						query.append(" AND MATINH = ? ");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						query.append(" AND MAHUYEN = ? ");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						query.append(" AND MATINH = ? ");
					}
					SQLQuery q = session.createSQLQuery(query.toString());
					q.addScalar("total", Type.INTEGER);
					q.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(q);
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						qPos.add(orgCode);
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						qPos.add(orgCode);
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						TramCapNuoc tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(Long.valueOf(orgCode));
						qPos.add(tramCap.getMaTinh());
					}
					List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					if (lstTotal != null) {
						return lstTotal.get(0);
					}
				}
			}
			else if (tableName.equalsIgnoreCase("me_kehoachkiemdemvesinh")) {
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					return KeHoachKiemDemVeSinhLocalServiceUtil.getKeHoachKiemDemVeSinhsCount();
				}else{
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						return KeHoachKiemDemVeSinhLocalServiceUtil.countKeHoachKiemDemVeSinhSearch(orgCode, "", "", "");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						return KeHoachKiemDemVeSinhLocalServiceUtil.countKeHoachKiemDemVeSinhSearch("", orgCode, "", "");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
						TramCapNuoc tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(Long.valueOf(orgCode));
						return KeHoachKiemDemVeSinhLocalServiceUtil.countKeHoachKiemDemVeSinhSearch(tramCap.getMaTinh(),"", "", "");
					}
				}
			} else if(tableName.equalsIgnoreCase("me_danhgiabenvung")) {
				
				if(initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU || initUserType == 0) {
					return DanhGiaBenVungLocalServiceUtil.countAll();
				} else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
					return DanhGiaBenVungBussiness.countDanhGiaBenVung(orgCode.toString(), 0);
				} else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
					return DanhGiaBenVungLocalServiceUtil.countByTram(Integer.parseInt(orgCode));
				}
				
			} else if(tableName.equalsIgnoreCase("me_danhgiavesinhxa")) {
				if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					return DanhGiaVeSinhXaNewFakeLocalServiceUtil.countListDanhGiaVeSinhXaSearch("", "");
				}else{
					if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						return DanhGiaVeSinhXaNewFakeLocalServiceUtil.countListDanhGiaVeSinhXaSearch(orgCode, "");
					}else if (initUserType == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						return DanhGiaVeSinhXaNewFakeLocalServiceUtil.countListDanhGiaVeSinhXaSearchHuyen(orgCode, "");
					}
				}
			}else{
				return 0;
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countDauNoiSearch(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao) throws SystemException {
		return countDauNoiSearch_(maTinh, maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao);
	}
	private int countDauNoiSearch_(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_daunoinuoc ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND MAHUYEN = ? ");
			if(Validator.isNotNull(maXa))query.append(" AND MAXA = ? ");
			
			if(Validator.isNotNull(namBaoCao) && namBaoCao.equals("9999")){
				if(Validator.isNotNull(trangThai) && trangThai.equalsIgnoreCase("0")){
					query.append(" AND ( TRANGTHAI = 0 OR TRANGTHAI = 3 OR TRANGTHAI = 4 OR TRANGTHAI = 8 ) ");
				}else{
					query.append(" AND TRANGTHAI = 1 ");
				}
				query.append(" AND NAMBAOCAO = ? ");
			}else{
				if(Validator.isNotNull(trangThai))query.append(" AND TRANGTHAI = ? ");
				if(Validator.isNotNull(namBaoCao))query.append(" AND NAMBAOCAO = ? ");
			}
			if(Validator.isNotNull(tramCapNuocId))query.append(" AND TRAMCAPNUOCID = ? ");
			//_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(Validator.isNotNull(maXa))qPos.add(maXa);
			
			if(Validator.isNotNull(namBaoCao) && namBaoCao.equals("9999")){
				qPos.add(0);
			}else{
				if(Validator.isNotNull(trangThai))qPos.add(Long.valueOf(trangThai));
				if(Validator.isNotNull(namBaoCao))qPos.add(Long.valueOf(namBaoCao));
			}
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
	public List<DauNoiNuoc> getDauNoiSearch(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao,int start,int end) throws SystemException {
		return getDauNoiSearch_(maTinh, maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao, start, end);
	}
	private List<DauNoiNuoc> getDauNoiSearch_(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * ");
			query.append(" FROM me_daunoinuoc ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND MAHUYEN = ? ");
			if(Validator.isNotNull(maXa))query.append(" AND MAXA = ? ");
			
			if(Validator.isNotNull(namBaoCao) && namBaoCao.equals("9999")){
				if(Validator.isNotNull(trangThai) && trangThai.equalsIgnoreCase("0")){
					query.append(" AND ( TRANGTHAI = 0 OR TRANGTHAI = 3 OR TRANGTHAI = 4 OR TRANGTHAI = 8 ) ");
				}else{
					query.append(" AND TRANGTHAI = 1 ");
				}
				query.append(" AND NAMBAOCAO = ? ");
			}else{
				if(Validator.isNotNull(trangThai))query.append(" AND TRANGTHAI = ? ");
				if(Validator.isNotNull(namBaoCao))query.append(" AND NAMBAOCAO = ? ");
			}
			if(Validator.isNotNull(tramCapNuocId))query.append(" AND TRAMCAPNUOCID = ? ");
			query.append(" ORDER BY MATINH , MAHUYEN , MAXA , THONXOM , TRAMCAPNUOCID , TENCHUHO, TRANGTHAI, NAMBAOCAO ");
			//_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DauNoiNuoc",DauNoiNuocImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(Validator.isNotNull(maXa))qPos.add(maXa);
			
			if(Validator.isNotNull(namBaoCao) && namBaoCao.equals("9999")){
				qPos.add(0);
			}else{
				if(Validator.isNotNull(trangThai))qPos.add(Long.valueOf(trangThai));
				if(Validator.isNotNull(namBaoCao))qPos.add(Long.valueOf(namBaoCao));
			}
			if(Validator.isNotNull(tramCapNuocId))qPos.add(Long.valueOf(tramCapNuocId));
			return (List<DauNoiNuoc>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	public int countDataItemSearch(String maTinh,String maHuyen,String maXa) throws SystemException {
		return countDataItemSearch_(maTinh, maHuyen, maXa);
	}
	//dataitem for ke hoach dau noi form
	private int countDataItemSearch_(String maTinh,String maHuyen,String maXa) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM dm_dataitem ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND NODE_1 = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND NODE_2 = ? ");
			if(Validator.isNotNull(maXa))query.append(" AND NODE_3 = ? ");
			//_log.debug("==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(Validator.isNotNull(maXa))qPos.add(maXa);
			
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
	public List<DATAITEM> getDataItemSearch(String maTinh,String maHuyen,String maXa,int start,int end) throws SystemException {
		return getDataItemSearch_(maTinh, maHuyen, maXa, start, end);
	}
	private List<DATAITEM> getDataItemSearch_(String maTinh,String maHuyen,String maXa,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * ");
			query.append(" FROM dm_dataitem ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND NODE_1 = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND NODE_2 = ? ");
			if(Validator.isNotNull(maXa))query.append(" AND NODE_3 = ? ");
			//_log.debug("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DATAITEM",DATAITEMImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(Validator.isNotNull(maXa))qPos.add(maXa);
			return (List<DATAITEM>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	//ke hoach kiem dem dau noi nuoc
	public List<THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String nguonDL, String danhGiaKiemDem,int start,int end) throws SystemException {
		return getThongTinKeHoachKiemDemNuocSearch_(keHoachId,trangThai,maTinh, maHuyen, maXa, nguonDL, danhGiaKiemDem, start, end);
	}
	private List<THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String nguonDL, String danhGiaKiemDem,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT a.* ");
			query.append(" FROM me_thongtinkiemdemnuoc a inner join me_daunoinuoc b on a.daunoinuocid = b.ID ");
			query.append(" WHERE 1 = 1 ");
//			daketthucdieutra
			if(Validator.isNotNull(keHoachId))query.append(" AND a.kehoachkiemdemnuocid = ? ");
			if(Validator.isNotNull(trangThai))query.append(" AND a.daketthucdieutra = ? ");
			if(Validator.isNotNull(maTinh))query.append(" AND a.matinh = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND a.mahuyen = ? ");
			if(Validator.isNotNull(maXa))query.append(" AND a.maxa = ? ");
			if(Validator.isNotNull(nguonDL)){
				if(nguonDL.equalsIgnoreCase("0")){
					query.append(" AND b.IDNGUOITAO = 0 ");
				}else{
					query.append(" AND b.IDNGUOITAO > 0 ");
				}
				
			}
			if(Validator.isNotNull(danhGiaKiemDem)){
				if(danhGiaKiemDem.equalsIgnoreCase("1")){
					query.append(" AND ( a.danhgiakiemdem = 1 ) ");
				}else{
					query.append(" AND ( a.danhgiakiemdem = 0 OR a.danhgiakiemdem = 2 ) ");
				}
				
			}
			//_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("THONGTINKIEMDEMNUOC",THONGTINKIEMDEMNUOCImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
			if(Validator.isNotNull(trangThai))qPos.add(trangThai);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(Validator.isNotNull(maXa))qPos.add(maXa);
			return (List<THONGTINKIEMDEMNUOC>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	/**
	 * @author tailt
	 * @param maTinh
	 * @param tramCapNuocId
	 * @param trangThai
	 * @param namBaoCao
	 * @return
	 */
	public int countDauNoiByMaTinhTramIdTrangThaiAndNam(String maTinh,String tramCapNuocId,String trangThai,String namBaoCao) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_daunoinuoc ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			if(Validator.isNotNull(tramCapNuocId)){
				query.append(" AND TRAMCAPNUOCID = ? ");
			}
			if(Validator.isNotNull(trangThai)){
				query.append(" AND TRANGTHAI = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND NAMBAOCAO = ? ");
			}
			
			
			//query.append(" ORDER BY MATINH , MAHUYEN , MAXA , THONXOM , TRAMCAPNUOCID , TENCHUHO, TRANGTHAI, NAMBAOCAO ");
			//_log.debug("==countDauNoiByMaTinhTramIdTrangThaiAndNam==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);		
			}
			if(Validator.isNotNull(tramCapNuocId)){
				qPos.add(tramCapNuocId);
			}
			if(Validator.isNotNull(trangThai)){
				qPos.add(trangThai);
			}
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
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
	
	/**
	 * @author tailt
	 * @param maTinh
	 * @param tramCapNuocId
	 * @param trangThai
	 * @param namBaoCao
	 * @return
	 */
	public List<DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNam(String maTinh,String tramCapNuocId,String trangThai,String namBaoCao)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * ");
			query.append(" FROM me_daunoinuoc ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			if(Validator.isNotNull(tramCapNuocId)){
				query.append(" AND TRAMCAPNUOCID = ? ");
			}
			if(Validator.isNotNull(trangThai)){
				query.append(" AND TRANGTHAI = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND NAMBAOCAO = ? ");
			}
			query.append(" ORDER BY TRAMCAPNUOCID, MAHUYEN , MAXA ");
			
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DauNoiNuocImpl.TABLE_NAME,DauNoiNuocImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			if(Validator.isNotNull(tramCapNuocId)){
				qPos.add(tramCapNuocId);
			}
			if(Validator.isNotNull(trangThai)){
				qPos.add(trangThai);
			}
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			
			return (List<DauNoiNuoc>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	//ke hoach kiem dem dau noi nuoc
			public List<String> getHuyenXaKeHoachKiemDemNuocSearch(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
				return getHuyenXaKeHoachKiemDemNuocSearch_(keHoachId,trangThai,maTinh,start, end);
			}
			private List<String> getHuyenXaKeHoachKiemDemNuocSearch_(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
				Session session = null;
				try {
					session = openSession();
					StringBuilder query = new StringBuilder();
					
					query.append(" SELECT distinct concat(matinh,\',\',mahuyen,\',\',maxa) as lsDataItem ");
					query.append(" FROM me_thongtinkiemdemnuoc ");
					query.append(" WHERE 1 = 1 ");
//					daketthucdieutra
					if(Validator.isNotNull(keHoachId))query.append(" AND kehoachkiemdemnuocid = ? ");
					if(Validator.isNotNull(trangThai))query.append(" AND daketthucdieutra = ? ");
					if(Validator.isNotNull(maTinh))query.append(" AND matinh = ? ");

					//_log.info("lsDataItemlsDataItemlsDataItem ==" + query.toString());
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
			
	public List<DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(String maTinh,String danhgiakiemdem,String namBaoCao)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT d.* FROM ME_TRAMCAPNUOC AS t ");
			query.append(" INNER JOIN ME_DAUNOINUOC AS d ON t.ID = d.TRAMCAPNUOCID ");
			query.append(" INNER JOIN ME_THONGTINKIEMDEMNUOC as k ON d.ID = k.DAUNOINUOCID ");
			query.append(" WHERE 1=1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND d.MATINH = ? ");
			}			
			if(Validator.isNotNull(danhgiakiemdem)){
				query.append(" AND k.DANHGIAKIEMDEM = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND YEAR(k.NGAYKIEMDEM) = ? ");
			}
			
			query.append(" ORDER BY d.TRAMCAPNUOCID, d.MAHUYEN, d.MAXA ");
			
			//_log.info("==getDauNoiByMaTinhTramIdTrangThaiAndNam==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DauNoiNuocImpl.TABLE_NAME,DauNoiNuocImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh)){
				qPos.add(maTinh);
			}
			if(Validator.isNotNull(danhgiakiemdem)){
				qPos.add(danhgiakiemdem);
			}
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			
			return (List<DauNoiNuoc>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}		
	
	//daunoisearch with ngay nhap lieu
	public List<DauNoiNuoc> getDauNoiSearch(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao,String ngayNhap,String idNguoiTao,String advText,int start,int end) throws SystemException {
		return getDauNoiSearch_(maTinh, maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText, start, end);
	}
	private List<DauNoiNuoc> getDauNoiSearch_(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao,String ngayNhap,String idNguoiTao,String advText,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * ");
			query.append(" FROM me_daunoinuoc ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND MAHUYEN = ? ");
			if(Validator.isNotNull(maXa))query.append(" AND MAXA = ? ");
			
			if(Validator.isNotNull(namBaoCao) && namBaoCao.equals("9999")){
				if(Validator.isNotNull(trangThai) && trangThai.equalsIgnoreCase("0")){
					query.append(" AND ( TRANGTHAI = 0 OR TRANGTHAI = 3 OR TRANGTHAI = 4 OR TRANGTHAI = 8 ) ");
				}else{
					query.append(" AND TRANGTHAI = 1 ");
				}
				query.append(" AND NAMBAOCAO = ? ");
			}else{
				if(Validator.isNotNull(trangThai))query.append(" AND TRANGTHAI = ? ");
				if(Validator.isNotNull(namBaoCao))query.append(" AND NAMBAOCAO = ? ");
			}
			if(Validator.isNotNull(tramCapNuocId))query.append(" AND TRAMCAPNUOCID = ? ");
			if(Validator.isNotNull(ngayNhap))query.append(" AND DATE_FORMAT(NGAYTAO, '%m/%d/%Y') = ? ");
			if(Validator.isNotNull(idNguoiTao))query.append(" AND IDNGUOITAO = ? ");
			if(Validator.isNotNull(advText))query.append(" AND ( THONXOM like ? OR TENCHUHO like ? ) ");
			query.append(" ORDER BY MATINH , MAHUYEN , MAXA , THONXOM , TRAMCAPNUOCID , TENCHUHO, TRANGTHAI, NAMBAOCAO ");
			//_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DauNoiNuoc",DauNoiNuocImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(Validator.isNotNull(maXa))qPos.add(maXa);
			
			if(Validator.isNotNull(namBaoCao) && namBaoCao.equals("9999")){
				qPos.add(0);
			}else{
				if(Validator.isNotNull(trangThai))qPos.add(Long.valueOf(trangThai));
				if(Validator.isNotNull(namBaoCao))qPos.add(Long.valueOf(namBaoCao));
			}
			if(Validator.isNotNull(tramCapNuocId))qPos.add(Long.valueOf(tramCapNuocId));
			if(Validator.isNotNull(ngayNhap))qPos.add(ngayNhap);
			if(Validator.isNotNull(idNguoiTao))qPos.add(idNguoiTao);
			if(Validator.isNotNull(advText)){
				qPos.add(advText + StringPool.PERCENT);
				qPos.add(advText + StringPool.PERCENT);
			}
			return (List<DauNoiNuoc>) QueryUtil.list(q, getDialect(),  start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	public int countDauNoiSearch(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao, String ngayNhap,String idNguoiTao,String advText) throws SystemException {
		return countDauNoiSearch_(maTinh, maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao,ngayNhap,idNguoiTao,advText);
	}
	private int countDauNoiSearch_(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao, String ngayNhap, String idNguoiTao,String advText) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_daunoinuoc ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND MATINH = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND MAHUYEN = ? ");
			if(Validator.isNotNull(maXa))query.append(" AND MAXA = ? ");
			
			if(Validator.isNotNull(namBaoCao) && namBaoCao.equals("9999")){
				if(Validator.isNotNull(trangThai) && trangThai.equalsIgnoreCase("0")){
					query.append(" AND ( TRANGTHAI = 0 OR TRANGTHAI = 3 OR TRANGTHAI = 4 OR TRANGTHAI = 8 ) ");
				}else{
					query.append(" AND TRANGTHAI = 1 ");
				}
				query.append(" AND NAMBAOCAO = ? ");
			}else{
				if(Validator.isNotNull(trangThai))query.append(" AND TRANGTHAI = ? ");
				if(Validator.isNotNull(namBaoCao))query.append(" AND NAMBAOCAO = ? ");
			}
			if(Validator.isNotNull(tramCapNuocId))query.append(" AND TRAMCAPNUOCID = ? ");
			if(Validator.isNotNull(ngayNhap))query.append(" AND DATE_FORMAT(NGAYTAO, '%m/%d/%Y') = ? ");
			if(Validator.isNotNull(idNguoiTao))query.append(" AND IDNGUOITAO = ? ");
			if(Validator.isNotNull(advText))query.append(" AND ( THONXOM like ? OR TENCHUHO like ? ) ");
			//_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(Validator.isNotNull(maXa))qPos.add(maXa);
			
			if(Validator.isNotNull(namBaoCao) && namBaoCao.equals("9999")){
				qPos.add(0);
			}else{
				if(Validator.isNotNull(trangThai))qPos.add(Long.valueOf(trangThai));
				if(Validator.isNotNull(namBaoCao))qPos.add(Long.valueOf(namBaoCao));
			}
			if(Validator.isNotNull(tramCapNuocId))qPos.add(Long.valueOf(tramCapNuocId));
			if(Validator.isNotNull(ngayNhap))qPos.add(ngayNhap);
			if(Validator.isNotNull(idNguoiTao))qPos.add(idNguoiTao);
			if(Validator.isNotNull(advText)){
				qPos.add(advText + StringPool.PERCENT);
				qPos.add(advText + StringPool.PERCENT);
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
	
	//ke hoach kiem dem dau noi nuoc exten
		public List<THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String nguonDL, String danhGiaKiemDem, String advText,int start,int end) throws SystemException {
			return getThongTinKeHoachKiemDemNuocSearch_(keHoachId,trangThai,maTinh, maHuyen, maXa, nguonDL, danhGiaKiemDem, advText, start, end);
		}
		private List<THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch_(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String nguonDL, String danhGiaKiemDem, String advText,int start,int end) throws SystemException {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				
				query.append(" SELECT a.* ");
				query.append(" FROM me_thongtinkiemdemnuoc a inner join me_daunoinuoc b on a.daunoinuocid = b.ID ");
				query.append(" WHERE 1 = 1 ");
//				daketthucdieutra
				if(Validator.isNotNull(keHoachId))query.append(" AND a.kehoachkiemdemnuocid = ? ");
				if(Validator.isNotNull(trangThai))query.append(" AND a.daketthucdieutra = ? ");
				if(Validator.isNotNull(maTinh))query.append(" AND a.matinh = ? ");
				if(Validator.isNotNull(maHuyen))query.append(" AND a.mahuyen = ? ");
				if(Validator.isNotNull(maXa))query.append(" AND a.maxa = ? ");
				if(Validator.isNotNull(nguonDL)){
					if(nguonDL.equalsIgnoreCase("0")){
						query.append(" AND b.IDNGUOITAO = 0 ");
					}else{
						query.append(" AND b.IDNGUOITAO > 0 ");
					}
					
				}
				if(Validator.isNotNull(danhGiaKiemDem)){
					if(danhGiaKiemDem.equalsIgnoreCase("1")){
						query.append(" AND ( a.danhgiakiemdem = 1 ) ");
					}else{
						query.append(" AND ( a.danhgiakiemdem = 0 OR a.danhgiakiemdem = 2 ) ");
					}
					
				}
				if(Validator.isNotNull(advText))query.append(" AND ( a.thonxom like ? OR a.tenchuho like ? ) ");
				//_log.info("==" + query.toString());
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("THONGTINKIEMDEMNUOC",THONGTINKIEMDEMNUOCImpl.class);
				QueryPos qPos = QueryPos.getInstance(q);
				if(Validator.isNotNull(keHoachId))qPos.add(keHoachId);
				if(Validator.isNotNull(trangThai))qPos.add(trangThai);
				if(Validator.isNotNull(maTinh))qPos.add(maTinh);
				if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
				if(Validator.isNotNull(maXa))qPos.add(maXa);
				if(Validator.isNotNull(advText)){
					qPos.add(advText + StringPool.PERCENT);
					qPos.add(advText + StringPool.PERCENT);
				}
				return (List<THONGTINKIEMDEMNUOC>) QueryUtil.list(q, getDialect(),  start, end);
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}
	public int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinh) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_daunoinuoc ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh)){
				query.append(" AND MATINH = ? ");
			}
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND NAMBAOCAO = ? ");
			}
			if(Validator.isNotNull(gioiTinh)){
				query.append(" AND GIOITINH = ? ");
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
			if(Validator.isNotNull(gioiTinh)){
				qPos.add(gioiTinh);
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
	
	public List<DauNoiNuoc> getDauNoiGroupByMaTinhTW(String namBaoCao)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT d.* FROM ME_DAUNOINUOC AS d ");
			query.append(" INNER JOIN  ME_TRAMCAPNUOC AS t  ON d.TRAMCAPNUOCID = t.ID ");
			query.append(" WHERE 1=1 ");
			
			
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND d.NAMBAOCAO = ? ");
			}
			
			query.append(" GROUP BY d.MATINH ");
			query.append(" ORDER BY d.MATINH ASC ");
			
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DauNoiNuocImpl.TABLE_NAME,DauNoiNuocImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			
			return (List<DauNoiNuoc>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}	
	public List<DauNoiNuoc> getDauNoiGroupByTramCapIDTW(String namBaoCao,String trangThai)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * FROM ME_DAUNOINUOC ");
			//query.append(" INNER JOIN  ME_TRAMCAPNUOC AS t  ON d.TRAMCAPNUOCID = t.ID ");
			query.append(" WHERE 1=1 ");
			
			
			if(Validator.isNotNull(namBaoCao)){
				query.append(" AND NAMBAOCAO = ? ");
			}
			if(Validator.isNotNull(trangThai)){
				query.append(" AND TRANGTHAI = ? ");
			}
			
			query.append(" GROUP BY MAHUYEN , MAXA  ");
			query.append(" ORDER BY  MATINH , MAHUYEN , MAXA , THONXOM , TRAMCAPNUOCID , TENCHUHO, TRANGTHAI, NAMBAOCAO ASC ");
			
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DauNoiNuocImpl.TABLE_NAME,DauNoiNuocImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			if(Validator.isNotNull(namBaoCao)){
				qPos.add(namBaoCao);
			}
			if(Validator.isNotNull(trangThai)){
				qPos.add(trangThai);
			}
			return (List<DauNoiNuoc>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}	
	Log _log = LogFactoryUtil.getLog(DauNoiNuocFinderImpl.class);
}
