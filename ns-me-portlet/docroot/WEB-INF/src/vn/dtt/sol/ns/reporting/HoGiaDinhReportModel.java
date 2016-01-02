package vn.dtt.sol.ns.reporting;

public class HoGiaDinhReportModel {
	private long id;
	private String stt;
	private String tinhThanh;
	private String quanHuyen;
	private String phuongXa;
	private String thonXom;
	private String tenChuHo;
	private String trangThai;
	private String ngayXayDung;
	private String namBaoCao;
	private int userIdData;
	public HoGiaDinhReportModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public HoGiaDinhReportModel(long id, String stt, String tinhThanh,
			String quanHuyen, String phuongXa, String thonXom,
			String tenChuHo, String trangThai,String ngayXayDung,String namBaoCao,int userIdData) {
		super();
		this.id = id;
		this.stt = stt;
		this.tinhThanh = tinhThanh;
		this.quanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.thonXom = thonXom;
		this.tenChuHo = tenChuHo;
		this.trangThai = trangThai;
		this.ngayXayDung = ngayXayDung;
		this.namBaoCao = namBaoCao;
		this.userIdData = userIdData;
	}


	public String getStt() {
		return stt;
	}
	public void setStt(String stt) {
		this.stt = stt;
	}
	public String getTinhThanh() {
		return tinhThanh;
	}
	public void setTinhThanh(String tinhThanh) {
		this.tinhThanh = tinhThanh;
	}
	public String getQuanHuyen() {
		return quanHuyen;
	}
	public void setQuanHuyen(String quanHuyen) {
		this.quanHuyen = quanHuyen;
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
	public String getTenChuHo() {
		return tenChuHo;
	}
	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getNamBaoCao() {
		return namBaoCao;
	}


	public void setNamBaoCao(String namBaoCao) {
		this.namBaoCao = namBaoCao;
	}


	public int getUserIdData() {
		return userIdData;
	}


	public void setUserIdData(int userIdData) {
		this.userIdData = userIdData;
	}


	public String getNgayXayDung() {
		return ngayXayDung;
	}


	public void setNgayXayDung(String ngayXayDung) {
		this.ngayXayDung = ngayXayDung;
	}
}
