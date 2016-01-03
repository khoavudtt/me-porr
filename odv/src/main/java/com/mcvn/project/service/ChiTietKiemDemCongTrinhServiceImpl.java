package com.mcvn.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.model.ChiTietKiemDemCongTrinh;
import com.mcvn.project.repository.ChiTietKiemDemCongTrinhRepository;

@Service
public class ChiTietKiemDemCongTrinhServiceImpl implements ChiTietKiemDemCongTrinhSevice {
	@Resource
	private ChiTietKiemDemCongTrinhRepository chiTietKiemDemCongTrinhRepository;

	@Override
	public ChiTietKiemDemCongTrinh save(ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		// TODO Auto-generated method stub
		return chiTietKiemDemCongTrinhRepository.save(chiTietKiemDemCongTrinh);
	}

	@Override
	public List<ChiTietKiemDemCongTrinh> findByThongtinkiemdemcongtrinhid(int thongtinkiemdemcongtrinhid) {
		// TODO Auto-generated method stub
		return chiTietKiemDemCongTrinhRepository.findByThongtinkiemdemcongtrinhid(thongtinkiemdemcongtrinhid);
	}

	@Override
	public void deletechitiet(int thongtinkiemdemcongtrinhid) {
		chiTietKiemDemCongTrinhRepository.deletechitiet(thongtinkiemdemcongtrinhid);
		
	}

	

}
