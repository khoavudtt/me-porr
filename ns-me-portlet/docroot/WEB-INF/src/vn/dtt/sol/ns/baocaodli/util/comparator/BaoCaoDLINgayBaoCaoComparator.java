package vn.dtt.sol.ns.baocaodli.util.comparator;

import java.util.Date;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringUtil;

public class BaoCaoDLINgayBaoCaoComparator extends OrderByComparator {

	public static final String ORDER_BY_ASC = "ME_NGAYBAOCAO.NGAYBAOCAO ASC";

	public static final String ORDER_BY_DESC = "ME_NGAYBAOCAO.NGAYBAOCAO DESC";

	public BaoCaoDLINgayBaoCaoComparator() {
		this(false);
	}

	public BaoCaoDLINgayBaoCaoComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		BaoCaoDLI item1 = (BaoCaoDLI)obj1;
		BaoCaoDLI item2 = (BaoCaoDLI)obj2;

		Date date1 = item1.getNgayBaoCao();
		Date date2 = item2.getNgayBaoCao();

		int value = date1.compareTo(date2);

		if (_ascending) {
			return value;
		}
		else {
			return -value;
		}
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private boolean _ascending;

}
