package com.mcvn.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dm_dataitem")
public class DataItem {
	private int ID;
	private int DATAGROUPID;
	private String CODE;
	private String NODE_1;
	private String NODE_2;
	private String NODE_3;
	private String NODE_4;
	private int LEVEL;
	private String NAME;
	private String DESCRIPTION;
	private int STATUS;
	private Date VALIDATEDFROM;
	private Date VALIDATEDTO;

	@Id
	@Column(name = "ID")
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getDATAGROUPID() {
		return DATAGROUPID;
	}

	public void setDATAGROUPID(int dATAGROUPID) {
		DATAGROUPID = dATAGROUPID;
	}

	public String getCODE() {
		return CODE;
	}

	public void setCODE(String cODE) {
		CODE = cODE;
	}

	public String getNODE_1() {
		return NODE_1;
	}

	public void setNODE_1(String nODE_1) {
		NODE_1 = nODE_1;
	}

	public String getNODE_2() {
		return NODE_2;
	}

	public void setNODE_2(String nODE_2) {
		NODE_2 = nODE_2;
	}

	public String getNODE_3() {
		return NODE_3;
	}

	public void setNODE_3(String nODE_3) {
		NODE_3 = nODE_3;
	}

	public String getNODE_4() {
		return NODE_4;
	}

	public void setNODE_4(String nODE_4) {
		NODE_4 = nODE_4;
	}

	public int getLEVEL() {
		return LEVEL;
	}

	public void setLEVEL(int lEVEL) {
		LEVEL = lEVEL;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}

	public Date getVALIDATEDFROM() {
		return VALIDATEDFROM;
	}

	public void setVALIDATEDFROM(Date vALIDATEDFROM) {
		VALIDATEDFROM = vALIDATEDFROM;
	}

	public Date getVALIDATEDTO() {
		return VALIDATEDTO;
	}

	public void setVALIDATEDTO(Date vALIDATEDTO) {
		VALIDATEDTO = vALIDATEDTO;
	}

}
