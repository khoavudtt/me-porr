package com.mcvn.project.service;

import java.util.List;

import com.dtt.nuocsach.bean.ThongTinDauNoi;
import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.mcvn.project.model.ThongTinKiemDemNuoc;

public interface ThongTinKiemDemNuocService {
	public ThongTinKiemDemNuoc save(ThongTinKiemDemNuoc thongTinKiemDem);

	public List<ThongTinKiemDemNuoc> getdaunoi(int ThongTinKiemDem);

	public ThongTinKiemDemNuoc findById(int id);

	public List<ThongTinDauNoi> getdaunoinuocmoi(int kiemdemvienid);

	public List<ThongTinKiemDemKeHoach> getthongtinkehoach(int kiemdemvienid);

	public List<ThongTinKiemDemNuoc> kiemtratrung(String matinh, String mahuyen, String maxa, String thonxom,
			String tenchuho);

	public List<ThongTinKiemDemNuoc> kiemtratrungsosery(String soserydongho);
}
