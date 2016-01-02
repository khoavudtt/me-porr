package vn.dtt.sol.ns.reporting.model.dli11th;

import java.util.List;

public class SoDauNoiMoiHoatDong {
	private String Nam;
	private String TenTinh;
	private String BaoCaoSo;
	private String BaoCaoNgayThangNam;
	private String nguoiLap;
	private String nguoiDuyet;
	List<SoDauNoiMoiHoatDongDanhSach> lstDoDauNoiMoiHoatDongDanhSach;
	
	public String getTenTinh() {
		return TenTinh;
	}
	public String getNam() {
		return Nam;
	}
	public void setNam(String nam) {
		Nam = nam;
	}
	public void setTenTinh(String tenTinh) {
		TenTinh = tenTinh;
	}
	public String getBaoCaoSo() {
		return BaoCaoSo;
	}
	public void setBaoCaoSo(String baoCaoSo) {
		BaoCaoSo = baoCaoSo;
	}
	public String getBaoCaoNgayThangNam() {
		return BaoCaoNgayThangNam;
	}
	public void setBaoCaoNgayThangNam(String baoCaoNgayThangNam) {
		BaoCaoNgayThangNam = baoCaoNgayThangNam;
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
	public List<SoDauNoiMoiHoatDongDanhSach> getLstDoDauNoiMoiHoatDongDanhSach() {
		return lstDoDauNoiMoiHoatDongDanhSach;
	}
	public void setLstDoDauNoiMoiHoatDongDanhSach(
			List<SoDauNoiMoiHoatDongDanhSach> lstDoDauNoiMoiHoatDongDanhSach) {
		this.lstDoDauNoiMoiHoatDongDanhSach = lstDoDauNoiMoiHoatDongDanhSach;
	}
	
}
