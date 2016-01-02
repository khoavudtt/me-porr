package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhImpl;

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
import com.liferay.util.dao.orm.CustomSQLUtil;

public class VeSinhCongTrinhFinderImpl extends
		BasePersistenceImpl<VeSinhCongTrinh> implements VeSinhCongTrinhFinder {

	public static final String SQL_NUOC_1 = "thong.ke.dau.noi.kiem.dem.tai.tinh";
	public static final String SQL_NUOC_2 = "thong.ke.dau.noi.kiem.dem.tai.tinh.da.phan.ke.hoach";
	public static final String SQL_NUOC_3 = "thong.ke.dau.noi.kiem.dem.tai.tinh.da.dong.bo";
	public static final String SQL_VESINH_1 = "thong.ke.ho.gia.dinh.kiem.dem.tai.tinh";
	public static final String SQL_VESINH_2 = "thong.ke.ho.gia.dinh.kiem.dem.tai.tinh.da.phan.ke.hoach";
	public static final String SQL_VESINH_3 = "thong.ke.ho.gia.dinh.kiem.dem.tai.tinh.da.dong.bo";
	public static final String SQL_CONGTRINH_1 = "thong.ke.cong.trinh.kiem.dem.tai.tinh";
	public static final String SQL_CONGTRINH_2 = "thong.ke.cong.trinh.kiem.dem.tai.tinh.da.phan.ke.hoach";
	public static final String SQL_CONGTRINH_3 = "thong.ke.cong.trinh.kiem.dem.tai.tinh.da.dong.bo";

	public static final String COUNT_CONG_TRINH_CAP_NUOC_ADMIN = "count.cong.trinh.cap.nuoc.admin";
	public static final String COUNT_CONG_TRINH_CAP_NUOC_TU = "count.cong.trinh.cap.nuoc.tu";
	public static final String COUNT_CONG_TRINH_CAP_NUOC_TINH = "count.cong.trinh.cap.nuoc.tinh";
	public static final String COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP = "count.cong.trinh.cap.nuoc.tramcap";
	public static final String COUNT_DAU_NOI_NUOC_ADMIN = "count.dau.noi.nuoc.admin";
	public static final String COUNT_DAU_NOI_NUOC_TU = "count.dau.noi.nuoc.tu";
	public static final String COUNT_DAU_NOI_NUOC_TINH = "count.dau.noi.nuoc.tinh";
	public static final String COUNT_DAU_NOI_NUOC_TRAMCAP = "count.dau.noi.nuoc.tramcap";
	public static final String COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN = "count.ke.hoach.dau.noi.admin";
	public static final String COUNT_KE_HOACH_DAU_NOI_NUOC_TU = "count.ke.hoach.dau.noi.tu";
	public static final String COUNT_KE_HOACH_DAU_NOI_NUOC_TINH = "count.ke.hoach.dau.noi.tinh";
	public static final String COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP = "count.ke.hoach.dau.noi.tramcap";
	
	public static final String COUNT_DANH_GIA_CUOI_NAM_ADMIN = "count.danh.gia.cuoi.nam.admin";
	public static final String COUNT_DANH_GIA_CUOI_NAM_TINH = "count.danh.gia.cuoi.nam.tinh";
	public static final String COUNT_DANH_GIA_CUOI_NAM_TU = "count.danh.gia.cuoi.nam.tu";
	public static final String COUNT_DANH_GIA_CUOI_NAM_TRAMCAP = "count.danh.gia.cuoi.nam.tramcap";

	public static final String COUNT_KE_HOACH_DAU_NAM_AMDIN = "count.ke.hoach.dau.nam.admin";
	public static final String COUNT_KE_HOACH_DAU_NAM_TU = "count.ke.hoach.dau.nam.tu";
	public static final String COUNT_KE_HOACH_DAU_NAM_TINH = "count.ke.hoach.dau.nam.tinh";
	public static final String COUNT_KE_HOACH_DAU_NAM_TRAMCAP = "count.ke.hoach.dau.nam.tramcap";

	// Ve sinh gia dinh
	
	public static final String COUNT_VE_SINH_GIA_DINH_ADMIN = "count.ve.sinh.gia.dinh.admin";
	public static final String COUNT_VE_SINH_GIA_DINH_TU = "count.ve.sinh.gia.dinh.tu";
	public static final String COUNT_VE_SINH_GIA_DINH_TINH = "count.ve.sinh.gia.dinh.tinh";
	public static final String COUNT_VE_SINH_GIA_DINH_HUYEN = "count.ve.sinh.gia.dinh.huyen";
	
	// Ve sinh cong trinh
	public static final String COUNT_VE_SINH_CONG_TRINH_ADMIN = "count.ve.sinh.cong.trinh.admin";
	public static final String COUNT_VE_SINH_CONG_TRINH_TU = "count.ve.sinh.cong.trinh.tu";
	public static final String COUNT_VE_SINH_CONG_TRINH_TINH = "count.ve.sinh.cong.trinh.tinh";
	public static final String COUNT_VE_SINH_CONG_TRINH_HUYEN = "count.ve.sinh.cong.trinh.huyen";
	
	// Kiem dem ve sinh
	public static final String COUNT_KIEM_DEM_VE_SINH_ADMIN = "count.kiem.dem.ve.sinh.admin";
	public static final String COUNT_KIEM_DEM_VE_SINH_TU = "count.kiem.dem.ve.sinh.tu";
	public static final String COUNT_KIEM_DEM_VE_SINH_TINH = "count.kiem.dem.ve.sinh.tinh";
	public static final String COUNT_KIEM_DEM_VE_SINH_HUYEN = "count.kiem.dem.ve.sinh.huyen";
	
	// Ke hoach dau nam
	public static final String COUNT_KE_HOACH_VE_SINH_ADMIN = "count.ke.hoach.ve.sinh.admin";
	public static final String COUNT_KE_HOACH_VE_SINH_TU = "count.ke.hoach.ve.sinh.tu";
	public static final String COUNT_KE_HOACH_VE_SINH_TINH = "count.ke.hoach.ve.sinh.tinh";
	public static final String COUNT_KE_HOACH_VE_SINH_HUYEN = "count.ke.hoach.ve.sinh.huyen";
	
	// Danh gia cuoi nam 
	public static final String COUNT_DANH_GIA_VE_SINH_ADMIN = "count.danh.gia.ve.sinh.admin";
	public static final String COUNT_DANH_GIA_VE_SINH_TU = "count.danh.gia.ve.sinh.tu";
	public static final String COUNT_DANH_GIA_VE_SINH_TINH = "count.danh.gia.ve.sinh.tinh";
	public static final String COUNT_DANH_GIA_VE_SINH_HUYEN = "count.danh.gia.ve.sinh.huyen";
	
	// Lua chon mau ngau nhien
	
	public static final String COUNT_MAU_NGAU_NHIEN_ADMIN = "count.mau.ngau.nhien.admin";
	public static final String COUNT_MAU_NGAU_NHIEN_TU = "count.mau.ngau.nhien.tu";
	public static final String COUNT_MAU_NGAU_NHIEN_TINH = "count.mau.ngau.nhien.tinh";
	public static final String COUNT_MAU_NGAU_NHIEN_HUYEN = "count.mau.ngau.nhien.huyen";

	public int COUNT_VE_SINH_GIA_DINH_ADMIN()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_VE_SINH_GIA_DINH_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	public int COUNT_VE_SINH_GIA_DINH_TU(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_VE_SINH_CONG_TRINH_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(userId);
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


	public int COUNT_VE_SINH_GIA_DINH_TINH(String maTinh, long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_VE_SINH_GIA_DINH_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);
			qPos.add(userId);
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


	public int COUNT_VE_SINH_GIA_DINH_HUYEN(String maTinh, long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_VE_SINH_GIA_DINH_HUYEN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);
			qPos.add(userId);
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

	
	public int COUNT_VE_SINH_CONG_TRINH_ADMIN()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_VE_SINH_CONG_TRINH_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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


	
	public int COUNT_VE_SINH_CONG_TRINH_TU(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_VE_SINH_CONG_TRINH_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(userId);

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


	public int COUNT_VE_SINH_CONG_TRINH_TINH(String maTinh, long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_VE_SINH_CONG_TRINH_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);
			qPos.add(userId);

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


	public int COUNT_VE_SINH_CONG_TRINH_HUYEN(String maTinh, long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_VE_SINH_CONG_TRINH_HUYEN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);
			qPos.add(userId);

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


	public int COUNT_KIEM_DEM_VE_SINH_ADMIN(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KIEM_DEM_VE_SINH_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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


	public int COUNT_KIEM_DEM_VE_SINH_TU(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KIEM_DEM_VE_SINH_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(userId);

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


	public int COUNT_KIEM_DEM_VE_SINH_TINH(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KIEM_DEM_VE_SINH_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(userId);

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


	public int COUNT_KIEM_DEM_VE_SINH_HUYEN(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KIEM_DEM_VE_SINH_HUYEN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(userId);

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


	
	public int COUNT_KE_HOACH_VE_SINH_ADMIN()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_VE_SINH_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			

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

	
	public int COUNT_KE_HOACH_VE_SINH_TU()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_VE_SINH_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			

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

	public int COUNT_KE_HOACH_VE_SINH_TINH(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_VE_SINH_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(maTinh);

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


	
	public int COUNT_KE_HOACH_VE_SINH_HUYEN(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_VE_SINH_HUYEN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(maTinh);

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

	
	public int COUNT_DANH_GIA_VE_SINH_ADMIN()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DANH_GIA_VE_SINH_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	public int COUNT_DANH_GIA_VE_SINH_TU()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DANH_GIA_VE_SINH_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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



	public int COUNT_DANH_GIA_VE_SINH_TINH(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DANH_GIA_VE_SINH_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);

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



	public int COUNT_DANH_GIA_VE_SINH_HUYEN(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DANH_GIA_VE_SINH_HUYEN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);
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


	
	public int COUNT_MAU_NGAU_NHIEN_ADMIN()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_MAU_NGAU_NHIEN_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			
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


	public int COUNT_MAU_NGAU_NHIEN_TU()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_MAU_NGAU_NHIEN_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			
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


	public int COUNT_MAU_NGAU_NHIEN_TINH(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_MAU_NGAU_NHIEN_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);
			
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


	public int COUNT_MAU_NGAU_NHIEN_HUYEN(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_MAU_NGAU_NHIEN_HUYEN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);
			
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

	
	
	
	
	/////////////////////
	
	public int COUNT_DANH_GIA_CUOI_NAM_ADMIN()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DANH_GIA_CUOI_NAM_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	public int COUNT_DANH_GIA_CUOI_NAM_TU()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DANH_GIA_CUOI_NAM_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	public int COUNT_DANH_GIA_CUOI_NAM_TINH(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DANH_GIA_CUOI_NAM_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);

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


	
	public int COUNT_DANH_GIA_CUOI_NAM_TRAMCAP(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DANH_GIA_CUOI_NAM_TRAMCAP);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTinh);

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

	
	public int COUNT_KE_HOACH_DAU_NAM_AMDIN()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_DAU_NAM_AMDIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	
	public int COUNT_KE_HOACH_DAU_NAM_TU()
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_DAU_NAM_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);


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


	public int COUNT_KE_HOACH_DAU_NAM_TINH(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_DAU_NAM_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int COUNT_KE_HOACH_DAU_NAM_TRAMCAP(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_DAU_NAM_TRAMCAP);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userId);

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

	
	
	
	
	
	
	
	
	public int COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userId);

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

	public int COUNT_KE_HOACH_DAU_NOI_NUOC_TINH(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_DAU_NOI_NUOC_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int COUNT_KE_HOACH_DAU_NOI_NUOC_TU() throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_DAU_NOI_NUOC_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	public int COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN() throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	public int COUNT_DAU_NOI_NUOC_TRAMCAP(String maTinh, long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DAU_NOI_NUOC_TRAMCAP);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(userId);

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

	public int COUNT_DAU_NOI_NUOC_TINH(String maTinh) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DAU_NOI_NUOC_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int COUNT_DAU_NOI_NUOC_TU(long userId) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DAU_NOI_NUOC_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userId);

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

	public int COUNT_DAU_NOI_NUOC_ADMIN() throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_DAU_NOI_NUOC_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	public int COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userId);

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

	public int COUNT_CONG_TRINH_CAP_NUOC_TINH(String maTinh, long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_CONG_TRINH_CAP_NUOC_TINH);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(userId);

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

	public int COUNT_CONG_TRINH_CAP_NUOC_TU(long userId)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_CONG_TRINH_CAP_NUOC_TU);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userId);

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

	public int COUNT_CONG_TRINH_CAP_NUOC_ADMIN() throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_CONG_TRINH_CAP_NUOC_ADMIN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

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

	public int countCongTrinhDongBoInTinh(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_CONGTRINH_3);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int countCongTrinhPhanKHInTinh(String maTinh)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_CONGTRINH_2);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int countCongTrinhInTinh(String maTinh) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_CONGTRINH_1);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int countHGDDongBoInTinh(String maTinh) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_VESINH_3);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int countHGDPhanKHInTinh(String maTinh, int namXayDung)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_VESINH_2);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(namXayDung);

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

	public int countHGDInTinh(String maTinh, int namXayDung)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_VESINH_1);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(namXayDung);

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

	public int countDauNoiDongBoInTinh(String maTinh) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_NUOC_3);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int countDauNoiPhanKHInTinh(String maTinh) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_NUOC_2);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int countDauNoiInTinh(String maTinh) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(SQL_NUOC_1);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	public int countVeSinhCongTrinhSearch(String maTinh, String maHuyen,
			String maXa, String loaiNhaTieuId, String loaiCongTrinh,
			String trangThai, String namBaoCao) throws SystemException {
		return countVeSinhCongTrinhSearch_(maTinh, maHuyen, maXa,
				loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao);
	}

	private int countVeSinhCongTrinhSearch_(String maTinh, String maHuyen,
			String maXa, String loaiNhaTieuId, String loaiCongTrinh,
			String trangThai, String namBaoCao) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append(" SELECT count(*) as total ");
			query.append(" FROM me_vesinhcongtrinh ");
			query.append(" WHERE 1 = 1 ");

			if (Validator.isNotNull(maTinh))
				query.append(" AND MATINH = ? ");
			if (Validator.isNotNull(maHuyen))
				query.append(" AND MAHUYEN = ? ");
			if (Validator.isNotNull(maXa))
				query.append(" AND MAXA = ? ");

			if (Validator.isNotNull(namBaoCao) && namBaoCao.contains("9999")) {
				if (Validator.isNotNull(trangThai) && trangThai.equals("0")) {
					query.append(" AND ( TRANGTHAI = 0 OR TRANGTHAI = 3 OR TRANGTHAI = 4 OR TRANGTHAI = 8 ) ");
				} else {
					query.append(" AND TRANGTHAI = ? ");
				}
			} else {
				if (Validator.isNotNull(trangThai))
					query.append(" AND TRANGTHAI = ? ");
				if (Validator.isNotNull(namBaoCao))
					query.append(" AND NAMBAOCAO = ? ");
			}
			if (Validator.isNotNull(loaiNhaTieuId))
				query.append(" AND LOAINHATIEU = ? ");
			if (Validator.isNotNull(loaiCongTrinh))
				query.append(" AND LOAICONGTRINH = ? ");
			_log.info("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.INTEGER);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(maTinh))
				qPos.add(maTinh);
			if (Validator.isNotNull(maHuyen))
				qPos.add(maHuyen);
			if (Validator.isNotNull(maXa))
				qPos.add(maXa);

			if (Validator.isNotNull(namBaoCao) && namBaoCao.contains("9999")) {
				if (Validator.isNotNull(trangThai) && trangThai.equals("0")) {

				} else {
					qPos.add(Long.valueOf(trangThai));
				}
			} else {
				if (Validator.isNotNull(trangThai))
					qPos.add(Long.valueOf(trangThai));
				if (Validator.isNotNull(namBaoCao))
					qPos.add(Long.valueOf(namBaoCao));
			}
			if (Validator.isNotNull(loaiNhaTieuId))
				qPos.add(Long.valueOf(loaiNhaTieuId));
			if (Validator.isNotNull(loaiCongTrinh))
				qPos.add(Long.valueOf(loaiCongTrinh));
			List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q,
					getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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

	public List<VeSinhCongTrinh> getVeSinhCongTrinhSearch(String maTinh,
			String maHuyen, String maXa, String loaiNhaTieuId,
			String loaiCongTrinh, String trangThai, String namBaoCao,
			int start, int end) throws SystemException {
		return getVeSinhCongTrinhSearch_(maTinh, maHuyen, maXa, loaiNhaTieuId,
				loaiCongTrinh, trangThai, namBaoCao, start, end);
	}

	private List<VeSinhCongTrinh> getVeSinhCongTrinhSearch_(String maTinh,
			String maHuyen, String maXa, String loaiNhaTieuId,
			String loaiCongTrinh, String trangThai, String namBaoCao,
			int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append(" SELECT * ");
			query.append(" FROM me_vesinhcongtrinh ");
			query.append(" WHERE 1 = 1 ");

			if (Validator.isNotNull(maTinh))
				query.append(" AND MATINH = ? ");
			if (Validator.isNotNull(maHuyen))
				query.append(" AND MAHUYEN = ? ");
			if (Validator.isNotNull(maXa))
				query.append(" AND MAXA = ? ");

			if (Validator.isNotNull(namBaoCao) && namBaoCao.contains("9999")) {
				if (Validator.isNotNull(trangThai) && trangThai.equals("0")) {
					query.append(" AND ( TRANGTHAI = 0 OR TRANGTHAI = 3 OR TRANGTHAI = 4 OR TRANGTHAI = 8 ) ");
				} else {
					query.append(" AND TRANGTHAI = ? ");
				}
				// query.append(" AND NAMBAOCAO = ? ");
			} else {
				if (Validator.isNotNull(trangThai))
					query.append(" AND TRANGTHAI = ? ");
				if (Validator.isNotNull(namBaoCao))
					query.append(" AND NAMBAOCAO = ? ");
			}
			if (Validator.isNotNull(loaiNhaTieuId))
				query.append(" AND LOAINHATIEU = ? ");
			if (Validator.isNotNull(loaiCongTrinh))
				query.append(" AND LOAICONGTRINH = ? ");
			query.append(" ORDER BY MATINH , MAHUYEN , MAXA , DIACHI , LOAINHATIEU , TENCONGTRINH, LOAICONGTRINH, TRANGTHAI, NAMBAOCAO ");
			_log.debug("==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("VeSinhCongTrinh", VeSinhCongTrinhImpl.class);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(maTinh))
				qPos.add(maTinh);
			if (Validator.isNotNull(maHuyen))
				qPos.add(maHuyen);
			if (Validator.isNotNull(maXa))
				qPos.add(maXa);

			if (Validator.isNotNull(namBaoCao) && namBaoCao.contains("9999")) {
				if (Validator.isNotNull(trangThai) && trangThai.equals("0")) {

				} else {
					qPos.add(Long.valueOf(trangThai));
				}
				// qPos.add(0);
			} else {
				if (Validator.isNotNull(trangThai))
					qPos.add(Long.valueOf(trangThai));
				if (Validator.isNotNull(namBaoCao))
					qPos.add(Long.valueOf(namBaoCao));
			}
			if (Validator.isNotNull(loaiNhaTieuId))
				qPos.add(Long.valueOf(loaiNhaTieuId));
			if (Validator.isNotNull(loaiCongTrinh))
				qPos.add(Long.valueOf(loaiCongTrinh));
			return (List<VeSinhCongTrinh>) QueryUtil.list(q, getDialect(),
					start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	Log _log = LogFactoryUtil.getLog(VeSinhCongTrinhFinderImpl.class);
}
