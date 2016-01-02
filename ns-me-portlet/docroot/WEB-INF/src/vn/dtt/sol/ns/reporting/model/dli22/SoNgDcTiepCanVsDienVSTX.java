package vn.dtt.sol.ns.reporting.model.dli22;

import java.util.List;

public class SoNgDcTiepCanVsDienVSTX {
	private String nam;
	private String tenTinh;	
	private String baoCaoSo;
	private String baoCaoNgayThangNam;
	private String nguoiLap;
	private String nguoiDuyet;
	private List<SoNgDcTiepCanVsDienVSTXDanhSach> lstSoNgDcTiepCanVsDienVSTXDanhSach;
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
	public List<SoNgDcTiepCanVsDienVSTXDanhSach> getLstSoNgDcTiepCanVsDienVSTXDanhSach() {
		return lstSoNgDcTiepCanVsDienVSTXDanhSach;
	}
	public void setLstSoNgDcTiepCanVsDienVSTXDanhSach(
			List<SoNgDcTiepCanVsDienVSTXDanhSach> lstSoNgDcTiepCanVsDienVSTXDanhSach) {
		this.lstSoNgDcTiepCanVsDienVSTXDanhSach = lstSoNgDcTiepCanVsDienVSTXDanhSach;
	}
	
	
}
