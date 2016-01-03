package com.mcvn.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "me_daunoinuoc")
public class DauNoiNuoc {
	private int ID;
	private int TRAMCAPNUOCID;
	private String MATINH;
	private String MAHUYEN;
	private String MAXA;
	private String THONXOM;
	private String TENCHUHO;
	private int GIOITINH;
	private Date NGAYDAUNOIHOPDONG;
	private int TRANGTHAI;
	private int NAMBAOCAO;
	private Date NGAYTAO;
	private int IDNGUOIDANHGIA;

	private Date NGAYDANHGIA;
	private Date NGAYKIEMDEM;
	private String DANHGIANUOCHVS;
	private String SOSERYDONGHO;
	private Date NGAYDAUNOITHUCTE;
	private String VIDO;
	private String KINHDO;
	private int TONGDOANHTHU;
	private int THANHPHANHOGIADINH;
	private int SONGUOITRONGHO;
	private int IDNGUOITAO;
	private int GHICHU;

	public int getTRAMCAPNUOCID() {
		return TRAMCAPNUOCID;
	}

	@Id
	@Column(name = "ID")
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setTRAMCAPNUOCID(int tRAMCAPNUOCID) {
		TRAMCAPNUOCID = tRAMCAPNUOCID;
	}

	public String getMATINH() {
		return MATINH;
	}

	public void setMATINH(String mATINH) {
		MATINH = mATINH;
	}

	public String getMAHUYEN() {
		return MAHUYEN;
	}

	public void setMAHUYEN(String mAHUYEN) {
		MAHUYEN = mAHUYEN;
	}

	public String getMAXA() {
		return MAXA;
	}

	public void setMAXA(String mAXA) {
		MAXA = mAXA;
	}

	public String getTHONXOM() {
		return THONXOM;
	}

	public void setTHONXOM(String tHONXOM) {
		THONXOM = tHONXOM;
	}

	public String getTENCHUHO() {
		return TENCHUHO;
	}

	public void setTENCHUHO(String tENCHUHO) {
		TENCHUHO = tENCHUHO;
	}

	public int getGIOITINH() {
		return GIOITINH;
	}

	public void setGIOITINH(int gIOITINH) {
		GIOITINH = gIOITINH;
	}

	public Date getNGAYDAUNOIHOPDONG() {
		return NGAYDAUNOIHOPDONG;
	}

	public void setNGAYDAUNOIHOPDONG(Date nGAYDAUNOIHOPDONG) {
		NGAYDAUNOIHOPDONG = nGAYDAUNOIHOPDONG;
	}

	public int getTRANGTHAI() {
		return TRANGTHAI;
	}

	public void setTRANGTHAI(int tRANGTHAI) {
		TRANGTHAI = tRANGTHAI;
	}

	public int getNAMBAOCAO() {
		return NAMBAOCAO;
	}

	public void setNAMBAOCAO(int nAMBAOCAO) {
		NAMBAOCAO = nAMBAOCAO;
	}

	public Date getNGAYTAO() {
		return NGAYTAO;
	}

	public void setNGAYTAO(Date nGAYTAO) {
		NGAYTAO = nGAYTAO;
	}

	public int getIDNGUOIDANHGIA() {
		return IDNGUOIDANHGIA;
	}

	public void setIDNGUOIDANHGIA(int iDNGUOIDANHGIA) {
		IDNGUOIDANHGIA = iDNGUOIDANHGIA;
	}

	public Date getNGAYDANHGIA() {
		return NGAYDANHGIA;
	}

	public void setNGAYDANHGIA(Date nGAYDANHGIA) {
		NGAYDANHGIA = nGAYDANHGIA;
	}

	public Date getNGAYKIEMDEM() {
		return NGAYKIEMDEM;
	}

	public void setNGAYKIEMDEM(Date nGAYKIEMDEM) {
		NGAYKIEMDEM = nGAYKIEMDEM;
	}

	public String getDANHGIANUOCHVS() {
		return DANHGIANUOCHVS;
	}

	public void setDANHGIANUOCHVS(String dANHGIANUOCHVS) {
		DANHGIANUOCHVS = dANHGIANUOCHVS;
	}

	public String getSOSERYDONGHO() {
		return SOSERYDONGHO;
	}

	public void setSOSERYDONGHO(String sOSERYDONGHO) {
		SOSERYDONGHO = sOSERYDONGHO;
	}

	public Date getNGAYDAUNOITHUCTE() {
		return NGAYDAUNOITHUCTE;
	}

	public void setNGAYDAUNOITHUCTE(Date nGAYDAUNOITHUCTE) {
		NGAYDAUNOITHUCTE = nGAYDAUNOITHUCTE;
	}

	public String getVIDO() {
		return VIDO;
	}

	public void setVIDO(String vIDO) {
		VIDO = vIDO;
	}

	public String getKINHDO() {
		return KINHDO;
	}

	public void setKINHDO(String kINHDO) {
		KINHDO = kINHDO;
	}

	public int getTONGDOANHTHU() {
		return TONGDOANHTHU;
	}

	public void setTONGDOANHTHU(int tONGDOANHTHU) {
		TONGDOANHTHU = tONGDOANHTHU;
	}

	public int getTHANHPHANHOGIADINH() {
		return THANHPHANHOGIADINH;
	}

	public void setTHANHPHANHOGIADINH(int tHANHPHANHOGIADINH) {
		THANHPHANHOGIADINH = tHANHPHANHOGIADINH;
	}

	public int getSONGUOITRONGHO() {
		return SONGUOITRONGHO;
	}

	public void setSONGUOITRONGHO(int sONGUOITRONGHO) {
		SONGUOITRONGHO = sONGUOITRONGHO;
	}

	public int getIDNGUOITAO() {
		return IDNGUOITAO;
	}

	public void setIDNGUOITAO(int iDNGUOITAO) {
		IDNGUOITAO = iDNGUOITAO;
	}

	public int getGHICHU() {
		return GHICHU;
	}

	public void setGHICHU(int gHICHU) {
		GHICHU = gHICHU;
	}

}
