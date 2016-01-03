package com.dtt.nuocsach.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class VeSinhGiaDinhTT {
	private int id;
	private String loainhatieu;
	private int vesinhgiadinhid;
	private int kehoachkiemdemvesinhid;
	private String matinh;
	private String mahuyen;
	private String maxa;
	private String thonxom;
	private String tenchuho;
	private int gioitinhchuho;
	private Date ngaykiemdem;
	private int timthaynha;
	private String hotennguoitraloi;
	private int lachuhokhong;
	private String tendantoc;
	private String kinhdo;
	private String vido;
	private int thanhphanhogd;
	private int chuhodungds;
	private String lydokhongdungds;
	private String tenchuhohientai;
	private int gioitinhchuhohientai;
	private String gioitinhnguoitraloi;
	private int conhatieu;
	private int conguoionha;
	private int namxaydung;
	private int nguonvon;
	private String chitietvonvay;
	private int duoccaitao;
	private String loainhatieucu;

	private int vesinhsachse;
	private int delamvesinh;
	private int muivesinh;
	private int phiatrenkindao;
	private int duchemuagio;
	private int sancaotrentoithieu;
	private int napbecontot;
	private int cuaphanbitkin;
	private int tranrangoai;
	private int nuocthaididau;
	private int khoangcachnguonnuoc;
	private int ngapkhimualon;
	private String ghichu;
	private int daketthucdieutra;
	private String lydokhonghoanthanh;
	private String imei;
	private String taikhoan;
	private int danhgiakiemdem;
	private Date savepoint;
	private int songuoitrongho;
	private int thangxaydung;
	private Integer chinhsach;
	private String loainguonnuoc;
	private String anhbechua;
	private String anhtoancanh;
	private String anhtrongnhatieu;

	public VeSinhGiaDinhTT(int id, int vesinhgiadinhid, int kehoachkiemdemvesinhid, String matinh, String mahuyen,
			String maxa, String thonxom, String tenchuho, int gioitinhchuho, Date ngaykiemdem, int timthaynha,
			String hotennguoitraloi, int lachuhokhong, String tendantoc, String kinhdo, String vido, int thanhphanhogd,
			int chuhodungds, String lydokhongdungds, String tenchuhohientai, int gioitinhchuhohientai, int conhatieu,
			String loainhatieu, int nguonvon, String chitietvonvay, int duoccaitao, String loainhatieucu,
			int vesinhsachse, int delamvesinh, int muivesinh, int phiatrenkindao, int duchemuagio,
			int sancaotrentoithieu, int napbecontot, int cuaphanbitkin, int tranrangoai, int nuocthaididau,
			int khoangcachnguonnuoc, int ngapkhimualon, String ghichu, int daketthucdieutra, String lydokhonghoanthanh,
			String imei, String taikhoan, int danhgiakiemdem, int songuoitrongho, int thangxaydung,
			String loainguonnuoc, Integer chinhsach, int conguoionha, String gioitinhnguoitraloi, int namxaydung,
			String anhtoancanh, String anhtrongnhatieu, String anhbechua) {
		super();
		this.id = id;
		this.vesinhgiadinhid = vesinhgiadinhid;
		this.kehoachkiemdemvesinhid = kehoachkiemdemvesinhid;
		this.matinh = matinh;
		this.mahuyen = mahuyen;
		this.maxa = maxa;
		this.thonxom = thonxom;
		this.tenchuho = tenchuho;
		this.gioitinhchuho = gioitinhchuho;
		this.ngaykiemdem = ngaykiemdem;
		this.timthaynha = timthaynha;
		this.hotennguoitraloi = hotennguoitraloi;
		this.lachuhokhong = lachuhokhong;
		this.tendantoc = tendantoc;
		this.kinhdo = kinhdo;
		this.vido = vido;
		this.thanhphanhogd = thanhphanhogd;
		this.chuhodungds = chuhodungds;
		this.lydokhongdungds = lydokhongdungds;
		this.tenchuhohientai = tenchuhohientai;
		this.gioitinhchuhohientai = gioitinhchuhohientai;
		this.conhatieu = conhatieu;
		this.loainhatieu = loainhatieu;

		this.nguonvon = nguonvon;
		this.chitietvonvay = chitietvonvay;
		this.duoccaitao = duoccaitao;
		this.loainhatieucu = loainhatieucu;

		this.vesinhsachse = vesinhsachse;
		this.delamvesinh = delamvesinh;
		this.muivesinh = muivesinh;
		this.phiatrenkindao = phiatrenkindao;
		this.duchemuagio = duchemuagio;
		this.sancaotrentoithieu = sancaotrentoithieu;
		this.napbecontot = napbecontot;
		this.cuaphanbitkin = cuaphanbitkin;
		this.tranrangoai = tranrangoai;
		this.nuocthaididau = nuocthaididau;
		this.khoangcachnguonnuoc = khoangcachnguonnuoc;
		this.ngapkhimualon = ngapkhimualon;
		this.ghichu = ghichu;
		this.daketthucdieutra = daketthucdieutra;
		this.lydokhonghoanthanh = lydokhonghoanthanh;
		this.imei = imei;
		this.taikhoan = taikhoan;
		this.danhgiakiemdem = danhgiakiemdem;

		this.songuoitrongho = songuoitrongho;
		this.thangxaydung = thangxaydung;
		this.loainguonnuoc = loainguonnuoc;
		this.chinhsach = chinhsach;
		this.conguoionha = conguoionha;
		this.gioitinhnguoitraloi = gioitinhnguoitraloi;
		this.namxaydung = namxaydung;
		this.anhbechua = anhbechua;
		this.anhtoancanh = anhtoancanh;
		this.anhtrongnhatieu = anhtrongnhatieu;

	}

	@Column(name = "kehoachkiemdemvesinhid")
	public int getKehoachkiemdemvesinhid() {
		return kehoachkiemdemvesinhid;
	}

	public Integer getChinhsach() {
		return chinhsach;
	}

	public void setChinhsach(Integer chinhsach) {
		this.chinhsach = chinhsach;
	}

	public void setKehoachkiemdemvesinhid(int kehoachkiemdemvesinhid) {
		this.kehoachkiemdemvesinhid = kehoachkiemdemvesinhid;
	}

	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "vesinhgiadinhid")
	public int getVesinhgiadinhid() {
		return vesinhgiadinhid;
	}

	public void setVesinhgiadinhid(int vesinhgiadinhid) {
		this.vesinhgiadinhid = vesinhgiadinhid;
	}

	@Column(name = "matinh")
	public String getMatinh() {
		return matinh;
	}

	public void setMatinh(String matinh) {
		this.matinh = matinh;
	}

	@Column(name = "gioitinhnguoitraloi")
	public String getGioitinhnguoitraloi() {
		return gioitinhnguoitraloi;
	}

	public void setGioitinhnguoitraloi(String gioitinhnguoitraloi) {
		this.gioitinhnguoitraloi = gioitinhnguoitraloi;
	}

	@Column(name = "mahuyen")
	public String getMahuyen() {
		return mahuyen;
	}

	@Column(name = "conguoionha")
	public int getConguoionha() {
		return conguoionha;
	}

	public void setConguoionha(int conguoionha) {
		this.conguoionha = conguoionha;
	}

	public void setMahuyen(String mahuyen) {
		this.mahuyen = mahuyen;
	}

	@Column(name = "maxa")
	public String getMaxa() {
		return maxa;
	}

	public void setMaxa(String maxa) {
		this.maxa = maxa;
	}

	@Column(name = "thonxom")
	public String getThonxom() {
		return thonxom;
	}

	public void setThonxom(String thonxom) {
		this.thonxom = thonxom;
	}

	@Column(name = "tenchuho")
	public String getTenchuho() {
		return tenchuho;
	}

	public void setTenchuho(String tenchuho) {
		this.tenchuho = tenchuho;
	}

	@Column(name = "gioitinhchuho")
	public int getGioitinhchuho() {
		return gioitinhchuho;
	}

	public void setGioitinhchuho(int gioitinhchuho) {
		this.gioitinhchuho = gioitinhchuho;
	}

	@Column(name = "ngaykiemdem")
	public Date getNgaykiemdem() {
		return ngaykiemdem;
	}

	public void setNgaykiemdem(Date ngaykiemdem) {
		this.ngaykiemdem = ngaykiemdem;
	}

	@Column(name = "timthaynha")
	public int getTimthaynha() {
		return timthaynha;
	}

	public void setTimthaynha(int timthaynha) {
		this.timthaynha = timthaynha;
	}

	@Column(name = "hotennguoitraloi")
	public String getHotennguoitraloi() {
		return hotennguoitraloi;
	}

	public void setHotennguoitraloi(String hotennguoitraloi) {
		this.hotennguoitraloi = hotennguoitraloi;
	}

	@Column(name = "lachuhokhong")
	public int getLachuhokhong() {
		return lachuhokhong;
	}

	public void setLachuhokhong(int lachuhokhong) {
		this.lachuhokhong = lachuhokhong;
	}

	@Column(name = "tendantoc")
	public String getTendantoc() {
		return tendantoc;
	}

	public void setTendantoc(String tendantoc) {
		this.tendantoc = tendantoc;
	}

	@Column(name = "kinhdo")
	public String getKinhdo() {
		return kinhdo;
	}

	public void setKinhdo(String kinhdo) {
		this.kinhdo = kinhdo;
	}

	@Column(name = "vido")
	public String getVido() {
		return vido;
	}

	public void setVido(String vido) {
		this.vido = vido;
	}

	@Column(name = "thanhphanhogd")
	public int getThanhphanhogd() {
		return thanhphanhogd;
	}

	public void setThanhphanhogd(int thanhphanhogd) {
		this.thanhphanhogd = thanhphanhogd;
	}

	@Column(name = "chuhodungds")
	public int getChuhodungds() {
		return chuhodungds;
	}

	public void setChuhodungds(int chuhodungds) {
		this.chuhodungds = chuhodungds;
	}

	@Column(name = "lydokhongdungds")
	public String getLydokhongdungds() {
		return lydokhongdungds;
	}

	public void setLydokhongdungds(String lydokhongdungds) {
		this.lydokhongdungds = lydokhongdungds;
	}

	@Column(name = "tenchuhohientai")
	public String getTenchuhohientai() {
		return tenchuhohientai;
	}

	public void setTenchuhohientai(String tenchuhohientai) {
		this.tenchuhohientai = tenchuhohientai;
	}

	@Column(name = "gioitinhchuhohientai")
	public int getGioitinhchuhohientai() {
		return gioitinhchuhohientai;
	}

	public void setGioitinhchuhohientai(int gioitinhchuhohientai) {
		this.gioitinhchuhohientai = gioitinhchuhohientai;
	}

	@Column(name = "conhatieu")
	public int getConhatieu() {
		return conhatieu;
	}

	public void setConhatieu(int conhatieu) {
		this.conhatieu = conhatieu;
	}

	@Column(name = "loainhatieu")
	public String getLoainhatieu() {
		return loainhatieu;
	}

	public void setLoainhatieu(String loainhatieu) {
		this.loainhatieu = loainhatieu;
	}

	@Column(name = "namxaydung")
	public int getNamxaydung() {
		return namxaydung;
	}

	public void setNamxaydung(int namxaydung) {
		this.namxaydung = namxaydung;
	}

	@Column(name = "nguonvon")
	public int getNguonvon() {
		return nguonvon;
	}

	public void setNguonvon(int nguonvon) {
		this.nguonvon = nguonvon;
	}

	@Column(name = "chitietvonvay")
	public String getChitietvonvay() {
		return chitietvonvay;
	}

	public void setChitietvonvay(String chitietvonvay) {
		this.chitietvonvay = chitietvonvay;
	}

	@Column(name = "duoccaitao")
	public int getDuoccaitao() {
		return duoccaitao;
	}

	public void setDuoccaitao(int duoccaitao) {
		this.duoccaitao = duoccaitao;
	}

	@Column(name = "loainhatieucu")
	public String getLoainhatieucu() {
		return loainhatieucu;
	}

	public void setLoainhatieucu(String loainhatieucu) {
		this.loainhatieucu = loainhatieucu;
	}

	@Column(name = "vesinhsachse")
	public int getVesinhsachse() {
		return vesinhsachse;
	}

	public void setVesinhsachse(int vesinhsachse) {
		this.vesinhsachse = vesinhsachse;
	}

	@Column(name = "delamvesinh")
	public int getDelamvesinh() {
		return delamvesinh;
	}

	public void setDelamvesinh(int delamvesinh) {
		this.delamvesinh = delamvesinh;
	}

	@Column(name = "muivesinh")
	public int getMuivesinh() {
		return muivesinh;
	}

	public void setMuivesinh(int muivesinh) {
		this.muivesinh = muivesinh;
	}

	@Column(name = "phiatrenkindao")
	public int getPhiatrenkindao() {
		return phiatrenkindao;
	}

	public void setPhiatrenkindao(int phiatrenkindao) {
		this.phiatrenkindao = phiatrenkindao;
	}

	@Column(name = "duchemuagio")
	public int getDuchemuagio() {
		return duchemuagio;
	}

	public void setDuchemuagio(int duchemuagio) {
		this.duchemuagio = duchemuagio;
	}

	@Column(name = "sancaotrentoithieu")
	public int getSancaotrentoithieu() {
		return sancaotrentoithieu;
	}

	public void setSancaotrentoithieu(int sancaotrentoithieu) {
		this.sancaotrentoithieu = sancaotrentoithieu;
	}

	@Column(name = "napbecontot")
	public int getNapbecontot() {
		return napbecontot;
	}

	public void setNapbecontot(int napbecontot) {
		this.napbecontot = napbecontot;
	}

	@Column(name = "cuaphanbitkin")
	public int getCuaphanbitkin() {
		return cuaphanbitkin;
	}

	public void setCuaphanbitkin(int cuaphanbitkin) {
		this.cuaphanbitkin = cuaphanbitkin;
	}

	public int getTranrangoai() {
		return tranrangoai;
	}

	public void setTranrangoai(int tranrangoai) {
		this.tranrangoai = tranrangoai;
	}

	public int getNuocthaididau() {
		return nuocthaididau;
	}

	public void setNuocthaididau(int nuocthaididau) {
		this.nuocthaididau = nuocthaididau;
	}

	public int getKhoangcachnguonnuoc() {
		return khoangcachnguonnuoc;
	}

	public void setKhoangcachnguonnuoc(int khoangcachnguonnuoc) {
		this.khoangcachnguonnuoc = khoangcachnguonnuoc;
	}

	public int getNgapkhimualon() {
		return ngapkhimualon;
	}

	public void setNgapkhimualon(int ngapkhimualon) {
		this.ngapkhimualon = ngapkhimualon;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public int getDaketthucdieutra() {
		return daketthucdieutra;
	}

	public void setDaketthucdieutra(int daketthucdieutra) {
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

	public int getDanhgiakiemdem() {
		return danhgiakiemdem;
	}

	public void setDanhgiakiemdem(int danhgiakiemdem) {
		this.danhgiakiemdem = danhgiakiemdem;
	}

	public Date getSavepoint() {
		return savepoint;
	}

	public void setSavepoint(Date savepoint) {
		this.savepoint = savepoint;
	}

	public int getSonguoitrongho() {
		return songuoitrongho;
	}

	public void setSonguoitrongho(int songuoitrongho) {
		this.songuoitrongho = songuoitrongho;
	}

	public int getThangxaydung() {
		return thangxaydung;
	}

	public void setThangxaydung(int thangxaydung) {
		this.thangxaydung = thangxaydung;
	}

	@Column(name = "LOAINGUONNUOC")
	public String getLoainguonnuoc() {
		return loainguonnuoc;
	}

	public void setLoainguonnuoc(String loainguonnuoc) {
		this.loainguonnuoc = loainguonnuoc;
	}
	@Column(name = "anhbechua")
	public String getAnhbechua() {
		return anhbechua;
	}

	public void setAnhbechua(String anhbechua) {
		this.anhbechua = anhbechua;
	}
	@Column(name = "anhtoancanh")
	public String getAnhtoancanh() {
		return anhtoancanh;
	}

	public void setAnhtoancanh(String anhtoancanh) {
		this.anhtoancanh = anhtoancanh;
	}
	@Column(name = "anhtrongnhatieu")
	public String getAnhtrongnhatieu() {
		return anhtrongnhatieu;
	}

	public void setAnhtrongnhatieu(String anhtrongnhatieu) {
		this.anhtrongnhatieu = anhtrongnhatieu;
	}

}
