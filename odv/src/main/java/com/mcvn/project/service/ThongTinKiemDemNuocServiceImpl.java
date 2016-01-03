package com.mcvn.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtt.nuocsach.bean.ThongTinDauNoi;
import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.mcvn.project.model.ThongTinKiemDemNuoc;
import com.mcvn.project.repository.ThongTinKiemDemNuocRepository;

@Service
public class ThongTinKiemDemNuocServiceImpl implements ThongTinKiemDemNuocService {
	@Resource
	private ThongTinKiemDemNuocRepository thongTinKiemDemRepository;

	@Override
	@Transactional
	public ThongTinKiemDemNuoc save(ThongTinKiemDemNuoc thongTinKiemDem) {
		// TODO Auto-generated method stub
		return thongTinKiemDemRepository.save(thongTinKiemDem);
	}

	@Override
	public List<ThongTinKiemDemNuoc> getdaunoi(int kehoachkiemdemnuocid) {
		// TODO Auto-generated method stub
		return thongTinKiemDemRepository.getdaunoi(kehoachkiemdemnuocid);
	}

	@Override
	public List<ThongTinDauNoi>  getdaunoinuocmoi(int kiemdemvienid) {
		return thongTinKiemDemRepository.getdaunoinuocmoi(kiemdemvienid);

	}

	@Override
	public List<ThongTinKiemDemKeHoach> getthongtinkehoach(int kiemdemvienid) {
		// TODO Auto-generated method stub
		return thongTinKiemDemRepository.getthongtinkehoach(kiemdemvienid);
	}

	@Override
	public List<ThongTinKiemDemNuoc> kiemtratrung(String matinh, String mahuyen, String maxa, String thonxom,
			String tenchuho) {
		// TODO Auto-generated method stub
		return thongTinKiemDemRepository.findByMatinhAndMahuyenAndMaxaAndThonxomAndTenchuho(matinh, mahuyen, maxa, thonxom, tenchuho);
	}

	@Override
	public List<ThongTinKiemDemNuoc> kiemtratrungsosery(String soserydongho) {
		// TODO Auto-generated method stub
		return thongTinKiemDemRepository.findBySoserydongho(soserydongho);
	}

	@Override
	public ThongTinKiemDemNuoc findById(int id) {
		// TODO Auto-generated method stub
		return thongTinKiemDemRepository.findOne(id);
	}

}
