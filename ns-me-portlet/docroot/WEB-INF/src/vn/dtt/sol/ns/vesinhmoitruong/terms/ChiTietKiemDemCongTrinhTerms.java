package vn.dtt.sol.ns.vesinhmoitruong.terms;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class ChiTietKiemDemCongTrinhTerms {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public static final String ID = "id";
	public static final String THONG_TIN_KIEM_DEM_CONG_TRINH_ID = "thongTinKiemDemCongTrinhId";
	public static final String SO_HO_TIEU = "soHoTieu";
	public static final String LOAI_NHA_TIEU= "loaiNhaTieu";
	public static final String ANH_TOAN_CANH = "anhToanCanh";
	public static final String ANH_TRONG_NHA_TIEU = "anhTrongNhaTieu";
	public static final String VE_SINH_SACH_SE = "veSinhSachSe";
	public static final String DE_LAM_VE_SINH = "deLamVeSinh";
	public static final String MUI_VE_SINH = "muiVeSinh";
	public static final String PHIA_TREN_KIN_DAO = "phiaTrenKinDao";
	public static final String DU_CHE_MUA_GIO = "duCheMuaGio";
	public static final String SAN_CAO_TREN_TOI_THIEU = "sanCaoTrenToiThieu";
	public static final String CO_CONG_TRINH_RUA_TAY = "coCongTrinhRuaTay";
	public static final String CHI_TIET_CONG_TRINH_RUA_TAY = "chiTietCongTrinhRuaTay";
	public static final String ANH_BE_CHUA = "anhBeChua";
	public static final String NAP_BE_CON_TOT = "napBeConTot";
	public static final String CUA_PHAN_BIT_KIN = "cuaPhanBitKin";
	public static final String TRAN_RA_NGOAI = "tranRaNgoai";
	public static final String NUOC_THAI_DI_DAU = "nuocThaiDiDau";
	public static final String KHOANG_CACH_NGUON_NUOC = "khoangCachNguonNuoc";
	public static final String NGAP_KHI_MUA_LON = "ngapKhiMuaLon";
	
	public ChiTietKiemDemCongTrinhTerms(ActionRequest actionRequest )
	{
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		id=ParamUtil.getInteger(request, ID);
		thongTinKiemDemCongTrinhId = ParamUtil.getInteger(request, THONG_TIN_KIEM_DEM_CONG_TRINH_ID);
		soHoTieu=ParamUtil.getInteger(request, SO_HO_TIEU);
		loaiNhaTieu = ParamUtil.getInteger(request, LOAI_NHA_TIEU);
		anhToanCanh=ParamUtil.getString(request, ANH_TOAN_CANH);
		anhTrongNhaTieu = ParamUtil.getString(request, ANH_TRONG_NHA_TIEU);
		veSinhSachSe=ParamUtil.getInteger(request, VE_SINH_SACH_SE);
		deLamVeSinh = ParamUtil.getInteger(request, DE_LAM_VE_SINH);
		muiVeSinh=ParamUtil.getInteger(request, MUI_VE_SINH);
		phiaTrenKinDao = ParamUtil.getInteger(request, PHIA_TREN_KIN_DAO);
		duCheMuaGio=ParamUtil.getInteger(request, DU_CHE_MUA_GIO);
		sanCaoTrenToiThieu = ParamUtil.getInteger(request, SAN_CAO_TREN_TOI_THIEU);
		coCongTrinhRuaTay=ParamUtil.getInteger(request, CO_CONG_TRINH_RUA_TAY);
		chiTietCongTrinhRuaTay = ParamUtil.getString(request, CHI_TIET_CONG_TRINH_RUA_TAY);
		anhBeChua=ParamUtil.getString(request, ANH_BE_CHUA);
		napBeConTot = ParamUtil.getInteger(request, NAP_BE_CON_TOT);
		cuaPhanBitKin=ParamUtil.getInteger(request, CUA_PHAN_BIT_KIN);
		tranRaNgoai = ParamUtil.getInteger(request, TRAN_RA_NGOAI);
		nuocThaiDiDau=ParamUtil.getInteger(request, NUOC_THAI_DI_DAU);
		khoangCachNguonNuoc = ParamUtil.getInteger(request, KHOANG_CACH_NGUON_NUOC);
		ngapKhiMuaLon = ParamUtil.getInteger(request, NGAP_KHI_MUA_LON);
	}
	
	private int id;
	private int thongTinKiemDemCongTrinhId;
	private int soHoTieu;
	private int loaiNhaTieu;
	private String anhToanCanh;
	private String anhTrongNhaTieu;
	private int veSinhSachSe;
	private int deLamVeSinh;
	private int muiVeSinh;
	private int phiaTrenKinDao;
	private int duCheMuaGio;
	private int sanCaoTrenToiThieu;
	private int coCongTrinhRuaTay;
	private String chiTietCongTrinhRuaTay;
	private String anhBeChua;
	private int napBeConTot;
	private int cuaPhanBitKin;
	private int tranRaNgoai;
	private int nuocThaiDiDau;
	private int khoangCachNguonNuoc;
	private int ngapKhiMuaLon;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getThongTinKiemDemCongTrinhId() {
		return thongTinKiemDemCongTrinhId;
	}
	public void setThongTinKiemDemCongTrinhId(int thongTinKiemDemCongTrinhId) {
		this.thongTinKiemDemCongTrinhId = thongTinKiemDemCongTrinhId;
	}
	public int getSoHoTieu() {
		return soHoTieu;
	}
	public void setSoHoTieu(int soHoTieu) {
		this.soHoTieu = soHoTieu;
	}
	public int getLoaiNhaTieu() {
		return loaiNhaTieu;
	}
	public void setLoaiNhaTieu(int loaiNhaTieu) {
		this.loaiNhaTieu = loaiNhaTieu;
	}
	public String getAnhToanCanh() {
		return anhToanCanh;
	}
	public void setAnhToanCanh(String anhToanCanh) {
		this.anhToanCanh = anhToanCanh;
	}
	public String getAnhTrongNhaTieu() {
		return anhTrongNhaTieu;
	}
	public void setAnhTrongNhaTieu(String anhTrongNhaTieu) {
		this.anhTrongNhaTieu = anhTrongNhaTieu;
	}
	public int getVeSinhSachSe() {
		return veSinhSachSe;
	}
	public void setVeSinhSachSe(int veSinhSachSe) {
		this.veSinhSachSe = veSinhSachSe;
	}
	public int getDeLamVeSinh() {
		return deLamVeSinh;
	}
	public void setDeLamVeSinh(int deLamVeSinh) {
		this.deLamVeSinh = deLamVeSinh;
	}
	public int getMuiVeSinh() {
		return muiVeSinh;
	}
	public void setMuiVeSinh(int muiVeSinh) {
		this.muiVeSinh = muiVeSinh;
	}
	public int getPhiaTrenKinDao() {
		return phiaTrenKinDao;
	}
	public void setPhiaTrenKinDao(int phiaTrenKinDao) {
		this.phiaTrenKinDao = phiaTrenKinDao;
	}
	public int getDuCheMuaGio() {
		return duCheMuaGio;
	}
	public void setDuCheMuaGio(int duCheMuaGio) {
		this.duCheMuaGio = duCheMuaGio;
	}
	public int getSanCaoTrenToiThieu() {
		return sanCaoTrenToiThieu;
	}
	public void setSanCaoTrenToiThieu(int sanCaoTrenToiThieu) {
		this.sanCaoTrenToiThieu = sanCaoTrenToiThieu;
	}
	public int getCoCongTrinhRuaTay() {
		return coCongTrinhRuaTay;
	}
	public void setCoCongTrinhRuaTay(int coCongTrinhRuaTay) {
		this.coCongTrinhRuaTay = coCongTrinhRuaTay;
	}
	public String getChiTietCongTrinhRuaTay() {
		return chiTietCongTrinhRuaTay;
	}
	public void setChiTietCongTrinhRuaTay(String chiTietCongTrinhRuaTay) {
		this.chiTietCongTrinhRuaTay = chiTietCongTrinhRuaTay;
	}
	public String getAnhBeChua() {
		return anhBeChua;
	}
	public void setAnhBeChua(String anhBeChua) {
		this.anhBeChua = anhBeChua;
	}
	public int getNapBeConTot() {
		return napBeConTot;
	}
	public void setNapBeConTot(int napBeConTot) {
		this.napBeConTot = napBeConTot;
	}
	public int getCuaPhanBitKin() {
		return cuaPhanBitKin;
	}
	public void setCuaPhanBitKin(int cuaPhanBitKin) {
		this.cuaPhanBitKin = cuaPhanBitKin;
	}
	public int getTranRaNgoai() {
		return tranRaNgoai;
	}
	public void setTranRaNgoai(int tranRaNgoai) {
		this.tranRaNgoai = tranRaNgoai;
	}
	public int getNuocThaiDiDau() {
		return nuocThaiDiDau;
	}
	public void setNuocThaiDiDau(int nuocThaiDiDau) {
		this.nuocThaiDiDau = nuocThaiDiDau;
	}
	public int getKhoangCachNguonNuoc() {
		return khoangCachNguonNuoc;
	}
	public void setKhoangCachNguonNuoc(int khoangCachNguonNuoc) {
		this.khoangCachNguonNuoc = khoangCachNguonNuoc;
	}
	public int getNgapKhiMuaLon() {
		return ngapKhiMuaLon;
	}
	public void setNgapKhiMuaLon(int ngapKhiMuaLon) {
		this.ngapKhiMuaLon = ngapKhiMuaLon;
	}
}
