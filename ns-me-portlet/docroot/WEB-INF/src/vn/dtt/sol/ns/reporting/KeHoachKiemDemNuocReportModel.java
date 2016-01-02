package vn.dtt.sol.ns.reporting;

import java.util.Date;


public class KeHoachKiemDemNuocReportModel {
	private long id;
	 private String stt;
	 private String tinhThanhPho;
	 private String quanHuyen;
	 private String tramCapNuoc;
	 private String kiemDemVien;
	 private String giamSatVien;
	 private String trangThaiKeHoach;
	 private int trangThaiChk;
	 private int userIdData;
	 private int tongDauNoi;
	 public KeHoachKiemDemNuocReportModel() {
		// TODO Auto-generated constructor stub
	}
	 
	 public KeHoachKiemDemNuocReportModel(long id, String stt,
			String tinhThanhPho, String quanHuyen, String tramCapNuoc,
			String kiemDemVien, String trangThaiKeHoach, int trangThaiChk, int userIdData, int tongDauNoi, String giamSatVien) {
		super();
		this.id = id;
		this.stt = stt;
		this.tinhThanhPho = tinhThanhPho;
		this.quanHuyen = quanHuyen;
		this.tramCapNuoc = tramCapNuoc;
		this.kiemDemVien = kiemDemVien;
		this.trangThaiKeHoach = trangThaiKeHoach;
		this.trangThaiChk = trangThaiChk;
		this.userIdData = userIdData;
		this.tongDauNoi = tongDauNoi;
		this.giamSatVien = giamSatVien;
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
	 public String getTramCapNuoc() {
	  return tramCapNuoc;
	 }
	 public void setTramCapNuoc(String tramCapNuoc) {
	  this.tramCapNuoc = tramCapNuoc;
	 }
	 public String getKiemDemVien() {
	  return kiemDemVien;
	 }
	 public void setKiemDemVien(String kiemDemVien) {
	  this.kiemDemVien = kiemDemVien;
	 }
	 public String getTrangThaiKeHoach() {
	  return trangThaiKeHoach;
	 }
	 public void setTrangThaiKeHoach(String trangThaiKeHoach) {
	  this.trangThaiKeHoach = trangThaiKeHoach;
	 }

	public int getTrangThaiChk() {
		return trangThaiChk;
	}

	public void setTrangThaiChk(int trangThaiChk) {
		this.trangThaiChk = trangThaiChk;
	}

	public long getUserIdData() {
		return userIdData;
	}

	public void setUserIdData(int userIdData) {
		this.userIdData = userIdData;
	}

	public int getTongDauNoi() {
		return tongDauNoi;
	}

	public void setTongDauNoi(int tongDauNoi) {
		this.tongDauNoi = tongDauNoi;
	}

	public String getGiamSatVien() {
		return giamSatVien;
	}

	public void setGiamSatVien(String giamSatVien) {
		this.giamSatVien = giamSatVien;
	}
	
}
