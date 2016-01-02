package vn.dtt.sol.ns.reporting;

import java.util.Date;


public class DauNoiNuocImportModel {

	//dau noi nuoc
	private long id;
	private String stt;
	private String tinh;
	private String maTinh;
	private String tenHeThongCapNuoc;
	private long tenHeThongCapNuocId;
	private String huyen;
	private String maHuyen;
	private String xa;
	private String maXa;
	private String thon;
	private String tenChuHoCoQuan;
	private String soNguoiTrongHo;
	private String ngayDauNoi;
	private Date ngayDauNoiDate;
	private String soSeRy;
	public DauNoiNuocImportModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DauNoiNuocImportModel(long id, String stt, String tinh,
			String maTinh, String tenHeThongCapNuoc, long tenHeThongCapNuocId,
			String huyen, String maHuyen, String xa, String maXa, String thon,
			String tenChuHoCoQuan, String soNguoiTrongHo, String ngayDauNoi,
			Date ngayDauNoiDate, String soSeRy) {
		super();
		this.id = id;
		this.stt = stt;
		this.tinh = tinh;
		this.maTinh = maTinh;
		this.tenHeThongCapNuoc = tenHeThongCapNuoc;
		this.tenHeThongCapNuocId = tenHeThongCapNuocId;
		this.huyen = huyen;
		this.maHuyen = maHuyen;
		this.xa = xa;
		this.maXa = maXa;
		this.thon = thon;
		this.tenChuHoCoQuan = tenChuHoCoQuan;
		this.soNguoiTrongHo = soNguoiTrongHo;
		this.ngayDauNoi = ngayDauNoi;
		this.ngayDauNoiDate = ngayDauNoiDate;
		this.soSeRy = soSeRy;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStt() {
		return stt;
	}
	public void setStt(String stt) {
		this.stt = stt;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	public String getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}
	public String getTenHeThongCapNuoc() {
		return tenHeThongCapNuoc;
	}
	public void setTenHeThongCapNuoc(String tenHeThongCapNuoc) {
		this.tenHeThongCapNuoc = tenHeThongCapNuoc;
	}
	public long getTenHeThongCapNuocId() {
		return tenHeThongCapNuocId;
	}
	public void setTenHeThongCapNuocId(long tenHeThongCapNuocId) {
		this.tenHeThongCapNuocId = tenHeThongCapNuocId;
	}
	public String getHuyen() {
		return huyen;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public String getMaHuyen() {
		return maHuyen;
	}
	public void setMaHuyen(String maHuyen) {
		this.maHuyen = maHuyen;
	}
	public String getXa() {
		return xa;
	}
	public void setXa(String xa) {
		this.xa = xa;
	}
	public String getMaXa() {
		return maXa;
	}
	public void setMaXa(String maXa) {
		this.maXa = maXa;
	}
	public String getThon() {
		return thon;
	}
	public void setThon(String thon) {
		this.thon = thon;
	}
	public String getTenChuHoCoQuan() {
		return tenChuHoCoQuan;
	}
	public void setTenChuHoCoQuan(String tenChuHoCoQuan) {
		this.tenChuHoCoQuan = tenChuHoCoQuan;
	}
	public String getSoNguoiTrongHo() {
		return soNguoiTrongHo;
	}
	public void setSoNguoiTrongHo(String soNguoiTrongHo) {
		this.soNguoiTrongHo = soNguoiTrongHo;
	}
	public String getNgayDauNoi() {
		return ngayDauNoi;
	}
	public void setNgayDauNoi(String ngayDauNoi) {
		this.ngayDauNoi = ngayDauNoi;
	}
	public Date getNgayDauNoiDate() {
		return ngayDauNoiDate;
	}
	public void setNgayDauNoiDate(Date ngayDauNoiDate) {
		this.ngayDauNoiDate = ngayDauNoiDate;
	}
	public String getSoSeRy() {
		return soSeRy;
	}
	public void setSoSeRy(String soSeRy) {
		this.soSeRy = soSeRy;
	}
	
	
}
