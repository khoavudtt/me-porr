package vn.dtt.sol.ns.reporting.model.dli11tu;

import java.util.List;

public class TUDauNoiCapNuoc {
	private String nam;

	private List<TUDauNoiCapNuocTHDanhSach> lstTUDauNoiCapNuocTHDanhSach;
	private List<TUDauNoiCapNuocTinhDanhSach> lstTUDauNoiCapNuocTinhDanhSach;
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public List<TUDauNoiCapNuocTHDanhSach> getLstTUDauNoiCapNuocTHDanhSach() {
		return lstTUDauNoiCapNuocTHDanhSach;
	}
	public void setLstTUDauNoiCapNuocTHDanhSach(
			List<TUDauNoiCapNuocTHDanhSach> lstTUDauNoiCapNuocTHDanhSach) {
		this.lstTUDauNoiCapNuocTHDanhSach = lstTUDauNoiCapNuocTHDanhSach;
	}
	public List<TUDauNoiCapNuocTinhDanhSach> getLstTUDauNoiCapNuocTinhDanhSach() {
		return lstTUDauNoiCapNuocTinhDanhSach;
	}
	public void setLstTUDauNoiCapNuocTinhDanhSach(
			List<TUDauNoiCapNuocTinhDanhSach> lstTUDauNoiCapNuocTinhDanhSach) {
		this.lstTUDauNoiCapNuocTinhDanhSach = lstTUDauNoiCapNuocTinhDanhSach;
	}
	
	
}
