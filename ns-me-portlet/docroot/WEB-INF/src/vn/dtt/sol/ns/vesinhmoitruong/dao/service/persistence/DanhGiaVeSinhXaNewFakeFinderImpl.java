package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.sol.ns.danhgiavesinh.dao.model.impl.DANHGIAVESINHXAImpl;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.keHoachVeSinhXaNewImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DanhGiaVeSinhXaNewFakeFinderImpl extends BasePersistenceImpl<DanhGiaVeSinhXaNewFake> implements DanhGiaVeSinhXaNewFakeFinder {

	public List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearch(String maTinh,String nam, int start, int end) throws SystemException {
		return getListDanhGiaVeSinhXaSearch_(maTinh, nam, start, end);
	}
	private List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearch_(String maTinh, String nam, int start, int end)  throws SystemException {
		Session session = null;
		List<DanhGiaVeSinhXaNewFake> results = new ArrayList<DanhGiaVeSinhXaNewFake>();
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" select distinct MaTinh as mTinh, MaHuyen as mHuyen, Nam as nNam ");
			query.append(" from ME_DANHGIAVESINHXA ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND MATINH = ? ");
			if(Validator.isNotNull(nam))query.append(" AND nam = ? ");
			query.append(" ORDER BY MATINH , MAHUYEN ");
			_log.debug("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("mTinh", Type.STRING);
			q.addScalar("mHuyen", Type.STRING);
			q.addScalar("nNam", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(nam))qPos.add(nam);
			List<Object> lsObj =  (List<Object>) QueryUtil.list(q, getDialect(),  start,  end);
			DanhGiaVeSinhXaNewFake ett =null;
			String serilizeString=null;
			JSONArray empoyeeJsonArray=null;
			for (Object object : lsObj) {
				serilizeString=JSONFactoryUtil.serialize(object);
				empoyeeJsonArray=JSONFactoryUtil.createJSONArray(serilizeString);
				ett = new DanhGiaVeSinhXaNewFakeImpl();
				ett.setMaTinh(Validator.isNotNull(empoyeeJsonArray.getString(0))?empoyeeJsonArray.getString(0):StringPool.BLANK);
				ett.setMaTinhStr(NuocSachUtils.getNameTinh(Validator.isNotNull(empoyeeJsonArray.getString(0))?empoyeeJsonArray.getString(0):StringPool.BLANK));
				ett.setMaHuyen(Validator.isNotNull(empoyeeJsonArray.getString(1))?empoyeeJsonArray.getString(1):StringPool.BLANK);
				ett.setMaHuyenStr(NuocSachUtils.getNameHuyen(Validator.isNotNull(empoyeeJsonArray.getString(0))?empoyeeJsonArray.getString(0):StringPool.BLANK, Validator.isNotNull(empoyeeJsonArray.getString(1))?empoyeeJsonArray.getString(1):StringPool.BLANK));
				ett.setNam(Validator.isNotNull(empoyeeJsonArray.getString(2))?Integer.valueOf(empoyeeJsonArray.getString(2)):0);
				results.add(ett);
			}
			return results;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		
	}
	
	public List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearchHuyen(String maHuyen,String nam, int start, int end) throws SystemException {
		return getListDanhGiaVeSinhXaSearchHuyen_(maHuyen, nam, start, end);
	}
	private List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearchHuyen_(String maHuyen, String nam, int start, int end)  throws SystemException {
		Session session = null;
		List<DanhGiaVeSinhXaNewFake> results = new ArrayList<DanhGiaVeSinhXaNewFake>();
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" select distinct MaTinh as mTinh, MaHuyen as mHuyen, Nam as nNam ");
			query.append(" from ME_DANHGIAVESINHXA ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maHuyen))query.append(" AND MaHuyen = ? ");
			if(Validator.isNotNull(nam))query.append(" AND nam = ? ");
			query.append(" ORDER BY MATINH , MAHUYEN ");
			_log.debug("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("mTinh", Type.STRING);
			q.addScalar("mHuyen", Type.STRING);
			q.addScalar("nNam", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(Validator.isNotNull(nam))qPos.add(nam);
			List<Object> lsObj =  (List<Object>) QueryUtil.list(q, getDialect(),  start,  end);
			DanhGiaVeSinhXaNewFake ett =null;
			String serilizeString=null;
			JSONArray empoyeeJsonArray=null;
			for (Object object : lsObj) {
				serilizeString=JSONFactoryUtil.serialize(object);
				empoyeeJsonArray=JSONFactoryUtil.createJSONArray(serilizeString);
				ett = new DanhGiaVeSinhXaNewFakeImpl();
				ett.setMaTinh(Validator.isNotNull(empoyeeJsonArray.getString(0))?empoyeeJsonArray.getString(0):StringPool.BLANK);
				ett.setMaTinhStr(NuocSachUtils.getNameTinh(Validator.isNotNull(empoyeeJsonArray.getString(0))?empoyeeJsonArray.getString(0):StringPool.BLANK));
				ett.setMaHuyen(Validator.isNotNull(empoyeeJsonArray.getString(1))?empoyeeJsonArray.getString(1):StringPool.BLANK);
				ett.setMaHuyenStr(NuocSachUtils.getNameHuyen(Validator.isNotNull(empoyeeJsonArray.getString(0))?empoyeeJsonArray.getString(0):StringPool.BLANK, Validator.isNotNull(empoyeeJsonArray.getString(1))?empoyeeJsonArray.getString(1):StringPool.BLANK));
				ett.setNam(Validator.isNotNull(empoyeeJsonArray.getString(2))?Integer.valueOf(empoyeeJsonArray.getString(2)):0);
				results.add(ett);
			}
			return results;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		
	}
	
	public List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaInsert(String maTinh,String maHuyen,int nam, int start, int end) throws SystemException {
		return getListDanhGiaVeSinhXaInsert_(maTinh, maHuyen, nam, start, end);
	}
	private List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaInsert_(String maTinh, String maHuyen, int nam, int start, int end)  throws SystemException {
		Session session = null;
		List<DanhGiaVeSinhXaNewFake> results = new ArrayList<DanhGiaVeSinhXaNewFake>();
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" select * ");
			query.append(" from dm_dataitem as a left join me_kehoachvesinhxa b ");
			query.append(" on a.NODE_3 = b.MaXa ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND a.node_1 = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND a.node_2 = ? ");
			if(nam > 0)query.append(" AND b.nam = ? ");
			query.append(" ORDER BY MATINH , MAHUYEN ");
			_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("DATAITEM", DATAITEMImpl.class);
			q.addEntity("keHoachVeSinhXaNew", keHoachVeSinhXaNewImpl.class);
			
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(nam > 0)qPos.add(nam);
			List lsObj =  (List) QueryUtil.list(q, getDialect(),  start,  end);
			keHoachVeSinhXaNew ett1 = null;
			DATAITEM ett2 = null;
			DanhGiaVeSinhXaNewFake ett = null;
			for(Object object:lsObj){
				Object[] arrayobject=(Object[])object;
				ett1 = new keHoachVeSinhXaNewImpl();
				ett2 = new DATAITEMImpl();
				ett1=(keHoachVeSinhXaNew)arrayobject[1];
				ett2=(DATAITEM)arrayobject[0];
				ett = new DanhGiaVeSinhXaNewFakeImpl();
				if(Validator.isNotNull(ett1)){
					if(Validator.isNotNull(ett1.getDangKyVSTX())){
						ett.setDangKyVSTX(ett1.getDangKyVSTX());
					}
					if(Validator.isNotNull(ett1.getSoDan())){
						ett.setSoDan(ett1.getSoDan());
					}
					if(Validator.isNotNull(ett1.getNam())){
						ett.setNam(ett1.getNam());
					}
					if(Validator.isNotNull(ett1.getSoNhaTieuHVSMoi())){
						ett.setSoNhaTieuHVSXayMoi(ett1.getSoNhaTieuHVSMoi());
					}
				}
				if(Validator.isNotNull(ett2)){
					ett.setMaTinh(ett2.getNode1());
					ett.setMaTinhStr(NuocSachUtils.getNameTinh(ett2.getNode1()));
					ett.setMaHuyen(ett2.getNode2());
					ett.setMaHuyenStr(NuocSachUtils.getNameHuyen(ett2.getNode1(), ett2.getNode2()));
					ett.setMaXa(ett2.getNode3());
					ett.setMaXaStr(ett2.getName());
//					ett.setNam(ett2.getNam());
					ett.setTongSoHGD(VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch(maTinh, maHuyen, "", "", "", "", ""));
//					ett.setSoHGDCoNhaTieu(ett2.getSoHGDCoNhaTieu());
//					ett.setSoHGDCoNhaTieuHVS(ett2.getSoHGDCoNhaTieuHVS());
//					ett.setSoNhaTieuHVSMoi(ett2.getSoNhaTieuHVSXayMoi());
//					ett.setTiLeHGDCoNhaTieu(ett2.getTiLeHGDCoNhaTieu());
//					ett.setTiLeHGDCoNhaTieuHVS(ett2.getTiLeHGDCoNhaTieuHVS());
					ett.setTongSoTruongHoc(VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(maTinh, maHuyen, "", "", "1", "", "")
							+VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(maTinh, maHuyen, "", "", "2", "", "")
							+VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(maTinh, maHuyen, "", "", "3", "", ""));
//					ett.setSoTruongHocHVS(ett2.getSoTruongHocHVS());
					ett.setTongSoTramYTe(VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(maTinh, maHuyen, "", "", "4", "", ""));
//					ett.setSoTramYTeHVS(ett2.getSoTramYTeHVS());
//					ett.setTiLeTruongHocHVS(ett2.getTiLeTruongHocHVS());
//					ett.setTiLeTramYTeHVS(ett2.getTiLeTramYTeHVS());
//					ett.setKetLuanVSTX(ett2.getKetLuanVSTX());
//					ett.setGhiChu(ett2.getGhiChu());
//					ett.setBaoCaoDLI(ett2.getBaoCaoDLI());
//					ett.setNgayTao(new Date());
//					ett.setIdNguoiTao(ett2.getIdNguoiTao());
				}
				results.add(ett);
			}
			return results;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		
	}
	
	public List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaFakeList(String maTinh,String maHuyen,int nam, int start, int end) throws SystemException {
		return getListDanhGiaVeSinhXaFakeList_(maTinh, maHuyen, nam, start, end);
	}
	private List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaFakeList_(String maTinh, String maHuyen, int nam, int start, int end)  throws SystemException {
		Session session = null;
		List<DanhGiaVeSinhXaNewFake> results = new ArrayList<DanhGiaVeSinhXaNewFake>();
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" select * ");
			query.append(" from ME_DANHGIAVESINHXA as a left join me_kehoachvesinhxa b ");
			query.append(" on a.MaXa = b.MaXa ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND a.MaTinh = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND a.MaHuyen = ? ");
			if(nam > 0)query.append(" AND b.nam = ? ");
			query.append(" ORDER BY a.MATINH , a.MAHUYEN ");
			_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("DanhGiaVeSinhXaNew", DanhGiaVeSinhXaNewImpl.class);
			q.addEntity("keHoachVeSinhXaNew", keHoachVeSinhXaNewImpl.class);
			
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(nam > 0)qPos.add(nam);
			List lsObj =  (List) QueryUtil.list(q, getDialect(),  start,  end);
			keHoachVeSinhXaNew ett1 = null;
			DanhGiaVeSinhXaNew ett2 = null;
			DanhGiaVeSinhXaNewFake ett = null;
			for(Object object:lsObj){
				Object[] arrayobject=(Object[])object;
				ett1 = new keHoachVeSinhXaNewImpl();
				ett2 = new DanhGiaVeSinhXaNewImpl();
				ett1=(keHoachVeSinhXaNew)arrayobject[1];
				ett2=(DanhGiaVeSinhXaNew)arrayobject[0];
				ett = new DanhGiaVeSinhXaNewFakeImpl();
				if(Validator.isNotNull(ett1)){
					if(Validator.isNotNull(ett1.getDangKyVSTX())){
						ett.setDangKyVSTX(ett1.getDangKyVSTX());
					}
					if(Validator.isNotNull(ett1.getSoDan())){
						ett.setSoDan(ett1.getSoDan());
					}
					if(Validator.isNotNull(ett1.getSoNhaTieuHVSMoi())){
						ett.setSoNhaTieuHVSXayMoi(ett1.getSoNhaTieuHVSMoi());
					}
				}
				if(Validator.isNotNull(ett2)){
					ett.setId(ett2.getId());
					ett.setMaTinh(ett2.getMaTinh());
					ett.setMaTinhStr(NuocSachUtils.getNameTinh(ett2.getMaTinh()));
					ett.setMaHuyen(ett2.getMaHuyen());
					ett.setMaHuyenStr(NuocSachUtils.getNameHuyen(ett2.getMaTinh(), ett2.getMaHuyen()));
					ett.setMaXa(ett2.getMaXa());
					ett.setMaXaStr(NuocSachUtils.getNameXa(ett2.getMaXa()));
					ett.setNam(ett2.getNam());
					ett.setTongSoHGD(VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch(maTinh, maHuyen, "", "", "", "", ""));
					ett.setSoHGDCoNhaTieu(ett2.getSoHGDCoNhaTieu());
					ett.setSoHGDCoNhaTieuHVS(ett2.getSoHGDCoNhaTieuHVS());
					ett.setSoNhaTieuHVSMoi(ett2.getSoNhaTieuHVSXayMoi());
					ett.setTiLeHGDCoNhaTieu(ett2.getTiLeHGDCoNhaTieu());
					ett.setTiLeHGDCoNhaTieuHVS(ett2.getTiLeHGDCoNhaTieuHVS());
					ett.setTongSoTruongHoc(VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(maTinh, maHuyen, "", "", "1", "", ""));
					ett.setSoTruongHocHVS(ett2.getSoTruongHocHVS());
					ett.setTongSoTramYTe(VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(maTinh, maHuyen, "", "", "2", "", ""));
					ett.setSoTramYTeHVS(ett2.getSoTramYTeHVS());
					ett.setTiLeTruongHocHVS(ett2.getTiLeTruongHocHVS());
					ett.setTiLeTramYTeHVS(ett2.getTiLeTramYTeHVS());
					ett.setKetLuanVSTX(ett2.getKetLuanVSTX());
					ett.setGhiChu(ett2.getGhiChu());
					ett.setBaoCaoDLI(ett2.getBaoCaoDLI());
					ett.setNgayTao(new Date());
					ett.setIdNguoiTao(ett2.getIdNguoiTao());
					ett.setSoNhaTieuHVSXayMoi(ett2.getSoNhaTieuHVSXayMoi());
				}
				results.add(ett);
			}
			return results;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		
	}
	
	public int countListDanhGiaVeSinhXaFakeList(String maTinh, String maHuyen, int nam)  throws SystemException {
		return countListDanhGiaVeSinhXaFakeList_(maTinh, maHuyen, nam);
	}
	private int countListDanhGiaVeSinhXaFakeList_(String maTinh, String maHuyen, int nam)  throws SystemException {
		Session session = null;
		int result = 0;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append(" select count(*) as total ");
			query.append(" from ME_DANHGIAVESINHXA as a left join me_kehoachvesinhxa b ");
			query.append(" on a.MaXa = b.MaXa ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND a.MaTinh = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND a.MaHuyen = ? ");
			if(nam > 0)query.append(" AND b.nam = ? ");
			_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(nam > 0)qPos.add(nam);
			List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lstTotal != null) {
				result = lstTotal.get(0);
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	
	public int countListDanhGiaVeSinhXaInsert(String maTinh, String maHuyen, int nam)  throws SystemException {
		return countListDanhGiaVeSinhXaInsert_(maTinh, maHuyen, nam);
	}
	private int countListDanhGiaVeSinhXaInsert_(String maTinh, String maHuyen, int nam)  throws SystemException {
		Session session = null;
		int result = 0;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append(" select count(*) as total ");
			query.append(" from dm_dataitem as a left join me_kehoachvesinhxa b ");
			query.append(" on a.NODE_3 = b.MaXa ");
			query.append(" WHERE 1 = 1 ");
			
			if(Validator.isNotNull(maTinh))query.append(" AND a.node_1 = ? ");
			if(Validator.isNotNull(maHuyen))query.append(" AND a.node_2 = ? ");
			if(nam > 0)query.append(" AND b.nam = ? ");
			_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			if(Validator.isNotNull(maTinh))qPos.add(maTinh);
			if(Validator.isNotNull(maHuyen))qPos.add(maHuyen);
			if(nam > 0)qPos.add(nam);
			List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lstTotal != null) {
				result = lstTotal.get(0);
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	Log _log = LogFactoryUtil.getLog(DanhGiaVeSinhXaNewFakeFinderImpl.class);
}
