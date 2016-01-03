package com.mcvn.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "me_kehoachkiemdemvesinh")
public class KeHoachKiemDemVeSinh {
	private int id;
	private int nam;
	private String matinh;
	private String mahuyen;
	private int kiemdemvienid;
	private Date ngaybatdau;
	private Date ngayketthuc;
	private String mota;;
	private Date ngaytao;
	private int idnguoitao;
	private Date ngayxuatban;
	private int idnguoixuatban;
	private String TableID;
	private Date ngaydong;
	private int idnguoidong;
	private Date LastSavePoint;

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

	public Date getNgayxuatban() {
		return ngayxuatban;
	}

	public void setNgayxuatban(Date ngayxuatban) {
		this.ngayxuatban = ngayxuatban;
	}

	public int getIdnguoixuatban() {
		return idnguoixuatban;
	}

	public void setIdnguoixuatban(int idnguoixuatban) {
		this.idnguoixuatban = idnguoixuatban;
	}

	public String getTableID() {
		return TableID;
	}

	public void setTableID(String tableID) {
		TableID = tableID;
	}

	public Date getNgaydong() {
		return ngaydong;
	}

	public void setNgaydong(Date ngaydong) {
		this.ngaydong = ngaydong;
	}

	public int getIdnguoidong() {
		return idnguoidong;
	}

	public void setIdnguoidong(int idnguoidong) {
		this.idnguoidong = idnguoidong;
	}

	public Date getLastSavePoint() {
		return LastSavePoint;
	}

	public void setLastSavePoint(Date lastSavePoint) {
		LastSavePoint = lastSavePoint;
	}

}
