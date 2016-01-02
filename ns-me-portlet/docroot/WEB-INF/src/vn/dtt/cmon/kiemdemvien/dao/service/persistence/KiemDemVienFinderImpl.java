package vn.dtt.cmon.kiemdemvien.dao.service.persistence;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.Validate;

import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienImpl;
import vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl;
import vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil;
import vn.dtt.cmon.user.dao.model.UserMapping;

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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class KiemDemVienFinderImpl extends BasePersistenceImpl<KiemDemVien>
		implements KiemDemVienFinder {

	public static final String FINDER_SQL = KiemDemVienFinder.class.getName()
			+ ".finderCTHTT";
	public static final String COUNT_SQL = KiemDemVienFinder.class.getName()
			+ ".countCTHTT";

	@Override
	public List<KiemDemVien> findKiemDemVien(String capHoatDong, String orgCode)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append(" SELECT * ");
			query.append(" FROM me_kiemdemvien ");
			query.append(" WHERE 1 = 1 ");
			query.append(" AND TRANGTHAI = 1 ");

			if (!capHoatDong.isEmpty() && (Integer.valueOf(capHoatDong) != 0)) {
				query.append(" AND CAPHOATDONG = "
						+ Integer.valueOf(capHoatDong) + " ");
			}

			if ((!orgCode.isEmpty()) && (Integer.valueOf(capHoatDong) == 1)) {
				query.append("AND (ORGCODE1 = '" + orgCode + "' ");
				query.append(" OR ORGCODE2 = '" + orgCode + "' )");
			} else if (!orgCode.isEmpty()
					&& (Integer.valueOf(capHoatDong) != 1)) {
				query.append("AND (ORGCODE1 = '" + orgCode + "' ");
				query.append(" OR ORGCODE2 = '" + orgCode + "' )");
			}
			_log.debug("==" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(KiemDemVienModelImpl.TABLE_NAME, KiemDemVienImpl.class);

			return (List<KiemDemVien>) QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	/**
	 * @param capHoatDong
	 * @param orgCode1
	 * @param orgCode2
	 * @param status
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<KiemDemVien> findByCTHTT(String capHoatDong, String orgCode1,
			String orgCode2, long status, int start, int end)
			throws PortalException, SystemException {
		return findByC_T_H_T_T(capHoatDong, orgCode1, orgCode2, status, start,
				end);
	}

	/**
	 * @param capHoatDong
	 * @param orgCode1
	 * @param orgCode2
	 * @param status
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	private List<KiemDemVien> findByC_T_H_T_T(String capHoatDong,
			String orgCode1, String orgCode2, long status, int start, int end)
			throws PortalException, SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FINDER_SQL);

			if (Validator.isNull(orgCode2)) {
				sql = StringUtil.replace(sql, "AND ORGCODE2 = ?",
						StringPool.BLANK);
			}

			if (Validator.isNull(capHoatDong)) {
				sql = StringUtil.replace(sql, "AND CAPHOATDONG = ?",
						StringPool.BLANK);
			}

			if (status < 0) {
				sql = StringUtil.replace(sql, "AND TRANGTHAI = ?",
						StringPool.BLANK);
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("KiemDemVien", KiemDemVienImpl.class);

			QueryPos pos = QueryPos.getInstance(q);
			
			pos.add(orgCode1);

			if (Validator.isNotNull(orgCode2)) {
				pos.add(orgCode2);
			}

			if (Validator.isNotNull(capHoatDong)) {
				pos.add(capHoatDong);
			}

			if (status >= 0) {
				pos.add(status);
			}

			return (List<KiemDemVien>) QueryUtil.list(q, getDialect(), start,
					end);

		} catch (Exception e) {
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	public int countCTHTT(String capHoatDong, String orgCode1, String orgCode2,
			long status) throws PortalException, SystemException {
		return countByC_T_H_T_T(capHoatDong, orgCode1, orgCode2, status);
	}

	/**
	 * @param capHoatDong
	 * @param orgCode1
	 * @param orgCode2
	 * @param status
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	private int countByC_T_H_T_T(String capHoatDong, String orgCode1,
			String orgCode2, long status) throws PortalException,
			SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_SQL);

			if (Validator.isNull(orgCode2)) {
				sql = StringUtil.replace(sql, "AND ORGCODE2 = ?",
						StringPool.BLANK);
			}

			if (Validator.isNull(capHoatDong)) {
				sql = StringUtil.replace(sql, "AND CAPHOATDONG = ?",
						StringPool.BLANK);
			}

			if (status < 0) {
				sql = StringUtil.replace(sql, "AND TRANGTHAI = ?",
						StringPool.BLANK);
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos pos = QueryPos.getInstance(q);
			
			pos.add(orgCode1);

			if (Validator.isNotNull(orgCode2)) {
				pos.add(orgCode2);
			}

			if (Validator.isNotNull(capHoatDong)) {
				pos.add(capHoatDong);
			}

			if (status >= 0) {
				pos.add(status);
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

	@Override
	public List<KiemDemVien> find(String capHoatDong, String orgCode,
			int start, int end) throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append(" SELECT * ");
			query.append(" FROM me_kiemdemvien ");
			query.append(" WHERE 1 = 1 ");

			if (!capHoatDong.isEmpty() && (Integer.valueOf(capHoatDong) != 0)) {
				query.append(" AND CAPHOATDONG = "
						+ Integer.valueOf(capHoatDong) + " ");
			}

			if ((!orgCode.isEmpty()) && (Integer.valueOf(capHoatDong) == 1)) {
				query.append("AND (ORGCODE1 = '" + orgCode + "' ");
				query.append(" OR ORGCODE2 = '" + orgCode + "' )");
			} else if (!orgCode.isEmpty()
					&& (Integer.valueOf(capHoatDong) != 1)) {
				query.append("AND (ORGCODE1 = '" + orgCode + "' ");
				query.append(" OR ORGCODE2 = '" + orgCode + "' )");
			}

			_log.debug("==" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(KiemDemVienModelImpl.TABLE_NAME, KiemDemVienImpl.class);

			return (List<KiemDemVien>) QueryUtil.list(q, getDialect(), start,
					end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	@Override
	public int count(String capHoatDong, String orgCode)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append(" SELECT count(*) as COUNT_VALUE ");
			query.append(" FROM me_kiemdemvien ");
			query.append(" WHERE 1 = 1 ");

			if (!capHoatDong.isEmpty() && (Integer.valueOf(capHoatDong) != 0)) {
				query.append(" AND CAPHOATDONG = "
						+ Integer.valueOf(capHoatDong) + " ");
			}

			if ((!orgCode.isEmpty()) && (Integer.valueOf(capHoatDong) == 1)) {
				query.append(" AND ORGCODE1 = '" + orgCode + "' ");
			} else if (!orgCode.isEmpty()
					&& (Integer.valueOf(capHoatDong) != 1)) {
				query.append(" AND ORGCODE2 = '" + orgCode + "' ");
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

			// List<Integer> lstTotal = (List<Integer>) QueryUtil.list(q,
			// getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			// if (lstTotal != null) {
			// return lstTotal.get(0);
			// }
			return 0;

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	@Override
	public void addKiemDemVien(String hoVaTen, String taiKhoan, String matKhau,
			int capHoatDong, String orgCode1, String orgCode2, String diaChi,
			String chungMinhThu, String dienThoai, String imei, int idNguoiTao)
			throws PortalException, SystemException {

		KiemDemVien kiemDemVien = new KiemDemVienImpl();
		kiemDemVien.setHoVaTen(hoVaTen);
		kiemDemVien.setTaiKhoan(taiKhoan);
		kiemDemVien.setMatKhau(matKhau);
		kiemDemVien.setCapHoatDong(capHoatDong);
		kiemDemVien.setOrgCode1(orgCode1);
		kiemDemVien.setOrgCode2(orgCode2);
		kiemDemVien.setDiaChi(diaChi);
		kiemDemVien.setDienThoai(dienThoai);
		kiemDemVien.setChungMinhThu(chungMinhThu);
		kiemDemVien.setImei(imei);
		kiemDemVien.setNgayTao(new Date());
		kiemDemVien.setTrangThai(1);
		kiemDemVien.setIdNguoiTao(idNguoiTao);

		try {
			KiemDemVienLocalServiceUtil.addKiemDemVien(kiemDemVien);
		} catch (Exception e) {
			_log.error(e);
		}

	}

	@Override
	public void chuyenTrangThai(long id) throws PortalException,
			SystemException {
		KiemDemVien kiemDemVien = KiemDemVienLocalServiceUtil
				.getKiemDemVien(id);

		long currentStatus = kiemDemVien.getTrangThai();

		if (currentStatus == 1) {
			kiemDemVien.setTrangThai(0);
		} else {
			kiemDemVien.setTrangThai(1);
		}
		try {
			KiemDemVienLocalServiceUtil.updateKiemDemVien(kiemDemVien);
		} catch (Exception e) {
			_log.error(e);
		}

	}

	private static final Log _log = LogFactoryUtil
			.getLog(KiemDemVienFinderImpl.class);
}
