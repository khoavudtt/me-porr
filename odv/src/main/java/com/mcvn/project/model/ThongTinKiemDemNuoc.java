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
@Table(name = "me_thongtinkiemdemnuoc")
public class ThongTinKiemDemNuoc {
	private int id;
	private String anhbechua;
	private String anhdaunoi;
	private String anhdongho;
	private Integer bimatnuoc;
	private String chisodongho;
	private Integer chuhodungds;
	private Integer cobechuanuoc;
	private String conguoionha;
	private Integer daunoinuocid;
	private Integer daketthucdieutra;
	private Integer datungduckhong;
	private Integer daunoichua;
	private String ghichu;
	private Integer gioitinhchuho;
	private Integer gioitinhchuhohientai;
	private String gioitinhnguoitraloi;
	private String hotennguoitraloi;
	private String imei;
	private Integer chinhsach;
	private KeHoachKiemDemNuoc keHoachKiemDemNuoc;
	private String lachuhokhong;
	private String loaikhac;
	private String loaikhactungco;
	private String lydokhongdungds;
	private String lydokhonghoanthanh;
	private String mahuyen;
	private String matinh;
	private String maxa;
	private String maunuoc;
	private String maunuoctungco;
	private String muinuoc;
	private String muinuoctungco;
	private Date ngaykiemdem;
	private Integer nuoctrongkhong;
	private Integer sogiotrungbinh;
	private Integer solanmatnuoc;
	private Integer songuoitrongho;
	private String soserydongho;
	private String tenchuho;
	private String tenchuhohientai;
	private String tendantoc;
	private Integer thanhphanhogd;
	private Date thoigiandauhopdong;
	private Date thoigiandaunoithucte;
	private String thonxom;
	private String timthaynha;
	private Integer tinhtrangbe;
	private String kinhdo;
	private String vido;
	private String vinuoc;
	private String vinuoctungco;
	private Integer voinuocchaykhong;
	private Integer danhgiakiemdem;
	

	public String getConguoionha() {
		return conguoionha;
	}

	public void setConguoionha(String conguoionha) {
		this.conguoionha = conguoionha;
	}

	public String getTimthaynha() {
		return timthaynha;
	}

	public void setTimthaynha(String timthaynha) {
		this.timthaynha = timthaynha;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnhbechua() {
		return anhbechua;
	}

	public void setAnhbechua(String anhbechua) {
		this.anhbechua = anhbechua;
	}

	public String getAnhdaunoi() {
		return anhdaunoi;
	}

	public Integer getChinhsach() {
		return chinhsach;
	}

	public void setChinhsach(Integer chinhsach) {
		this.chinhsach = chinhsach;
	}

	public void setAnhdaunoi(String anhdaunoi) {
		this.anhdaunoi = anhdaunoi;
	}

	public String getAnhdongho() {
		return anhdongho;
	}

	public void setAnhdongho(String anhdongho) {
		this.anhdongho = anhdongho;
	}

	public Integer getBimatnuoc() {
		return bimatnuoc;
	}

	public void setBimatnuoc(Integer bimatnuoc) {
		this.bimatnuoc = bimatnuoc;
	}

	public String getChisodongho() {
		return chisodongho;
	}

	public void setChisodongho(String chisodongho) {
		this.chisodongho = chisodongho;
	}

	public Integer getChuhodungds() {
		return chuhodungds;
	}

	public void setChuhodungds(Integer chuhodungds) {
		this.chuhodungds = chuhodungds;
	}

	public Integer getCobechuanuoc() {
		return cobechuanuoc;
	}

	public void setCobechuanuoc(Integer cobechuanuoc) {
		this.cobechuanuoc = cobechuanuoc;
	}

	public Integer getDaketthucdieutra() {
		return daketthucdieutra;
	}

	public Integer getDaunoinuocid() {
		return daunoinuocid;
	}

	public void setDaunoinuocid(Integer daunoinuocid) {
		this.daunoinuocid = daunoinuocid;
	}

	public void setDaketthucdieutra(Integer daketthucdieutra) {
		this.daketthucdieutra = daketthucdieutra;
	}

	public Integer getDatungduckhong() {
		return datungduckhong;
	}

	public void setDatungduckhong(Integer datungduckhong) {
		this.datungduckhong = datungduckhong;
	}

	public Integer getDaunoichua() {
		return daunoichua;
	}

	public void setDaunoichua(Integer daunoichua) {
		this.daunoichua = daunoichua;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public Integer getGioitinhchuho() {
		return gioitinhchuho;
	}

	public void setGioitinhchuho(Integer gioitinhchuho) {
		this.gioitinhchuho = gioitinhchuho;
	}

	public Integer getGioitinhchuhohientai() {
		return gioitinhchuhohientai;
	}

	public void setGioitinhchuhohientai(Integer gioitinhchuhohientai) {
		this.gioitinhchuhohientai = gioitinhchuhohientai;
	}

	public String getGioitinhnguoitraloi() {
		return gioitinhnguoitraloi;
	}

	public void setGioitinhnguoitraloi(String gioitinhnguoitraloi) {
		this.gioitinhnguoitraloi = gioitinhnguoitraloi;
	}

	public String getHotennguoitraloi() {
		return hotennguoitraloi;
	}

	public void setHotennguoitraloi(String hotennguoitraloi) {
		this.hotennguoitraloi = hotennguoitraloi;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "kehoachkiemdemnuocid", nullable = false)
	public KeHoachKiemDemNuoc getKeHoachKiemDemNuoc() {
		return keHoachKiemDemNuoc;
	}

	public void setKeHoachKiemDemNuoc(KeHoachKiemDemNuoc keHoachKiemDemNuoc) {
		this.keHoachKiemDemNuoc = keHoachKiemDemNuoc;
	}

	public String getLachuhokhong() {
		return lachuhokhong;
	}

	public void setLachuhokhong(String lachuhokhong) {
		this.lachuhokhong = lachuhokhong;
	}

	public String getLoaikhac() {
		return loaikhac;
	}

	public void setLoaikhac(String loaikhac) {
		this.loaikhac = loaikhac;
	}

	public String getLoaikhactungco() {
		return loaikhactungco;
	}

	public void setLoaikhactungco(String loaikhactungco) {
		this.loaikhactungco = loaikhactungco;
	}

	public String getLydokhongdungds() {
		return lydokhongdungds;
	}

	public void setLydokhongdungds(String lydokhongdungds) {
		this.lydokhongdungds = lydokhongdungds;
	}

	public String getLydokhonghoanthanh() {
		return lydokhonghoanthanh;
	}

	public void setLydokhonghoanthanh(String lydokhonghoanthanh) {
		this.lydokhonghoanthanh = lydokhonghoanthanh;
	}

	public String getMahuyen() {
		return mahuyen;
	}

	public void setMahuyen(String mahuyen) {
		this.mahuyen = mahuyen;
	}

	public String getMatinh() {
		return matinh;
	}

	public void setMatinh(String matinh) {
		this.matinh = matinh;
	}

	public String getMaxa() {
		return maxa;
	}

	public void setMaxa(String maxa) {
		this.maxa = maxa;
	}

	public String getMaunuoc() {
		return maunuoc;
	}

	public void setMaunuoc(String maunuoc) {
		this.maunuoc = maunuoc;
	}

	public String getMaunuoctungco() {
		return maunuoctungco;
	}

	public void setMaunuoctungco(String maunuoctungco) {
		this.maunuoctungco = maunuoctungco;
	}

	public String getMuinuoc() {
		return muinuoc;
	}

	public void setMuinuoc(String muinuoc) {
		this.muinuoc = muinuoc;
	}

	public String getMuinuoctungco() {
		return muinuoctungco;
	}

	public void setMuinuoctungco(String muinuoctungco) {
		this.muinuoctungco = muinuoctungco;
	}

	public Date getNgaykiemdem() {
		return ngaykiemdem;
	}

	public void setNgaykiemdem(Date ngaykiemdem) {
		this.ngaykiemdem = ngaykiemdem;
	}

	public Integer getNuoctrongkhong() {
		return nuoctrongkhong;
	}

	public void setNuoctrongkhong(Integer nuoctrongkhong) {
		this.nuoctrongkhong = nuoctrongkhong;
	}

	public Integer getSogiotrungbinh() {
		return sogiotrungbinh;
	}

	public void setSogiotrungbinh(Integer sogiotrungbinh) {
		this.sogiotrungbinh = sogiotrungbinh;
	}

	public Integer getSolanmatnuoc() {
		return solanmatnuoc;
	}

	public void setSolanmatnuoc(Integer solanmatnuoc) {
		this.solanmatnuoc = solanmatnuoc;
	}

	public Integer getSonguoitrongho() {
		return songuoitrongho;
	}

	public void setSonguoitrongho(Integer songuoitrongho) {
		this.songuoitrongho = songuoitrongho;
	}

	public String getSoserydongho() {
		return soserydongho;
	}

	public void setSoserydongho(String soserydongho) {
		this.soserydongho = soserydongho;
	}

	public String getTenchuho() {
		return tenchuho;
	}

	public void setTenchuho(String tenchuho) {
		this.tenchuho = tenchuho;
	}

	public String getTenchuhohientai() {
		return tenchuhohientai;
	}

	public void setTenchuhohientai(String tenchuhohientai) {
		this.tenchuhohientai = tenchuhohientai;
	}

	public String getTendantoc() {
		return tendantoc;
	}

	public void setTendantoc(String tendantoc) {
		this.tendantoc = tendantoc;
	}

	public Integer getThanhphanhogd() {
		return thanhphanhogd;
	}

	public void setThanhphanhogd(Integer thanhphanhogd) {
		this.thanhphanhogd = thanhphanhogd;
	}

	public Date getThoigiandauhopdong() {
		return thoigiandauhopdong;
	}

	public void setThoigiandauhopdong(Date thoigiandauhopdong) {
		this.thoigiandauhopdong = thoigiandauhopdong;
	}

	public Date getThoigiandaunoithucte() {
		return thoigiandaunoithucte;
	}

	public void setThoigiandaunoithucte(Date thoigiandaunoithucte) {
		this.thoigiandaunoithucte = thoigiandaunoithucte;
	}

	public String getThonxom() {
		return thonxom;
	}

	public void setThonxom(String thonxom) {
		this.thonxom = thonxom;
	}

	// public String getTimthaynha() {
	// return timthaynha;
	// }
	// public void setTimthaynha(String timthaynha) {
	// this.timthaynha = timthaynha;
	// }
	public Integer getTinhtrangbe() {
		return tinhtrangbe;
	}

	public void setTinhtrangbe(Integer tinhtrangbe) {
		this.tinhtrangbe = tinhtrangbe;
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

	public String getVinuoc() {
		return vinuoc;
	}

	public void setVinuoc(String vinuoc) {
		this.vinuoc = vinuoc;
	}

	public String getVinuoctungco() {
		return vinuoctungco;
	}

	public void setVinuoctungco(String vinuoctungco) {
		this.vinuoctungco = vinuoctungco;
	}

	public Integer getVoinuocchaykhong() {
		return voinuocchaykhong;
	}

	public void setVoinuocchaykhong(Integer voinuocchaykhong) {
		this.voinuocchaykhong = voinuocchaykhong;
	}

	public Integer getDanhgiakiemdem() {
		return danhgiakiemdem;
	}

	public void setDanhgiakiemdem(Integer danhgiakiemdem) {
		this.danhgiakiemdem = danhgiakiemdem;
	}

}
