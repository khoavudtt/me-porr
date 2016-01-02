package vn.dtt.sol.ns.reporting.model.thdkdaunoisdnuoc;

import java.util.List;

public class DauNoiSDNcKH {
	private String nam;
	private String tenTinh;	
	private String baoCaoSo;
	private String baoCaoNgayThangNam;
	private String nguoiLap;
	private String nguoiDuyet;
	
	private String totalSoHo;
	private String totalDanSo;
	private String totalSoDauNoiDuKien;
	
	private List<DauNoiSDNcKHDanhSach> lstDauNoiSDNcKHDanhSach;
	
	
	
	
	public String getTotalSoHo() {
		return totalSoHo;
	}
	public void setTotalSoHo(String totalSoHo) {
		this.totalSoHo = totalSoHo;
	}
	public String getTotalDanSo() {
		return totalDanSo;
	}
	public void setTotalDanSo(String totalDanSo) {
		this.totalDanSo = totalDanSo;
	}
	public String getTotalSoDauNoiDuKien() {
		return totalSoDauNoiDuKien;
	}
	public void setTotalSoDauNoiDuKien(String totalSoDauNoiDuKien) {
		this.totalSoDauNoiDuKien = totalSoDauNoiDuKien;
	}
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
	public List<DauNoiSDNcKHDanhSach> getLstDauNoiSDNcKHDanhSach() {
		return lstDauNoiSDNcKHDanhSach;
	}
	public void setLstDauNoiSDNcKHDanhSach(
			List<DauNoiSDNcKHDanhSach> lstDauNoiSDNcKHDanhSach) {
		this.lstDauNoiSDNcKHDanhSach = lstDauNoiSDNcKHDanhSach;
	}
	
	
}
