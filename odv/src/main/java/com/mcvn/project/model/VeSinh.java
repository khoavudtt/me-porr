package com.mcvn.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "me_vesinhgiadinh")
public class VeSinh {
	private int id;
	private String matinh;
	private String mahuyen;
	private String maxa;
	private String thonxom;
	private String tenchuho;
	private int gioitinhchuho;
	private int trangthai;
	private String ghichu;
	private Date ngaytao;
	private int idnguoitao;
	private int thanhphanhogd;
	private String kinhdo;
	private String vido;
	private int conhatieu;
	private int nhatieuhvs;
	private String loainhatieu;
	private int duoccaitao;
	private int namxaydung;
	private int nguonvon;
	private Date ngaykiemdem;
	private Date ngaydanhgia;
	private int idnguoidanhgia;
	private int soNguoiTrongHo;
	private int thangxaydung;
	private int MAUNGAUNHIEN;
	
	
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getThonxom() {
		return thonxom;
	}
	public void setThonxom(String thonxom) {
		this.thonxom = thonxom;
	}
	public String getTenchuho() {
		return tenchuho;
	}
	public void setTenchuho(String tenchuho) {
		this.tenchuho = tenchuho;
	}
	public int getGioitinhchuho() {
		return gioitinhchuho;
	}
	public void setGioitinhchuho(int gioitinhchuho) {
		this.gioitinhchuho = gioitinhchuho;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	public Date getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}
	public int getIdnguoitao() {
		return idnguoitao;
	}
	public void setIdnguoitao(int idnguoitao) {
		this.idnguoitao = idnguoitao;
	}
	public int getThanhphanhogd() {
		return thanhphanhogd;
	}
	public void setThanhphanhogd(int thanhphanhogd) {
		this.thanhphanhogd = thanhphanhogd;
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
	public int getConhatieu() {
		return conhatieu;
	}
	public void setConhatieu(int conhatieu) {
		this.conhatieu = conhatieu;
	}
	public int getNhatieuhvs() {
		return nhatieuhvs;
	}
	public void setNhatieuhvs(int nhatieuhvs) {
		this.nhatieuhvs = nhatieuhvs;
	}
	public String getLoainhatieu() {
		return loainhatieu;
	}
	public void setLoainhatieu(String loainhatieu) {
		this.loainhatieu = loainhatieu;
	}
	public int getDuoccaitao() {
		return duoccaitao;
	}
	public void setDuoccaitao(int duoccaitao) {
		this.duoccaitao = duoccaitao;
	}
	public int getNamxaydung() {
		return namxaydung;
	}
	public void setNamxaydung(int namxaydung) {
		this.namxaydung = namxaydung;
	}
	public int getNguonvon() {
		return nguonvon;
	}
	public void setNguonvon(int nguonvon) {
		this.nguonvon = nguonvon;
	}
	public Date getNgaykiemdem() {
		return ngaykiemdem;
	}
	public void setNgaykiemdem(Date ngaykiemdem) {
		this.ngaykiemdem = ngaykiemdem;
	}
	public Date getNgaydanhgia() {
		return ngaydanhgia;
	}
	public void setNgaydanhgia(Date ngaydanhgia) {
		this.ngaydanhgia = ngaydanhgia;
	}
	public int getIdnguoidanhgia() {
		return idnguoidanhgia;
	}
	public void setIdnguoidanhgia(int idnguoidanhgia) {
		this.idnguoidanhgia = idnguoidanhgia;
	}
	public int getSoNguoiTrongHo() {
		return soNguoiTrongHo;
	}
	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		this.soNguoiTrongHo = soNguoiTrongHo;
	}
	public int getThangxaydung() {
		return thangxaydung;
	}
	public void setThangxaydung(int thangxaydung) {
		this.thangxaydung = thangxaydung;
	}
	public int getMAUNGAUNHIEN() {
		return MAUNGAUNHIEN;
	}
	public void setMAUNGAUNHIEN(int mAUNGAUNHIEN) {
		MAUNGAUNHIEN = mAUNGAUNHIEN;
	}
	
}
