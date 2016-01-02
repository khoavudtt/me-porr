package vn.dtt.sol.ns.reporting.model.dli12tu;

import java.util.List;

public class SoNhaTieuXayMoiHVSToanTinh {
	
	private int keHoachTotal;
	private int thucHienTotal;
	
	private List<SoNhaTieuXayMoiHVSToanTinhDanhSach> lstSoNhaTieuXayMoiHVSToanTinhDanhSach;

	public int getKeHoachTotal() {
		return keHoachTotal;
	}

	public void setKeHoachTotal(int keHoachTotal) {
		this.keHoachTotal = keHoachTotal;
	}

	public int getThucHienTotal() {
		return thucHienTotal;
	}

	public void setThucHienTotal(int thucHienTotal) {
		this.thucHienTotal = thucHienTotal;
	}

	public List<SoNhaTieuXayMoiHVSToanTinhDanhSach> getLstSoNhaTieuXayMoiHVSToanTinhDanhSach() {
		return lstSoNhaTieuXayMoiHVSToanTinhDanhSach;
	}

	public void setLstSoNhaTieuXayMoiHVSToanTinhDanhSach(
			List<SoNhaTieuXayMoiHVSToanTinhDanhSach> lstSoNhaTieuXayMoiHVSToanTinhDanhSach) {
		this.lstSoNhaTieuXayMoiHVSToanTinhDanhSach = lstSoNhaTieuXayMoiHVSToanTinhDanhSach;
	}
	
	
	
}
