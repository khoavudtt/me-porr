package vn.dtt.sol.ns.tramcap.action;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;

import vn.dtt.sol.ns.tramcap.business.DanhGiaBenVungBussiness;
import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.util.NuocSachUtils;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

public class DanhGiaBenVungAction {

	public void deleteDanhGiaBenVung(ActionRequest request)
			throws PortalException, SystemException {
		long danhGiaId = ParamUtil.getLong(request, "danhGiaId");

		DanhGiaBenVung danhGia = null;

		try {
			danhGia = DanhGiaBenVungLocalServiceUtil
					.fetchDanhGiaBenVung(danhGiaId);
		} catch (Exception e) {
			_log.error(e);
		}

		if (Validator.isNotNull(danhGia)) {
			DanhGiaBenVungLocalServiceUtil.deleteDanhGiaBenVung(danhGia);
		}
		
		
	}

	/**
	 * @param actionRequest
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public DanhGiaBenVung addDanhGiaBenVung(ActionRequest actionRequest)
			throws PortalException, SystemException {

		DanhGiaBenVung danhGiaVenVung = null;

		long id = ParamUtil.getLong(actionRequest, "id");

		long idNguoiTao = PortalUtil.getUserId(actionRequest);

		int nam = ParamUtil.getInteger(actionRequest, "selYear");

		int tramCapId = ParamUtil.getInteger(actionRequest, "selTramCap");

		int trangThaiCapNuoc = ParamUtil.getInteger(actionRequest,
				"trangThaiCapNuoc");

		int tongDauNoiMoi = ParamUtil
				.getInteger(actionRequest, "tongDauNoiMoi");

		int congXuatThucTe = ParamUtil.getInteger(actionRequest,
				"congXuatThucTe");

		int tongDauNoiThucTe = ParamUtil.getInteger(actionRequest,
				"tongDauNoiThucTe");

		int soNguoiCapThucTe = ParamUtil.getInteger(actionRequest,
				"soNguoiCapThucTe");

		int nuocThatThoat = ParamUtil
				.getInteger(actionRequest, "nuocThatThoat");

		int nuocDatTieuChuan = ParamUtil.getInteger(actionRequest,
				"nuocDatTieuChuan");

		int nuocCoAsen = ParamUtil.getInteger(actionRequest, "nuocCoAsen");

		int tongChiPhi = ParamUtil.getInteger(actionRequest, "tongChiPhi");

		int tongDoanhThu = ParamUtil.getInteger(actionRequest, "tongDoanhThu");

		String ghiChu = ParamUtil.getString(actionRequest, "ghiChu");

		int boMayVanHanh = ParamUtil.getInteger(actionRequest, "boMayVanHanh");

		int loaiHinh = ParamUtil.getInteger(actionRequest, "loaiHinh");

		if (loaiHinh == 03 || loaiHinh == 04 || loaiHinh == 05) {
			loaiHinh = 1;
		} else {
			loaiHinh = 0;
		}

		TramCapNuoc tramCap = NuocSachUtils.getTramCap(tramCapId);

		boolean isThoiGianVanHanh = false;

		Date now = new Date();

		long diffDay = Math.abs(now.getTime()
				- tramCap.getNgayVanHanh().getTime())
				/ (24 * 60 * 60 * 1000l);

		// neu thoi gian van hanh lon hon 2 nam thi ok

		if (diffDay > 740) {
			isThoiGianVanHanh = true;
		}

		int mucDichCap = ParamUtil.getInteger(actionRequest, "mucDichCap", 1);

		int hieuXuatHoatDong = 0;

		int tyLeDauNoi = 0;

		/*
		 * int hieuXuatHoatDong = (int) congXuatThucTe /
		 * ParamUtil.getInteger(actionRequest, "congXuatThietKe",
		 * congXuatThucTe);
		 */

		int doanhThu = tongDoanhThu - tongChiPhi;

		/*
		 * int tyLeDauNoi = (int) tongDauNoiThucTe /
		 * ParamUtil.getInteger(actionRequest, "dauNoiThietKe",
		 * tongDauNoiThucTe);
		 */

		int tyLeThatThoat = ParamUtil
				.getInteger(actionRequest, "tyLeThatThoat");

		int ketQuaDanhGia = danhGiaKetQua(loaiHinh, mucDichCap, nuocCoAsen,
				tyLeDauNoi, isThoiGianVanHanh, hieuXuatHoatDong, tyLeThatThoat,
				doanhThu, trangThaiCapNuoc, boMayVanHanh);

		int baoCaoDLI = ParamUtil.getInteger(actionRequest, "baoCaoDLI", 0);

		danhGiaVenVung = DanhGiaBenVungLocalServiceUtil.updateDanhGiaBenVung(
				id, tramCapId, (int) idNguoiTao, nam, trangThaiCapNuoc,
				tongDauNoiMoi, congXuatThucTe, tongDauNoiThucTe,
				soNguoiCapThucTe, nuocThatThoat, nuocDatTieuChuan, nuocCoAsen,
				tongChiPhi, tongDoanhThu, ghiChu, ketQuaDanhGia, baoCaoDLI);

		/*
		 * danhGiaVenVung = DanhGiaBenVungLocalServiceUtil.updateDanhGiaBenVung(
		 * id, tramCapId, (int) idNguoiTao, nam, trangThaiCapNuoc,
		 * congXuatThucTe, tongDauNoiThucTe, soNguoiCapThucTe, nuocThatThoat,
		 * nuocDatTieuChuan, nuocCoAsen, tongChiPhi, tongDoanhThu, ghiChu,
		 * ketQuaDanhGia, baoCaoDLI);
		 */

		// TODO: can xem lai cho nay

		List<DauNoiNuoc> lsDauNoi = DauNoiNuocLocalServiceUtil.getDauNoiSearch(
				StringPool.BLANK, StringPool.BLANK, StringPool.BLANK,
				Integer.toString(tramCapId), "2", StringPool.BLANK,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		for (DauNoiNuoc daunoi : lsDauNoi) {
			DauNoiNuocLocalServiceUtil.addNamBaoCao(daunoi.getId(), nam);
		}

		return danhGiaVenVung;
	}

	/**
	 * @param loaiHinh
	 * @param mucDichCap
	 * @param nuocCoAsen
	 * @param tyLeDauNoi
	 * @param hieuXuatHoatDong
	 * @param tyLeThatThoat
	 * @param doanhThu
	 * @param trangThaiCapNuoc
	 * @param boMayVanHanh
	 * @return
	 */
	public int danhGiaKetQua(int loaiHinh, int mucDichCap, int nuocCoAsen,
			int tyLeDauNoi, boolean isThoiGianVanHanh, int hieuXuatHoatDong,
			int tyLeThatThoat, int doanhThu, int trangThaiCapNuoc,
			int boMayVanHanh) {

		int ketQuaDanhGia = 1;

		// Khong thuoc loai hinh duoc quy dinh
		if (loaiHinh == 0) {
			ketQuaDanhGia = 0;
		}
		// muc dich cap khong phu hop
		if (mucDichCap == 0) {
			ketQuaDanhGia = 0;
		}

		// nuoc co asen
		if (nuocCoAsen == 1) {
			ketQuaDanhGia = 0;
		}

		// ty le dau noi khong dat yeu cau
		if (tyLeDauNoi < 85 && isThoiGianVanHanh) {
			ketQuaDanhGia = 0;
		}

		// hieu xuat hoat dong khong dat yeu cau
		if (hieuXuatHoatDong < 80) {
			ketQuaDanhGia = 0;
		}

		// ty le that thoat khong dat yeu cau
		if (tyLeThatThoat > 35) {
			ketQuaDanhGia = 0;
		}
		// doanh thu khong co tich luy
		if (doanhThu <= 0) {
			ketQuaDanhGia = 0;
		}

		// trang thai cap nuoc khong on dinh hoac khong cap nuoc
		if (trangThaiCapNuoc != 1) {
			ketQuaDanhGia = 0;
		}

		// bo may van hanh chua duoc dao tao
		if (boMayVanHanh != 1) {
			ketQuaDanhGia = 0;
		}

		return ketQuaDanhGia;
	}

	private static Log _log = LogFactoryUtil
			.getLog(DanhGiaBenVungBussiness.class);
}
