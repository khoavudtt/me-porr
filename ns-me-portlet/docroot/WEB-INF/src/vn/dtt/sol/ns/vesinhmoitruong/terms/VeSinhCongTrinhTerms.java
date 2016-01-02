package vn.dtt.sol.ns.vesinhmoitruong.terms;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class VeSinhCongTrinhTerms {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public static final String ID = "id";
	public static final String TEN_CONG_TRINH = "tenCongTrinh";
	public static final String LOAI_CONG_TRINH = "loaiCongTrinh";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String MA_XA = "maXa";
	public static final String DIA_CHI = "diaChi";
	public static final String TRANG_THAI = "trangThai";
	public static final String NAM_BAO_CAO = "namBaoCao";
	public static final String GHI_CHU = "ghiChu";
	public static final String NGAY_TAO = "ngayTao";
	public static final String ID_NGUOI_TAO = "idNguoiTao";
	public static final String KINH_DO = "kinhDo";
	public static final String VI_DO = "viDo";
	public static final String LOAI_NGUON_NUOC = "loaiNguonNuoc";
	public static final String NGUON_NUOC_HVS = "nguonNuocHVS";
	public static final String LOAI_NHA_TIEU = "loaiNhaTieu";
	public static final String NHA_TIEU_HVS = "nhaTieuHVS";
	public static final String KET_LUON_HVS = "ketLuanHVS";
	public static final String NGAY_KIEM_DEM = "ngayKiemDem";
	public static final String NGAY_DANH_GIA = "ngayDanhGia";
	public static final String ID_NGUOI_DANH_GIA = "idNguoiDanhGia";
	public VeSinhCongTrinhTerms(ActionRequest actionRequest )
	{
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		id=ParamUtil.getInteger(request, ID);
		tenCongTrinh=ParamUtil.getString(request, TEN_CONG_TRINH);
		loaiCongTrinh=ParamUtil.getInteger(request, LOAI_CONG_TRINH);
		maTinh=ParamUtil.getString(request, MA_TINH);
		maHuyen=ParamUtil.getString(request, MA_HUYEN);
		maXa=ParamUtil.getString(request, MA_XA);
		diaChi=ParamUtil.getString(request, DIA_CHI);
		trangThai=ParamUtil.getInteger(request, TRANG_THAI);
		namBaoCao=ParamUtil.getInteger(request, NAM_BAO_CAO);
		ghiChu=ParamUtil.getString(request, GHI_CHU);
		ngayTao=ParamUtil.getDate(request, NGAY_TAO, sdf);
		idNguoiTao=ParamUtil.getInteger(request, ID_NGUOI_TAO);		
		kinhDo= ParamUtil.getString(request, KINH_DO);
		viDo= ParamUtil.getString(request,VI_DO);
		loaiNguonNuoc=ParamUtil.getString(request, LOAI_NGUON_NUOC);
		nguonNuocHVS=ParamUtil.getInteger(request, NGUON_NUOC_HVS);
		loaiNhaTieu=ParamUtil.getString(request, LOAI_NHA_TIEU);
		nhaTieuHVS=ParamUtil.getInteger(request, NHA_TIEU_HVS);
		ketLuanHVS=ParamUtil.getInteger(request, KET_LUON_HVS);
		ngayKiemDem=ParamUtil.getDate(request, NGAY_KIEM_DEM, sdf);
		ngayDanhGia=ParamUtil.getDate(request, NGAY_DANH_GIA, sdf);
		idNguoiDanhGia=ParamUtil.getInteger(request, ID_NGUOI_DANH_GIA);
	
	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenCongTrinh() {
		return tenCongTrinh;
	}
	public void setTenCongTrinh(String tenCongTrinh) {
		this.tenCongTrinh = tenCongTrinh;
	}
	public int getLoaiCongTrinh() {
		return loaiCongTrinh;
	}
	public void setLoaiCongTrinh(int loaiCongTrinh) {
		this.loaiCongTrinh = loaiCongTrinh;
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
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
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
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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
	public String getKinhDo() {
		return kinhDo;
	}
	public void setKinhDo(String kinhDo) {
		this.kinhDo = kinhDo;
	}
	public String getViDo() {
		return viDo;
	}
	public void setViDo(String viDo) {
		this.viDo = viDo;
	}
	public String getLoaiNguonNuoc() {
		return loaiNguonNuoc;
	}
	public void setLoaiNguonNuoc(String loaiNguonNuoc) {
		this.loaiNguonNuoc = loaiNguonNuoc;
	}
	public int getNguonNuocHVS() {
		return nguonNuocHVS;
	}
	public void setNguonNuocHVS(int nguonNuocHVS) {
		this.nguonNuocHVS = nguonNuocHVS;
	}
	public String getLoaiNhaTieu() {
		return loaiNhaTieu;
	}
	public void setLoaiNhaTieu(String loaiNhaTieu) {
		this.loaiNhaTieu = loaiNhaTieu;
	}
	public int getNhaTieuHVS() {
		return nhaTieuHVS;
	}
	public void setNhaTieuHVS(int nhaTieuHVS) {
		this.nhaTieuHVS = nhaTieuHVS;
	}
	public int getKetLuanHVS() {
		return ketLuanHVS;
	}
	public void setKetLuanHVS(int ketLuanHVS) {
		this.ketLuanHVS = ketLuanHVS;
	}
	public Date getNgayKiemDem() {
		return ngayKiemDem;
	}
	public void setNgayKiemDem(Date ngayKiemDem) {
		this.ngayKiemDem = ngayKiemDem;
	}
	public Date getNgayDanhGia() {
		return ngayDanhGia;
	}
	public void setNgayDanhGia(Date ngayDanhGia) {
		this.ngayDanhGia = ngayDanhGia;
	}
	public int getIdNguoiDanhGia() {
		return idNguoiDanhGia;
	}
	public void setIdNguoiDanhGia(int idNguoiDanhGia) {
		this.idNguoiDanhGia = idNguoiDanhGia;
	}
	private int id;
	private String tenCongTrinh;
	private int loaiCongTrinh;
	private  String maTinh;
	private String maHuyen;
	private String maXa;
	private String diaChi;
	private int trangThai;
	private int namBaoCao;
	private String ghiChu;
	private Date ngayTao;
	private int idNguoiTao;
	private String kinhDo;
	private String viDo;
	private String loaiNguonNuoc;
	private int nguonNuocHVS;
	private String loaiNhaTieu;
	private int nhaTieuHVS;
	private int ketLuanHVS;
	private  Date ngayKiemDem;
	private Date ngayDanhGia;
	private int idNguoiDanhGia;
}
