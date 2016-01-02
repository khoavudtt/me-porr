package vn.dtt.sol.ns.vesinhmoitruong.terms;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class ThongTinKiemDemCongTrinhTerms {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public static final String ID = "id";
	public static final String VE_SINH_CONG_TRINH_ID = "veSinhConTrinhId";
	public static final String KE_HOACH_KIEM_DEM_VE_SINH_ID = "keHoachKiemDemVeSinhId";
	public static final String TEN_CONG_TRINH = "tenCongTrinh";
	public static final String LOAI_CONG_TRINH = "loaiCongTrinh";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String MA_XA = "maXa";
	public static final String DIA_CHI = "diaChi";
	public static final String NGAY_KIEM_DEM = "ngayKiemDem";
	public static final String HO_TEN_NGUOI_TRA_LOI = "hoTenNguoiTraLoi";
	public static final String SO_DIEN_THOAI = "soDienThoai";
	public static final String GIOI_TINH_NGUOI_TRA_LOI = "gioiTinhNguoiTraLoi";
	public static final String VAI_TRO_CHUC_DANH = "vaiTroChucDanh";
	public static final String SO_CA= "soCa";
	public static final String SO_NGUOI_TRONG_CA = "soNguoiTrongCa";
	public static final String KINH_DO = "kinhDo";
	public static final String VI_DO = "viDo";
	public static final String LOAI_NGUON_NUOC = "loaiNguonNuoc";
	public static final String DAT_QCVN = "daTQCVN";
	public static final String DAT_TIEU_CHUAN_HVS= "datTieuChuanHVS";
	public static final String ANH_CHUP_CHUNG_NHAN = "anhChupChungNhan";
	public static final String SO_NHA_TIEU = "soNhaTieu";
	public static final String GHI_CHU = "ghiChu";
	public static final String DA_KET_THUC_DIEU_TRA = "daKetThucDieuTra";
	public static final String LY_DO_KHONG_HOAN_THANH = "lyDoKhongHoanThanh";
	public static final String IMEI = "imei";
	public static final String TAI_KHOAN = "taiKhoan";
	public static final String DANH_GIA_KIEM_DEM = "danhGiaKiemDem";
	public static final String SAVE_POINT = "savePoint";
	
	public ThongTinKiemDemCongTrinhTerms(ActionRequest actionRequest )
	{
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		id=ParamUtil.getInteger(request, ID);
		veSinhCongTrinhId=ParamUtil.getInteger(request, VE_SINH_CONG_TRINH_ID);
		keHoachKiemDemVeSinhId=ParamUtil.getInteger(request, KE_HOACH_KIEM_DEM_VE_SINH_ID);
		tenCongTrinh=ParamUtil.getString(request, TEN_CONG_TRINH);
		loaiCongTrinh=ParamUtil.getInteger(request, LOAI_CONG_TRINH);
		maTinh=ParamUtil.getString(request, MA_TINH);
		maHuyen=ParamUtil.getString(request, MA_HUYEN);
		maXa=ParamUtil.getString(request, MA_XA);
		diaChi=ParamUtil.getString(request, DIA_CHI);
		ngayKiemDem=ParamUtil.getDate(request, NGAY_KIEM_DEM, sdf);
		hoTenNguoiTraLoi=ParamUtil.getString(request, HO_TEN_NGUOI_TRA_LOI);
		soDienThoai=ParamUtil.getString(request, SO_DIEN_THOAI);
		gioiTinhNguoiTraLoi=ParamUtil.getString(request, GIOI_TINH_NGUOI_TRA_LOI);
		vaiTroChucDanh=ParamUtil.getString(request, VAI_TRO_CHUC_DANH);
		soCa=ParamUtil.getInteger(request, SO_CA);
		soNguoiTrongCa=ParamUtil.getInteger(request, SO_NGUOI_TRONG_CA);
		kinhDo=ParamUtil.getString(request, KINH_DO);
		viDo=ParamUtil.getString(request, VI_DO);
		loaiNguonNuoc=ParamUtil.getString(request, LOAI_NGUON_NUOC);
		datQCVN=ParamUtil.getInteger(request, DAT_QCVN);
		datTieuChuanHVS=ParamUtil.getInteger(request, DAT_TIEU_CHUAN_HVS);
		anhChupChungNhan=ParamUtil.getString(request, ANH_CHUP_CHUNG_NHAN);
		soNhaTieu=ParamUtil.getInteger(request, SO_NHA_TIEU);
		ghiChu=ParamUtil.getString(request, GHI_CHU);
		daKetThucDieuTra=ParamUtil.getInteger(request, DA_KET_THUC_DIEU_TRA);
		lyDoKhongHoanThanh=ParamUtil.getString(request, LY_DO_KHONG_HOAN_THANH);
		imei=ParamUtil.getString(request, IMEI);
		taiKhoan=ParamUtil.getString(request, TAI_KHOAN);
		danhGiaKiemDem=ParamUtil.getInteger(request, DANH_GIA_KIEM_DEM);
		savePoint=ParamUtil.getDate(request, SAVE_POINT, sdf);
	
	}
	
	
	
	private int id;
	private int veSinhCongTrinhId;
	private int keHoachKiemDemVeSinhId;
	private String tenCongTrinh;
	private int loaiCongTrinh;
	private String maTinh;
	private String maHuyen;
	private String maXa;
	private String diaChi;
	private Date ngayKiemDem;
	private String hoTenNguoiTraLoi;
	private  String soDienThoai;
	private String gioiTinhNguoiTraLoi;
	private String vaiTroChucDanh;
	private int soCa;
	private int soNguoiTrongCa;
	private String kinhDo;
	private String viDo;
	private String loaiNguonNuoc;
	private int datQCVN;
	private int datTieuChuanHVS;
	private String anhChupChungNhan;
	private int soNhaTieu;
	private String ghiChu;
	private  int daKetThucDieuTra;
	private String lyDoKhongHoanThanh;
	private String imei;
	private String taiKhoan;
	private int danhGiaKiemDem;
	private Date savePoint;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVeSinhCongTrinhId() {
		return veSinhCongTrinhId;
	}
	public void setVeSinhCongTrinhId(int veSinhCongTrinhId) {
		this.veSinhCongTrinhId = veSinhCongTrinhId;
	}
	public int getKeHoachKiemDemVeSinhId() {
		return keHoachKiemDemVeSinhId;
	}
	public void setKeHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId) {
		this.keHoachKiemDemVeSinhId = keHoachKiemDemVeSinhId;
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
	public Date getNgayKiemDem() {
		return ngayKiemDem;
	}
	public void setNgayKiemDem(Date ngayKiemDem) {
		this.ngayKiemDem = ngayKiemDem;
	}
	public String getHoTenNguoiTraLoi() {
		return hoTenNguoiTraLoi;
	}
	public void setHoTenNguoiTraLoi(String hoTenNguoiTraLoi) {
		this.hoTenNguoiTraLoi = hoTenNguoiTraLoi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getGioiTinhNguoiTraLoi() {
		return gioiTinhNguoiTraLoi;
	}
	public void setGioiTinhNguoiTraLoi(String gioiTinhNguoiTraLoi) {
		this.gioiTinhNguoiTraLoi = gioiTinhNguoiTraLoi;
	}
	public String getVaiTroChucDanh() {
		return vaiTroChucDanh;
	}
	public void setVaiTroChucDanh(String vaiTroChucDanh) {
		this.vaiTroChucDanh = vaiTroChucDanh;
	}
	public int getSoCa() {
		return soCa;
	}
	public void setSoCa(int soCa) {
		this.soCa = soCa;
	}
	public int getSoNguoiTrongCa() {
		return soNguoiTrongCa;
	}
	public void setSoNguoiTrongCa(int soNguoiTrongCa) {
		this.soNguoiTrongCa = soNguoiTrongCa;
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
	public int getDatQCVN() {
		return datQCVN;
	}
	public void setDatQCVN(int datQCVN) {
		this.datQCVN = datQCVN;
	}
	public int getDatTieuChuanHVS() {
		return datTieuChuanHVS;
	}
	public void setDatTieuChuanHVS(int datTieuChuanHVS) {
		this.datTieuChuanHVS = datTieuChuanHVS;
	}
	public String getAnhChupChungNhan() {
		return anhChupChungNhan;
	}
	public void setAnhChupChungNhan(String anhChupChungNhan) {
		this.anhChupChungNhan = anhChupChungNhan;
	}
	public int getSoNhaTieu() {
		return soNhaTieu;
	}
	public void setSoNhaTieu(int soNhaTieu) {
		this.soNhaTieu = soNhaTieu;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public int getDaKetThucDieuTra() {
		return daKetThucDieuTra;
	}
	public void setDaKetThucDieuTra(int daKetThucDieuTra) {
		this.daKetThucDieuTra = daKetThucDieuTra;
	}
	public String getLyDoKhongHoanThanh() {
		return lyDoKhongHoanThanh;
	}
	public void setLyDoKhongHoanThanh(String lyDoKhongHoanThanh) {
		this.lyDoKhongHoanThanh = lyDoKhongHoanThanh;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public int getDanhGiaKiemDem() {
		return danhGiaKiemDem;
	}
	public void setDanhGiaKiemDem(int danhGiaKiemDem) {
		this.danhGiaKiemDem = danhGiaKiemDem;
	}
	public Date getSavePoint() {
		return savePoint;
	}
	public void setSavePoint(Date savePoint) {
		this.savePoint = savePoint;
	}
}
