package vn.dtt.sol.ns.vesinhmoitruong.terms;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class ThongTinKiemDemHoGiaDinhTerms {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public static final String ID = "id";
	public static final String VE_SINH_GIA_DINH_ID = "veSinhGiaDinhId";
	public static final String KE_HOACH_KIEM_DEM_VE_SINH_ID = "keHoachKiemDemVeSinhId";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String MA_XA = "maXa";
	public static final String THON_XOM = "thonXom";
	public static final String TEN_CHU_HO = "tenChuHo";
	public static final String GIOI_TINH_CHU_HO = "gioiTinhChuHo";
	public static final String NGAY_KIEM_DEM = "ngayKiemDem";
	public static final String TIM_THAY_NHA = "timThayNha";
	public static final String CO_NGUOI_O_NHA = "coNguoiONha";
	public static final String SO_NGUOI_TRONG_HO = "soNguoiTrongHo";
	public static final String HO_TEN_NGUOI_TRA_LOI = "hoTenNguoiTraLoi";
	public static final String LA_CHU_HO_KHONG = "laChuHoKhong";
	public static final String GIOI_TINH_NGUOI_TRA_LOI = "gioiTinhNguoiTraLoi";
	public static final String TEN_DAN_DOC = "tenDanToc";
	public static final String KINH_DO = "kinhDo";
	public static final String VI_DO = "viDo";
	public static final String THANH_PHAN_HO_GD = "thanhPhanHoGD";
	public static final String CHU_HO_DUNG_DS = "chuHoDungDS";
	public static final String LY_DO_KHONG_DUNG_DS = "lyDoKhongDungDS";
	public static final String TEN_CHU_HO_HIEN_TAI= "tenChuHienTai";
	public static final String GIOI_TINH_CHU_HO_HIEN_TAI = "gioiTinhChuHoHienTai";
	public static final String CO_NHA_TIEU = "coNhaTieu";
	public static final String LOAI_NHA_TIEU = "loaiNhaTieu";
	public static final String ANH_TOAN_CANH = "anhToanCanh";
	public static final String ANH_TRONG_NHA_TIEU = "anhTrongNhaTieu";
	public static final String THANG_XAY_DUNG = "thangXayDung";
	public static final String NAM_XAY_DUNG = "namXayDung";
	public static final String NGUON_VON = "nguonVon";
	public static final String CHI_TIET_VON_VAY = "chiTietVonVay";
	public static final String DUOC_CAI_TAO = "duocCaiTao";
	public static final String LOAI_NHA_TIEU_CU = "loaiNhaTieuCu";
	public static final String ANH_BE_CHUA = "anhBeChua";
	public static final String VE_SINH_SACH_SE = "veSinhSachSe";
	public static final String DE_LAM_VE_SINH = "deLamVeSinh";
	public static final String MUI_VE_SINH = "muiVeSinh";
	public static final String PHIA_TREN_KIN_DAO = "phiaTrenKinDao";
	public static final String DU_CHE_MUA_GIO = "duCheMuaGio";
	public static final String SAN_CAO_TREN_TOI_THIEU = "sanCaoTrenToiThieu";
	public static final String NAP_BE_CON_TOT = "napBeConTot";
	public static final String CUA_PHAN_BIT_KIN = "cuaPhanBitKin";
	public static final String TRAN_RA_NGOAI = "tranRaNgoai";
	public static final String NUOC_THAI_DI_DAU = "nuocThaiDiDau";
	public static final String KHOANG_CACH_NGUON_NUOC = "khoangCachNguonNuoc";
	public static final String NGAP_KHI_MUA_LON = "ngapKhiMuaLon";
	public static final String GHI_CHU = "ghiChu";
	public static final String DA_KET_THUC_DIEU_TRA = "daKetThucDieuTra";
	public static final String LY_DO_KHONG_HOAN_THANH = "lyDoKhongHoanThanh";
	public static final String IMEI = "imei";
	public static final String TAI_KHOAN = "taiKhoan";
	public static final String DANH_GIA_KIEM_DEM = "danhGiaKiemDem";
	public static final String SAVE_POINT = "savePoint";
	public static final String LOAI_NGUON_NUOC = "loaiNguonNuoc";
	public ThongTinKiemDemHoGiaDinhTerms(ActionRequest actionRequest) {
		// TODO Auto-generated constructor stub
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		id = ParamUtil.getInteger(request, ID);
		veSinhGiaDinhId = ParamUtil.getInteger(request, VE_SINH_GIA_DINH_ID);
		keHoachKiemDemVeSinhId = ParamUtil.getInteger(request, KE_HOACH_KIEM_DEM_VE_SINH_ID);
		maTinh = ParamUtil.getString(request, MA_TINH);
		maHuyen = ParamUtil.getString(request, MA_HUYEN);
		maXa = ParamUtil.getString(request, MA_XA);
		thonXom = ParamUtil.getString(request, THON_XOM);
		tenChuHo = ParamUtil.getString(request, TEN_CHU_HO);
		gioiTinhChuHo = ParamUtil.getInteger(request, GIOI_TINH_CHU_HO);
		ngayKiemDem = ParamUtil.getDate(request, NGAY_KIEM_DEM, sdf);
		timThayNha = ParamUtil.getInteger(request, TIM_THAY_NHA);
		coNguoiONha = ParamUtil.getInteger(request, CO_NGUOI_O_NHA);
		hoTenNguoiTraLoi = ParamUtil.getString(request, HO_TEN_NGUOI_TRA_LOI);
		laChuHoKhong = ParamUtil.getInteger(request, LA_CHU_HO_KHONG);
		gioiTinhNguoiTraLoi = ParamUtil.getString(request, GIOI_TINH_NGUOI_TRA_LOI);
		tenDanToc = ParamUtil.getString(request, TEN_DAN_DOC);
		kinhDo = ParamUtil.getString(request, KINH_DO);
		viDo = ParamUtil.getString(request, VI_DO);
		thanhPhanHoGD = ParamUtil.getInteger(request, THANH_PHAN_HO_GD);
		chuHoDungDS = ParamUtil.getInteger(request, CHU_HO_DUNG_DS);
		lyDoKhongDungDS = ParamUtil.getString(request, LY_DO_KHONG_DUNG_DS);
		tenChuHienTai = ParamUtil.getString(request, TEN_CHU_HO_HIEN_TAI);
		gioiTinhChuHoHienTai = ParamUtil.getInteger(request, GIOI_TINH_CHU_HO_HIEN_TAI);
		coNhaTieu = ParamUtil.getInteger(request, CO_NHA_TIEU);
		loaiNhaTieu = ParamUtil.getString(request, LOAI_NHA_TIEU);
		anhToanCanh = ParamUtil.getString(request, ANH_TOAN_CANH);
		anhTrongNhaTieu = ParamUtil.getString(request, ANH_TRONG_NHA_TIEU);
		thangXayDung = ParamUtil.getInteger(request, THANG_XAY_DUNG);
		namXayDung = ParamUtil.getInteger(request, NAM_XAY_DUNG);
		nguonVon = ParamUtil.getInteger(request, NGUON_VON);
		chiTietVonVay = ParamUtil.getString(request, CHI_TIET_VON_VAY);
		duocCaiTao = ParamUtil.getInteger(request, DUOC_CAI_TAO);
		loaiNhaTieuCu = ParamUtil.getString(request, LOAI_NHA_TIEU_CU);
		anhBeChua = ParamUtil.getString(request, ANH_BE_CHUA);
		veSinhSachSe = ParamUtil.getInteger(request, VE_SINH_GIA_DINH_ID);
		deLamVeSinh = ParamUtil.getInteger(request, DE_LAM_VE_SINH);
		muiVeSinh = ParamUtil.getInteger(request, MUI_VE_SINH);
		phiaTrenKinDao = ParamUtil.getInteger(request, PHIA_TREN_KIN_DAO);
		duCheMuaGio = ParamUtil.getInteger(request, DU_CHE_MUA_GIO);
		sanCaoTrenToiThieu = ParamUtil.getInteger(request, SAN_CAO_TREN_TOI_THIEU);
		napBeConTot = ParamUtil.getInteger(request, NAP_BE_CON_TOT);
		cuaPhanBitKin = ParamUtil.getInteger(request, CUA_PHAN_BIT_KIN);
		tranRaNgoai = ParamUtil.getInteger(request, TRAN_RA_NGOAI);
		nuocThaiDiDau = ParamUtil.getInteger(request, NUOC_THAI_DI_DAU);
		khoangCachNguonNuoc = ParamUtil.getInteger(request, KHOANG_CACH_NGUON_NUOC);
		ngapKhiMuaLon = ParamUtil.getInteger(request, NGAP_KHI_MUA_LON);
		ghiChu = ParamUtil.getString(request, GHI_CHU);
		daKetThucDieuTra = ParamUtil.getInteger(request, DA_KET_THUC_DIEU_TRA);
		lyDoKhongHoanThanh = ParamUtil.getString(request, LY_DO_KHONG_HOAN_THANH);
		imei = ParamUtil.getString(request, IMEI);
		taiKhoan = ParamUtil.getString(request, TAI_KHOAN);
		danhGiaKiemDem = ParamUtil.getInteger(request, DANH_GIA_KIEM_DEM);
		savePoint = ParamUtil.getString(request, SAVE_POINT);
		soNguoiTrongHo = ParamUtil.getInteger(request, SO_NGUOI_TRONG_HO);
		loaiNguonNuoc = ParamUtil.getString(request, LOAI_NGUON_NUOC);
	}
	private static int id;
	private static int veSinhGiaDinhId;
	private static int keHoachKiemDemVeSinhId;
	private static String maTinh;
	private static String maHuyen;
	private static String maXa;
	private static String thonXom;
	private static String tenChuHo;
	private static int gioiTinhChuHo;
	private static Date ngayKiemDem;
	private static int timThayNha;
	private static int coNguoiONha;
	private static int soNguoiTrongHo;
	private static String hoTenNguoiTraLoi;
	private static int laChuHoKhong;
	private static String gioiTinhNguoiTraLoi;
	private static String tenDanToc;
	private static String kinhDo;
	private static String viDo;
	private static int thanhPhanHoGD;
	private static int chuHoDungDS;
	private static String lyDoKhongDungDS;
	private static String tenChuHienTai;
	private static int gioiTinhChuHoHienTai;
	private static int coNhaTieu;
	private static String loaiNhaTieu;
	private static String anhToanCanh;
	private static String anhTrongNhaTieu;
	private static int thangXayDung;
	private static int namXayDung;
	private static int nguonVon;
	private static String chiTietVonVay;
	private static int duocCaiTao;
	private static String loaiNhaTieuCu;
	private static String anhBeChua;
	private static int veSinhSachSe;
	private static int deLamVeSinh;
	private static int muiVeSinh;
	private static int phiaTrenKinDao;
	private static int duCheMuaGio;
	private static int sanCaoTrenToiThieu;
	private static int napBeConTot;
	private static int cuaPhanBitKin;
	private static int tranRaNgoai;
	private static int nuocThaiDiDau;
	private static int khoangCachNguonNuoc;
	private static int ngapKhiMuaLon;
	private static String ghiChu;
	private static int daKetThucDieuTra;
	private static String lyDoKhongHoanThanh;
	private static String imei;
	private static String taiKhoan;
	private static int danhGiaKiemDem;
	private static String savePoint;
	private static String loaiNguonNuoc;
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		ThongTinKiemDemHoGiaDinhTerms.id = id;
	}
	public static int getVeSinhGiaDinhId() {
		return veSinhGiaDinhId;
	}
	public static void setVeSinhGiaDinhId(int veSinhGiaDinhId) {
		ThongTinKiemDemHoGiaDinhTerms.veSinhGiaDinhId = veSinhGiaDinhId;
	}
	public static int getKeHoachKiemDemVeSinhId() {
		return keHoachKiemDemVeSinhId;
	}
	public static void setKeHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId) {
		ThongTinKiemDemHoGiaDinhTerms.keHoachKiemDemVeSinhId = keHoachKiemDemVeSinhId;
	}
	public static String getMaTinh() {
		return maTinh;
	}
	public static void setMaTinh(String maTinh) {
		ThongTinKiemDemHoGiaDinhTerms.maTinh = maTinh;
	}
	public static String getMaHuyen() {
		return maHuyen;
	}
	public static void setMaHuyen(String maHuyen) {
		ThongTinKiemDemHoGiaDinhTerms.maHuyen = maHuyen;
	}
	public static String getMaXa() {
		return maXa;
	}
	public static void setMaXa(String maXa) {
		ThongTinKiemDemHoGiaDinhTerms.maXa = maXa;
	}
	public static String getThonXom() {
		return thonXom;
	}
	public static void setThonXom(String thonXom) {
		ThongTinKiemDemHoGiaDinhTerms.thonXom = thonXom;
	}
	public static String getTenChuHo() {
		return tenChuHo;
	}
	public static void setTenChuHo(String tenChuHo) {
		ThongTinKiemDemHoGiaDinhTerms.tenChuHo = tenChuHo;
	}
	public static int getGioiTinhChuHo() {
		return gioiTinhChuHo;
	}
	public static void setGioiTinhChuHo(int gioiTinhChuHo) {
		ThongTinKiemDemHoGiaDinhTerms.gioiTinhChuHo = gioiTinhChuHo;
	}
	public static Date getNgayKiemDem() {
		return ngayKiemDem;
	}
	public static void setNgayKiemDem(Date ngayKiemDem) {
		ThongTinKiemDemHoGiaDinhTerms.ngayKiemDem = ngayKiemDem;
	}
	public static int getTimThayNha() {
		return timThayNha;
	}
	public static void setTimThayNha(int timThayNha) {
		ThongTinKiemDemHoGiaDinhTerms.timThayNha = timThayNha;
	}
	public static int getCoNguoiONha() {
		return coNguoiONha;
	}
	public static void setCoNguoiONha(int coNguoiONha) {
		ThongTinKiemDemHoGiaDinhTerms.coNguoiONha = coNguoiONha;
	}
	public static String getHoTenNguoiTraLoi() {
		return hoTenNguoiTraLoi;
	}
	public static void setHoTenNguoiTraLoi(String hoTenNguoiTraLoi) {
		ThongTinKiemDemHoGiaDinhTerms.hoTenNguoiTraLoi = hoTenNguoiTraLoi;
	}
	public static int getLaChuHoKhong() {
		return laChuHoKhong;
	}
	public static void setLaChuHoKhong(int laChuHoKhong) {
		ThongTinKiemDemHoGiaDinhTerms.laChuHoKhong = laChuHoKhong;
	}
	public static String getGioiTinhNguoiTraLoi() {
		return gioiTinhNguoiTraLoi;
	}
	public static void setGioiTinhNguoiTraLoi(String gioiTinhNguoiTraLoi) {
		ThongTinKiemDemHoGiaDinhTerms.gioiTinhNguoiTraLoi = gioiTinhNguoiTraLoi;
	}
	public static String getTenDanToc() {
		return tenDanToc;
	}
	public static void setTenDanToc(String tenDanToc) {
		ThongTinKiemDemHoGiaDinhTerms.tenDanToc = tenDanToc;
	}
	public static String getKinhDo() {
		return kinhDo;
	}
	public static void setKinhDo(String kinhDo) {
		ThongTinKiemDemHoGiaDinhTerms.kinhDo = kinhDo;
	}
	public static String getViDo() {
		return viDo;
	}
	public static void setViDo(String viDo) {
		ThongTinKiemDemHoGiaDinhTerms.viDo = viDo;
	}
	public static int getThanhPhanHoGD() {
		return thanhPhanHoGD;
	}
	public static void setThanhPhanHoGD(int thanhPhanHoGD) {
		ThongTinKiemDemHoGiaDinhTerms.thanhPhanHoGD = thanhPhanHoGD;
	}
	public static int getChuHoDungDS() {
		return chuHoDungDS;
	}
	public static void setChuHoDungDS(int chuHoDungDS) {
		ThongTinKiemDemHoGiaDinhTerms.chuHoDungDS = chuHoDungDS;
	}
	public static String getLyDoKhongDungDS() {
		return lyDoKhongDungDS;
	}
	public static void setLyDoKhongDungDS(String lyDoKhongDungDS) {
		ThongTinKiemDemHoGiaDinhTerms.lyDoKhongDungDS = lyDoKhongDungDS;
	}
	public static String getTenChuHienTai() {
		return tenChuHienTai;
	}
	public static void setTenChuHienTai(String tenChuHienTai) {
		ThongTinKiemDemHoGiaDinhTerms.tenChuHienTai = tenChuHienTai;
	}
	public static int getGioiTinhChuHoHienTai() {
		return gioiTinhChuHoHienTai;
	}
	public static void setGioiTinhChuHoHienTai(int gioiTinhChuHoHienTai) {
		ThongTinKiemDemHoGiaDinhTerms.gioiTinhChuHoHienTai = gioiTinhChuHoHienTai;
	}
	public static int getCoNhaTieu() {
		return coNhaTieu;
	}
	public static void setCoNhaTieu(int coNhaTieu) {
		ThongTinKiemDemHoGiaDinhTerms.coNhaTieu = coNhaTieu;
	}
	public static String getLoaiNhaTieu() {
		return loaiNhaTieu;
	}
	public static void setLoaiNhaTieu(String loaiNhaTieu) {
		ThongTinKiemDemHoGiaDinhTerms.loaiNhaTieu = loaiNhaTieu;
	}
	public static String getAnhToanCanh() {
		return anhToanCanh;
	}
	public static void setAnhToanCanh(String anhToanCanh) {
		ThongTinKiemDemHoGiaDinhTerms.anhToanCanh = anhToanCanh;
	}
	public static String getAnhTrongNhaTieu() {
		return anhTrongNhaTieu;
	}
	public static void setAnhTrongNhaTieu(String anhTrongNhaTieu) {
		ThongTinKiemDemHoGiaDinhTerms.anhTrongNhaTieu = anhTrongNhaTieu;
	}
	public static int getNguonVon() {
		return nguonVon;
	}
	public static void setNguonVon(int nguonVon) {
		ThongTinKiemDemHoGiaDinhTerms.nguonVon = nguonVon;
	}
	public static String getChiTietVonVay() {
		return chiTietVonVay;
	}
	public static void setChiTietVonVay(String chiTietVonVay) {
		ThongTinKiemDemHoGiaDinhTerms.chiTietVonVay = chiTietVonVay;
	}
	public static int getDuocCaiTao() {
		return duocCaiTao;
	}
	public static void setDuocCaiTao(int duocCaiTao) {
		ThongTinKiemDemHoGiaDinhTerms.duocCaiTao = duocCaiTao;
	}
	public static String getLoaiNhaTieuCu() {
		return loaiNhaTieuCu;
	}
	public static void setLoaiNhaTieuCu(String loaiNhaTieuCu) {
		ThongTinKiemDemHoGiaDinhTerms.loaiNhaTieuCu = loaiNhaTieuCu;
	}
	public static String getAnhBeChua() {
		return anhBeChua;
	}
	public static void setAnhBeChua(String anhBeChua) {
		ThongTinKiemDemHoGiaDinhTerms.anhBeChua = anhBeChua;
	}
	public static int getVeSinhSachSe() {
		return veSinhSachSe;
	}
	public static void setVeSinhSachSe(int veSinhSachSe) {
		ThongTinKiemDemHoGiaDinhTerms.veSinhSachSe = veSinhSachSe;
	}
	public static int getDeLamVeSinh() {
		return deLamVeSinh;
	}
	public static void setDeLamVeSinh(int deLamVeSinh) {
		ThongTinKiemDemHoGiaDinhTerms.deLamVeSinh = deLamVeSinh;
	}
	public static int getMuiVeSinh() {
		return muiVeSinh;
	}
	public static void setMuiVeSinh(int muiVeSinh) {
		ThongTinKiemDemHoGiaDinhTerms.muiVeSinh = muiVeSinh;
	}
	public static int getPhiaTrenKinDao() {
		return phiaTrenKinDao;
	}
	public static void setPhiaTrenKinDao(int phiaTrenKinDao) {
		ThongTinKiemDemHoGiaDinhTerms.phiaTrenKinDao = phiaTrenKinDao;
	}
	public static int getDuCheMuaGio() {
		return duCheMuaGio;
	}
	public static void setDuCheMuaGio(int duCheMuaGio) {
		ThongTinKiemDemHoGiaDinhTerms.duCheMuaGio = duCheMuaGio;
	}
	public static int getSanCaoTrenToiThieu() {
		return sanCaoTrenToiThieu;
	}
	public static void setSanCaoTrenToiThieu(int sanCaoTrenToiThieu) {
		ThongTinKiemDemHoGiaDinhTerms.sanCaoTrenToiThieu = sanCaoTrenToiThieu;
	}
	public static int getNapBeConTot() {
		return napBeConTot;
	}
	public static void setNapBeConTot(int napBeConTot) {
		ThongTinKiemDemHoGiaDinhTerms.napBeConTot = napBeConTot;
	}
	public static int getCuaPhanBitKin() {
		return cuaPhanBitKin;
	}
	public static void setCuaPhanBitKin(int cuaPhanBitKin) {
		ThongTinKiemDemHoGiaDinhTerms.cuaPhanBitKin = cuaPhanBitKin;
	}
	public static int getTranRaNgoai() {
		return tranRaNgoai;
	}
	public static void setTranRaNgoai(int tranRaNgoai) {
		ThongTinKiemDemHoGiaDinhTerms.tranRaNgoai = tranRaNgoai;
	}
	public static int getNuocThaiDiDau() {
		return nuocThaiDiDau;
	}
	public static void setNuocThaiDiDau(int nuocThaiDiDau) {
		ThongTinKiemDemHoGiaDinhTerms.nuocThaiDiDau = nuocThaiDiDau;
	}
	public static int getKhoangCachNguonNuoc() {
		return khoangCachNguonNuoc;
	}
	public static void setKhoangCachNguonNuoc(int khoangCachNguonNuoc) {
		ThongTinKiemDemHoGiaDinhTerms.khoangCachNguonNuoc = khoangCachNguonNuoc;
	}
	public static int getNgapKhiMuaLon() {
		return ngapKhiMuaLon;
	}
	public static void setNgapKhiMuaLon(int ngapKhiMuaLon) {
		ThongTinKiemDemHoGiaDinhTerms.ngapKhiMuaLon = ngapKhiMuaLon;
	}
	public static String getGhiChu() {
		return ghiChu;
	}
	public static void setGhiChu(String ghiChu) {
		ThongTinKiemDemHoGiaDinhTerms.ghiChu = ghiChu;
	}
	public static int getDaKetThucDieuTra() {
		return daKetThucDieuTra;
	}
	public static void setDaKetThucDieuTra(int daKetThucDieuTra) {
		ThongTinKiemDemHoGiaDinhTerms.daKetThucDieuTra = daKetThucDieuTra;
	}
	public static String getLyDoKhongHoanThanh() {
		return lyDoKhongHoanThanh;
	}
	public static void setLyDoKhongHoanThanh(String lyDoKhongHoanThanh) {
		ThongTinKiemDemHoGiaDinhTerms.lyDoKhongHoanThanh = lyDoKhongHoanThanh;
	}
	public static String getImei() {
		return imei;
	}
	public static void setImei(String imei) {
		ThongTinKiemDemHoGiaDinhTerms.imei = imei;
	}
	public static String getTaiKhoan() {
		return taiKhoan;
	}
	public static void setTaiKhoan(String taiKhoan) {
		ThongTinKiemDemHoGiaDinhTerms.taiKhoan = taiKhoan;
	}
	public static int getDanhGiaKiemDem() {
		return danhGiaKiemDem;
	}
	public static void setDanhGiaKiemDem(int danhGiaKiemDem) {
		ThongTinKiemDemHoGiaDinhTerms.danhGiaKiemDem = danhGiaKiemDem;
	}
	public static String getSavePoint() {
		return savePoint;
	}
	public static void setSavePoint(String savePoint) {
		ThongTinKiemDemHoGiaDinhTerms.savePoint = savePoint;
	}
	public static int getSoNguoiTrongHo() {
		return soNguoiTrongHo;
	}
	public static void setSoNguoiTrongHo(int soNguoiTrongHo) {
		ThongTinKiemDemHoGiaDinhTerms.soNguoiTrongHo = soNguoiTrongHo;
	}
	public static int getThangXayDung() {
		return thangXayDung;
	}
	public static void setThangXayDung(int thangXayDung) {
		ThongTinKiemDemHoGiaDinhTerms.thangXayDung = thangXayDung;
	}
	public static int getNamXayDung() {
		return namXayDung;
	}
	public static void setNamXayDung(int namXayDung) {
		ThongTinKiemDemHoGiaDinhTerms.namXayDung = namXayDung;
	}
	public static String getLoaiNguonNuoc() {
		return loaiNguonNuoc;
	}
	public static void setLoaiNguonNuoc(String loaiNguonNuoc) {
		ThongTinKiemDemHoGiaDinhTerms.loaiNguonNuoc = loaiNguonNuoc;
	}
}
