package vn.dtt.sol.ns.baocaodli.dao.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;
import vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class BaoCaoDLIFinderImpl extends BasePersistenceImpl<BaoCaoDLI>
		implements BaoCaoDLIFinder {

	public static String COUNT_BY_ALL = BaoCaoDLIFinder.class.getName()
			+ ".countByAll";

	public static String FIND_BY_ALL = BaoCaoDLIFinder.class.getName()
			+ ".findByAll";

	public static String COUNT = BaoCaoDLIFinder.class.getName() + ".count";

	public static String FIND = BaoCaoDLIFinder.class.getName() + ".find";

	public List<BaoCaoDLI> searchDLI(String maTinh, int loaiBaoCao, int nam, Integer trangThai,
			int start, int end, OrderByComparator obc) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FIND);

			if (Validator.isNull(maTinh)) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.MATINH = ?) AND",
						"");
			}

			if (loaiBaoCao == 0) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.LOAIBAOCAO = ?) AND",
						"");
			}

			if (trangThai == null) {
				sql = StringUtil.replace(sql,
						"(ME_BAOCAODLI.TRANGTHAI = ?) AND", "");
			}

			if (nam <= 0) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.NAM = ?)",
						"(ME_BAOCAODLI.NAM > 0)");
			}

			sql = CustomSQLUtil.replaceOrderBy(sql, obc);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity(BaoCaoDLIImpl.TABLE_NAME, BaoCaoDLIImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(maTinh)) {
				qPos.add(maTinh);
			}
			
			if (loaiBaoCao != 0) {
				qPos.add(loaiBaoCao);
			}

			if (trangThai != null) {
				qPos.add(trangThai);
			}

			if (nam > 0) {
				qPos.add(nam);
			}

			return (List<BaoCaoDLI>) QueryUtil
					.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int searchCountDLI(String maTinh, int loaiBaoCao, int nam, Integer trangThai)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT);

			if (Validator.isNull(maTinh)) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.MATINH = ?) AND",
						"");
			}

			if (loaiBaoCao == 0) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.LOAIBAOCAO = ?) AND",
						"");
			}

			if (trangThai == null) {
				sql = StringUtil.replace(sql,
						"(ME_BAOCAODLI.TRANGTHAI = ?) AND", "");
			}

			if (nam <= 0) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.NAM = ?)",
						"(ME_BAOCAODLI.NAM > 0)");
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(maTinh)) {
				qPos.add(maTinh);
			}
			
			if (loaiBaoCao != 0) {
				qPos.add(loaiBaoCao);
			}

			if (trangThai != null) {
				qPos.add(trangThai);
			}

			if (nam > 0) {
				qPos.add(nam);
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

	public List<BaoCaoDLI> search(String maTinh, int nam, Integer trangThai,
			int start, int end, OrderByComparator obc) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FIND_BY_ALL);

			if (Validator.isNull(maTinh)) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.MATINH = ?) AND",
						"");
			}

			if (trangThai == null) {
				sql = StringUtil.replace(sql,
						"(ME_BAOCAODLI.TRANGTHAI = ?) AND", "");
			}

			if (nam <= 0) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.NAM = ?)",
						"(ME_BAOCAODLI.NAM > 0)");
			}

			sql = CustomSQLUtil.replaceOrderBy(sql, obc);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity(BaoCaoDLIImpl.TABLE_NAME, BaoCaoDLIImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(maTinh)) {
				qPos.add(maTinh);
			}

			if (trangThai != null) {
				qPos.add(trangThai);
			}

			if (nam > 0) {
				qPos.add(nam);
			}

			return (List<BaoCaoDLI>) QueryUtil
					.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int searchCount(String maTinh, int nam, Integer trangThai)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_BY_ALL);

			if (Validator.isNull(maTinh)) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.MATINH = ?) AND",
						"");
			}

			if (trangThai == null) {
				sql = StringUtil.replace(sql,
						"(ME_BAOCAODLI.TRANGTHAI = ?) AND", "");
			}

			if (nam <= 0) {
				sql = StringUtil.replace(sql, "(ME_BAOCAODLI.NAM = ?)",
						"(ME_BAOCAODLI.NAM > 0)");
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(maTinh)) {
				qPos.add(maTinh);
			}

			if (trangThai != null) {
				qPos.add(trangThai);
			}

			if (nam > 0) {
				qPos.add(nam);
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
}
