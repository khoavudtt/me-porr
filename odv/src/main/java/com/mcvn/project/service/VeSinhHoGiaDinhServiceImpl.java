package com.mcvn.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.bean.VeSinhGiaDinhTT;
import com.mcvn.project.model.VeSinhHoGiaDinh;
import com.mcvn.project.repository.VeSinhHoGiaDinhRepository;

@Service
public class VeSinhHoGiaDinhServiceImpl implements VeSinhHoGiaDinhService {
	@Resource
	private VeSinhHoGiaDinhRepository veSinhHoGiaDinhRepository;

	@Override
	public List<VeSinhGiaDinhTT> getVeSinhGd(int idkiemdem) {

		return veSinhHoGiaDinhRepository.getthongtinvesinhgd(idkiemdem);
	}

	@Override
	public VeSinhHoGiaDinh save(VeSinhHoGiaDinh veSinhHoGiaDinh) {

		return veSinhHoGiaDinhRepository.save(veSinhHoGiaDinh);
	}

	@Override
	public List<ThongTinKiemDemKeHoach> getthongtinkehoach(int idkiemdemvien) {

		return veSinhHoGiaDinhRepository.getthongtinkehoach(idkiemdemvien);
	}

	@Override
	public List<String> kiemtratrung(String matinh, String mahuyen, String maxa, String thonxom,
			String tenchuho) {
		// TODO Auto-generated method stub
			return veSinhHoGiaDinhRepository.checkTrung(matinh, mahuyen, maxa, thonxom, tenchuho);
	}

}
