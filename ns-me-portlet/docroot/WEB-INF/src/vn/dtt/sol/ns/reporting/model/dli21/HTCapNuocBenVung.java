package vn.dtt.sol.ns.reporting.model.dli21;

import java.util.List;

public class HTCapNuocBenVung {
	private String nam;
	private String tinh;
	private String baoCaoSo;
	private String ngay_thang_nam;
	private String nguoiLap;
	private String nguoiDuyet;
	List <HTCapNuocBenVungDanhSach>  danhSachTenHeThongCapNuoc;
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public String getTinh() {
		return tinh;
	}
	public List<HTCapNuocBenVungDanhSach> getDanhSachTenHeThongCapNuoc() {
		return danhSachTenHeThongCapNuoc;
	}
	public void setDanhSachTenHeThongCapNuoc(
			List<HTCapNuocBenVungDanhSach> danhSachTenHeThongCapNuoc) {
		this.danhSachTenHeThongCapNuoc = danhSachTenHeThongCapNuoc;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	public String getBaoCaoSo() {
		return baoCaoSo;
	}
	public void setBaoCaoSo(String baoCaoSo) {
		this.baoCaoSo = baoCaoSo;
	}
	public String getNgay_thang_nam() {
		return ngay_thang_nam;
	}
	public void setNgay_thang_nam(String ngay_thang_nam) {
		this.ngay_thang_nam = ngay_thang_nam;
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
	

}
