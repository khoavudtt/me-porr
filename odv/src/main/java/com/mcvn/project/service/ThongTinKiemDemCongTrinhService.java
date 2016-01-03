package com.mcvn.project.service;

import java.util.List;

import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.bean.ThongTinKiemDemVSCCT;
import com.mcvn.project.model.ThongTinKiemDemVeSinhCongTrinh;

public interface ThongTinKiemDemCongTrinhService {

	public List<ThongTinKiemDemVSCCT> getthongtinVSCT(int kiemdemvienid);

	public ThongTinKiemDemVeSinhCongTrinh save(ThongTinKiemDemVeSinhCongTrinh thongTinKiemDemVeSinhCongTrinh);

	public int findById(int id);

	public void updateDanhgia(int danhgiakiemdem,int id);

	public List<ThongTinKiemDemKeHoach> getthongtinkehoachcongtrinh(int idkiemdemvien);

	public List<ThongTinKiemDemVeSinhCongTrinh> kiemtratrung(String matinh, String mahuyen, String maxa, String diachi,
			String tencongtrinh, Integer loaicongtrinh);

}
