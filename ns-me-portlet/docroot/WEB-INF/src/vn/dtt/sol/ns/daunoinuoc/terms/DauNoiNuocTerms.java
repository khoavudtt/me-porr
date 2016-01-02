package vn.dtt.sol.ns.daunoinuoc.terms;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class DauNoiNuocTerms {

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	public static final String FILE = "uploadFileXLS";
	public static final String ID = "id";
	public static final String TRAM_CAP_NUOC_ID = "tramCapNuocId";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String MA_XA = "maXa";
	public static final String THON_XOM = "thonXom";
	public static final String TEN_CHU_HO = "tenChuHo";
	public static final String GIOI_TINH = "gioiTinh";
	public static final String NGAY_DAU_NOI_HOP_DONG = "ngayDauNoiHopDong";
	public static final String TRANG_THAI = "trangThai";
	public static final String NAM_BAO_CAO = "namBaoCao";
	public static final String GHI_CHU = "ghiChu";
	public static final String ID_NGUOI_TAO = "idNguoiTao";
	public static final String SO_NGUOI_TRONG_HO = "soNguoiTrongHo";
	public static final String THANH_PHAN_HO_GIA_DINH = "thanhPhanHoGiaDinh";
	public static final String TONG_DOANH_THU = "tongDoanhThu";
	public static final String KINH_DO = "kinhDo";
	public static final String VI_DO = "viDo";
	public static final String NGAY_DAU_NOI_THUC_TE = "ngayDauNoiThucTe";
	public static final String SO_SERY_DONG_HO = "soSeryDongHo";
	public static final String DANH_GIA_NUOC_HVS = "danhGiaNuocHVS";
	public static final String NGAY_KIEM_DEM = "ngayKiemDem";
	public static final String NGAY_DANH_GIA = "ngayDanhGia";
	public static final String ID_NGUOI_DANH_GIA = "idNguoiDanhGia";
	
	public DauNoiNuocTerms() {
		// TODO Auto-generated constructor stub
	}
	public DauNoiNuocTerms(ActionRequest actionRequest) {
		// TODO Auto-generated constructor stub
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		fileImport=request.getFile(FILE);
		id=ParamUtil.getInteger(request, ID);
		tramCapNuocId=ParamUtil.getInteger(request, TRAM_CAP_NUOC_ID);
		maTinh=ParamUtil.getString(request, MA_TINH);
		maHuyen=ParamUtil.getString(request, MA_HUYEN);
		maXa=ParamUtil.getString(request, MA_XA);
		thonXom=ParamUtil.getString(request, THON_XOM);
		tenChuHo=ParamUtil.getString(request, TEN_CHU_HO);
		gioiTinh=ParamUtil.getInteger(request, GIOI_TINH);
		ngayDauNoiHopDong=ParamUtil.getDate(request, NGAY_DAU_NOI_HOP_DONG, sdf);
		trangThai=ParamUtil.getInteger(request, TRANG_THAI);
		namBaoCao=ParamUtil.getInteger(request, NAM_BAO_CAO);
		ghiChu=ParamUtil.getString(request, GHI_CHU);
		idNguoiTao=ParamUtil.getInteger(request, ID_NGUOI_TAO);
		soNguoiTrongHo=ParamUtil.getInteger(request, SO_NGUOI_TRONG_HO);
		thanhPhanHoGiaDinh=ParamUtil.getInteger(request, THANH_PHAN_HO_GIA_DINH);
		tongDoanhThu=ParamUtil.getInteger(request, TONG_DOANH_THU);
		kinhDo=ParamUtil.getString(request, KINH_DO);
		viDo=ParamUtil.getString(request, VI_DO);
		ngayDauNoiThucTe=ParamUtil.getDate(request, NGAY_DAU_NOI_THUC_TE, sdf);
		soSeryDongHo=ParamUtil.getString(request, SO_SERY_DONG_HO);
		danhGiaNuocHVS=ParamUtil.getString(request, DANH_GIA_NUOC_HVS);
		ngayKiemDem=ParamUtil.getDate(request, NGAY_KIEM_DEM, sdf);
		ngayDanhGia=ParamUtil.getDate(request, NGAY_DANH_GIA, sdf);
		idNguoiDanhGia=ParamUtil.getInteger(request, ID_NGUOI_DANH_GIA);
		cuString = ParamUtil.getString(request, "currentURL");
		isRefresh = ParamUtil.getString(request, "isRefresh");
		
	}
	
	private String cuString;
	private String isRefresh;
	private File fileImport;
	private int id;
	private int tramCapNuocId;
	private String maTinh;
	private String maHuyen;
	private String maXa;
	private String thonXom;
	private String tenChuHo;
	private int gioiTinh;
	private Date ngayDauNoiHopDong;
	private int trangThai;
	private int namBaoCao;
	private String ghiChu;
	private int idNguoiTao;
	private int soNguoiTrongHo;
	private int thanhPhanHoGiaDinh;
	private int tongDoanhThu;
	private String kinhDo;
	private String viDo;
	private Date ngayDauNoiThucTe;
	private String soSeryDongHo;
	private String danhGiaNuocHVS;
	private Date ngayKiemDem;
	private Date ngayDanhGia;
	private int idNguoiDanhGia;
	
	private static Log _log = LogFactoryUtil.getLog(DauNoiNuocTerms.class);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgayDauNoiHopDong() {
		return ngayDauNoiHopDong;
	}

	public void setNgayDauNoiHopDong(Date ngayDauNoiHopDong) {
		this.ngayDauNoiHopDong = ngayDauNoiHopDong;
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

	public int getIdNguoiTao() {
		return idNguoiTao;
	}

	public void setIdNguoiTao(int idNguoiTao) {
		this.idNguoiTao = idNguoiTao;
	}

	public int getSoNguoiTrongHo() {
		return soNguoiTrongHo;
	}

	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		this.soNguoiTrongHo = soNguoiTrongHo;
	}

	public int getThanhPhanHoGiaDinh() {
		return thanhPhanHoGiaDinh;
	}

	public void setThanhPhanHoGiaDinh(int thanhPhanHoGiaDinh) {
		this.thanhPhanHoGiaDinh = thanhPhanHoGiaDinh;
	}

	public int getTongDoanhThu() {
		return tongDoanhThu;
	}

	public void setTongDoanhThu(int tongDoanhThu) {
		this.tongDoanhThu = tongDoanhThu;
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

	public Date getNgayDauNoiThucTe() {
		return ngayDauNoiThucTe;
	}

	public void setNgayDauNoiThucTe(Date ngayDauNoiThucTe) {
		this.ngayDauNoiThucTe = ngayDauNoiThucTe;
	}

	public String getSoSeryDongHo() {
		return soSeryDongHo;
	}

	public void setSoSeryDongHo(String soSeryDongHo) {
		this.soSeryDongHo = soSeryDongHo;
	}

	public String getDanhGiaNuocHVS() {
		return danhGiaNuocHVS;
	}

	public void setDanhGiaNuocHVS(String danhGiaNuocHVS) {
		this.danhGiaNuocHVS = danhGiaNuocHVS;
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
	public File getFileImport() {
		return fileImport;
	}
	public void setFileImport(File fileImport) {
		this.fileImport = fileImport;
	}
	public String getCuString() {
		return cuString;
	}
	public void setCuString(String cuString) {
		this.cuString = cuString;
	}
	public String getIsRefresh() {
		return isRefresh;
	}
	public void setIsRefresh(String isRefresh) {
		this.isRefresh = isRefresh;
	}
}
