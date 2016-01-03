package com.mcvn.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "me_vesinhcongtrinh")
public class VeSinhCongTrinh {
	private int id;
	private String tencongtrinh;
	private int loaicongtrinh;
	private String matinh;
	private String mahuyen;
	private String maxa;
	private String diachi;
	private int trangthai;
	private int nambaocao;
	private String ghichu;
	private Date ngaytao;
	private int idnguoitao;
	private String kinhdo;
	private String vido;
	private String loainguonnuoc;
	private int nguonnuochvs;
	private String loainhatieu;
	private int nhatieuhvs;
	private int ketluanhvs;
	private Date ngaykiemdem;
	private Date ngaydanhgia;
	private int idnguoidanhgia;
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTencongtrinh() {
		return tencongtrinh;
	}
	public void setTencongtrinh(String tencongtrinh) {
		this.tencongtrinh = tencongtrinh;
	}
	public int getLoaicongtrinh() {
		return loaicongtrinh;
	}
	public void setLoaicongtrinh(int loaicongtrinh) {
		this.loaicongtrinh = loaicongtrinh;
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
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	public int getNambaocao() {
		return nambaocao;
	}
	public void setNambaocao(int nambaocao) {
		this.nambaocao = nambaocao;
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
	public int getNguonnuochvs() {
		return nguonnuochvs;
	}
	public void setNguonnuochvs(int nguonnuochvs) {
		this.nguonnuochvs = nguonnuochvs;
	}
	public String getLoainhatieu() {
		return loainhatieu;
	}
	public void setLoainhatieu(String loainhatieu) {
		this.loainhatieu = loainhatieu;
	}
	public int getNhatieuhvs() {
		return nhatieuhvs;
	}
	public void setNhatieuhvs(int nhatieuhvs) {
		this.nhatieuhvs = nhatieuhvs;
	}
	public int getKetluanhvs() {
		return ketluanhvs;
	}
	public void setKetluanhvs(int ketluanhvs) {
		this.ketluanhvs = ketluanhvs;
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

	

}
