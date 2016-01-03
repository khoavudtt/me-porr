package com.mcvn.project.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "me_kiemdemvien")
public class KiemDemVien {
	private int id;
	private String HOVATEN;
	private String taikhoan;
	private String matkhau;
	private Integer CAPHOATDONG;
	private String ORGCODE1;
	private String ORGCODE2;
	private String DIACHI;
	private String CHUNGMINHTHU;
	private String DIENTHOAI;
	private String IMEI;
	private Integer TRANGTHAI;
	private Timestamp NGAYTAO;
	private Integer IDNGUOITAO;
	private String nameQuanLy;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHOVATEN() {
		return HOVATEN;
	}

	@Column(name = "TAIKHOAN")
	public String getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}

	@Column(name = "MATKHAU")
	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public void setHOVATEN(String hOVATEN) {
		HOVATEN = hOVATEN;
	}

	public Integer getCAPHOATDONG() {
		return CAPHOATDONG;
	}

	public void setCAPHOATDONG(Integer cAPHOATDONG) {
		CAPHOATDONG = cAPHOATDONG;
	}

	public String getORGCODE1() {
		return ORGCODE1;
	}

	public void setORGCODE1(String oRGCODE1) {
		ORGCODE1 = oRGCODE1;
	}

	public String getORGCODE2() {
		return ORGCODE2;
	}

	public void setORGCODE2(String oRGCODE2) {
		ORGCODE2 = oRGCODE2;
	}

	public String getDIACHI() {
		return DIACHI;
	}

	public void setDIACHI(String dIACHI) {
		DIACHI = dIACHI;
	}

	public String getCHUNGMINHTHU() {
		return CHUNGMINHTHU;
	}

	public void setCHUNGMINHTHU(String cHUNGMINHTHU) {
		CHUNGMINHTHU = cHUNGMINHTHU;
	}

	public String getDIENTHOAI() {
		return DIENTHOAI;
	}

	public void setDIENTHOAI(String dIENTHOAI) {
		DIENTHOAI = dIENTHOAI;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public Integer getTRANGTHAI() {
		return TRANGTHAI;
	}

	public void setTRANGTHAI(Integer tRANGTHAI) {
		TRANGTHAI = tRANGTHAI;
	}

	public Timestamp getNGAYTAO() {
		return NGAYTAO;
	}

	public void setNGAYTAO(Timestamp nGAYTAO) {
		NGAYTAO = nGAYTAO;
	}

	public Integer getIDNGUOITAO() {
		return IDNGUOITAO;
	}

	public void setIDNGUOITAO(Integer iDNGUOITAO) {
		IDNGUOITAO = iDNGUOITAO;
	}

	public String getNameQuanLy() {
		return nameQuanLy;
	}

	public void setNameQuanLy(String nameQuanLy) {
		this.nameQuanLy = nameQuanLy;
	}

}
