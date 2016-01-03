package com.mcvn.project.service;

import java.util.List;

import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.bean.VeSinhGiaDinhTT;
import com.mcvn.project.model.VeSinhHoGiaDinh;

public interface VeSinhHoGiaDinhService {
	public List<VeSinhGiaDinhTT> getVeSinhGd(int idkiemdem);

	public VeSinhHoGiaDinh save(VeSinhHoGiaDinh veSinhHoGiaDinh);

	public List<ThongTinKiemDemKeHoach> getthongtinkehoach(int idkiemdemvien);

	public List<String> kiemtratrung(String matinh, String mahuyen, String maxa, String thonxom,
			String tenchuho);

}
