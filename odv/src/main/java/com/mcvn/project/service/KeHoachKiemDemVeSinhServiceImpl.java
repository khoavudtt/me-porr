package com.mcvn.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.model.KeHoachKiemDemVeSinh;
import com.mcvn.project.repository.KeHoachkiemDemVeSinhRepository;

@Service
public class KeHoachKiemDemVeSinhServiceImpl implements KeHoachKiemDemVeSinhService {
	@Resource
	private KeHoachkiemDemVeSinhRepository keHoachkiemDemVeSinhRepository;

	@Override
	public List<KeHoachKiemDemVeSinh> kiemtrakehoachdong(int kiemdemvienid) {
		// TODO Auto-generated method stub
		return keHoachkiemDemVeSinhRepository.kiemtrakhdongvs(kiemdemvienid);
	}

	@Override
	public List<KeHoachKiemDemVeSinh> kiemtrakehoachgannhat(int kiemdemvienid) {
		// TODO Auto-generated method stub
		return keHoachkiemDemVeSinhRepository.kiemtrakehoachgan(kiemdemvienid);
	}

	@Override
	public List<KeHoachKiemDemVeSinh> getallkehoach(int kiemdemvienid) {
		// TODO Auto-generated method stub
		return keHoachkiemDemVeSinhRepository.getAllkehoach(kiemdemvienid);
	}

	@Override
	public List<KeHoachKiemDemVeSinh> kiemtrakehoach(Integer kiemdemvienid, Integer id) {
		// TODO Auto-generated method stub
		return keHoachkiemDemVeSinhRepository.kiemtrakehoach(kiemdemvienid, id);
	}

}
