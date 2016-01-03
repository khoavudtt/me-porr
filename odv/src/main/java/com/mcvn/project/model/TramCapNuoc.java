package com.mcvn.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "me_tramcapnuoc")
public class TramCapNuoc {
	private int ID;
	private String MATRAM;
	private String TENTRAM;
	private String MATINH;
	private String TENTINH;
	private String MAHUYEN;
	private String TENHUYEN;
	private String MAXA;
	private String TENXA;
	private String DIACHI;
	private String KINHDO;
	private String VIDO;
	private int LOAIHINH;
	private String LOAIMOHINH;
	private String TENMOHINH;
	private int CONGXUATTHIETKE;
	private int TONGDAUNOITHIETKE;
	private int SONUOICAPTHIETKE;
	private int TINHTRANGDUAN;
	private int TIENDOXAYDUNG;
	private int NAMXAYDUNG;
	private int NAMHOANTHANH;
	private Date NGAYVANHANH;
	private int BOMAYVANHANH;
	private String CHICHU;
	private Date NGAYTAO;
	private long IDNGUOITAO;
	private long IDNGUOIDANHGIA;
	private Date NGAYDANHGIA;
	private int TRANGTHAICAPNUOC;
	private int CONGXUATTHUCTE;
	private int SONGUOICAPTHUCTE;
	private int TONGCHIPHI;
	private int TONGDOANHTTHU;
	private int NUOCDATTIEUCHUAN;
	private int NUOCCOASEN;
	private int NUOCTHATTHOAT;
	private int TRANGTHAIDANHGIA;

	@Id
	@Column(name = "ID")
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMATRAM() {
		return MATRAM;
	}

	public void setMATRAM(String mATRAM) {
		MATRAM = mATRAM;
	}

	public String getTENTRAM() {
		return TENTRAM;
	}

	public void setTENTRAM(String tENTRAM) {
		TENTRAM = tENTRAM;
	}

	public String getMATINH() {
		return MATINH;
	}

	public void setMATINH(String mATINH) {
		MATINH = mATINH;
	}

	public String getTENTINH() {
		return TENTINH;
	}

	public void setTENTINH(String tENTINH) {
		TENTINH = tENTINH;
	}

	public String getMAHUYEN() {
		return MAHUYEN;
	}

	public void setMAHUYEN(String mAHUYEN) {
		MAHUYEN = mAHUYEN;
	}

	public String getTENHUYEN() {
		return TENHUYEN;
	}

	public void setTENHUYEN(String tENHUYEN) {
		TENHUYEN = tENHUYEN;
	}

	public String getMAXA() {
		return MAXA;
	}

	public void setMAXA(String mAXA) {
		MAXA = mAXA;
	}

	public String getTENXA() {
		return TENXA;
	}

	public void setTENXA(String tENXA) {
		TENXA = tENXA;
	}

	public String getDIACHI() {
		return DIACHI;
	}

	public void setDIACHI(String dIACHI) {
		DIACHI = dIACHI;
	}

	public String getKINHDO() {
		return KINHDO;
	}

	public void setKINHDO(String kINHDO) {
		KINHDO = kINHDO;
	}

	public String getVIDO() {
		return VIDO;
	}

	public void setVIDO(String vIDO) {
		VIDO = vIDO;
	}

	public int getLOAIHINH() {
		return LOAIHINH;
	}

	public void setLOAIHINH(int lOAIHINH) {
		LOAIHINH = lOAIHINH;
	}

	public String getLOAIMOHINH() {
		return LOAIMOHINH;
	}

	public void setLOAIMOHINH(String lOAIMOHINH) {
		LOAIMOHINH = lOAIMOHINH;
	}

	public String getTENMOHINH() {
		return TENMOHINH;
	}

	public void setTENMOHINH(String tENMOHINH) {
		TENMOHINH = tENMOHINH;
	}

	public int getCONGXUATTHIETKE() {
		return CONGXUATTHIETKE;
	}

	public void setCONGXUATTHIETKE(int cONGXUATTHIETKE) {
		CONGXUATTHIETKE = cONGXUATTHIETKE;
	}

	public int getTONGDAUNOITHIETKE() {
		return TONGDAUNOITHIETKE;
	}

	public void setTONGDAUNOITHIETKE(int tONGDAUNOITHIETKE) {
		TONGDAUNOITHIETKE = tONGDAUNOITHIETKE;
	}

	public int getSONUOICAPTHIETKE() {
		return SONUOICAPTHIETKE;
	}

	public void setSONUOICAPTHIETKE(int sONUOICAPTHIETKE) {
		SONUOICAPTHIETKE = sONUOICAPTHIETKE;
	}

	public int getTINHTRANGDUAN() {
		return TINHTRANGDUAN;
	}

	public void setTINHTRANGDUAN(int tINHTRANGDUAN) {
		TINHTRANGDUAN = tINHTRANGDUAN;
	}

	public int getTIENDOXAYDUNG() {
		return TIENDOXAYDUNG;
	}

	public void setTIENDOXAYDUNG(int tIENDOXAYDUNG) {
		TIENDOXAYDUNG = tIENDOXAYDUNG;
	}

	public int getNAMXAYDUNG() {
		return NAMXAYDUNG;
	}

	public void setNAMXAYDUNG(int nAMXAYDUNG) {
		NAMXAYDUNG = nAMXAYDUNG;
	}

	public int getNAMHOANTHANH() {
		return NAMHOANTHANH;
	}

	public void setNAMHOANTHANH(int nAMHOANTHANH) {
		NAMHOANTHANH = nAMHOANTHANH;
	}

	public Date getNGAYVANHANH() {
		return NGAYVANHANH;
	}

	public void setNGAYVANHANH(Date nGAYVANHANH) {
		NGAYVANHANH = nGAYVANHANH;
	}

	public int getBOMAYVANHANH() {
		return BOMAYVANHANH;
	}

	public void setBOMAYVANHANH(int bOMAYVANHANH) {
		BOMAYVANHANH = bOMAYVANHANH;
	}

	public String getCHICHU() {
		return CHICHU;
	}

	public void setCHICHU(String cHICHU) {
		CHICHU = cHICHU;
	}

	public Date getNGAYTAO() {
		return NGAYTAO;
	}

	public void setNGAYTAO(Date nGAYTAO) {
		NGAYTAO = nGAYTAO;
	}

	public long getIDNGUOITAO() {
		return IDNGUOITAO;
	}

	public void setIDNGUOITAO(long iDNGUOITAO) {
		IDNGUOITAO = iDNGUOITAO;
	}

	public long getIDNGUOIDANHGIA() {
		return IDNGUOIDANHGIA;
	}

	public void setIDNGUOIDANHGIA(long iDNGUOIDANHGIA) {
		IDNGUOIDANHGIA = iDNGUOIDANHGIA;
	}

	public Date getNGAYDANHGIA() {
		return NGAYDANHGIA;
	}

	public void setNGAYDANHGIA(Date nGAYDANHGIA) {
		NGAYDANHGIA = nGAYDANHGIA;
	}

	public int getTRANGTHAICAPNUOC() {
		return TRANGTHAICAPNUOC;
	}

	public void setTRANGTHAICAPNUOC(int tRANGTHAICAPNUOC) {
		TRANGTHAICAPNUOC = tRANGTHAICAPNUOC;
	}

	public int getCONGXUATTHUCTE() {
		return CONGXUATTHUCTE;
	}

	public void setCONGXUATTHUCTE(int cONGXUATTHUCTE) {
		CONGXUATTHUCTE = cONGXUATTHUCTE;
	}

	public int getSONGUOICAPTHUCTE() {
		return SONGUOICAPTHUCTE;
	}

	public void setSONGUOICAPTHUCTE(int sONGUOICAPTHUCTE) {
		SONGUOICAPTHUCTE = sONGUOICAPTHUCTE;
	}

	public int getTONGCHIPHI() {
		return TONGCHIPHI;
	}

	public void setTONGCHIPHI(int tONGCHIPHI) {
		TONGCHIPHI = tONGCHIPHI;
	}

	public int getTONGDOANHTTHU() {
		return TONGDOANHTTHU;
	}

	public void setTONGDOANHTTHU(int tONGDOANHTTHU) {
		TONGDOANHTTHU = tONGDOANHTTHU;
	}

	public int getNUOCDATTIEUCHUAN() {
		return NUOCDATTIEUCHUAN;
	}

	public void setNUOCDATTIEUCHUAN(int nUOCDATTIEUCHUAN) {
		NUOCDATTIEUCHUAN = nUOCDATTIEUCHUAN;
	}

	public int getNUOCCOASEN() {
		return NUOCCOASEN;
	}

	public void setNUOCCOASEN(int nUOCCOASEN) {
		NUOCCOASEN = nUOCCOASEN;
	}

	public int getNUOCTHATTHOAT() {
		return NUOCTHATTHOAT;
	}

	public void setNUOCTHATTHOAT(int nUOCTHATTHOAT) {
		NUOCTHATTHOAT = nUOCTHATTHOAT;
	}

	public int getTRANGTHAIDANHGIA() {
		return TRANGTHAIDANHGIA;
	}

	public void setTRANGTHAIDANHGIA(int tRANGTHAIDANHGIA) {
		TRANGTHAIDANHGIA = tRANGTHAIDANHGIA;
	}

}
