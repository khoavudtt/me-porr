package com.mcvn.project.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "me_kehoachkiemdemnuoc")
public class KeHoachKiemDemNuoc {
	private int id;
	private int nam;
	private int tramcapnuocid;
	private int kiemdemvienid;
	private Date ngaybatdau;
	private Date ngayketthuc;
	private String mota;
	private Timestamp ngaytao;
	private int idnguoitao;
	private Timestamp ngayxuatban;
	private int idnguoixuatban;
	private Timestamp ngaydong;
	private Integer idnguoidong;
	private Timestamp lastsavepoint;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public int getTramcapnuocid() {
		return tramcapnuocid;
	}

	public void setTramcapnuocid(int tramcapnuocid) {
		this.tramcapnuocid = tramcapnuocid;
	}

	public int getKiemdemvienid() {
		return kiemdemvienid;
	}

	public void setKiemdemvienid(int kiemdemvienid) {
		this.kiemdemvienid = kiemdemvienid;
	}

	public Date getNgaybatdau() {
		return ngaybatdau;
	}

	public void setNgaybatdau(Date ngaybatdau) {
		this.ngaybatdau = ngaybatdau;
	}

	public Date getNgayketthuc() {
		return ngayketthuc;
	}

	public void setNgayketthuc(Date ngayketthuc) {
		this.ngayketthuc = ngayketthuc;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Timestamp getNgaytao() {
		return ngaytao;
	}

	public void setNgaytao(Timestamp ngaytao) {
		this.ngaytao = ngaytao;
	}

	public int getIdnguoitao() {
		return idnguoitao;
	}

	public void setIdnguoitao(int idnguoitao) {
		this.idnguoitao = idnguoitao;
	}

	public Timestamp getNgayxuatban() {
		return ngayxuatban;
	}

	public void setNgayxuatban(Timestamp ngayxuatban) {
		this.ngayxuatban = ngayxuatban;
	}

	public int getIdnguoixuatban() {
		return idnguoixuatban;
	}

	public void setIdnguoixuatban(int idnguoixuatban) {
		this.idnguoixuatban = idnguoixuatban;
	}

	public Timestamp getNgaydong() {
		return ngaydong;
	}

	public void setNgaydong(Timestamp ngaydong) {
		this.ngaydong = ngaydong;
	}

	public Integer getIdnguoidong() {
		return idnguoidong;
	}

	public void setIdnguoidong(Integer idnguoidong) {
		this.idnguoidong = idnguoidong;
	}

	public Timestamp getLastsavepoint() {
		return lastsavepoint;
	}

	public void setLastsavepoint(Timestamp lastsavepoint) {
		this.lastsavepoint = lastsavepoint;
	}

}
