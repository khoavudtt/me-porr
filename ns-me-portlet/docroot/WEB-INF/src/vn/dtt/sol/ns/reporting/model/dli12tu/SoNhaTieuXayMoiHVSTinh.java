package vn.dtt.sol.ns.reporting.model.dli12tu;

import java.util.List;

public class SoNhaTieuXayMoiHVSTinh {
	private String tenTinh;
	private int totalDanSoVSTX;
	private List<SoNhaTieuXayMoiHVSTinhDanhSach> lstSoNhaTieuXayMoiHVSTinhDanhSachVSTX;
	private List<SoNhaTieuXayMoiHVSTinhDanhSach> lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac;
	private int totalDanSoXaKhac;
	private int totalDanSoTatCaCacXa;
	
	public String getTenTinh() {
		return tenTinh;
	}
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	
	public int getTotalDanSoVSTX() {
		return totalDanSoVSTX;
	}
	public void setTotalDanSoVSTX(int totalDanSoVSTX) {
		this.totalDanSoVSTX = totalDanSoVSTX;
	}
	public List<SoNhaTieuXayMoiHVSTinhDanhSach> getLstSoNhaTieuXayMoiHVSTinhDanhSachVSTX() {
		return lstSoNhaTieuXayMoiHVSTinhDanhSachVSTX;
	}
	public void setLstSoNhaTieuXayMoiHVSTinhDanhSachVSTX(
			List<SoNhaTieuXayMoiHVSTinhDanhSach> lstSoNhaTieuXayMoiHVSTinhDanhSachVSTX) {
		this.lstSoNhaTieuXayMoiHVSTinhDanhSachVSTX = lstSoNhaTieuXayMoiHVSTinhDanhSachVSTX;
	}
	public List<SoNhaTieuXayMoiHVSTinhDanhSach> getLstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac() {
		return lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac;
	}
	public void setLstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac(
			List<SoNhaTieuXayMoiHVSTinhDanhSach> lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac) {
		this.lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac = lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac;
	}
	public int getTotalDanSoXaKhac() {
		return totalDanSoXaKhac;
	}
	public void setTotalDanSoXaKhac(int totalDanSoXaKhac) {
		this.totalDanSoXaKhac = totalDanSoXaKhac;
	}
	public int getTotalDanSoTatCaCacXa() {
		return totalDanSoTatCaCacXa;
	}
	public void setTotalDanSoTatCaCacXa(int totalDanSoTatCaCacXa) {
		this.totalDanSoTatCaCacXa = totalDanSoTatCaCacXa;
	}
	
}
