package vn.dtt.sol.ns.reporting;

public class ThongTinKiemDemNuocModel {
	private long id;
	private String soLanKiemDem;
	private String ngayKiemDem;
	private String nguoiKiemDem;
	private String tenChuHo;
	private String ketQuaDieuTra;
	
	private String QuanHuyen;
	private String phuongXa;
	private String thonXom;
	private String hopDongDauNoi;
	private String trangThai;
	private String ketQuaKiemDem;
	private String keHoach;
	private String nguoiTraLoi;
	public ThongTinKiemDemNuocModel() {
		// TODO Auto-generated constructor stub
	}
	
	public ThongTinKiemDemNuocModel(long id, String tenChuHo, String quanHuyen,
			String phuongXa, String thonXom, String ngayKiemDem,String trangThai,String soLanKiemDem,String ketQuaKiemDem) {
		super();
		this.id = id;
		this.tenChuHo = tenChuHo;
		this.QuanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.thonXom = thonXom;
		this.ngayKiemDem=ngayKiemDem;
		this.trangThai = trangThai;
		this.soLanKiemDem = soLanKiemDem;
		this.ketQuaKiemDem = ketQuaKiemDem;
	}
	
	public ThongTinKiemDemNuocModel(long id, String tenChuHo, String quanHuyen,
			String phuongXa, String thonXom, String hopDongDauNoi,String soLanKiemDem) {
		super();
		this.id = id;
		this.tenChuHo = tenChuHo;
		QuanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.thonXom = thonXom;
		this.hopDongDauNoi=hopDongDauNoi;
		this.soLanKiemDem = soLanKiemDem;
	}
	public ThongTinKiemDemNuocModel(long id, String soLanKiemDem,
			String ngayKiemDem, String nguoiKiemDem, String tenChuHo,
			String ketQuaDieuTra) {
		super();
		this.id = id;
		this.soLanKiemDem = soLanKiemDem;
		this.ngayKiemDem = ngayKiemDem;
		this.nguoiKiemDem = nguoiKiemDem;
		this.tenChuHo = tenChuHo;
		this.ketQuaDieuTra = ketQuaDieuTra;
	}
	public ThongTinKiemDemNuocModel(long id, String nguoiKiemDem, String keHoach, String nguoiTraLoi, String tinhTrang, String ngayKiemDem,
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
	public String getTenChuHo() {
		return tenChuHo;
	}
	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
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

	public String getThonXom() {
		return thonXom;
	}

	public void setThonXom(String thonXom) {
		this.thonXom = thonXom;
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
