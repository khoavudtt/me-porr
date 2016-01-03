package com.mcvn.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.bean.ThongTinKiemDemVSCCT;
import com.mcvn.project.model.ThongTinKiemDemVeSinhCongTrinh;
import com.mcvn.project.repository.ThongTinKiemDemCongTrinhRepository;

@Service
public class ThongTinKiemDemVeSinhCongTrinhServiceImpl implements ThongTinKiemDemCongTrinhService {
	@Resource
	private ThongTinKiemDemCongTrinhRepository thongTinKiemDemCongTrinhRepository;

	@Override
	public List<ThongTinKiemDemVSCCT> getthongtinVSCT(int kiemdemvienid) {

		return thongTinKiemDemCongTrinhRepository.getVsCT(kiemdemvienid);
	}

	@Override
	public ThongTinKiemDemVeSinhCongTrinh save(ThongTinKiemDemVeSinhCongTrinh thongTinKiemDemVeSinhCongTrinh) {

		return thongTinKiemDemCongTrinhRepository.save(thongTinKiemDemVeSinhCongTrinh);
	}

	@Override
	public int findById(int id) {
		return thongTinKiemDemCongTrinhRepository.getdanhgia(id);
	}

	@Override
	public List<ThongTinKiemDemKeHoach> getthongtinkehoachcongtrinh(int idkiemdemvien) {
		return thongTinKiemDemCongTrinhRepository.getthongtinkehoachcongtrinh(idkiemdemvien);
	}

	@Override
	public List<ThongTinKiemDemVeSinhCongTrinh> kiemtratrung(String matinh, String mahuyen, String maxa, String diachi,
			String tencongtrinh, Integer loaicongtrinh) {
		// TODO Auto-generated method stub
		return thongTinKiemDemCongTrinhRepository.findByMatinhAndMahuyenAndMaxaAndDiachiAndTencongtrinhAndLoaicongtrinh(
				matinh, mahuyen, maxa, diachi, tencongtrinh, loaicongtrinh);
	}

	@Override
	public void updateDanhgia(int danhgiakiemdem, int id) {
		// TODO Auto-generated method stub
		thongTinKiemDemCongTrinhRepository.update(danhgiakiemdem, id);
	}

}
