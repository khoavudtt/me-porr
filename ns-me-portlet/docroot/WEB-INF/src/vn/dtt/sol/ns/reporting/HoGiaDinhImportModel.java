package vn.dtt.sol.ns.reporting;

import java.util.Date;

public class HoGiaDinhImportModel {
	private long id;
	private String stt;
	private String maTinh;
	private String maHuyen;
	private String maXa;
	private String thonXom;
	private String tenChuHo;
	private String hoNgheo;
	private int khongCoNhaTieu;
	private int coNhaTieuKhongHVS;
	private String loaiNhaTieu;
	private int nguonVon;
	private int thangXayDung;
	private int namXayDung;
	private String ghiChu;
	private Date dateToGet;
	private String dateToGetStr;
	private int soNguoi;
	public int getSoNguoi() {
		return soNguoi;
	}

	public void setSoNguoi(int soNguoi) {
		this.soNguoi = soNguoi;
	}

	public HoGiaDinhImportModel() {
		// TODO Auto-generated constructor stub
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
	public String getHoNgheo() {
		return hoNgheo;
	}
	public void setHoNgheo(String hoNgheo) {
		this.hoNgheo = hoNgheo;
	}
	public int getKhongCoNhaTieu() {
		return khongCoNhaTieu;
	}
	public void setKhongCoNhaTieu(int khongCoNhaTieu) {
		this.khongCoNhaTieu = khongCoNhaTieu;
	}
	public int getCoNhaTieuKhongHVS() {
		return coNhaTieuKhongHVS;
	}
	public void setCoNhaTieuKhongHVS(int coNhaTieuKhongHVS) {
		this.coNhaTieuKhongHVS = coNhaTieuKhongHVS;
	}
	public String getLoaiNhaTieu() {
		return loaiNhaTieu;
	}
	public void setLoaiNhaTieu(String loaiNhaTieu) {
		this.loaiNhaTieu = loaiNhaTieu;
	}
	public int getNguonVon() {
		return nguonVon;
	}
	public void setNguonVon(int nguonVon) {
		this.nguonVon = nguonVon;
	}
	public int getThangXayDung() {
		return thangXayDung;
	}
	public void setThangXayDung(int thangXayDung) {
		this.thangXayDung = thangXayDung;
	}
	public int getNamXayDung() {
		return namXayDung;
	}
	public void setNamXayDung(int namXayDung) {
		this.namXayDung = namXayDung;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}

	public Date getDateToGet() {
		return dateToGet;
	}

	public void setDateToGet(Date dateToGet) {
		this.dateToGet = dateToGet;
	}

	public String getDateToGetStr() {
		return dateToGetStr;
	}

	public void setDateToGetStr(String dateToGetStr) {
		this.dateToGetStr = dateToGetStr;
	}
}
