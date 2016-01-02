package vn.dtt.sol.ns.reporting;

import java.util.Date;


public class DataItemReportModel {
	private long id;
	 private String stt;
	 private String tinhThanhPho;
	 private String quanHuyen;
	 private String phuongXa;
	 private String tongDauNoi;
	 public DataItemReportModel() {
		// TODO Auto-generated constructor stub
	}
	 
	public DataItemReportModel(long id, String stt, String tinhThanhPho,
			String quanHuyen, String phuongXa, String tongDauNoi) {
		super();
		this.id = id;
		this.stt = stt;
		this.tinhThanhPho = tinhThanhPho;
		this.quanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.tongDauNoi = tongDauNoi;
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
	public String getTinhThanhPho() {
		return tinhThanhPho;
	}
	public void setTinhThanhPho(String tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}
	public String getQuanHuyen() {
		return quanHuyen;
	}
	public void setQuanHuyen(String quanHuyen) {
		this.quanHuyen = quanHuyen;
	}
	public String getPhuongXa() {
		return phuongXa;
	}
	public void setPhuongXa(String phuongXa) {
		this.phuongXa = phuongXa;
	}
	public String getTongDauNoi() {
		return tongDauNoi;
	}
	public void setTongDauNoi(String tongDauNoi) {
		this.tongDauNoi = tongDauNoi;
	}
	 
}
