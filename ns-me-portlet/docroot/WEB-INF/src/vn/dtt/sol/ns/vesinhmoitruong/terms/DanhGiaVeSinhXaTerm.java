package vn.dtt.sol.ns.vesinhmoitruong.terms;

import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class DanhGiaVeSinhXaTerm {

	public static final String ID = "id";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String MA_XA = "maXa";
	public static final String NAM = "nam";
	public static final String SO_DAN = "soDan";
	public static final String TONG_SO_HGD = "tongSoHGD";
	public static final String TONG_SO_HGD_TRONG_MAU = "tongSoHGDTrongMau";
	public static final String SO_HGD_CO_NHA_TIEU = "soHGDCoNhaTieu";
	public static final String SO_HGD_CO_NHA_TIEU_HVS = "soHGDCoNhaTieuHVS";
	public static final String SO_NHA_TIEU_HVS_XAY_MOI = "soNhaTieuHVSXayMoi";
	public static final String TI_LE_HGD_CO_NHA_TIEU = "tiLeHGDCoNhaTieu";
	public static final String TI_LE_HGD_CO_NHA_TIEU_HVS = "tiLeHGDCoNhaTieuHVS";
	public static final String TONG_SO_TRUONG_HOC = "tongSoTruongHoc";
	public static final String SO_TRUONG_HOC_HVS = "soTruongHocHVS";
	public static final String TONG_SO_TRAM_YTE = "tongSoTramYTe";
	public static final String SO_TRAM_YTE_HVS = "soTramYTeHVS";
	public static final String TI_LE_TRUONG_HOC_HVS = "tiLeTruongHocHVS";
	public static final String TI_LE_TRAM_YTE_HVS = "tiLeTramYTeHVS";
	public static final String KET_LUAN_VSTX = "ketLuanVSTX";
	public static final String GHI_CHU = "ghiChu";
	public static final String BAO_CAO_DLI = "baoCaoDLI";
	
	public DanhGiaVeSinhXaTerm(ActionRequest actionRequest )
	{
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		id = ParamUtil.getInteger(request, ID);
		maTinh = ParamUtil.getString(request, MA_TINH);
		maHuyen = ParamUtil.getString(request, MA_HUYEN);
		maXa = ParamUtil.getString(request, MA_XA);
		nam = ParamUtil.getInteger(request, NAM);
		soDan = ParamUtil.getInteger(request, SO_DAN);
		tongSoHGD = ParamUtil.getInteger(request, TONG_SO_HGD);
		soHGDCoNhaTieu = ParamUtil.getInteger(request, SO_HGD_CO_NHA_TIEU);
		soHGDCoNhaTieuHVS = ParamUtil.getInteger(request, SO_HGD_CO_NHA_TIEU_HVS);
		soNhaTieuHVSXayMoi = ParamUtil.getInteger(request, SO_NHA_TIEU_HVS_XAY_MOI);
		tiLeHGDCoNhaTieu = ParamUtil.getInteger(request, TI_LE_HGD_CO_NHA_TIEU);
		tiLeHGDCoNhaTieuHVS = ParamUtil.getInteger(request, TI_LE_HGD_CO_NHA_TIEU_HVS);
		tongSoTruongHoc = ParamUtil.getInteger(request, TONG_SO_TRUONG_HOC);
		tongSoTramYTe = ParamUtil.getInteger(request, TONG_SO_TRAM_YTE);
		soTramYTeHVS = ParamUtil.getInteger(request, SO_TRAM_YTE_HVS);
		tiLeTruongHocHVS = ParamUtil.getInteger(request, TI_LE_TRAM_YTE_HVS);
		tiLeTramYTeHVS = ParamUtil.getInteger(request, TI_LE_TRAM_YTE_HVS);
		ketLuanVSTX = ParamUtil.getInteger(request, KET_LUAN_VSTX);
		ghiChu = ParamUtil.getString(request, GHI_CHU);
		baoCaoDLI = ParamUtil.getInteger(request, BAO_CAO_DLI);
		soTruongHocHVS = ParamUtil.getInteger(request, SO_TRUONG_HOC_HVS);
	}
	
	private int id;
	private String maTinh;
	private String maHuyen;
	private String maXa;
	private int nam;
	private int soDan;
	private int tongSoHGD;
	private int soHGDCoNhaTieu;
	private int soHGDCoNhaTieuHVS;
	private int soNhaTieuHVSXayMoi;
	private int tiLeHGDCoNhaTieu;
	private int tiLeHGDCoNhaTieuHVS;
	private int tongSoTruongHoc;
	private int soTruongHocHVS;
	private int tongSoTramYTe;
	private int soTramYTeHVS;
	private int tiLeTruongHocHVS;
	private int tiLeTramYTeHVS;
	private int ketLuanVSTX;
	private String ghiChu;
	private int baoCaoDLI;
	private Date ngayTao;
	private int idNguoiTao;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public int getSoDan() {
		return soDan;
	}
	public void setSoDan(int soDan) {
		this.soDan = soDan;
	}
	public int getTongSoHGD() {
		return tongSoHGD;
	}
	public void setTongSoHGD(int tongSoHGD) {
		this.tongSoHGD = tongSoHGD;
	}
	public int getSoHGDCoNhaTieu() {
		return soHGDCoNhaTieu;
	}
	public void setSoHGDCoNhaTieu(int soHGDCoNhaTieu) {
		this.soHGDCoNhaTieu = soHGDCoNhaTieu;
	}
	public int getSoHGDCoNhaTieuHVS() {
		return soHGDCoNhaTieuHVS;
	}
	public void setSoHGDCoNhaTieuHVS(int soHGDCoNhaTieuHVS) {
		this.soHGDCoNhaTieuHVS = soHGDCoNhaTieuHVS;
	}
	public int getSoNhaTieuHVSXayMoi() {
		return soNhaTieuHVSXayMoi;
	}
	public void setSoNhaTieuHVSXayMoi(int soNhaTieuHVSXayMoi) {
		this.soNhaTieuHVSXayMoi = soNhaTieuHVSXayMoi;
	}
	public int getTiLeHGDCoNhaTieu() {
		return tiLeHGDCoNhaTieu;
	}
	public void setTiLeHGDCoNhaTieu(int tiLeHGDCoNhaTieu) {
		this.tiLeHGDCoNhaTieu = tiLeHGDCoNhaTieu;
	}
	public int getTiLeHGDCoNhaTieuHVS() {
		return tiLeHGDCoNhaTieuHVS;
	}
	public void setTiLeHGDCoNhaTieuHVS(int tiLeHGDCoNhaTieuHVS) {
		this.tiLeHGDCoNhaTieuHVS = tiLeHGDCoNhaTieuHVS;
	}
	public int getTongSoTruongHoc() {
		return tongSoTruongHoc;
	}
	public void setTongSoTruongHoc(int tongSoTruongHoc) {
		this.tongSoTruongHoc = tongSoTruongHoc;
	}
	public int getSoTruongHocHVS() {
		return soTruongHocHVS;
	}
	public void setSoTruongHocHVS(int soTruongHocHVS) {
		this.soTruongHocHVS = soTruongHocHVS;
	}
	public int getTongSoTramYTe() {
		return tongSoTramYTe;
	}
	public void setTongSoTramYTe(int tongSoTramYTe) {
		this.tongSoTramYTe = tongSoTramYTe;
	}
	public int getSoTramYTeHVS() {
		return soTramYTeHVS;
	}
	public void setSoTramYTeHVS(int soTramYTeHVS) {
		this.soTramYTeHVS = soTramYTeHVS;
	}
	public int getTiLeTruongHocHVS() {
		return tiLeTruongHocHVS;
	}
	public void setTiLeTruongHocHVS(int tiLeTruongHocHVS) {
		this.tiLeTruongHocHVS = tiLeTruongHocHVS;
	}
	public int getTiLeTramYTeHVS() {
		return tiLeTramYTeHVS;
	}
	public void setTiLeTramYTeHVS(int tiLeTramYTeHVS) {
		this.tiLeTramYTeHVS = tiLeTramYTeHVS;
	}
	public int getKetLuanVSTX() {
		return ketLuanVSTX;
	}
	public void setKetLuanVSTX(int ketLuanVSTX) {
		this.ketLuanVSTX = ketLuanVSTX;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public int getBaoCaoDLI() {
		return baoCaoDLI;
	}
	public void setBaoCaoDLI(int baoCaoDLI) {
		this.baoCaoDLI = baoCaoDLI;
	}
	public Date getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
	public int getIdNguoiTao() {
		return idNguoiTao;
	}
	public void setIdNguoiTao(int idNguoiTao) {
		this.idNguoiTao = idNguoiTao;
	}
	
}
