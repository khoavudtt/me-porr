package vn.dtt.sol.ns.reporting.model.kehoachvesinh;

import java.util.List;

public class KeHoachVSHGDvsCTCC {
	private String diaBanKiemDem;
	private String tenKiemDemVien;
	private String thoiGianDuKienFrom;
	private String thoiGianDuKienTo;
	private String moTa;
	// vesinh ho gia dinh
	private String tongSoGD;
	private String choKSGD;
	private String daHoanThanhGD;
	private String coNhaVS;
	private String hopVS;
	private String hopVSXayMoi;
	// vesinh ctcc
	private String tongSoCTCC;
	private String choKSCTCC;
	private String daHoanThanhCTCC;
	private String dat;
	private String koDat;
	private List<KeHoachVSDanhSach> lstKeHoachVSDanhSachHGD;
	private List<KeHoachVSDanhSach> lstKeHoachVSDanhSachCTCC;
	
	
	public String getDiaBanKiemDem() {
		return diaBanKiemDem;
	}
	public void setDiaBanKiemDem(String diaBanKiemDem) {
		this.diaBanKiemDem = diaBanKiemDem;
	}
	public String getTenKiemDemVien() {
		return tenKiemDemVien;
	}
	public void setTenKiemDemVien(String tenKiemDemVien) {
		this.tenKiemDemVien = tenKiemDemVien;
	}
	public String getThoiGianDuKienFrom() {
		return thoiGianDuKienFrom;
	}
	public void setThoiGianDuKienFrom(String thoiGianDuKienFrom) {
		this.thoiGianDuKienFrom = thoiGianDuKienFrom;
	}
	public String getThoiGianDuKienTo() {
		return thoiGianDuKienTo;
	}
	public void setThoiGianDuKienTo(String thoiGianDuKienTo) {
		this.thoiGianDuKienTo = thoiGianDuKienTo;
	}
	
	public String getCoNhaVS() {
		return coNhaVS;
	}
	public void setCoNhaVS(String coNhaVS) {
		this.coNhaVS = coNhaVS;
	}
	public String getHopVS() {
		return hopVS;
	}
	public void setHopVS(String hopVS) {
		this.hopVS = hopVS;
	}
	public String getHopVSXayMoi() {
		return hopVSXayMoi;
	}
	public void setHopVSXayMoi(String hopVSXayMoi) {
		this.hopVSXayMoi = hopVSXayMoi;
	}
	public String getDat() {
		return dat;
	}
	public void setDat(String dat) {
		this.dat = dat;
	}
	public String getKoDat() {
		return koDat;
	}
	public void setKoDat(String koDat) {
		this.koDat = koDat;
	}
	public String getTongSoGD() {
		return tongSoGD;
	}
	public void setTongSoGD(String tongSoGD) {
		this.tongSoGD = tongSoGD;
	}
	public String getChoKSGD() {
		return choKSGD;
	}
	public void setChoKSGD(String choKSGD) {
		this.choKSGD = choKSGD;
	}
	public String getDaHoanThanhGD() {
		return daHoanThanhGD;
	}
	public void setDaHoanThanhGD(String daHoanThanhGD) {
		this.daHoanThanhGD = daHoanThanhGD;
	}
	public String getTongSoCTCC() {
		return tongSoCTCC;
	}
	public void setTongSoCTCC(String tongSoCTCC) {
		this.tongSoCTCC = tongSoCTCC;
	}
	public String getChoKSCTCC() {
		return choKSCTCC;
	}
	public void setChoKSCTCC(String choKSCTCC) {
		this.choKSCTCC = choKSCTCC;
	}
	public String getDaHoanThanhCTCC() {
		return daHoanThanhCTCC;
	}
	public void setDaHoanThanhCTCC(String daHoanThanhCTCC) {
		this.daHoanThanhCTCC = daHoanThanhCTCC;
	}
	public List<KeHoachVSDanhSach> getLstKeHoachVSDanhSachHGD() {
		return lstKeHoachVSDanhSachHGD;
	}
	public void setLstKeHoachVSDanhSachHGD(
			List<KeHoachVSDanhSach> lstKeHoachVSDanhSachHGD) {
		this.lstKeHoachVSDanhSachHGD = lstKeHoachVSDanhSachHGD;
	}
	public List<KeHoachVSDanhSach> getLstKeHoachVSDanhSachCTCC() {
		return lstKeHoachVSDanhSachCTCC;
	}
	public void setLstKeHoachVSDanhSachCTCC(
			List<KeHoachVSDanhSach> lstKeHoachVSDanhSachCTCC) {
		this.lstKeHoachVSDanhSachCTCC = lstKeHoachVSDanhSachCTCC;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
}
