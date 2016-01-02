package vn.dtt.sol.ns.vesinhmoitruong.terms;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class VeSinhGiaDinhTerms {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public static final String TYPE_IMPORT = "typeImport";
	public static final String FILE = "uploadFileXLS";
	public static final String ID = "id";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String MA_XA = "maXa";
	public static final String THON_XOM = "thonXom";
	public static final String TEN_CHU_HO = "tenChuHo";
	public static final String GIOI_TINH_CHU_HO = "gioiTinhChuHo";
	public static final String TRANG_THAI = "trangThai";
	public static final String NAM_BAO_CAO = "namBaoCao";
	public static final String GHI_CHU = "ghiChu";
	public static final String NGAY_TAO = "ngayTao";
	public static final String ID_NGUOI_TAO = "idNguoiTao";
	public static final String SO_NGUOI_TRONG_HO = "soNguoiTrongHo";
	public static final String THANH_PHAN_HO_GD= "thanhPhanHoGD";
	public static final String KINH_DO = "kinhDo";
	public static final String VI_DO = "viDo";
	public static final String CO_NHA_TIEU= "coNhaTieu";
	public static final String NHA_TIEU_HVS = "nhaTieuHVS";
	public static final String LOAI_NHA_TIEU= "loaiNhaTieu";
	public static final String DUOC_CAI_TAO = "duocCaiTao";
	public static final String NAM_XAY_DUNG = "namXayDung";
	public static final String THANG_XAY_DUNG = "thangXayDung";
	public static final String NGUON_VON = "nguonVon";
	public static final String NGAY_KIEM_DEM = "ngayKiemDem";
	public static final String NGAY_DANH_GIA = "ngayDanhGia";
	public static final String ID_NGUOI_DANH_GIA = "idNguoiDanhGia";
	public static final String HIEN_TRANG_TRUOC_KHI_XAY = "hienTrangTruocKhiXay";
	public static final String MAU_NGAU_NHIEN = "mauNgauNhien";
	
	
	public VeSinhGiaDinhTerms(ActionRequest actionRequest )
	{
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		fileImport=request.getFile(FILE);
		id=ParamUtil.getInteger(request, ID);
		maTinh=ParamUtil.getString(request, MA_TINH);
		maHuyen=ParamUtil.getString(request, MA_HUYEN);
		maXa=ParamUtil.getString(request, MA_XA);
		thonXom= ParamUtil.getString(request, THON_XOM);
		tenChuHo=ParamUtil.getString(request, TEN_CHU_HO);
		gioiTinhChuHo=ParamUtil.getInteger(request, GIOI_TINH_CHU_HO);
		trangThai= ParamUtil.getInteger(request, TRANG_THAI);
		mauNgauNhien=ParamUtil.getInteger(request, MAU_NGAU_NHIEN);
		namBaoCao=ParamUtil.getInteger(request, NAM_BAO_CAO);
		ghiChu=ParamUtil.getString(request, GHI_CHU);
		ngayTao=ParamUtil.getDate(request, NGAY_TAO, sdf);
		idNguoiTao=ParamUtil.getInteger(request, ID_NGUOI_TAO);
		thanhPhanHoGD=ParamUtil.getInteger(request, THANH_PHAN_HO_GD);
		kinhDo= ParamUtil.getString(request, KINH_DO);
		viDo= ParamUtil.getString(request,VI_DO);
		coNhaTieu= ParamUtil.getInteger(request, CO_NHA_TIEU);
		nhaTieuHVS= ParamUtil.getInteger(request, NHA_TIEU_HVS);
		loaiNhaTieu=ParamUtil.getString(request, LOAI_NHA_TIEU);
		duocCaiTao= ParamUtil.getInteger(request, DUOC_CAI_TAO);
		thangXayDung = ParamUtil.getInteger(request, THANG_XAY_DUNG);
		namXayDung=ParamUtil.getInteger(request, NAM_XAY_DUNG);
		nguonVon= ParamUtil.getInteger(request, NGUON_VON);
		ngayKiemDem= ParamUtil.getDate(request, NGAY_KIEM_DEM, sdf);
		ngayDanhGia=ParamUtil.getDate(request, NGAY_DANH_GIA, sdf);
		idNguoiDanhGia=ParamUtil.getInteger(request, ID_NGUOI_DANH_GIA);
		soNguoiTrongHo = ParamUtil.getInteger(request, SO_NGUOI_TRONG_HO);
		hienTrangTruocKhiXay = ParamUtil.getInteger(request, HIEN_TRANG_TRUOC_KHI_XAY);
		if(hienTrangTruocKhiXay == 1){
			coNhaTieu = 2;
			nhaTieuHVS = 2;
		}else if(hienTrangTruocKhiXay == 2){
			coNhaTieu = 1;
			nhaTieuHVS = 2;
		}else if(hienTrangTruocKhiXay == 3){
			coNhaTieu = 1;
			nhaTieuHVS = 1;
		}
		typeImport = ParamUtil.getInteger(request, TYPE_IMPORT);
	}
	
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
	public int getThanhPhanHoGD() {
		return thanhPhanHoGD;
	}
	public void setThanhPhanHoGD(int thanhPhanHoGD) {
		this.thanhPhanHoGD = thanhPhanHoGD;
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
	public int getCoNhaTieu() {
		return coNhaTieu;
	}
	public void setCoNhaTieu(int coNhaTieu) {
		this.coNhaTieu = coNhaTieu;
	}
	public int getNhaTieuHVS() {
		return nhaTieuHVS;
	}
	public void setNhaTieuHVS(int nhaTieuHVS) {
		this.nhaTieuHVS = nhaTieuHVS;
	}
	public String getLoaiNhaTieu() {
		return loaiNhaTieu;
	}
	public void setLoaiNhaTieu(String loaiNhaTieu) {
		this.loaiNhaTieu = loaiNhaTieu;
	}
	public int getDuocCaiTao() {
		return duocCaiTao;
	}
	public void setDuocCaiTao(int duocCaiTao) {
		this.duocCaiTao = duocCaiTao;
	}
	
	public int getNguonVon() {
		return nguonVon;
	}
	public void setNguonVon(int nguonVon) {
		this.nguonVon = nguonVon;
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

	public int getSoNguoiTrongHo() {
		return soNguoiTrongHo;
	}

	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		this.soNguoiTrongHo = soNguoiTrongHo;
	}
	public int getHienTrangTruocKhiXay() {
		return hienTrangTruocKhiXay;
	}

	public void setHienTrangTruocKhiXay(int hienTrangTruocKhiXay) {
		this.hienTrangTruocKhiXay = hienTrangTruocKhiXay;
	}
	private int mauNgauNhien;
	private int typeImport;
	private File fileImport;
	private int hienTrangTruocKhiXay;
	private int id;
	private  String maTinh;
	private String maHuyen;
	private String maXa;
	private String thonXom;
	private String tenChuHo;
	private int gioiTinhChuHo;
	private int trangThai;
	private int namBaoCao;
	private String ghiChu;
	private Date ngayTao;
	private int idNguoiTao;
	private int soNguoiTrongHo;
	private int thanhPhanHoGD;
	private String kinhDo;
	private String viDo;
	private int coNhaTieu;
	private int nhaTieuHVS;
	private String loaiNhaTieu;
	private int duocCaiTao;
	private int thangXayDung;
	private int namXayDung;
	private int nguonVon;
	private Date ngayKiemDem;
	private Date ngayDanhGia;
	private int idNguoiDanhGia;

	public int getNamXayDung() {
		return namXayDung;
	}

	public void setNamXayDung(int namXayDung) {
		this.namXayDung = namXayDung;
	}

	public int getThangXayDung() {
		return thangXayDung;
	}

	public void setThangXayDung(int thangXayDung) {
		this.thangXayDung = thangXayDung;
	}

	public File getFileImport() {
		return fileImport;
	}

	public void setFileImport(File fileImport) {
		this.fileImport = fileImport;
	}

	public int getTypeImport() {
		return typeImport;
	}

	public void setTypeImport(int typeImport) {
		this.typeImport = typeImport;
	}

	public int getMauNgauNhien() {
		return mauNgauNhien;
	}

	public void setMauNgauNhien(int mauNgauNhien) {
		this.mauNgauNhien = mauNgauNhien;
	}


}
