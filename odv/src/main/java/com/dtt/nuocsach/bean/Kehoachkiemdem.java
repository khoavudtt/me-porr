package com.dtt.nuocsach.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Kehoachkiemdem {
	private int id;
	private int kehoachid;
	private int daketthuc;
	private Date lastsave;

	public Kehoachkiemdem(int id, int kehoachid, int daketthuc, Date lastsave) {
		super();
		this.id = id;
		this.kehoachid = kehoachid;
		this.daketthuc = daketthuc;
		this.lastsave = lastsave;
	}
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "kehoachid")
	public int getKehoachid() {
		return kehoachid;
	}

	public void setKehoachid(int kehoachid) {
		this.kehoachid = kehoachid;
	}
	@Column(name = "daketthuc")
	public int getDaketthuc() {
		return daketthuc;
	}

	public void setDaketthuc(int daketthuc) {
		this.daketthuc = daketthuc;
	}
	@Column(name = "lastsave")
	public Date getLastsave() {
		return lastsave;
	}

	public void setLastsave(Date lastsave) {
		this.lastsave = lastsave;
	}

}
