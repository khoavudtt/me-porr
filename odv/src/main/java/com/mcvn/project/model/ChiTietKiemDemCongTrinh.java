package com.mcvn.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "me_chitietkiemdemcongtrinh")
public class ChiTietKiemDemCongTrinh {

	private int id;
	private int thongtinkiemdemcongtrinhid;
	private String loainhatieu;
	private String anhtoancanh;
	private String anhtrongnhatieu;
	private Integer sohotieu;
	private int vesinhsachse;
	private int delamvesinh;
	private int muivesinh;
	private int phiatrenkindao;
	private int duchemuagio;
	private int sancaotrentoithieu;
	private int cocongtrinhruatay;
	private String chitietcongtrinhruatay;
	private String anhbechua;
	private int napbecontot;
	private int cuaphanbitkin;
	private int tranrangoai;
	private int nuocthaididau;
	private int khoangcachnguonnuoc;
	private int ngapkhimualon;
	private String tencongtrinh;
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public Integer getSohotieu() {
		return sohotieu;
	}

	public void setSohotieu(Integer sohotieu) {
		this.sohotieu = sohotieu;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getThongtinkiemdemcongtrinhid() {
		return thongtinkiemdemcongtrinhid;
	}

	public String getTencongtrinh() {
		return tencongtrinh;
	}

	public void setTencongtrinh(String tencongtrinh) {
		this.tencongtrinh = tencongtrinh;
	}

	public void setThongtinkiemdemcongtrinhid(int thongtinkiemdemcongtrinhid) {
		this.thongtinkiemdemcongtrinhid = thongtinkiemdemcongtrinhid;
	}

	public String getLoainhatieu() {
		return loainhatieu;
	}

	public void setLoainhatieu(String loainhatieu) {
		this.loainhatieu = loainhatieu;
	}

	public String getAnhtoancanh() {
		return anhtoancanh;
	}

	public void setAnhtoancanh(String anhtoancanh) {
		this.anhtoancanh = anhtoancanh;
	}

	public String getAnhtrongnhatieu() {
		return anhtrongnhatieu;
	}

	public void setAnhtrongnhatieu(String anhtrongnhatieu) {
		this.anhtrongnhatieu = anhtrongnhatieu;
	}

	public int getVesinhsachse() {
		return vesinhsachse;
	}

	public void setVesinhsachse(int vesinhsachse) {
		this.vesinhsachse = vesinhsachse;
	}

	public int getDelamvesinh() {
		return delamvesinh;
	}

	public void setDelamvesinh(int delamvesinh) {
		this.delamvesinh = delamvesinh;
	}

	public int getMuivesinh() {
		return muivesinh;
	}

	public void setMuivesinh(int muivesinh) {
		this.muivesinh = muivesinh;
	}

	public int getPhiatrenkindao() {
		return phiatrenkindao;
	}

	public void setPhiatrenkindao(int phiatrenkindao) {
		this.phiatrenkindao = phiatrenkindao;
	}

	public int getDuchemuagio() {
		return duchemuagio;
	}

	public void setDuchemuagio(int duchemuagio) {
		this.duchemuagio = duchemuagio;
	}

	public int getSancaotrentoithieu() {
		return sancaotrentoithieu;
	}

	public void setSancaotrentoithieu(int sancaotrentoithieu) {
		this.sancaotrentoithieu = sancaotrentoithieu;
	}

	public int getCocongtrinhruatay() {
		return cocongtrinhruatay;
	}

	public void setCocongtrinhruatay(int cocongtrinhruatay) {
		this.cocongtrinhruatay = cocongtrinhruatay;
	}

	public String getChitietcongtrinhruatay() {
		return chitietcongtrinhruatay;
	}

	public void setChitietcongtrinhruatay(String chitietcongtrinhruatay) {
		this.chitietcongtrinhruatay = chitietcongtrinhruatay;
	}

	public String getAnhbechua() {
		return anhbechua;
	}

	public void setAnhbechua(String anhbechua) {
		this.anhbechua = anhbechua;
	}

	public int getNapbecontot() {
		return napbecontot;
	}

	public void setNapbecontot(int napbecontot) {
		this.napbecontot = napbecontot;
	}

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

}
