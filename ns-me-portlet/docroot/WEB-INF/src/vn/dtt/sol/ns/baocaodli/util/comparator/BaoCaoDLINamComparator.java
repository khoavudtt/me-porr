package vn.dtt.sol.ns.baocaodli.util.comparator;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;

import com.liferay.portal.kernel.util.OrderByComparator;

public class BaoCaoDLINamComparator extends OrderByComparator {

	public static final String ORDER_BY_ASC = "ME_BAOCAODLI.NAM ASC";

	public static final String ORDER_BY_DESC = "ME_BAOCAODLI.NAM DESC";

	public BaoCaoDLINamComparator() {
		this(false);
	}

	public BaoCaoDLINamComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		BaoCaoDLI item1 = (BaoCaoDLI)obj1;
		BaoCaoDLI item2 = (BaoCaoDLI)obj2;

		int nam1 = item1.getNam();
		int nam2 = item2.getNam();

		int value = nam1 - nam2;

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
