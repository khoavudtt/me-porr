package com.mcvn.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "me_thongtinkiemdemcongtrinh")
public class ThongTinKiemDemVeSinhCongTrinh {
	private int id;
	private int vesinhcongtrinhid;
	private KeHoachKiemDemVeSinh keHoachKiemDemVeSinh;
	private Integer loaicongtrinh;
	private String tencongtrinh;
	private String matinh;
	private String mahuyen;
	private String maxa;
	private String diachi;
	private Date NgayKiemDem;
	private String hotennguoitraloi;
	private String sodienthoai;
	private String gioitinhnguoitraloi;
	private String vaitrochucdanh;
	private Integer soca;
	private Integer songuoitrongca;
	private String kinhdo;
	private String vido;
	private String loainguonnuoc;
	private Integer datqcvn;
	private Integer dattieuchuanhvs;
	private String anhchupchungnhan;
	private Integer sonhatieu;
	private String ghichu;
	private Integer daketthucdieutra;
	private String lydokhonghoanthanh;
	private String imei;
	private String taikhoan;
	private Integer danhgiakiemdem;
	private Date savepoint;

	public ThongTinKiemDemVeSinhCongTrinh(int id, int vesinhcongtrinhid, KeHoachKiemDemVeSinh keHoachKiemDemVeSinh,
			String tencongtrinh, String matinh, String mahuyen, String maxa, String diachi, String hotennguoitraloi,
			String sodienthoai, String gioitinhnguoitraloi, String vaitrochucdanh, Integer soca, Integer songuoitrongca,
			String kinhdo, String vido, String loainguonnuoc, Integer datqcvn, Integer dattieuchuanhvs,
			Integer sonhatieu, String chitietcongtrinhruatay, String ghichu, Integer daketthucdieutra,
			String lydokhonghoanthanh, String imei) {
		super();
		this.id = id;
		this.vesinhcongtrinhid = vesinhcongtrinhid;
		this.keHoachKiemDemVeSinh = keHoachKiemDemVeSinh;
		this.tencongtrinh = tencongtrinh;
		this.matinh = matinh;
		this.mahuyen = mahuyen;
		this.maxa = maxa;
		this.diachi = diachi;
		this.hotennguoitraloi = hotennguoitraloi;
		this.sodienthoai = sodienthoai;
		this.gioitinhnguoitraloi = gioitinhnguoitraloi;
		this.vaitrochucdanh = vaitrochucdanh;
		this.soca = soca;
		this.songuoitrongca = songuoitrongca;
		this.kinhdo = kinhdo;
		this.vido = vido;
		this.loainguonnuoc = loainguonnuoc;
		this.datqcvn = datqcvn;
		this.dattieuchuanhvs = dattieuchuanhvs;
		this.sonhatieu = sonhatieu;

		this.ghichu = ghichu;
		this.daketthucdieutra = daketthucdieutra;
		this.lydokhonghoanthanh = lydokhonghoanthanh;
		this.imei = imei;

	}

	public ThongTinKiemDemVeSinhCongTrinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVesinhcongtrinhid() {
		return vesinhcongtrinhid;
	}

	public void setVesinhcongtrinhid(int vesinhcongtrinhid) {
		this.vesinhcongtrinhid = vesinhcongtrinhid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "kehoachkiemdemvesinhid", nullable = false)
	public KeHoachKiemDemVeSinh getKeHoachKiemDemVeSinh() {
		return keHoachKiemDemVeSinh;
	}

	public void setKeHoachKiemDemVeSinh(KeHoachKiemDemVeSinh keHoachKiemDemVeSinh) {
		this.keHoachKiemDemVeSinh = keHoachKiemDemVeSinh;
	}

	public Integer getLoaicongtrinh() {
		return loaicongtrinh;
	}

	public void setLoaicongtrinh(Integer loaicongtrinh) {
		this.loaicongtrinh = loaicongtrinh;
	}

	public String getTencongtrinh() {
		return tencongtrinh;
	}

	public void setTencongtrinh(String tencongtrinh) {
		this.tencongtrinh = tencongtrinh;
	}

	public String getMatinh() {
		return matinh;
	}

	public void setMatinh(String matinh) {
		this.matinh = matinh;
	}

	public String getMahuyen() {
		return mahuyen;
	}

	public void setMahuyen(String mahuyen) {
		this.mahuyen = mahuyen;
	}

	public String getMaxa() {
		return maxa;
	}

	public void setMaxa(String maxa) {
		this.maxa = maxa;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Date getNgayKiemDem() {
		return NgayKiemDem;
	}

	public void setNgayKiemDem(Date ngayKiemDem) {
		NgayKiemDem = ngayKiemDem;
	}

	public String getHotennguoitraloi() {
		return hotennguoitraloi;
	}

	public void setHotennguoitraloi(String hotennguoitraloi) {
		this.hotennguoitraloi = hotennguoitraloi;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getGioitinhnguoitraloi() {
		return gioitinhnguoitraloi;
	}

	public void setGioitinhnguoitraloi(String gioitinhnguoitraloi) {
		this.gioitinhnguoitraloi = gioitinhnguoitraloi;
	}

	public String getVaitrochucdanh() {
		return vaitrochucdanh;
	}

	public void setVaitrochucdanh(String vaitrochucdanh) {
		this.vaitrochucdanh = vaitrochucdanh;
	}

	public Integer getSoca() {
		return soca;
	}

	public void setSoca(Integer soca) {
		this.soca = soca;
	}

	public Integer getSonguoitrongca() {
		return songuoitrongca;
	}

	public void setSonguoitrongca(Integer songuoitrongca) {
		this.songuoitrongca = songuoitrongca;
	}

	public String getKinhdo() {
		return kinhdo;
	}

	public void setKinhdo(String kinhdo) {
		this.kinhdo = kinhdo;
	}

	public String getVido() {
		return vido;
	}

	public void setVido(String vido) {
		this.vido = vido;
	}

	public String getLoainguonnuoc() {
		return loainguonnuoc;
	}

	public void setLoainguonnuoc(String loainguonnuoc) {
		this.loainguonnuoc = loainguonnuoc;
	}

	public Integer getDatqcvn() {
		return datqcvn;
	}

	public void setDatqcvn(Integer datqcvn) {
		this.datqcvn = datqcvn;
	}

	public Integer getDattieuchuanhvs() {
		return dattieuchuanhvs;
	}

	public void setDattieuchuanhvs(Integer dattieuchuanhvs) {
		this.dattieuchuanhvs = dattieuchuanhvs;
	}

	public String getAnhchupchungnhan() {
		return anhchupchungnhan;
	}

	public void setAnhchupchungnhan(String anhchupchungnhan) {
		this.anhchupchungnhan = anhchupchungnhan;
	}

	public Integer getSonhatieu() {
		return sonhatieu;
	}

	public void setSonhatieu(Integer sonhatieu) {
		this.sonhatieu = sonhatieu;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public Integer getDaketthucdieutra() {
		return daketthucdieutra;
	}

	public void setDaketthucdieutra(Integer daketthucdieutra) {
		this.daketthucdieutra = daketthucdieutra;
	}

	public String getLydokhonghoanthanh() {
		return lydokhonghoanthanh;
	}

	public void setLydokhonghoanthanh(String lydokhonghoanthanh) {
		this.lydokhonghoanthanh = lydokhonghoanthanh;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}

	public Integer getDanhgiakiemdem() {
		return danhgiakiemdem;
	}

	public void setDanhgiakiemdem(Integer danhgiakiemdem) {
		this.danhgiakiemdem = danhgiakiemdem;
	}

	public Date getSavepoint() {
		return savepoint;
	}

	public void setSavepoint(Date savepoint) {
		this.savepoint = savepoint;
	}

}
