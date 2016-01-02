package vn.dtt.sol.ns.reporting.model.dli11ct;

import java.util.List;

public class DSDauNoiMoiCapNuoc {
	private String nam;
	private String tenTinh;	
	private String baoCaoSo;
	private String baoCaoNgayThangNam;
	private String nguoiLap;
	private String nguoiDuyet;
	private List<DSDauNoiMoiCapNuocDanhSach> lstDSDauNoiMoiCapNuocDanhSachs;
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
	public List<DSDauNoiMoiCapNuocDanhSach> getLstDSDauNoiMoiCapNuocDanhSachs() {
		return lstDSDauNoiMoiCapNuocDanhSachs;
	}
	public void setLstDSDauNoiMoiCapNuocDanhSachs(
			List<DSDauNoiMoiCapNuocDanhSach> lstDSDauNoiMoiCapNuocDanhSachs) {
		this.lstDSDauNoiMoiCapNuocDanhSachs = lstDSDauNoiMoiCapNuocDanhSachs;
	}
	
	
}
