package vn.dtt.sol.ns.reporting;

public class ThongTinKiemDemVeSinhCongTrinhModel {
	private long id;
	private String soLanKiemDem;
	private String ngayKiemDem;
	private String nguoiKiemDem;
	private String tenCongTrinh;
	private String ketQuaDieuTra;
	
	private String QuanHuyen;
	private String phuongXa;
	private String diaChi;
	private String hopDongDauNoi;
	private String trangThai;
	private String ketQuaKiemDem;
	private String keHoach;
	private String nguoiTraLoi;
	public ThongTinKiemDemVeSinhCongTrinhModel() {
		// TODO Auto-generated constructor stub
	}
	
	public ThongTinKiemDemVeSinhCongTrinhModel(long id, String tenCongTrinh, String quanHuyen,
			String phuongXa, String diaChi, String ngayKiemDem,String trangThai,String soLanKiemDem,String ketQuaKiemDem) {
		super();
		this.id = id;
		this.tenCongTrinh = tenCongTrinh;
		this.QuanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.diaChi = diaChi;
		this.ngayKiemDem=ngayKiemDem;
		this.trangThai = trangThai;
		this.soLanKiemDem = soLanKiemDem;
		this.ketQuaKiemDem = ketQuaKiemDem;
	}
	
	public ThongTinKiemDemVeSinhCongTrinhModel(long id, String tenCongTrinh, String quanHuyen,
			String phuongXa, String diaChi, String hopDongDauNoi,String soLanKiemDem) {
		super();
		this.id = id;
		this.tenCongTrinh = tenCongTrinh;
		QuanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.diaChi = diaChi;
		this.hopDongDauNoi=hopDongDauNoi;
		this.soLanKiemDem = soLanKiemDem;
	}
	public ThongTinKiemDemVeSinhCongTrinhModel(long id, String soLanKiemDem,
			String ngayKiemDem, String nguoiKiemDem, String tenCongTrinh,
			String ketQuaDieuTra) {
		super();
		this.id = id;
		this.soLanKiemDem = soLanKiemDem;
		this.ngayKiemDem = ngayKiemDem;
		this.nguoiKiemDem = nguoiKiemDem;
		this.tenCongTrinh = tenCongTrinh;
		this.ketQuaDieuTra = ketQuaDieuTra;
	}
	public ThongTinKiemDemVeSinhCongTrinhModel(long id, String nguoiKiemDem, String keHoach, String nguoiTraLoi, String tinhTrang, String ngayKiemDem,
			String ketQuaDieuTra, String deTailPage) {
		super();
		this.id = id;
		this.nguoiKiemDem = nguoiKiemDem;
		this.keHoach = keHoach;
		this.nguoiTraLoi = nguoiTraLoi;
		this.trangThai = tinhTrang;
		this.ngayKiemDem = ngayKiemDem;
		this.ketQuaDieuTra = ketQuaDieuTra;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSoLanKiemDem() {
		return soLanKiemDem;
	}
	public void setSoLanKiemDem(String soLanKiemDem) {
		this.soLanKiemDem = soLanKiemDem;
	}
	public String getNgayKiemDem() {
		return ngayKiemDem;
	}
	public void setNgayKiemDem(String ngayKiemDem) {
		this.ngayKiemDem = ngayKiemDem;
	}
	public String getNguoiKiemDem() {
		return nguoiKiemDem;
	}
	public void setNguoiKiemDem(String nguoiKiemDem) {
		this.nguoiKiemDem = nguoiKiemDem;
	}
	public String getTenCongTrinh() {
		return tenCongTrinh;
	}
	public void setTenCongTrinh(String tenCongTrinh) {
		this.tenCongTrinh = tenCongTrinh;
	}
	public String getKetQuaDieuTra() {
		return ketQuaDieuTra;
	}
	public void setKetQuaDieuTra(String ketQuaDieuTra) {
		this.ketQuaDieuTra = ketQuaDieuTra;
	}

	public String getQuanHuyen() {
		return QuanHuyen;
	}

	public void setQuanHuyen(String quanHuyen) {
		QuanHuyen = quanHuyen;
	}

	public String getPhuongXa() {
		return phuongXa;
	}

	public void setPhuongXa(String phuongXa) {
		this.phuongXa = phuongXa;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getHopDongDauNoi() {
		return hopDongDauNoi;
	}

	public void setHopDongDauNoi(String hopDongDauNoi) {
		this.hopDongDauNoi = hopDongDauNoi;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getKetQuaKiemDem() {
		return ketQuaKiemDem;
	}

	public void setKetQuaKiemDem(String ketQuaKiemDem) {
		this.ketQuaKiemDem = ketQuaKiemDem;
	}

	public String getKeHoach() {
		return keHoach;
	}

	public void setKeHoach(String keHoach) {
		this.keHoach = keHoach;
	}

	public String getNguoiTraLoi() {
		return nguoiTraLoi;
	}

	public void setNguoiTraLoi(String nguoiTraLoi) {
		this.nguoiTraLoi = nguoiTraLoi;
	}
}
