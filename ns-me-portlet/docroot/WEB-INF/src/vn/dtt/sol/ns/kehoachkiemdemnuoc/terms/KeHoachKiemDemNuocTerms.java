package vn.dtt.sol.ns.kehoachkiemdemnuoc.terms;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

public class KeHoachKiemDemNuocTerms {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public static String ID="id";
	public static String NAM="nam";
	public static String TRAM_CAP_NUOC_ID="tramCapNuocId";
	public static String KIEM_DEM_VIEN_ID="kiemDemVienId";
	public static String NGAY_BAT_DAU="ngayBatDau";
	public static String NGAY_KET_THUC="ngayKetThuc";
	public static String MO_TA="moTa";
	public static String NGAY_TAO="ngayTao";
	public static String ID_NGUOI_TAO="idNguoiTao";
	public static String NGAY_XUAT_BAN="ngayXuatBan";
	public static String ID_NGUOI_XUAT_BAN="idNguoiXuatBan";
	public static String NGAY_DONG="ngayDong";
	public static String ID_NGUOI_DONG="idNguoiDong";
	
	public KeHoachKiemDemNuocTerms() {
		// TODO Auto-generated constructor stub
	}
	public KeHoachKiemDemNuocTerms(ActionRequest actionRequest) {
		// TODO Auto-generated constructor stub
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		id=ParamUtil.getInteger(request, ID);
		nam=ParamUtil.getInteger(request, NAM);
		tramCapNuocId=ParamUtil.getInteger(request, TRAM_CAP_NUOC_ID);
		kiemDemVienId=ParamUtil.getInteger(request, KIEM_DEM_VIEN_ID);
		ngayBatDau=ParamUtil.getDate(request, NGAY_BAT_DAU, sdf);
		ngayKetThuc=ParamUtil.getDate(request, NGAY_KET_THUC, sdf);
		moTa=ParamUtil.getString(request, MO_TA);
		ngayTao=ParamUtil.getDate(request, NGAY_TAO, sdf);
		idNguoiTao=ParamUtil.getInteger(request, ID_NGUOI_TAO);
		ngayXuatBan=ParamUtil.getDate(request, NGAY_XUAT_BAN, sdf);
		idNguoiXuatBan=ParamUtil.getInteger(request, ID_NGUOI_XUAT_BAN);
		ngayDong= ParamUtil.getDate(request, NGAY_DONG, sdf);
		idNguoiDong=ParamUtil.getInteger(request, ID_NGUOI_DONG);
		
	}
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
	public int getKiemDemVienId() {
		return kiemDemVienId;
	}
	public void setKiemDemVienId(int kiemDemVienId) {
		this.kiemDemVienId = kiemDemVienId;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
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
	public Date getNgayXuatBan() {
		return ngayXuatBan;
	}
	public void setNgayXuatBan(Date ngayXuatBan) {
		this.ngayXuatBan = ngayXuatBan;
	}
	public int getIdNguoiXuatBan() {
		return idNguoiXuatBan;
	}
	public void setIdNguoiXuatBan(int idNguoiXuatBan) {
		this.idNguoiXuatBan = idNguoiXuatBan;
	}
	public Date getNgayDong() {
		return ngayDong;
	}
	public void setNgayDong(Date ngayDong) {
		this.ngayDong = ngayDong;
	}
	public int getIdNguoiDong() {
		return idNguoiDong;
	}
	public void setIdNguoiDong(int idNguoiDong) {
		this.idNguoiDong = idNguoiDong;
	}
	
	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	private int id;
	private int nam;
	private int tramCapNuocId;
	private int kiemDemVienId;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private String moTa;
	private Date ngayTao;
	private int idNguoiTao;
	private Date ngayXuatBan;
	private int idNguoiXuatBan;
	private Date ngayDong;
	private int  idNguoiDong;
}
