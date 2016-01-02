package vn.dtt.sol.ns.baocaodli.util;

import java.util.List;

import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;
import vn.dtt.sol.ns.kehoachdaunam.dao.service.KeHoachDauNamLocalServiceUtil;
import vn.dtt.sol.ns.kehoachvesinh.dao.service.KeHoachVeSinhLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

public class DLIUtils {

	/**
	 * @param maTinh
	 * @param nam
	 * @return so dau noi theo ke hoach
	 */
	public int getSoDauNoiTheoKeHoach(String maTinh, int nam) {
		int soDauNoiTheoKeHoach = 0;
		try {
			List<KeHoachDauNam> lsKeHoach = KeHoachDauNamLocalServiceUtil
					.searchByNamAndTinh(nam, maTinh, QueryUtil.ALL_POS,
							QueryUtil.ALL_POS);

			for (KeHoachDauNam keHoach : lsKeHoach) {
				soDauNoiTheoKeHoach = soDauNoiTheoKeHoach
						+ (int) keHoach.getSoDauNoiMoi();
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return soDauNoiTheoKeHoach;
	}

	/**
	 * @param maTinh
	 * @param nam
	 * @return so dau noi moi trong mot nam
	 */
	public int getSoDauNoiMoi(String maTinh, int nam) {
		int soDauNoiMoi = DauNoiNuocLocalServiceUtil
				.countDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,
						StringPool.BLANK, "2", Integer.toString(nam));

		return soDauNoiMoi;
	}

	/**
	 * @param maTinh
	 * @param nam
	 * @return So nha tieu hop ve sinh theo ke hoach
	 */
	public int getSoNhaTieuHVSTheoKH(String maTinh, int nam) {
		int soNhaTieuHVSTheoKH = 0;

		try {
			soNhaTieuHVSTheoKH = KeHoachVeSinhLocalServiceUtil.count(nam,
					maTinh, StringPool.BLANK);
		} catch (Exception e) {
			_log.error(e);
		}

		return soNhaTieuHVSTheoKH;
	}

	public int getSoNguoiHuongLoiNuocSach(String maTinh, int nam) {
		int soNguoiHuongLoiNuocSach = 0;

		return soNguoiHuongLoiNuocSach;
	}

	public int getSoXa(String maTinh, int nam) {
		int soXa = 0;

		return soXa;
	}

	public int getTiLeHGDCoNhaTieu(String maTinh, int nam) {
		int tiLeHGDCoNhaTieu = 0;

		return tiLeHGDCoNhaTieu;
	}

	public int getTiLeHGDCoNhaTieuHVS(String maTinh, int nam) {
		int tiLeHGDCoNhaTieuHVS = 0;

		return tiLeHGDCoNhaTieuHVS;
	}

	public int getTiLeTruongHocHVS(String maTinh, int nam) {
		int tiLeTruongHocHVS = 0;

		return tiLeTruongHocHVS;
	}

	public int getTiLeTramYTeHVS(String maTinh, int nam) {
		int tiLeTramYTeHVS = 0;

		return tiLeTramYTeHVS;
	}

	public int getSoNguoiHuongLoiVSTX(String maTinh, int nam) {
		int soNguoiHuongLoiVSTX = 0;

		return soNguoiHuongLoiVSTX;
	}

	public String getKeHoachPheDuyet(String maTinh, int nam) {
		String keHoachPheDuyet = StringPool.BLANK;

		return keHoachPheDuyet;
	}

	public int getSoNhaTieuHVSMoi(String maTinh, int nam) {
		int getSoNhaTieuHVSMoi = 0;

		return getSoNhaTieuHVSMoi;
	}

	private static Log _log = LogFactoryUtil.getLog(DLIUtils.class);
}
