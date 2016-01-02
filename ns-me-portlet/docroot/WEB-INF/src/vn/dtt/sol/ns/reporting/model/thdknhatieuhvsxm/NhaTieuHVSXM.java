package vn.dtt.sol.ns.reporting.model.thdknhatieuhvsxm;

import java.util.List;

public class NhaTieuHVSXM {
	private String nam;
	private String tenTinh;	
	private String baoCaoSo;
	private String baoCaoNgayThangNam;
	private String nguoiLap;
	private String nguoiDuyet;
	
	private long totalDanSo;
	private long totalSoNhaTieuHVSDuKien;
	
	private long totalDanSoVSTX;
	private long totalSoNhaTieuHVSDuKienVSTX;
	
	private long totalDanSoXaKhac;
	private long totalSoNhaTieuHVSDuKienXaKhac;
	
	private List<NhaTieuHVSXMDanhSach> lstNhaTieuHVSXMDanhSachVSTX;
	private List<NhaTieuHVSXMDanhSach> lstNhaTieuHVSXMDanhSachXaKhac;
	
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public String getTenTinh() {
		return tenTinh;
	}
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	public String getBaoCaoSo() {
		return baoCaoSo;
	}
	public void setBaoCaoSo(String baoCaoSo) {
		this.baoCaoSo = baoCaoSo;
	}
	public String getBaoCaoNgayThangNam() {
		return baoCaoNgayThangNam;
	}
	public void setBaoCaoNgayThangNam(String baoCaoNgayThangNam) {
		this.baoCaoNgayThangNam = baoCaoNgayThangNam;
	}
	public String getNguoiLap() {
		return nguoiLap;
	}
	public void setNguoiLap(String nguoiLap) {
		this.nguoiLap = nguoiLap;
	}
	public String getNguoiDuyet() {
		return nguoiDuyet;
	}
	public void setNguoiDuyet(String nguoiDuyet) {
		this.nguoiDuyet = nguoiDuyet;
	}
	
	
	
	public long getTotalDanSo() {
		return totalDanSo;
	}
	public void setTotalDanSo(long totalDanSo) {
		this.totalDanSo = totalDanSo;
	}
	public long getTotalSoNhaTieuHVSDuKien() {
		return totalSoNhaTieuHVSDuKien;
	}
	public void setTotalSoNhaTieuHVSDuKien(long totalSoNhaTieuHVSDuKien) {
		this.totalSoNhaTieuHVSDuKien = totalSoNhaTieuHVSDuKien;
	}
	public long getTotalDanSoVSTX() {
		return totalDanSoVSTX;
	}
	public void setTotalDanSoVSTX(long totalDanSoVSTX) {
		this.totalDanSoVSTX = totalDanSoVSTX;
	}
	public long getTotalSoNhaTieuHVSDuKienVSTX() {
		return totalSoNhaTieuHVSDuKienVSTX;
	}
	public void setTotalSoNhaTieuHVSDuKienVSTX(long totalSoNhaTieuHVSDuKienVSTX) {
		this.totalSoNhaTieuHVSDuKienVSTX = totalSoNhaTieuHVSDuKienVSTX;
	}
	public long getTotalDanSoXaKhac() {
		return totalDanSoXaKhac;
	}
	public void setTotalDanSoXaKhac(long totalDanSoXaKhac) {
		this.totalDanSoXaKhac = totalDanSoXaKhac;
	}
	public long getTotalSoNhaTieuHVSDuKienXaKhac() {
		return totalSoNhaTieuHVSDuKienXaKhac;
	}
	public void setTotalSoNhaTieuHVSDuKienXaKhac(long totalSoNhaTieuHVSDuKienXaKhac) {
		this.totalSoNhaTieuHVSDuKienXaKhac = totalSoNhaTieuHVSDuKienXaKhac;
	}
	public List<NhaTieuHVSXMDanhSach> getLstNhaTieuHVSXMDanhSachVSTX() {
		return lstNhaTieuHVSXMDanhSachVSTX;
	}
	public void setLstNhaTieuHVSXMDanhSachVSTX(
			List<NhaTieuHVSXMDanhSach> lstNhaTieuHVSXMDanhSachVSTX) {
		this.lstNhaTieuHVSXMDanhSachVSTX = lstNhaTieuHVSXMDanhSachVSTX;
	}
	public List<NhaTieuHVSXMDanhSach> getLstNhaTieuHVSXMDanhSachXaKhac() {
		return lstNhaTieuHVSXMDanhSachXaKhac;
	}
	public void setLstNhaTieuHVSXMDanhSachXaKhac(
			List<NhaTieuHVSXMDanhSach> lstNhaTieuHVSXMDanhSachXaKhac) {
		this.lstNhaTieuHVSXMDanhSachXaKhac = lstNhaTieuHVSXMDanhSachXaKhac;
	}
	
	
	
}
