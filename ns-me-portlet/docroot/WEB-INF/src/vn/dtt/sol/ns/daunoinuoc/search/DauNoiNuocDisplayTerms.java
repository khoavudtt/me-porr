package vn.dtt.sol.ns.daunoinuoc.search;

import java.text.SimpleDateFormat;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

public class DauNoiNuocDisplayTerms extends DisplayTerms {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public static final String TRAM_CAP_NUOC_ID = "tramCapNuocId";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String MA_XA = "maXa";
	public static final String TRANG_THAI = "trangThai";
	public static final String NAM_BAO_CAO = "namBaoCao";
	public DauNoiNuocDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		maTinh = ParamUtil.getString(portletRequest, MA_TINH);
		maHuyen = ParamUtil.getString(portletRequest, MA_HUYEN);
		maXa = ParamUtil.getString(portletRequest, MA_XA);
		tramCapNuocId = ParamUtil.getInteger(portletRequest, TRAM_CAP_NUOC_ID);
		trangThai = ParamUtil.getInteger(portletRequest, TRANG_THAI);
		namBaoCao = ParamUtil.getInteger(portletRequest, NAM_BAO_CAO);

	}

	protected int tramCapNuocId;
	protected String maTinh;
	protected String maHuyen;
	protected String maXa;
	protected int trangThai;
	protected int namBaoCao;

	public int getTramCapNuocId() {
		return tramCapNuocId;
	}

	public void setTramCapNuocId(int tramCapNuocId) {
		this.tramCapNuocId = tramCapNuocId;
	}

	public String getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}

	public String getMaHuyen() {
		return maHuyen;
	}

	public void setMaHuyen(String maHuyen) {
		this.maHuyen = maHuyen;
	}

	public String getMaXa() {
		return maXa;
	}

	public void setMaXa(String maXa) {
		this.maXa = maXa;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public int getNamBaoCao() {
		return namBaoCao;
	}

	public void setNamBaoCao(int namBaoCao) {
		this.namBaoCao = namBaoCao;
	}
}
