package vn.dtt.sol.ns.daunoinuoc.terms;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class ThongTinKiemDemNuocTerms {

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	public static final String ID = "id";
	public static final String DAU_NOI_NUOC_ID = "dauNoiNuocId";
	public static final String KE_HOACH_KIEM_DEM_NUOC_ID = "keHoachKiemDemNuocId";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String MA_XA = "maXa";
	public static final String THON_XOM = "thonXom";
	public static final String TEN_CHU_HO = "tenChuHo";
	public static final String GIOI_TINH_CHU_HO = "gioiTinhChuHo";
	public static final String NGAY_KIEM_DEM = "ngayKiemDem";
	public static final String HO_TEN_NGUOI_TRA_LOI = "hoTenNguoiTraLoi";
	public static final String LA_CHU_HO_KHONG = "laChuHoKhong";
	public static final String GIOI_TINH_NGUOI_TRA_LOI = "gioiTinhNguoiTraLoi";
	public static final String TEN_DAN_TOC = "tenDanToc";
	public static final String KINH_DO = "kinhDo";
	public static final String VI_DO = "viDo";
	public static final String SO_NGUOI_TRONG_HO = "soNguoiTrongHo";
	public static final String THANH_PHAN_HO_GD = "thanhPhanHoGd";
	public static final String CHU_HO_DUNG_DS = "chuHoDungDs";
	public static final String LY_DO_KHONG_DUNG_DS = "lyDoKhongDungDs";
	public static final String TEN_CHU_HO_HIEN_TAI = "tenChuHoHienTai";
	public static final String GIOI_TINH_CHU_HO_HIEN_TAI = "gioiTinhChuHoHienTai";
	public static final String DAU_NOI_CHUA = "dauNoiChua";
	public static final String ANH_DAU_NOI = "anhDauNoi";
	public static final String THOI_GIAN_DAU_HOP_DONG = "thoiGianDauHopDong";
	public static final String THOI_GIAN_DAU_NOI_THUC_TE = "thoiGianDauNoiThucTe";
	public static final String VOI_NUOC_CHAY_KHONG = "voiNuocChayKhong";
	public static final String NUOC_TRONG_KHONG = "nuocTrongKhong";
	public static final String MAU_NUOC = "mauNuoc";
	public static final String MUI_NUOC = "muiNuoc";
	public static final String VI_NUOC = "viNuoc";
	public static final String LOAI_KHAC = "loaiKhac";
	public static final String DA_TUNG_DUC_KHONG = "daTungDucKhong";
	public static final String MAU_NUOC_TUNG_CO = "mauNuocTungCo";
	public static final String MUI_NUOC_TUNG_CO = "muiNuocTungCo";
	public static final String VI_NUOC_TUNG_CO = "viNuocTungCo";
	public static final String LOAI_KHAC_TUNG_CO = "loaiKhacTungCo";
	public static final String CO_BE_CHUA_NUOC = "coBeChuaNuoc";
	public static final String TINH_TRANG_BE = "tinhTrangBe";
	public static final String ANH_BE_CHUA = "anhBeChua";
	public static final String BI_MAT_NUOC = "biMatNuoc";
	public static final String SO_LAN_MAT_NUOC = "soLanMatNuoc";
	public static final String SO_GIO_TRUNG_BINH = "soGioTrungBinh";
	public static final String SO_SE_RY_DONG_HO = "soSeRyDongHo";
	public static final String CHI_SO_DONG_HO = "chiSoDongHo";
	public static final String ANH_DONG_HO = "anhDongHo";
	public static final String GHI_CHU = "ghiChu";
	public static final String DA_KET_THUC_DIEU_TRA = "daKetThucDieuTra";
	public static final String LY_DO_KHONG_HOAN_THANH = "lyDoKhongHoanThanh";
	public static final String IMEI = "iMei";
	public static final String TAI_KHOAN = "taiKhoan";
	public static final String DANH_GIA_KIEM_DEM = "danhGiaKiemDem";
	
	public ThongTinKiemDemNuocTerms() {
		// TODO Auto-generated constructor stub
	}
	
	public ThongTinKiemDemNuocTerms(ActionRequest actionRequest) {
		// TODO Auto-generated constructor stub
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		id=ParamUtil.getLong(request, ID);
		dauNoiNuocId=ParamUtil.getLong(request, DAU_NOI_NUOC_ID);
		keHoachKiemDemNuocId=ParamUtil.getInteger(request, KE_HOACH_KIEM_DEM_NUOC_ID);
		maTinh=ParamUtil.getString(request, MA_TINH);
		maHuyen=ParamUtil.getString(request, MA_HUYEN);
		maXa=ParamUtil.getString(request, MA_XA);
		thonXom=ParamUtil.getString(request, THON_XOM);
		tenChuHo=ParamUtil.getString(request, TEN_CHU_HO);
		gioiTinhChuHo=ParamUtil.getInteger(request, GIOI_TINH_CHU_HO);
		ngayKiemDem=ParamUtil.getDate(request, NGAY_KIEM_DEM, sdf);
		hoTenNguoiTraLoi=ParamUtil.getString(request, HO_TEN_NGUOI_TRA_LOI);
		laChuHoKhong=ParamUtil.getInteger(request, LA_CHU_HO_KHONG);
		gioiTinhNguoiTraLoi=ParamUtil.getInteger(request, GIOI_TINH_NGUOI_TRA_LOI);
		tenDanToc=ParamUtil.getString(request, TEN_DAN_TOC);
		kinhDo=ParamUtil.getString(request, KINH_DO);
		viDo=ParamUtil.getString(request, VI_DO);
		soNguoiTrongHo=ParamUtil.getInteger(request, SO_NGUOI_TRONG_HO);
		thanhPhanHoGd=ParamUtil.getInteger(request, THANH_PHAN_HO_GD);
		chuHoDungDs=ParamUtil.getInteger(request, CHU_HO_DUNG_DS);
		lyDoKhongDungDs=ParamUtil.getString(request, LY_DO_KHONG_DUNG_DS);
		tenChuHoHienTai=ParamUtil.getString(request, TEN_CHU_HO_HIEN_TAI);
		gioiTinhChuHoHienTai=ParamUtil.getInteger(request, GIOI_TINH_CHU_HO_HIEN_TAI);
		dauNoiChua=ParamUtil.getInteger(request, DAU_NOI_CHUA);
		anhDauNoi=ParamUtil.getString(request, ANH_DAU_NOI);
		thoiGianDauHopDong=ParamUtil.getDate(request, THOI_GIAN_DAU_HOP_DONG, sdf);
		thoiGianDauNoiThucTe=ParamUtil.getDate(request, THOI_GIAN_DAU_NOI_THUC_TE, sdf);
		voiNuocChayKhong=ParamUtil.getInteger(request, VOI_NUOC_CHAY_KHONG);
		nuocTrongKhong=ParamUtil.getInteger(request, NUOC_TRONG_KHONG);
		mauNuoc=ParamUtil.getString(request, MAU_NUOC);
		muiNuoc=ParamUtil.getString(request, MUI_NUOC);
		viNuoc=ParamUtil.getString(request, VI_NUOC);
		loaiKhac=ParamUtil.getString(request, LOAI_KHAC);
		daTungDucKhong=ParamUtil.getInteger(request, DA_TUNG_DUC_KHONG);
		mauNuocTungCo=ParamUtil.getString(request, MAU_NUOC_TUNG_CO);
		muiNuocTungCo=ParamUtil.getString(request, MUI_NUOC_TUNG_CO);
		viNuocTungCo=ParamUtil.getString(request, VI_NUOC_TUNG_CO);
		loaiKhacTungCo=ParamUtil.getString(request, LOAI_KHAC_TUNG_CO);
		coBeChuaNuoc=ParamUtil.getInteger(request, CO_BE_CHUA_NUOC);
		tinhTrangBe=ParamUtil.getInteger(request, TINH_TRANG_BE);
		anhBeChua=ParamUtil.getString(request, ANH_BE_CHUA);
		biMatNuoc=ParamUtil.getInteger(request, BI_MAT_NUOC);
		soLanMatNuoc=ParamUtil.getInteger(request, SO_LAN_MAT_NUOC);
		soGioTrungBinh=ParamUtil.getInteger(request, SO_GIO_TRUNG_BINH);
		
		soSeRyDongHo=ParamUtil.getString(request, SO_SE_RY_DONG_HO);
		chiSoDongHo=ParamUtil.getString(request, CHI_SO_DONG_HO);
		anhDongHo=ParamUtil.getString(request, ANH_DONG_HO);
		ghiChu=ParamUtil.getString(request, GHI_CHU);
		daKetThucDieuTra=ParamUtil.getInteger(request, DA_KET_THUC_DIEU_TRA);
		lyDoKhongHoanThanh=ParamUtil.getString(request, LY_DO_KHONG_HOAN_THANH);
		iMei=ParamUtil.getString(request, IMEI);
		taiKhoan=ParamUtil.getString(request, TAI_KHOAN);
		danhGiaKiemDem=ParamUtil.getString(request, DANH_GIA_KIEM_DEM);
	}
	private long id;
	private long dauNoiNuocId;
	private int keHoachKiemDemNuocId;
	private String maTinh;
	private String maHuyen;
	private String maXa;
	private String thonXom;
	private String tenChuHo;
	private int gioiTinhChuHo;
	private Date ngayKiemDem;
	private String hoTenNguoiTraLoi;
	private int laChuHoKhong;
	private int gioiTinhNguoiTraLoi;
	private String tenDanToc;
	private String kinhDo;
	private String viDo;
	private int soNguoiTrongHo;
	private int thanhPhanHoGd;
	private int chuHoDungDs;
	private String lyDoKhongDungDs;
	private String tenChuHoHienTai;
	private int gioiTinhChuHoHienTai;
	private int dauNoiChua;
	private String anhDauNoi;
	private Date thoiGianDauHopDong;
	private Date thoiGianDauNoiThucTe;
	private int voiNuocChayKhong;
	private int nuocTrongKhong;
	private String mauNuoc;
	private String muiNuoc;
	private String viNuoc;
	private String loaiKhac;
	private int daTungDucKhong;
	private String mauNuocTungCo;
	private String muiNuocTungCo;
	private String viNuocTungCo;
	private String loaiKhacTungCo;
	private int coBeChuaNuoc;
	private int tinhTrangBe;
	private String anhBeChua;
	private int biMatNuoc;
	private int soLanMatNuoc;
	private int soGioTrungBinh;
	private String soSeRyDongHo;
	private String chiSoDongHo;
	private String anhDongHo;
	private String ghiChu;
	private int daKetThucDieuTra;
	private String lyDoKhongHoanThanh;
	private String iMei;
	private String taiKhoan;
	private String danhGiaKiemDem;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDauNoiNuocId() {
		return dauNoiNuocId;
	}
	public void setDauNoiNuocId(long dauNoiNuocId) {
		this.dauNoiNuocId = dauNoiNuocId;
	}
	public int getKeHoachKiemDemNuocId() {
		return keHoachKiemDemNuocId;
	}
	public void setKeHoachKiemDemNuocId(int keHoachKiemDemNuocId) {
		this.keHoachKiemDemNuocId = keHoachKiemDemNuocId;
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
	public String getThonXom() {
		return thonXom;
	}
	public void setThonXom(String thonXom) {
		this.thonXom = thonXom;
	}
	public String getTenChuHo() {
		return tenChuHo;
	}
	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}
	public int getGioiTinhChuHo() {
		return gioiTinhChuHo;
	}
	public void setGioiTinhChuHo(int gioiTinhChuHo) {
		this.gioiTinhChuHo = gioiTinhChuHo;
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
	public int getLaChuHoKhong() {
		return laChuHoKhong;
	}
	public void setLaChuHoKhong(int laChuHoKhong) {
		this.laChuHoKhong = laChuHoKhong;
	}
	public int getGioiTinhNguoiTraLoi() {
		return gioiTinhNguoiTraLoi;
	}
	public void setGioiTinhNguoiTraLoi(int gioiTinhNguoiTraLoi) {
		this.gioiTinhNguoiTraLoi = gioiTinhNguoiTraLoi;
	}
	public String getTenDanToc() {
		return tenDanToc;
	}
	public void setTenDanToc(String tenDanToc) {
		this.tenDanToc = tenDanToc;
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
	public int getSoNguoiTrongHo() {
		return soNguoiTrongHo;
	}
	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		this.soNguoiTrongHo = soNguoiTrongHo;
	}
	public int getThanhPhanHoGd() {
		return thanhPhanHoGd;
	}
	public void setThanhPhanHoGd(int thanhPhanHoGd) {
		this.thanhPhanHoGd = thanhPhanHoGd;
	}
	public int getChuHoDungDs() {
		return chuHoDungDs;
	}
	public void setChuHoDungDs(int chuHoDungDs) {
		this.chuHoDungDs = chuHoDungDs;
	}
	public String getLyDoKhongDungDs() {
		return lyDoKhongDungDs;
	}
	public void setLyDoKhongDungDs(String lyDoKhongDungDs) {
		this.lyDoKhongDungDs = lyDoKhongDungDs;
	}
	public String getTenChuHoHienTai() {
		return tenChuHoHienTai;
	}
	public void setTenChuHoHienTai(String tenChuHoHienTai) {
		this.tenChuHoHienTai = tenChuHoHienTai;
	}
	public int getGioiTinhChuHoHienTai() {
		return gioiTinhChuHoHienTai;
	}
	public void setGioiTinhChuHoHienTai(int gioiTinhChuHoHienTai) {
		this.gioiTinhChuHoHienTai = gioiTinhChuHoHienTai;
	}
	public int getDauNoiChua() {
		return dauNoiChua;
	}
	public void setDauNoiChua(int dauNoiChua) {
		this.dauNoiChua = dauNoiChua;
	}
	public String getAnhDauNoi() {
		return anhDauNoi;
	}
	public void setAnhDauNoi(String anhDauNoi) {
		this.anhDauNoi = anhDauNoi;
	}
	public Date getThoiGianDauHopDong() {
		return thoiGianDauHopDong;
	}
	public void setThoiGianDauHopDong(Date thoiGianDauHopDong) {
		this.thoiGianDauHopDong = thoiGianDauHopDong;
	}
	public Date getThoiGianDauNoiThucTe() {
		return thoiGianDauNoiThucTe;
	}
	public void setThoiGianDauNoiThucTe(Date thoiGianDauNoiThucTe) {
		this.thoiGianDauNoiThucTe = thoiGianDauNoiThucTe;
	}
	public int getVoiNuocChayKhong() {
		return voiNuocChayKhong;
	}
	public void setVoiNuocChayKhong(int voiNuocChayKhong) {
		this.voiNuocChayKhong = voiNuocChayKhong;
	}
	public int getNuocTrongKhong() {
		return nuocTrongKhong;
	}
	public void setNuocTrongKhong(int nuocTrongKhong) {
		this.nuocTrongKhong = nuocTrongKhong;
	}
	public String getMauNuoc() {
		return mauNuoc;
	}
	public void setMauNuoc(String mauNuoc) {
		this.mauNuoc = mauNuoc;
	}
	public String getMuiNuoc() {
		return muiNuoc;
	}
	public void setMuiNuoc(String muiNuoc) {
		this.muiNuoc = muiNuoc;
	}
	public String getViNuoc() {
		return viNuoc;
	}
	public void setViNuoc(String viNuoc) {
		this.viNuoc = viNuoc;
	}
	public String getLoaiKhac() {
		return loaiKhac;
	}
	public void setLoaiKhac(String loaiKhac) {
		this.loaiKhac = loaiKhac;
	}
	public int getDaTungDucKhong() {
		return daTungDucKhong;
	}
	public void setDaTungDucKhong(int daTungDucKhong) {
		this.daTungDucKhong = daTungDucKhong;
	}
	public String getMauNuocTungCo() {
		return mauNuocTungCo;
	}
	public void setMauNuocTungCo(String mauNuocTungCo) {
		this.mauNuocTungCo = mauNuocTungCo;
	}
	public String getMuiNuocTungCo() {
		return muiNuocTungCo;
	}
	public void setMuiNuocTungCo(String muiNuocTungCo) {
		this.muiNuocTungCo = muiNuocTungCo;
	}
	public String getViNuocTungCo() {
		return viNuocTungCo;
	}
	public void setViNuocTungCo(String viNuocTungCo) {
		this.viNuocTungCo = viNuocTungCo;
	}
	public String getLoaiKhacTungCo() {
		return loaiKhacTungCo;
	}
	public void setLoaiKhacTungCo(String loaiKhacTungCo) {
		this.loaiKhacTungCo = loaiKhacTungCo;
	}
	public int getCoBeChuaNuoc() {
		return coBeChuaNuoc;
	}
	public void setCoBeChuaNuoc(int coBeChuaNuoc) {
		this.coBeChuaNuoc = coBeChuaNuoc;
	}
	public int getTinhTrangBe() {
		return tinhTrangBe;
	}
	public void setTinhTrangBe(int tinhTrangBe) {
		this.tinhTrangBe = tinhTrangBe;
	}
	public String getAnhBeChua() {
		return anhBeChua;
	}
	public void setAnhBeChua(String anhBeChua) {
		this.anhBeChua = anhBeChua;
	}
	public int getBiMatNuoc() {
		return biMatNuoc;
	}
	public void setBiMatNuoc(int biMatNuoc) {
		this.biMatNuoc = biMatNuoc;
	}
	public int getSoLanMatNuoc() {
		return soLanMatNuoc;
	}
	public void setSoLanMatNuoc(int soLanMatNuoc) {
		this.soLanMatNuoc = soLanMatNuoc;
	}
	public int getSoGioTrungBinh() {
		return soGioTrungBinh;
	}
	public void setSoGioTrungBinh(int soGioTrungBinh) {
		this.soGioTrungBinh = soGioTrungBinh;
	}
	public String getSoSeRyDongHo() {
		return soSeRyDongHo;
	}
	public void setSoSeRyDongHo(String soSeRyDongHo) {
		this.soSeRyDongHo = soSeRyDongHo;
	}
	public String getChiSoDongHo() {
		return chiSoDongHo;
	}
	public void setChiSoDongHo(String chiSoDongHo) {
		this.chiSoDongHo = chiSoDongHo;
	}
	public String getAnhDongHo() {
		return anhDongHo;
	}
	public void setAnhDongHo(String anhDongHo) {
		this.anhDongHo = anhDongHo;
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
	public String getiMei() {
		return iMei;
	}
	public void setiMei(String iMei) {
		this.iMei = iMei;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public String getDanhGiaKiemDem() {
		return danhGiaKiemDem;
	}
	public void setDanhGiaKiemDem(String danhGiaKiemDem) {
		this.danhGiaKiemDem = danhGiaKiemDem;
	}
}
