package com.dtt.nuocsach.bean;

import javax.persistence.Entity;

@Entity
public class ThongTinKiemDemVSCCT {
	private Integer id;
	private String anhchungnhan;
	private String anhbechua;
	private String anhtrongnhatieu;
	private String anhtoancanh;
	private Integer vesinhcongtrinhid;
	private Integer loaicongtrinh;
	private String idkiemdem;
	private String idmobile;
	private Integer kehoachkiemdemvesinhid;
	private String tencongtrinh;
	private String matinh;
	private String mahuyen;
	private String maxa;
	private String ngaykiemdem;
	private String diachi;
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
	private Integer sohotieu;
	private Integer sonhatieu;
	private String loainhatieu;
	private Integer vesinhsachse;
	private Integer delamvesinh;
	private Integer muivesinh;
	private Integer phiatrenkindao;
	private Integer duchemuagio;
	private Integer sancaotrentoithieu;
	private Integer napbecontot;
	private Integer cuaphanbitkin;
	private Integer tranrangoai;
	private Integer nuocthaididau;
	private Integer khoangcachnguonnuoc;
	private Integer ngapkhimualon;
	private Integer cocongtrinhruatay;
	private String chitietcongtrinhruatay;
	private String ghichu;
	private Integer daketthucdieutra;
	private String lydokhonghoanthanh;
	private String imei;
	private String idmap;
	private int sancaotoithieu;
	private String tennhatieu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnhtoancanh() {
		return anhtoancanh;
	}

	public void setAnhtoancanh(String anhtoancanh) {
		this.anhtoancanh = anhtoancanh;
	}

	public Integer getVesinhcongtrinhid() {
		return vesinhcongtrinhid;
	}

	public void setVesinhcongtrinhid(Integer vesinhcongtrinhid) {
		this.vesinhcongtrinhid = vesinhcongtrinhid;
	}

	public Integer getKehoachkiemdemvesinhid() {
		return kehoachkiemdemvesinhid;
	}

	public void setKehoachkiemdemvesinhid(Integer kehoachkiemdemvesinhid) {
		this.kehoachkiemdemvesinhid = kehoachkiemdemvesinhid;
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

	public Integer getSohotieu() {
		return sohotieu;
	}

	public void setSohotieu(Integer sohotieu) {
		this.sohotieu = sohotieu;
	}

	public Integer getSonhatieu() {
		return sonhatieu;
	}

	public void setSonhatieu(Integer sonhatieu) {
		this.sonhatieu = sonhatieu;
	}

	public String getLoainhatieu() {
		return loainhatieu;
	}

	public void setLoainhatieu(String loainhatieu) {
		this.loainhatieu = loainhatieu;
	}

	public Integer getVesinhsachse() {
		return vesinhsachse;
	}

	public void setVesinhsachse(Integer vesinhsachse) {
		this.vesinhsachse = vesinhsachse;
	}

	public Integer getDelamvesinh() {
		return delamvesinh;
	}

	public void setDelamvesinh(Integer delamvesinh) {
		this.delamvesinh = delamvesinh;
	}

	public Integer getMuivesinh() {
		return muivesinh;
	}

	public void setMuivesinh(Integer muivesinh) {
		this.muivesinh = muivesinh;
	}

	public Integer getPhiatrenkindao() {
		return phiatrenkindao;
	}

	public void setPhiatrenkindao(Integer phiatrenkindao) {
		this.phiatrenkindao = phiatrenkindao;
	}

	public Integer getDuchemuagio() {
		return duchemuagio;
	}

	public void setDuchemuagio(Integer duchemuagio) {
		this.duchemuagio = duchemuagio;
	}

	public Integer getSancaotrentoithieu() {
		return sancaotrentoithieu;
	}

	public void setSancaotrentoithieu(Integer sancaotrentoithieu) {
		this.sancaotrentoithieu = sancaotrentoithieu;
	}

	public Integer getNapbecontot() {
		return napbecontot;
	}

	public void setNapbecontot(Integer napbecontot) {
		this.napbecontot = napbecontot;
	}

	public Integer getCuaphanbitkin() {
		return cuaphanbitkin;
	}

	public void setCuaphanbitkin(Integer cuaphanbitkin) {
		this.cuaphanbitkin = cuaphanbitkin;
	}

	public Integer getTranrangoai() {
		return tranrangoai;
	}

	public void setTranrangoai(Integer tranrangoai) {
		this.tranrangoai = tranrangoai;
	}

	public Integer getNuocthaididau() {
		return nuocthaididau;
	}

	public void setNuocthaididau(Integer nuocthaididau) {
		this.nuocthaididau = nuocthaididau;
	}

	public Integer getKhoangcachnguonnuoc() {
		return khoangcachnguonnuoc;
	}

	public void setKhoangcachnguonnuoc(Integer khoangcachnguonnuoc) {
		this.khoangcachnguonnuoc = khoangcachnguonnuoc;
	}

	public Integer getNgapkhimualon() {
		return ngapkhimualon;
	}

	public void setNgapkhimualon(Integer ngapkhimualon) {
		this.ngapkhimualon = ngapkhimualon;
	}

	public Integer getCocongtrinhruatay() {
		return cocongtrinhruatay;
	}

	public void setCocongtrinhruatay(Integer cocongtrinhruatay) {
		this.cocongtrinhruatay = cocongtrinhruatay;
	}

	public String getChitietcongtrinhruatay() {
		return chitietcongtrinhruatay;
	}

	public void setChitietcongtrinhruatay(String chitietcongtrinhruatay) {
		this.chitietcongtrinhruatay = chitietcongtrinhruatay;
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

	public String getAnhchungnhan() {
		return anhchungnhan;
	}

	public void setAnhchungnhan(String anhchungnhan) {
		this.anhchungnhan = anhchungnhan;
	}

	public Integer getLoaicongtrinh() {
		return loaicongtrinh;
	}

	public void setLoaicongtrinh(Integer loaicongtrinh) {
		this.loaicongtrinh = loaicongtrinh;
	}

	public String getIdkiemdem() {
		return idkiemdem;
	}

	public void setIdkiemdem(String idkiemdem) {
		this.idkiemdem = idkiemdem;
	}

	public String getIdmobile() {
		return idmobile;
	}

	public void setIdmobile(String idmobile) {
		this.idmobile = idmobile;
	}

	public String getNgaykiemdem() {
		return ngaykiemdem;
	}

	public void setNgaykiemdem(String ngaykiemdem) {
		this.ngaykiemdem = ngaykiemdem;
	}

	public String getAnhbechua() {
		return anhbechua;
	}

	public void setAnhbechua(String anhbechua) {
		this.anhbechua = anhbechua;
	}

	public String getAnhtrongnhatieu() {
		return anhtrongnhatieu;
	}

	public void setAnhtrongnhatieu(String anhtrongnhatieu) {
		this.anhtrongnhatieu = anhtrongnhatieu;
	}

	public String getIdmap() {
		return idmap;
	}

	public void setIdmap(String idmap) {
		this.idmap = idmap;
	}

	public int getSancaotoithieu() {
		return sancaotoithieu;
	}

	public void setSancaotoithieu(int sancaotoithieu) {
		this.sancaotoithieu = sancaotoithieu;
	}

	public String getTennhatieu() {
		return tennhatieu;
	}

	public void setTennhatieu(String tennhatieu) {
		this.tennhatieu = tennhatieu;
	}

	public ThongTinKiemDemVSCCT(Integer id, Integer vesinhcongtrinhid, Integer kehoachkiemdemvesinhid,
			String tencongtrinh, Integer loaicongtrinh, String matinh, String mahuyen, String maxa, String diachi,
			String hotennguoitraloi, String sodienthoai, String gioitinhnguoitraloi, String vaitrochucdanh,
			Integer soca, Integer songuoitrongca, String kinhdo, String vido, String loainguonnuoc, Integer datqcvn,
			Integer dattieuchuanhvs, Integer sonhatieu, String ghichu, Integer daketthucdieutra, String lydokhonghoanthanh,
			String imei) {
		super();
		this.id = id;
		this.vesinhcongtrinhid = vesinhcongtrinhid;
		this.kehoachkiemdemvesinhid = kehoachkiemdemvesinhid;
		this.tencongtrinh = tencongtrinh;
		this.loaicongtrinh = loaicongtrinh;
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

}
