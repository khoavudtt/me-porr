package vn.dtt.sol.ns.vesinhmoitruong.terms;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class KeHoachKiemDemVeSinhTerms {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public static final String ID = "id";
	public static final String NAM = "nam";
	public static final String MA_TINH = "maTinh";
	public static final String MA_HUYEN = "maHuyen";
	public static final String KIEM_DEM_VIEN_ID = "kiemDemVienID";
	public static final String NGAY_BAT_DAU = "ngayBatDau";
	public static final String NGAY_KET_THUC = "ngayKetThuc";
	public static final String MO_TA = "moTa";
	public static final String NGAY_TAO = "ngayTao";
	public static final String ID_NGUOI_TAO = "idNguoiTao";
	public static final String NGAY_XUAT_BAN= "ngayXuatBan";
	public static final String ID_NGUOI_XUAT_BAN = "idNguoiXuatBan";
	public static final String TABLE_ID = "tableId";
	public static final String NGAY_DONG = "ngayDong";
	public static final String ID_NGUOI_DONG = "idNguoiDong";
	public static final String LAST_SAVE_POINT= "lastSavePoint";
	public KeHoachKiemDemVeSinhTerms(ActionRequest actionRequest )
	{
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(actionRequest);
		id=ParamUtil.getInteger(request, ID);
		nam=ParamUtil.getInteger(request, NAM);
		maTinh=ParamUtil.getString(request, MA_TINH);
		maHuyen=ParamUtil.getString(request, MA_HUYEN);
		kiemDemVienId=ParamUtil.getInteger(request, KIEM_DEM_VIEN_ID);
		ngayBatDau=ParamUtil.getDate(request, NGAY_BAT_DAU, sdf);
		ngayKetThuc=ParamUtil.getDate(request, NGAY_KET_THUC, sdf);
		moTa=ParamUtil.getString(request, MO_TA);
		ngayTao=ParamUtil.getDate(request, NGAY_TAO, sdf);
		idNguoiTao=ParamUtil.getInteger(request, ID_NGUOI_TAO);
		ngayXuatBan=ParamUtil.getDate(request, NGAY_XUAT_BAN, sdf);
		idNguoiXuatBan=ParamUtil.getInteger(request, ID_NGUOI_XUAT_BAN);
		tableId=ParamUtil.getString(request, TABLE_ID);
		ngayDong=ParamUtil.getDate(request, NGAY_DONG, sdf);
		idNguoiDong=ParamUtil.getInteger(request, ID_NGUOI_DONG);
		lastSavePoint=ParamUtil.getDate(request, LAST_SAVE_POINT, sdf);
	}
	
	private int id;
	private int nam;
	private  String maTinh;
	private String maHuyen;
	private int kiemDemVienId;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private String moTa;
	private Date ngayTao;
	private int idNguoiTao;
	private Date ngayXuatBan;
	private int idNguoiXuatBan;
	private String tableId;
	private Date ngayDong;
	private int idNguoiDong;
	private Date lastSavePoint;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
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
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
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
	public Date getLastSavePoint() {
		return lastSavePoint;
	}
	public void setLastSavePoint(Date lastSavePoint) {
		this.lastSavePoint = lastSavePoint;
	}
}
