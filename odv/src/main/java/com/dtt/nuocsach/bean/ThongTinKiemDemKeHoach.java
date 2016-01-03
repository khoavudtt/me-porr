package com.dtt.nuocsach.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ThongTinKiemDemKeHoach {
	private Integer id;
	private Integer nam;
	private Integer kehoachkiemdemid;
	private Date tungay;
	private Date denngay;
	private Integer daketthucdieutra;
	private Date ngaydong;

	public ThongTinKiemDemKeHoach(Integer id, Integer kehoachkiemdemid, Integer daketthucdieutra, Integer nam,
			Date tungay, Date denngay, Date ngaydong) {
		super();
		this.id = id;
		this.kehoachkiemdemid = kehoachkiemdemid;
		this.tungay = tungay;
		this.denngay = denngay;
		this.daketthucdieutra = daketthucdieutra;
		this.nam = nam;
		this.ngaydong = ngaydong;
	}

	@Id
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "kehoachkiemdemid")
	public Integer getKehoachkiemdemid() {
		return kehoachkiemdemid;
	}

	public void setKehoachkiemdemid(Integer kehoachkiemdemid) {
		this.kehoachkiemdemid = kehoachkiemdemid;
	}

	@Column(name = "tungay")
	public Date getTungay() {
		return tungay;
	}

	public void setTungay(Date tungay) {
		this.tungay = tungay;
	}

	@Column(name = "denngay")
	public Date getDenngay() {
		return denngay;
	}

	public void setDenngay(Date denngay) {
		this.denngay = denngay;
	}

	@Column(name = "daketthucdieutra")
	public Integer getDaketthucdieutra() {
		return daketthucdieutra;
	}

	public void setDaketthucdieutra(Integer daketthucdieutra) {
		this.daketthucdieutra = daketthucdieutra;
	}

	@Column(name = "nam")
	public Integer getNam() {
		return nam;
	}

	public void setNam(Integer nam) {
		this.nam = nam;
	}
	@Column(name = "ngaydong")
	public Date getNgaydong() {
		return ngaydong;
	}

	public void setNgaydong(Date ngaydong) {
		this.ngaydong = ngaydong;
	}

}
