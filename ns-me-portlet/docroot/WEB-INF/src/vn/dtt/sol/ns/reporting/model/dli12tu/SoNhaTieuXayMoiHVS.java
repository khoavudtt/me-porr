package vn.dtt.sol.ns.reporting.model.dli12tu;

import java.util.List;

public class SoNhaTieuXayMoiHVS {
	private String nam;
	private List<SoNhaTieuXayMoiHVSToanTinh> lstSoNhaTieuXayMoiHVSToanTinh;
	private List<SoNhaTieuXayMoiHVSTinh> lstSoNhaTieuXayMoiHVSTinh;
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public List<SoNhaTieuXayMoiHVSToanTinh> getLstSoNhaTieuXayMoiHVSToanTinh() {
		return lstSoNhaTieuXayMoiHVSToanTinh;
	}
	public void setLstSoNhaTieuXayMoiHVSToanTinh(
			List<SoNhaTieuXayMoiHVSToanTinh> lstSoNhaTieuXayMoiHVSToanTinh) {
		this.lstSoNhaTieuXayMoiHVSToanTinh = lstSoNhaTieuXayMoiHVSToanTinh;
	}
	public List<SoNhaTieuXayMoiHVSTinh> getLstSoNhaTieuXayMoiHVSTinh() {
		return lstSoNhaTieuXayMoiHVSTinh;
	}
	public void setLstSoNhaTieuXayMoiHVSTinh(
			List<SoNhaTieuXayMoiHVSTinh> lstSoNhaTieuXayMoiHVSTinh) {
		this.lstSoNhaTieuXayMoiHVSTinh = lstSoNhaTieuXayMoiHVSTinh;
	}
	
	
}
